package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.repos.MusteriRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusteriServiceImpl implements MusteriService {

    private final MusteriRepository musteriRepository;

    public MusteriServiceImpl(MusteriRepository musteriRepository) {
        this.musteriRepository = musteriRepository;
    }

    @Override
    @Transactional
    public Musteri save(Musteri musteri) {
        return musteriRepository.save(musteri);

    }

    @Override
    public Musteri update(Musteri musteri) {
        if (musteri.getId() != null) {
            var musteriDb = musteriRepository.findById(musteri.getId());
            if (musteriDb.isPresent()) {
                Musteri musterEnt = musteriDb.get();
                if (musteri.getMusteriAdi() != null)
                    musterEnt.setMusteriAdi(musteri.getMusteriAdi());
                if (musteri.getAdres() != null)
                    musterEnt.setAdres(musteri.getAdres());
                if (musteri.getIlce() != null)
                    musterEnt.setIlce(musteri.getIlce());
                if (musteri.getIl() != null)
                    musterEnt.setIl(musteri.getIl());
                if (musteri.getTelefon() != null)
                    musterEnt.setTelefon(musteri.getTelefon());
                if (musteri.getAktif() != null)
                    musterEnt.setAktif(musteri.getAktif());

                return musteriRepository.save(musterEnt);

            } else return null;
        } else
            return null;
    }

    @Override
    public Musteri getById(Long id) {
        return musteriRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        musteriRepository.deleteById(id);
    }

    @Override
    public List<Musteri> getAll() {
        return musteriRepository.findAll();
    }

}

