package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciRepository extends JpaRepository<Kullanici, Long> {
    Kullanici findByKullaniciAdi(String kullaniciAdi);
}