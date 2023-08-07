package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FaturaRepository extends JpaRepository<Fatura,Long> {
    Optional<Fatura> findByAy(int ay);
}
