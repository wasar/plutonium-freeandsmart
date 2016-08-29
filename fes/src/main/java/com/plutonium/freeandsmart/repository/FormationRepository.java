package com.plutonium.freeandsmart.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonium.freeandsmart.entity.Formation;

/**
 * <p>
 * Title : FormationRepository.java
 * </p>
 * <p>
 * Copyright : Copyright (c) 2016
 * </p>
 * <p>
 * Company : PLUTONIUM
 * </p>
 */
public interface FormationRepository extends JpaRepository<Formation, Integer> {

    public Page<Formation> findAllByOrderByDureeAsc(Pageable pageable);

}
