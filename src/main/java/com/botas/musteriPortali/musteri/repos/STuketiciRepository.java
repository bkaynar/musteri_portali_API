package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.STuketici;
import com.botas.musteriPortali.musteri.entity.Tahis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface STuketiciRepository extends JpaRepository<STuketici,Long> {
}
