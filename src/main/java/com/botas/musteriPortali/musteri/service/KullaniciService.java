package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Kullanici;
import com.botas.musteriPortali.musteri.model.KullaniciGirisModel;

import java.util.List;

public interface KullaniciService {
    Kullanici save(Kullanici kullanici);

    Kullanici getById(Long id);

    Kullanici giris(KullaniciGirisModel kullaniciGirisModel);
    boolean kullaniciDogrula(String kullaniciAdi, String kullaniciSifre);

    void deleteById(Long id);
    List<Kullanici> getAll();
}
