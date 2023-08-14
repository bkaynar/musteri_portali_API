package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Tehis;

import java.util.List;
import java.util.Optional;

public interface TehisService {
    Tehis save(Tehis tehis);

    Optional<Tehis> getById(Long id);
    void deleteById(Long id);
    List<Tehis> getAll();
}
