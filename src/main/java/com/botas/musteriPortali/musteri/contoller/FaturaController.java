package com.botas.musteriPortali.musteri.contoller;

import com.botas.musteriPortali.musteri.entity.Fatura;
import com.botas.musteriPortali.musteri.model.FaturaBilgiModel;
import com.botas.musteriPortali.musteri.service.FaturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fatura")
public class FaturaController {

    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
        //@service olduğunu belirtmen gerekiyor
    }

    @PostMapping(value = "/ekle")
    public ResponseEntity<Fatura> ekle(@RequestBody Fatura fatura) {
        return ResponseEntity.ok(faturaService.save(fatura));
    }


    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<Optional<Fatura>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(faturaService.getById(id));
    }

    @GetMapping(value = "/faturalar")
    public ResponseEntity<List<Fatura>> getAll() {
        return ResponseEntity.ok(faturaService.getAll());
    }

    @GetMapping(value = "/getMusteriFaturalar/{musteriId}")
    public ResponseEntity<List<Fatura>> getMusteriFaturalar(@PathVariable Long musteriId) {
        List<Fatura> faturalar = faturaService.getMusteriFaturalar(musteriId);
        return ResponseEntity.ok(faturalar);
    }

    @GetMapping(value = "/getLoginFatura/{musteriId}")
    public ResponseEntity<FaturaBilgiModel> getLoginFatura(@PathVariable Long musteriId) {
        return ResponseEntity.ok(faturaService.getLoginFatura(musteriId));
    }


    @GetMapping(value = "/getByAy{ay}")
    public ResponseEntity<Optional<Fatura>> getByay(@PathVariable int ay) {
        return ResponseEntity.ok(faturaService.getByay(ay));
    }
}
