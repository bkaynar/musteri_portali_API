package com.botas.musteriPortali.musteri.service;

import com.botas.musteriPortali.musteri.entity.Kullanici;
import com.botas.musteriPortali.musteri.model.KullaniciGirisModel;
import com.botas.musteriPortali.musteri.repos.KullaniciRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullaniciServiceImpl implements KullaniciService {
    private final KullaniciRepository kullaniciRepository;

    public KullaniciServiceImpl(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    @Override
    public Kullanici save(Kullanici kullanici) {
        return kullaniciRepository.save(kullanici);
    }

    @Override
    public Kullanici getById(Long id) {
        return kullaniciRepository.getById(id);
    }

    @Override
    public Kullanici giris(KullaniciGirisModel kullaniciGirisModel) {
        if (this.kullaniciDogrula(kullaniciGirisModel.getKullaniciAdi(), kullaniciGirisModel.getKullaniciSifre())) {
            return kullaniciRepository.findByKullaniciAdi(kullaniciGirisModel.getKullaniciAdi());

        } else {
            return null;

        }
    }

    @Override
    public boolean kullaniciDogrula(String kullaniciAdi, String kullaniciSifre) {
        Kullanici kullanici = kullaniciRepository.findByKullaniciAdi(kullaniciAdi);
        return kullanici != null && kullanici.getKullaniciSifre().equals(kullaniciSifre);
    }

    @Override
    public void deleteById(Long id) {
        kullaniciRepository.deleteById(id);
    }

    @Override
    public List<Kullanici> getAll() {
        return kullaniciRepository.findAll();
    }
}
