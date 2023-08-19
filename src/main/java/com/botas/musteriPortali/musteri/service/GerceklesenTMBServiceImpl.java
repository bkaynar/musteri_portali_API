package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.GerceklesenTMB;
import com.botas.musteriPortali.musteri.repos.GerceklesenTMBRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GerceklesenTMBServiceImpl implements GerceklesenTMBService {
    private final GerceklesenTMBRepository gerceklesenTMBRepository;

    public GerceklesenTMBServiceImpl(GerceklesenTMBRepository gerceklesenTMBRepository) {
        this.gerceklesenTMBRepository = gerceklesenTMBRepository;
    }

    @Override
    public GerceklesenTMB save(GerceklesenTMB gerceklesenTMB) {
        return gerceklesenTMBRepository.save(gerceklesenTMB);
    }

    @Override
    public Optional<GerceklesenTMB> getById(Long id) {
        return gerceklesenTMBRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        gerceklesenTMBRepository.findById(id);
    }

    @Override
    public List<GerceklesenTMB> getAll() {
        return gerceklesenTMBRepository.findAll();
    }

    @Override
    public List<GerceklesenTMB> getByMusteriId(Long musteriId) {
        return gerceklesenTMBRepository.findByMusteriId(musteriId);

    }
}
