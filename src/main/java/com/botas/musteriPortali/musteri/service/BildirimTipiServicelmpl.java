package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.BildirimTipi;
import com.botas.musteriPortali.musteri.repos.BildirimTipiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BildirimTipiServicelmpl implements BildirimTipiService {


    @Override
    public BildirimTipi save(BildirimTipi bildirimTipi) {
        return null;
    }

    @Override
    public Optional<BildirimTipi> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<BildirimTipi> getAll() {
        return null;
    }

    @Override
    public Optional<BildirimTipi> getByBildirimTipi(String bildirimTipi) {
        return Optional.empty();
    }
}
