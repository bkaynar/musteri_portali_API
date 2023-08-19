package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.STuketici;
import com.botas.musteriPortali.musteri.entity.Tahis;
import com.botas.musteriPortali.musteri.service.STuketiciService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/serbesttuketici")
public class STuketiciController {
    private final STuketiciService tuketiciService;

    public STuketiciController(STuketiciService tuketiciService) {
        this.tuketiciService = tuketiciService;
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity<STuketici> ekle(@RequestBody STuketici sTuketici) {
        return ResponseEntity.ok(tuketiciService.save(sTuketici));
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<STuketici>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(tuketiciService.getById(id));
    }

    @GetMapping(value = "/tuketiciler")
    public ResponseEntity<List<STuketici>> getAll() {
        return ResponseEntity.ok(tuketiciService.getAll());
    }

}

