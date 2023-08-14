package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.TMBGerceklesen;


import java.util.List;
import java.util.Optional;

public interface TMBGerceklesenService {
    TMBGerceklesenService save(TMBGerceklesen tmbGerceklesen);

    Optional<TMBGerceklesen> getById(Long id);
    void deleteById(Long id);
    List<TMBGerceklesen> getAll();
}
