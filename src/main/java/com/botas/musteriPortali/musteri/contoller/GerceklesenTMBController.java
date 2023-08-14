package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.GerceklesenTMB;
import com.botas.musteriPortali.musteri.entity.Istasyon;
import com.botas.musteriPortali.musteri.service.GerceklesenTMBService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gerceklesen_tmb")
public class GerceklesenTMBController {
    private final GerceklesenTMBService gerceklesenTMBService;

    public GerceklesenTMBController(GerceklesenTMBService gerceklesenTMBService) {
        this.gerceklesenTMBService = gerceklesenTMBService;
    }
    @PostMapping(value = "/ekle")
    public ResponseEntity<GerceklesenTMB> ekle(@RequestBody GerceklesenTMB gerceklesenTMB) {
        return ResponseEntity.ok(gerceklesenTMBService.save(gerceklesenTMB));
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<GerceklesenTMB>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(gerceklesenTMBService.getById(id));
    }

    @GetMapping(value = "gerceklesen_tmb")
    public ResponseEntity<List<GerceklesenTMB>> getAll() {
        return ResponseEntity.ok(gerceklesenTMBService.getAll());
    }
}
