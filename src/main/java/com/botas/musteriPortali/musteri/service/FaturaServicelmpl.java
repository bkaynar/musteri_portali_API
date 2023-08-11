package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.repos.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FaturaServicelmpl implements FaturaService {
    private final FaturaRepository faturaRepository;

    public FaturaServicelmpl(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
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
    public Optional<Fatura> getByay(int ay) {
        return faturaRepository.findByAy(ay);
    }
}
