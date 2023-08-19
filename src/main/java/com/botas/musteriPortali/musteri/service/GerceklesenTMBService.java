package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.GerceklesenTMB;

import java.util.List;
import java.util.Optional;

public interface GerceklesenTMBService {
    GerceklesenTMB save(GerceklesenTMB gerceklesenTMB);

    Optional<GerceklesenTMB> getById(Long id);

    void deleteById(Long id);

    List<GerceklesenTMB> getAll();

    List<GerceklesenTMB> getByMusteriId(Long musteriId);

}
