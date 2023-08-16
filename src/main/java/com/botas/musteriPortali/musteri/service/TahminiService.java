package com.botas.musteriPortali.musteri.service;


import com.botas.musteriPortali.musteri.entity.Tahmini;
import com.botas.musteriPortali.musteri.entity.Tehis;

import java.util.List;
import java.util.Optional;

public interface TahminiService {
    Tahmini save (Tahmini tahmini);


    Optional<Tahmini> getById(Long id);

    void deleteById(Long id);

    List<Tahmini> getAll();
}
