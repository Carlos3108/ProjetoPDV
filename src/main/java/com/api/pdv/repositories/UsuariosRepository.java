package com.api.pdv.repositories;

import com.api.pdv.models.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuariosModel, UUID> {
}
