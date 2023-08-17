package com.botas.musteriPortali.musteri.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Setter
@Getter
public class FaturaBilgiModel {
    private Long musteriId;
    private int yil;
    private int ay;
    private BigDecimal tutar;
    private BigDecimal ysm;
    private BigDecimal aat;
    private BigDecimal aatdurum;
    private BigDecimal toplam;
    private BigDecimal tuketimMiktari;
}
