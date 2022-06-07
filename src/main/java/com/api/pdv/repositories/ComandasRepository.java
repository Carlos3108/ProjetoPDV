package com.api.pdv.repositories;

import com.api.pdv.models.ComandasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComandasRepository extends JpaRepository<ComandasModel, Integer> {
}
