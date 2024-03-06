package com.example.platos.domain.service;

import com.example.platos.domain.repository.PlatoRepository;
import com.example.platos.persistense.entity.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PlatoServiceImpl implements PlatoService{

    private final PlatoRepository platoRepository;

    @Autowired
    public PlatoServiceImpl(PlatoRepository platoRepository){
        this.platoRepository = platoRepository;
    }

    @Override
    public List<Plato> getAllPlato() {
        return platoRepository.findAll();
    }

    @Override
    public Plato getPlatoById(Long id) {
        Optional<Plato> optionalPlato = platoRepository.findById(id);
        return optionalPlato.orElse(null);
    }

    @Override
    public Plato savePlato(Plato plato) {
        return platoRepository.save(plato);
    }

    @Override
    public void deletePlato(Long id) {
        platoRepository.deleteById(id);
    }

    @Override
    public Plato updatePlato(Plato plato) {
        return platoRepository.save(plato);
    }
}
