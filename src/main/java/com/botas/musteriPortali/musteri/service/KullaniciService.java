package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Kullanici;
import com.botas.musteriPortali.musteri.entity.Musteri;

import java.util.List;
import java.util.Optional;

public interface KullaniciService {
    Kullanici save(Kullanici kullanici);

    Optional<Kullanici> getById(Long id);
    void deleteById(Long id);
    List<Kullanici> getAll();
}
