package com.botas.musteriPortali.musteri.mapper;

import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.model.MusteriModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface MusteriMapper  {
    MusteriMapper INSTANCE = Mappers.getMapper(MusteriMapper.class);

    Musteri convertToEntity(MusteriModel musteriModel);
    MusteriModel convertToModel(Musteri musteri);

    List<MusteriModel> convertToModelList(List<Musteri> musteriList);

    List<Musteri> convertToEntityList(List<MusteriModel> musteriModelList);

}
