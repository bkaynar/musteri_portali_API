package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.entity.Tehis;
import com.botas.musteriPortali.musteri.service.TehisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tehis")
public class TehisController {

    private final TehisService tehisService;

    public TehisController(TehisService tehisService) {
        this.tehisService = tehisService;
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity<Tehis> ekle(@RequestBody Tehis tehis) {
        return ResponseEntity.ok(tehisService.save(tehis));
    }

    @PutMapping(value = "/gunle")
    public ResponseEntity<Tehis>gunle (@RequestBody Tehis tehis){
        return ResponseEntity.ok(tehisService.update(tehis));
    }
    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<Tehis>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(tehisService.getById(id));
    }

    @GetMapping(value = "/tehisler")
    public ResponseEntity<List<Tehis>> getAll() {
        return ResponseEntity.ok(tehisService.getAll());
    }

    @GetMapping(value = "/getByMusteriId/{musteriId}")
    public ResponseEntity<List<Tehis>> getByMusteriId(@PathVariable Long musteriId) {
        return ResponseEntity.ok(tehisService.getByMusteriId(musteriId));
    }
}
