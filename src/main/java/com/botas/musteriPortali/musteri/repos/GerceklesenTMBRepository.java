package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.GerceklesenTMB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerceklesenTMBRepository extends JpaRepository<GerceklesenTMB,Long> {
}
