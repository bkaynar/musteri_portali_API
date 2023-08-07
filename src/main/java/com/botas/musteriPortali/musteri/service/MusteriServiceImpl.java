package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.repos.MusteriRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusteriServiceImpl implements MusteriService {

    private final MusteriRepository musteriRepository;

    public MusteriServiceImpl(MusteriRepository musteriRepository) {
        this.musteriRepository = musteriRepository;
    }

    @Override
    @Transactional
    public Musteri save(Musteri musteri) {
       return musteriRepository.save(musteri);

    }

    @Override
    public Optional<Musteri> getById(Long id) {
        return musteriRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
    musteriRepository.deleteById(id);
    }

    @Override
    public List<Musteri> getAll() {
        return musteriRepository.findAll();
    }

}

