package com.plutonium.freeandsmart.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonium.freeandsmart.entity.Localisation;

/**
 * <p>
 * Title : LocalisationRepository.java
 * </p>
 * <p>
 * Copyright : Copyright (c) 2016
 * </p>
 * <p>
 * Company : PLUTONIUM
 * </p>
 */
public interface LocalisationRepository extends JpaRepository<Localisation, Integer> {

    public Page<Localisation> findAllByOrderByPaysAsc(Pageable pageable);

}
