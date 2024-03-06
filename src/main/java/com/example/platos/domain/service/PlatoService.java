package com.example.platos.domain.service;

import com.example.platos.persistense.entity.Plato;

import java.util.List;

public interface PlatoService {
    List<Plato> getAllPlato();
    Plato getPlatoById(Long id);
    Plato savePlato(Plato plato);
    void deletePlato(Long id);
    Plato updatePlato(Plato plato);
}
