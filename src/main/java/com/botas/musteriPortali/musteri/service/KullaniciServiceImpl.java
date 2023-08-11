package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Kullanici;
import com.botas.musteriPortali.musteri.repos.KullaniciRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class KullaniciServiceImpl implements KullaniciService {
    private final KullaniciRepository kullaniciRepository;

    public KullaniciServiceImpl(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    @Override
    public Kullanici save(Kullanici kullanici) {
        return kullaniciRepository.save(kullanici);
    }

    @Override
    public Optional<Kullanici> getById(Long id) {
        return kullaniciRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        kullaniciRepository.deleteById(id);
    }

    @Override
    public List<Kullanici> getAll() {
        return kullaniciRepository.findAll();
    }
}
