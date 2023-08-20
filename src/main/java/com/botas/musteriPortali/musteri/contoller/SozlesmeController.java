package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Sozlesme;
import com.botas.musteriPortali.musteri.service.SozlesmeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sozlesme")
public class SozlesmeController {
    private final SozlesmeService sozlesmeService;

    public SozlesmeController(SozlesmeService sozlesmeService) {
        this.sozlesmeService = sozlesmeService;
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity<Sozlesme> ekle(@RequestBody Sozlesme sozlesme) {
        return ResponseEntity.ok(sozlesmeService.save(sozlesme));
    }


    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Sozlesme> getById(@PathVariable Long id) {
        return ResponseEntity.ok(sozlesmeService.getById(id));
    }

    @GetMapping(value = "/sozlesmeler")
    public ResponseEntity<List<Sozlesme>> getAll() {
        return ResponseEntity.ok(sozlesmeService.getAll());
    }


    @GetMapping(value = "/getMusteriyillikSozlesme/{yil}/{musteriId}")
    public ResponseEntity<Sozlesme> getyillikSozlesme(@PathVariable int yil, @PathVariable Long musteriId) {
        return ResponseEntity.ok(sozlesmeService.getyillikSozlesme(yil, musteriId));
    }




}
