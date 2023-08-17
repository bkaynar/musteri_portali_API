package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Kullanici;
import com.botas.musteriPortali.musteri.model.KullaniciGirisModel;
import com.botas.musteriPortali.musteri.service.KullaniciService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciController {
    private final KullaniciService kullaniciService;

    public KullaniciController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

    @PostMapping(value = "/giris")
    public ResponseEntity<Kullanici> kullaniciGiris(@RequestBody KullaniciGirisModel request) {
        return ResponseEntity.ok(kullaniciService.giris(request));
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciService.save(kullanici));
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Kullanici> getById(@PathVariable Long id) {
        return ResponseEntity.ok(kullaniciService.getById(id));
    }

    @GetMapping(value = "/kullanicilar")
    public ResponseEntity<List<Kullanici>> getAll() {
        return ResponseEntity.ok(kullaniciService.getAll());
    }
}
