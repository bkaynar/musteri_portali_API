package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.entity.Sozlesme;
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
    private final SozlesmeService sozlesmeService;

    public FaturaServicelmpl(FaturaRepository faturaRepository, MusteriService musteriService, SozlesmeService sozlesmeService) {
        this.faturaRepository = faturaRepository;
        this.musteriService = musteriService;
        this.sozlesmeService = sozlesmeService;
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
    public FaturaBilgiModel getLoginFatura(Long musteriId) {
        FaturaBilgiModel faturaBilgiModel= new FaturaBilgiModel();
        LocalDateTime tarih = LocalDateTime.now();
        int yil = tarih.getYear();
        faturaBilgiModel.setMusteriId(musteriId);
        faturaBilgiModel.setYil(yil);
        findToplamTutars(faturaBilgiModel, yil) ;
        faturaBilgiModel.setAat(findAatTutar(faturaBilgiModel,yil));
        faturaBilgiModel.setYsm(findYsmTutar(faturaBilgiModel,yil));
        return faturaBilgiModel;
    }

    public BigDecimal findAatTutar(FaturaBilgiModel faturaBilgiModel, int yil  ){
        BigDecimal aatTutar = BigDecimal.ZERO;
        Sozlesme sozlesme= sozlesmeService.getyillikSozlesme(yil,faturaBilgiModel.getMusteriId() );
        if(sozlesme!= null && sozlesme.getAatOrani() != null && sozlesme.getYsmMiktar() != null){
            aatTutar= sozlesme.getAatOrani().multiply(sozlesme.getYsmMiktar()).divide(BigDecimal.valueOf(100));
        }
        return aatTutar;
    }
    public BigDecimal findYsmTutar(FaturaBilgiModel faturaBilgiModel, int yil  ){
        BigDecimal ysmTutar = BigDecimal.ZERO;
        Sozlesme sozlesme= sozlesmeService.getyillikSozlesme(yil,faturaBilgiModel.getMusteriId() );
        if(sozlesme!= null ){
            ysmTutar= sozlesme.getYsmMiktar();
        }
        return ysmTutar;
    }
    public FaturaBilgiModel findToplamTutars(FaturaBilgiModel faturaBilgiModel, int yil  ){
        BigDecimal sumToplam = BigDecimal.ZERO;
        BigDecimal sumKdv = BigDecimal.ZERO;
        BigDecimal sumOtv = BigDecimal.ZERO;
        BigDecimal sumTuketimMiktari = BigDecimal.ZERO;
        List<Fatura> yillikFaturaLar = faturaRepository.getMusteriFatura(faturaBilgiModel.getMusteriId(),yil);
        if (yillikFaturaLar != null && !yillikFaturaLar.isEmpty()) {
            for(Fatura fatura : yillikFaturaLar) {
                sumToplam = sumToplam.add(fatura.getTutar());
                sumKdv= sumKdv.add(fatura.getKdv());
                sumOtv= sumOtv.add(fatura.getOtv());
                sumTuketimMiktari= sumTuketimMiktari.add(fatura.getTuketimMiktari());
            }
        }
        faturaBilgiModel.setToplam(sumToplam);
        faturaBilgiModel.setTuketimMiktari(sumTuketimMiktari);
        faturaBilgiModel.setTutar(sumToplam.add(sumKdv).add(sumOtv));

        return faturaBilgiModel;

    }
}
