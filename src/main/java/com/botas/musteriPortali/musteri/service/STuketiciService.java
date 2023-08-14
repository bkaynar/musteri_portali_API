package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.STuketici;

import java.util.List;
import java.util.Optional;

public interface STuketiciService{
    STuketici save(STuketici sTuketici);
    Optional<STuketici> getById(Long id);

    void deleteById(Long id);

    List<STuketici> getAll();
}
