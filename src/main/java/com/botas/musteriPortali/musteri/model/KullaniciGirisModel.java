package com.botas.musteriPortali.musteri.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KullaniciGirisModel {
    private String kullaniciAdi;
    private String kullaniciSifre;
}