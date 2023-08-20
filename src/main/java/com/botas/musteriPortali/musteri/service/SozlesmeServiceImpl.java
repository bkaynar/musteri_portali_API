package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Sozlesme;
import com.botas.musteriPortali.musteri.repos.SozlesmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SozlesmeServiceImpl implements SozlesmeService {
    private final SozlesmeRepository sozlesmeRepository;

    public SozlesmeServiceImpl(SozlesmeRepository sozlesmeRepository) {
        this.sozlesmeRepository = sozlesmeRepository;
    }

    @Override
    public Sozlesme save(Sozlesme sozlesme) {
        return sozlesmeRepository.save(sozlesme);
    }

    @Override
    public Sozlesme update(Sozlesme sozlesme) {
        //TODO update kısmı yapılacak
        return null;
    }

    @Override
    public Sozlesme getById(Long id) {
        return  sozlesmeRepository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        sozlesmeRepository.deleteById(id);
    }

    @Override
    public List<Sozlesme> getAll() {
        return sozlesmeRepository.findAll();
    }

    @Override
    public Sozlesme getyillikSozlesme(int yil, Long musteriID) {
        return sozlesmeRepository.findByYilAndMusteriId(yil,musteriID);
    }
}
