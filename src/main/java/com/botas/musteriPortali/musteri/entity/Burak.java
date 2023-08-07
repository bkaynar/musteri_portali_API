package com.botas.musteriPortali.musteri.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "burak")
public class Burak {
    @Id
    private  Long id;

    @Column(name = "ad", length = 75 )
    private String ad;

}
