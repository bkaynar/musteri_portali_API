package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Tehis;
import com.botas.musteriPortali.musteri.repos.TehisRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TehisServiceImpl implements TehisService {
    private final TehisRepository tehisRepository;

    public TehisServiceImpl(TehisRepository tehisRepository) {
        this.tehisRepository = tehisRepository;
    }

    @Override
    @Transactional
    public Tehis save(Tehis tehis) {
        return tehisRepository.save(tehis);
    }

    @Override
    public Tehis update(Tehis tehis) {
        if (tehis.getId() != null) {
            var tehisDb = tehisRepository.findById(tehis.getId());
            if (tehisDb.isPresent()) {
                Tehis tahisEnt = tehisDb.get();
                if (tehis.getBaslangic_tarihi() != null)
                    tahisEnt.setBaslangic_tarihi(tehis.getBaslangic_tarihi());
                if (tehis.getBitis_tarihi() != null)
                    tahisEnt.setBitis_tarihi(tehis.getBitis_tarihi());
                if (tehis.getSerbestTuketici() != null)
                    tahisEnt.setSerbestTuketici(tehis.getSerbestTuketici());
                if (tehis.getImza_tarihi() != null)
                    tahisEnt.setImza_tarihi(tehis.getImza_tarihi());
                return tehisRepository.save(tahisEnt);

            } else return null;
        } else
            return null;
    }
    @Override
    public Optional<Tehis> getById(Long id) {
        return tehisRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
tehisRepository.deleteById(id);
    }

    @Override
    public List<Tehis> getAll() {
        return tehisRepository.findAll();
    }
}
