package com.example.platos.web.controller;

import com.example.platos.domain.service.PlatoService;
import com.example.platos.persistense.entity.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platos")
@CrossOrigin("*")
public class PlatoController {
    private final PlatoService platoService;

    @Autowired
    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping
    public List<Plato> getAllProductos() {
        return platoService.getAllPlato();
    }

    @GetMapping("/{id}")
    public Plato getProductoById(@PathVariable Long id) {
        return platoService.getPlatoById(id);
    }

    @PostMapping
    public Plato saveProducto(@RequestBody Plato plato) {
        return platoService.savePlato(plato);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        platoService.deletePlato(id);
    }

    @PutMapping("/{id}")
    public Plato updatePlato(@RequestBody Plato plato, @PathVariable Long id) {
        Plato updatePlato= getProductoById(id);
        return platoService.updatePlato(plato);
    }
}
