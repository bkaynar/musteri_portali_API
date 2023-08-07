package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Musteri;

import java.util.List;
import java.util.Optional;

public interface MusteriService {


    Musteri save(Musteri musteri);

    Optional<Musteri> getById(Long id);
    void deleteById(Long id);
    List<Musteri> getAll();

}
