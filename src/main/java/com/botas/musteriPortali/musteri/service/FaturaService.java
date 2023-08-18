package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.model.FaturaBilgiModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface FaturaService {

    Fatura save(Fatura fatura);

    Optional<Fatura> getById(Long id);

    void deleteById(Long id);

    List<Fatura> getAll();

    List<Fatura> getMusteriFaturalar(Long musteriId);


    Optional<Fatura> getByay(int ay);

    FaturaBilgiModel getLoginFatura(FaturaBilgiModel faturaBilgiModel);

}
