package projeto.spring.dio_desafio.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.spring.dio_desafio.service.ConversorService;

import java.math.BigDecimal;
import java.util.Map;

@RestController
@RequestMapping("/api/conversor")
public class ConversorController {

    private final ConversorService conversorService;

    public ConversorController(ConversorService conversorService) {
        this.conversorService = conversorService;
    }

    @GetMapping("/moedas")
    public ResponseEntity<Map<String, Object>> listarMoedas() {
        return ResponseEntity.ok(conversorService.listarMoedasSuportadas());
    }

    @GetMapping("/{origem}/{destino}/{valor}")
    public ResponseEntity<Map<String, Object>> converter(
            @PathVariable String origem,
            @PathVariable String destino,
            @PathVariable BigDecimal valor) {

        Map<String, Object> resultado = conversorService.converterMoeda(origem, destino, valor);
        return ResponseEntity.ok(resultado);
    }
}