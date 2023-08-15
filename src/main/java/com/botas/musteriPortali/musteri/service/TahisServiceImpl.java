package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Tahis;
import com.botas.musteriPortali.musteri.repos.TahisRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TahisServiceImpl implements TahisService {

    private final TahisRepository tahisRepository;

    public TahisServiceImpl(TahisRepository tahisRepository) {
        this.tahisRepository = tahisRepository;
    }

    @Override
    @Transactional
    public Tahis save(Tahis tahis) {
        return tahisRepository.save(tahis);
    }

    @Override
    public Optional<Tahis> getById(Long id) {
        return tahisRepository.findById(id);
    }

    public Tahis update(Tahis tahis) {
        if (tahis.getId() != null) {
            var tahisDb = tahisRepository.findById(tahis.getId());
            if (tahisDb.isPresent()) {
                Tahis tahisEnt = tahisDb.get();
                if (tahis.getBaslangic_tarihi() != null)
                    tahisEnt.setBaslangic_tarihi(tahis.getBaslangic_tarihi());
                if (tahis.getBitis_tarihi() != null)
                    tahisEnt.setBitis_tarihi(tahis.getBitis_tarihi());
                if (tahis.getMusteri() != null)
                    tahisEnt.setMusteri(tahis.getMusteri());
                if (tahis.getBotas_odeyecegi_tutar() != null)
                    tahisEnt.setBotas_odeyecegi_tutar(tahis.getBotas_odeyecegi_tutar());
                if (tahis.getDamga_vergisi() != null)
                    tahisEnt.setDamga_vergisi(tahis.getDamga_vergisi());
                if (tahis.getImza_tarihi() != null)
                    tahisEnt.setImza_tarihi(tahis.getImza_tarihi());
                if (tahis.getMusteri_odeyecegi_tutar() != null)
                    tahisEnt.setMusteri_odeyecegi_tutar(tahis.getMusteri_odeyecegi_tutar());
                return tahisRepository.save(tahisEnt);

            } else return null;
        } else
            return null;
    }

    @Override
    public void deleteById(Long id) {
        tahisRepository.deleteById(id);

    }

    @Override
    public List<Tahis> getAll() {
        return tahisRepository.findAll();
    }
}
