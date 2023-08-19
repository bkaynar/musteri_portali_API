package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Istasyon;

import java.util.List;
import java.util.Optional;

public interface IstasyonService {
    Istasyon save(Istasyon istasyon);

    Optional<Istasyon> getById(Long id);

    void deleteById(Long id);

    List<Istasyon> getAll();

    List<Istasyon> getByMusteriId(Long musteriId);
}
