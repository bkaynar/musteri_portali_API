package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.STuketici;
import com.botas.musteriPortali.musteri.repos.STuketiciRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class STuketiciImpl implements STuketiciService {
    private final STuketiciRepository sTuketiciRepository;

    public STuketiciImpl(STuketiciRepository sTuketiciRepository) {
        this.sTuketiciRepository = sTuketiciRepository;
    }

    @Override
    @Transactional
    public STuketici save(STuketici sTuketici) {
        return sTuketiciRepository.save(sTuketici);
    }

    @Override
    public Optional<STuketici> getById(Long id) {
        return sTuketiciRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        sTuketiciRepository.deleteById(id);
    }

    @Override
    public List<STuketici> getAll() {
        return sTuketiciRepository.findAll();
    }

    @Override
    public List<STuketici> getByMusteriId(Long musteriId) {
        return sTuketiciRepository.findByMusteriId(musteriId);
    }
}
