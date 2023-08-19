package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Tahis;
import com.botas.musteriPortali.musteri.entity.Tehis;
import com.botas.musteriPortali.musteri.service.TahisService;
import com.botas.musteriPortali.musteri.service.TahisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tahis")
public class TahisController {

    private final TahisService tahisService;


    @PutMapping(value = "/gunle")
    public ResponseEntity<Tahis> gunle(@RequestBody Tahis tahis) {
        return ResponseEntity.ok(tahisService.update(tahis));
    }

    public TahisController(TahisService tahisService) {
        this.tahisService = tahisService;
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity<Tahis> ekle(@RequestBody Tahis tahis) {
        return ResponseEntity.ok(tahisService.save(tahis));
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<Tahis>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(tahisService.getById(id));
    }

    @GetMapping(value = "/tahisler")
    public ResponseEntity<List<Tahis>> getAll() {
        return ResponseEntity.ok(tahisService.getAll());
    }

    @GetMapping(value = "/getByMusteriId/{musteriId}")
    public ResponseEntity<List<Tahis>> getByMusteriId(@PathVariable Long musteriId) {
        return ResponseEntity.ok(tahisService.getByMusteriId(musteriId));
    }
}
