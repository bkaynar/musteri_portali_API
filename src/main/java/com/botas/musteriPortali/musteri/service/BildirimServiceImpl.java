package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Bildirim;
import com.botas.musteriPortali.musteri.repos.BildirimRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BildirimServiceImpl implements BildirimService {
    private BildirimRepository bildirimRepository;

    public BildirimServiceImpl(BildirimRepository bildirimRepository) {
        this.bildirimRepository = bildirimRepository;
    }

    @Override
    public Bildirim save(Bildirim bildirim) {
        return bildirimRepository.save(bildirim);
    }

    @Override
    public Optional<Bildirim> getById(Long id) {
        return bildirimRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        bildirimRepository.deleteById(id);
    }

    @Override
    public List<Bildirim> getAll() {
        return bildirimRepository.findAll();
    }
}
