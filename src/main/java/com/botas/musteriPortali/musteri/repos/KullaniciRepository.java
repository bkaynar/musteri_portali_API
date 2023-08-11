package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Istasyon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciRepository extends JpaRepository<Istasyon, Long> {

}
