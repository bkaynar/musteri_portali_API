package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Tehis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TehisRepository extends JpaRepository<Tehis,Long> {
    List<Tehis> findByMusteriId(Long musteriId);
}
