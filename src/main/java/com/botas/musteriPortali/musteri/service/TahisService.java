package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.entity.Tahis;

import java.util.List;
import java.util.Optional;

public interface TahisService {
    Tahis save(Tahis tahis);

    Optional<Tahis> getById(Long id);
    void deleteById(Long id);
    List<Tahis> getAll();
}
