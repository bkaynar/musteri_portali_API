package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.GerceklesenTMB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GerceklesenTMBRepository extends JpaRepository<GerceklesenTMB,Long> {
    List<GerceklesenTMB> findByMusteriId(Long musteriId);

}
