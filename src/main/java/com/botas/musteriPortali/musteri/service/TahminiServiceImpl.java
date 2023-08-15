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
    public Tahmini update(Tahmini tahmini) {
        if (tahmini.getId() != null) {
            var tahminiDb = tahminiRepository.findById(tahmini.getId());
            if (tahminiDb.isPresent()) {
                Tahmini tahminiEnt = tahminiDb.get();
                if (tahmini.getBildirim() != null)
                    tahminiEnt.setBildirim(tahmini.getBildirim());
                if (tahmini.getTarih() != null)
                    tahminiEnt.setTarih(tahmini.getTarih());
                if (tahmini.getMusteri() != null)
                    tahminiEnt.setMusteri(tahmini.getMusteri());
                if (tahmini.getMiktar() != null)
                    tahminiEnt.setMiktar(tahmini.getMiktar());
                return tahminiRepository.save(tahminiEnt);
            } else return null;
        } else return null;
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
}
