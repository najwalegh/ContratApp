package com.adria.contratapp.repositories;

import com.adria.contratapp.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
