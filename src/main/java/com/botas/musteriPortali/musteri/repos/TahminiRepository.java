package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Tahis;
import com.botas.musteriPortali.musteri.entity.Tahmini;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TahminiRepository extends JpaRepository<Tahmini,Long> {

    List<Tahmini> findByMusteriId(Long musteriId);

}
