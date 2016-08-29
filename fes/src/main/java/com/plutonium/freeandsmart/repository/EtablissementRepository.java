package com.plutonium.freeandsmart.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonium.freeandsmart.entity.Etablissement;

/**
 * <p>
 * Title : EtablissementRepository.java
 * </p>
 * <p>
 * Copyright : Copyright (c) 2016
 * </p>
 * <p>
 * Company : PLUTONIUM
 * </p>
 */
public interface EtablissementRepository extends JpaRepository<Etablissement, Integer> {

    public Page<Etablissement> findAllByOrderByNomAsc(Pageable pageable);

}
