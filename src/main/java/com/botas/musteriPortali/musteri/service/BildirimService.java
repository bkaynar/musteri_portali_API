package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Bildirim;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BildirimService {

    Bildirim save(Bildirim bildirim);

    Optional<Bildirim> getById(Long id);
    void deleteById(Long id);
    List<Bildirim> getAll();

}
