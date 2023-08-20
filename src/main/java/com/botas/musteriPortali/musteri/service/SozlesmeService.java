package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.entity.Sozlesme;

import java.util.List;

public interface SozlesmeService {
    Sozlesme save(Sozlesme sozlesme);

    Sozlesme update(Sozlesme sozlesme);

    Sozlesme getById(Long id);
    void deleteById(Long id);
    List<Sozlesme> getAll();
    Sozlesme getyillikSozlesme(int yil,Long musteriId);


}
