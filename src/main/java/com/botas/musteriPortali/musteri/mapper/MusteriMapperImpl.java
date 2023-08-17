package com.botas.musteriPortali.musteri.mapper;

import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.model.MusteriModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MusteriMapperImpl implements MusteriMapper {
    @Override
    public Musteri convertToEntity(MusteriModel musteriModel) {
        if ( musteriModel == null ) {
            return null;
        }
        Musteri musteri= new Musteri();
        musteri.setId(musteriModel.getId());
        musteri.setMusteriKod(musteriModel.getMusteriKod());
        musteri.setMusteriAdi(musteriModel.getMusteriAdi());
        musteri.setAdres(musteriModel.getAdres());
        musteri.setIl(musteriModel.getIl());
        musteri.setIlce(musteriModel.getIlce());
        musteri.setTelefon(musteriModel.getTelefon());
        return musteri;
    }

    @Override
    public MusteriModel convertToModel(Musteri musteri) {
        if (musteri== null ){
            return null;
        }
        MusteriModel musteriModel= new MusteriModel();
        musteriModel.setId(musteri.getId());
        musteriModel.setMusteriKod(musteri.getMusteriKod());
        musteriModel.setMusteriAdi(musteri.getMusteriAdi());
        musteriModel.setAdres(musteri.getAdres());
        musteriModel.setIl(musteri.getIl());
        musteriModel.setIlce(musteri.getIlce());
        musteriModel.setTelefon(musteri.getTelefon());


        return musteriModel;

    }

    @Override
    public List<MusteriModel> convertToModelList(List<Musteri> musteriList) {
        if (musteriList== null){
            return null;
        }
        List<MusteriModel> list= new ArrayList<>(musteriList.size());
        for (Musteri musteri: musteriList){
            list.add(convertToModel(musteri));
        }
        return list;
    }

    @Override
    public List<Musteri> convertToEntityList(List<MusteriModel> musteriModelList) {
        if (musteriModelList== null){
            return null;
        }
        List<Musteri> list= new ArrayList<>(musteriModelList.size());
        for (MusteriModel musteriModel: musteriModelList)//müşteri sayısı kadar döner ve sonucu verir
        {
            list.add(convertToEntity(musteriModel));
        }
        return list;    }
}
