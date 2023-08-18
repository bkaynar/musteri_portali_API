package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface FaturaRepository extends JpaRepository<Fatura,Long> {
    Optional<Fatura> findByAy(int ay);

    List<Fatura> findByMusteri_Id(Long musteriId);

    @Query(value="select b from Fatura b where b.musteri.id=?1 and b.yil=?2 ") // ?1= birinci parametre -- ?2= iknci parameter
    List<Fatura> getMusteriFatura(Long musteriId, int yil);
}
