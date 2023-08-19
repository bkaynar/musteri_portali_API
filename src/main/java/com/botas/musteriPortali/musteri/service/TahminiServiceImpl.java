package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Tahmini;
import com.botas.musteriPortali.musteri.repos.TahminiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TahminiServiceImpl implements TahminiService {
    private final TahminiRepository tahminiRepository;

    public TahminiServiceImpl(TahminiRepository tahminiRepository) {
        this.tahminiRepository = tahminiRepository;
    }

    @Override
    public Tahmini save(Tahmini tahmini) {
        return tahminiRepository.save(tahmini);
    }

    @Override
    public Optional<Tahmini> getById(Long id) {
        return tahminiRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        tahminiRepository.deleteById(id);
    }

    @Override
    public List<Tahmini> getAll() {
        return tahminiRepository.findAll();
    }

    @Override
    public List<Tahmini> getByMusteriId(Long musteriId) {
        return tahminiRepository.findByMusteriId(musteriId);
    }
}
