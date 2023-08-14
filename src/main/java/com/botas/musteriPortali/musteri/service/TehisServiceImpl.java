package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Tehis;
import com.botas.musteriPortali.musteri.repos.TehisRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TehisServiceImpl implements TehisService {
    private final TehisRepository tehisRepository;

    public TehisServiceImpl(TehisRepository tehisRepository) {
        this.tehisRepository = tehisRepository;
    }

    @Override
    @Transactional
    public Tehis save(Tehis tehis) {
        return tehisRepository.save(tehis);
    }

    @Override
    public Optional<Tehis> getById(Long id) {
        return tehisRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        tehisRepository.deleteById(id);
    }

    @Override
    public List<Tehis> getAll() {
        return tehisRepository.findAll();
    }
}
