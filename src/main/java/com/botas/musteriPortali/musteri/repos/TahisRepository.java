package com.botas.musteriPortali.musteri.repos;

import com.botas.musteriPortali.musteri.entity.Tahis;
import org.springframework.data.jpa.repository.JpaRepository;
//Oluştururken Class Yerine Interface Seçiyoruz
public interface TahisRepository extends JpaRepository<Tahis, Long>{
}
