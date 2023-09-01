package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.entity.Sozlesme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SozlesmeRepository extends JpaRepository<Sozlesme, Long> {
    Sozlesme findByYilAndMusteriId(int yil, Long musteriId);

    List<Sozlesme> findByMusteriId(Long musteriId);
}
