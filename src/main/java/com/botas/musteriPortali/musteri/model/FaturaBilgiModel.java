package com.botas.musteriPortali.musteri.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

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
