package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Musteri;
import com.botas.musteriPortali.musteri.service.MusteriService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musteri")
public class MusteriController {

    private final MusteriService musteriService;

    public MusteriController(MusteriService musteriService) {
        this.musteriService = musteriService;
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity< Musteri> ekle (@RequestBody Musteri musteri){
        return ResponseEntity.ok(musteriService.save(musteri));
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<Musteri>> getById(@PathVariable Long id){
        return ResponseEntity.ok(musteriService.getById(id));
    }

    @GetMapping(value = "/musteriler")
    public ResponseEntity<List<Musteri>> getAll(){
        return ResponseEntity.ok(musteriService.getAll());
    }


}
