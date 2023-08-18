package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.model.FaturaBilgiModel;
import com.botas.musteriPortali.musteri.repos.FaturaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class FaturaServicelmpl implements FaturaService {
    private final FaturaRepository faturaRepository;
    private final MusteriService musteriService;

    public FaturaServicelmpl(FaturaRepository faturaRepository, MusteriService musteriService) {
        this.faturaRepository = faturaRepository;
        this.musteriService = musteriService;
    }

    @Override
    public Fatura save(Fatura fatura) {
        return faturaRepository.save(fatura);
    }

    @Override
    public Optional<Fatura> getById(Long id) {
        return faturaRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        faturaRepository.deleteById(id);

    }

    @Override
    public List<Fatura> getAll() {
        return faturaRepository.findAll();
    }

    @Override
    public List<Fatura> getMusteriFaturalar(Long musteriId) {
        return faturaRepository.findByMusteri_Id(musteriId);

    }

    @Override
    public Optional<Fatura> getByay(int ay) {
        return faturaRepository.findByAy(ay);
    }

    @Override
    public FaturaBilgiModel getLoginFatura(FaturaBilgiModel faturaBilgiModel) {
        LocalDateTime tarih = LocalDateTime.now();
        int yil = tarih.getYear();
        faturaBilgiModel.setToplam(findToplamTutar(faturaBilgiModel, yil) );
        return faturaBilgiModel;
    }

    public BigDecimal findToplamTutar(FaturaBilgiModel faturaBilgiModel, int yil  ){
        BigDecimal sumFatura = BigDecimal.ZERO;
        List<Fatura> yillikFaturaLar = faturaRepository.getMusteriFatura(faturaBilgiModel.getMusteriId(),yil);
        if (yillikFaturaLar != null && !yillikFaturaLar.isEmpty()) {
            for(Fatura fatura : yillikFaturaLar) {
                sumFatura = sumFatura.add(fatura.getTutar());
            }
        }
        return sumFatura;

    }
}
