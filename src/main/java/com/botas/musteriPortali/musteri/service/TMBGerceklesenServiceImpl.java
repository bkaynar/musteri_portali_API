package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.TMBGerceklesen;
import com.botas.musteriPortali.musteri.repos.TMBGerceklesenRepository;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public class TMBGerceklesenServiceImpl implements TMBGerceklesenService{

    private final TMBGerceklesenRepository tmbGerceklesenRepository;

    public TMBGerceklesenServiceImpl(TMBGerceklesenRepository tmbGerceklesenRepository) {
        this.tmbGerceklesenRepository = tmbGerceklesenRepository;
    }

    @Override
    public TMBGerceklesenService save(TMBGerceklesen tmbGerceklesen) {
        return (TMBGerceklesenService) tmbGerceklesenRepository.save(tmbGerceklesen);
    }

    @Override
    @Transactional
    public Optional<TMBGerceklesen> getById(Long id) {
        return tmbGerceklesenRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        tmbGerceklesenRepository.deleteById(id);

    }

    @Override
    public List<TMBGerceklesen> getAll() {
        return tmbGerceklesenRepository.findAll();
    }
}
