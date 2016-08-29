package com.plutonium.freeandsmart.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonium.freeandsmart.entity.Entreprise;

/**
 * <p>
 * Title : EntrepriseRepository.java
 * </p>
 * <p>
 * Copyright : Copyright (c) 2016
 * </p>
 * <p>
 * Company : PLUTONIUM
 * </p>
 */
public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

    public Page<Entreprise> findAllByOrderByNomAsc(Pageable pageable);

}
