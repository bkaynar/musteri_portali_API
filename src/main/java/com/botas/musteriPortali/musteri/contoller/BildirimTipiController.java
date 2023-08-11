package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.BildirimTipi;
import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.service.BildirimTipiService;
import com.botas.musteriPortali.musteri.service.FaturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bildirimtipi")
public class BildirimTipiController {
    private final BildirimTipiService bildirimService;

    public BildirimTipiController(BildirimTipiService bildirimTipiService) {
        this.bildirimService = bildirimTipiService;
        //@service olduğunu belirtmen gerekiyor
    }

    @PostMapping
    public ResponseEntity<BildirimTipi> ekle(@RequestBody BildirimTipi bildirimTipi) {
        return ResponseEntity.ok(bildirimService.save(bildirimTipi));
    }

    @GetMapping(value = "/getbyId{id}")
    public ResponseEntity<Optional<BildirimTipi>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(bildirimService.getById(id));
    }
    @GetMapping(value = "/bildirimtipleri")
    public ResponseEntity<List<BildirimTipi>> getAll() {
        return ResponseEntity.ok(bildirimService.getAll());
    }
}
