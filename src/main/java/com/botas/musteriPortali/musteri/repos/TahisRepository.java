package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Tahis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TahisRepository extends JpaRepository<Tahis,Long> {
    List<Tahis> findByMusteriId(Long musteriId);
}
