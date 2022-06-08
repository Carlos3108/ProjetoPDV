package com.api.pdv.repositories;

import com.api.pdv.models.ComandaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComandaRepository extends JpaRepository<ComandaModel, Integer> {
}
