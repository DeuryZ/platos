package com.example.platos.domain.repository;

import com.example.platos.persistense.entity.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatoRepository extends JpaRepository<Plato, Long> {
}
