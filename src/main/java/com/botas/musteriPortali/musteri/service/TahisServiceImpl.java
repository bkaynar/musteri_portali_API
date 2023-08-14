package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Tahis;
import com.botas.musteriPortali.musteri.repos.TahisRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TahisServiceImpl implements TahisService {

    private final TahisRepository tahisRepository;

    public TahisServiceImpl(TahisRepository tahisRepository) {
        this.tahisRepository = tahisRepository;
    }

    @Override
    @Transactional
    public Tahis save(Tahis tahis) {
        return tahisRepository.save(tahis);
    }

    @Override
    public Optional<Tahis> getById(Long id) {
        return tahisRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        tahisRepository.deleteById(id);

    }

    @Override
    public List<Tahis> getAll() {
        return tahisRepository.findAll();
    }
}
