package com.botas.musteriPortali.musteri.model;

import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Data
public class MusteriModel {

    private Long id;
    public String musteriKod;
    public String musteriAdi;
    public  String adress;
    public  String il;
    public  String ilce;
    public  String telefon;

    @OneToMany
    private List<FaturaModel> faturalari;
}
