package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.BildirimTipi;

import java.util.List;
import java.util.Optional;

public interface BildirimTipiService {
    BildirimTipi save(BildirimTipi bildirimTipi);

    Optional <BildirimTipi> getById(Long id);

    void deleteById(Long id);

    List<BildirimTipi> getAll();

    Optional<BildirimTipi> getByBildirimTipi(String bildirimTipi);

}
