package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Bildirim;
import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.service.BildirimService;
import com.botas.musteriPortali.musteri.service.FaturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bildirim")
public class BildirimController {

    private final BildirimService bildirimService;

    public BildirimController( BildirimService bildirimService) {
        this.bildirimService = bildirimService;
        //Service olduğunu belirtmen gerekiyor
    }

    @PostMapping(value = "/ekle")//hepsine /ekle
    public ResponseEntity<Bildirim> ekle(@RequestBody Bildirim bildirim) {
        return ResponseEntity.ok(bildirimService.save(bildirim));
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<Bildirim>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(bildirimService.getById(id));
    }

    @GetMapping(value = "/bildirimler")
    public ResponseEntity<List<Bildirim>> getAll() {
        return ResponseEntity.ok(bildirimService.getAll());
    }
}
