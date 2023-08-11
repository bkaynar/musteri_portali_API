package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Istasyon;
import com.botas.musteriPortali.musteri.repos.IstasyonRepository;

import java.util.List;
import java.util.Optional;

public class IstasyonServiceImpl implements IstasyonService {
    private final IstasyonRepository istasyonRepository;

    public IstasyonServiceImpl(IstasyonRepository istasyonRepository) {
        this.istasyonRepository = istasyonRepository;
    }

    @Override
    public Istasyon save(Istasyon istasyon) {
        return istasyonRepository.save(istasyon);
    }

    @Override
    public Optional<Istasyon> getById(Long id) {
        return istasyonRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        istasyonRepository.deleteById(id);
    }

    @Override
    public List<Istasyon> getAll() {
        return istasyonRepository.findAll();
    }
}
