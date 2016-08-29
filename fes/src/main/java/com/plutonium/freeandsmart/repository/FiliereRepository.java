package com.plutonium.freeandsmart.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonium.freeandsmart.entity.Filiere;

/**
 * <p>
 * Title : FiliereRepository.java
 * </p>
 * <p>
 * Copyright : Copyright (c) 2016
 * </p>
 * <p>
 * Company : PLUTONIUM
 * </p>
 */
public interface FiliereRepository extends JpaRepository<Filiere, Integer> {

    public Page<Filiere> findAllByOrderByNomAsc(Pageable pageable);

}
