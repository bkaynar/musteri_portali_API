package com.botas.musteriPortali.musteri.model;

import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class FaturaModel {
    private Long Id;
    private int yil;
    private int ay;
    private BigDecimal tutar;

    @ManyToOne
    private MusteriModel musteri;
}
