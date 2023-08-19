package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.entity.Istasyon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IstasyonRepository extends JpaRepository<Istasyon,Long> {
    List<Istasyon> findByMusteriId(Long musteriId);

}
