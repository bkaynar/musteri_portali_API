package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Istasyon;
import com.botas.musteriPortali.musteri.service.IstasyonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/istasyon")
public class IstasyonController {
    private final IstasyonService istasyonService;


    public IstasyonController(IstasyonService istasyonService) {
        this.istasyonService = istasyonService;
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity<Istasyon> ekle(@RequestBody Istasyon istasyon) {
        return ResponseEntity.ok(istasyonService.save(istasyon));
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<Istasyon>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(istasyonService.getById(id));
    }

    @GetMapping(value = "istasyonlar")
    public ResponseEntity<List<Istasyon>> getAll() {
        return ResponseEntity.ok(istasyonService.getAll());
    }
}
