package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Tahis;
import com.botas.musteriPortali.musteri.entity.Tahmini;
import com.botas.musteriPortali.musteri.service.TahminiService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tahmini_tmb")
public class TahminiController {

    private final TahminiService tahminiService;

    public TahminiController(TahminiService tahminiService) {
        this.tahminiService = tahminiService;
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity<Tahmini> ekle(@RequestBody Tahmini tahmini) {
        return ResponseEntity.ok(tahminiService.save(tahmini));
    }


    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<Tahmini>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(tahminiService.getById(id));
    }

    @GetMapping(value = "/tahminiTMBler")
    public ResponseEntity<List<Tahmini>> getAll() {
        return ResponseEntity.ok(tahminiService.getAll());
    }
}