package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Kullanici;
import com.botas.musteriPortali.musteri.service.KullaniciService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kullanici")
public class KullaniciController {
    private final KullaniciService kullaniciService;

    public KullaniciController(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }
    @PostMapping(value = "/save")
    public ResponseEntity<Kullanici> ekle (@RequestBody Kullanici kullanici){
        return ResponseEntity.ok(kullaniciService.save(kullanici));
    }

    @GetMapping(value = "/getById{id}")
    public ResponseEntity<Optional<Kullanici>> getById(@PathVariable Long id){
        return ResponseEntity.ok(kullaniciService.getById(id));
    }

    @GetMapping(value = "/kullanicilar")
    public ResponseEntity<List<Kullanici>> getAll(){
        return ResponseEntity.ok(kullaniciService.getAll());
    }
}
