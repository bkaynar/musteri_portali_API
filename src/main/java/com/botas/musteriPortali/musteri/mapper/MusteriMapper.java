package com.botas.musteriPortali.musteri.mapper;

import com.botas.musteriPortali.musteri.model.MusteriModel;
import com.botas.musteriPortali.musteri.entity.Musteri;

public class MusteriMapper {


    public Musteri convertToMusteri(MusteriModel musteriModel){
        Musteri musteri= new Musteri();
        musteri.setMusteriAdi(musteriModel.getMusteriAdi());
        musteri.setIl(musteriModel.getIl());
        musteri.setIlce(musteriModel.getIlce());
        musteri.setTelefon(musteriModel.getTelefon());
        return musteri;
    }
}
