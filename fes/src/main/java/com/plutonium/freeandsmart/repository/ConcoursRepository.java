package com.plutonium.freeandsmart.repository;

import java.awt.print.Pageable;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonium.freeandsmart.entity.Avis;
import com.plutonium.freeandsmart.entity.Concours;
import com.plutonium.freeandsmart.entity.Utilisateur;

/**
 * <p>
 * Title : ConcoursRepository.java
 * </p>
 * <p>
 * Copyright : Copyright (c) 2016
 * </p>
 * <p>
 * Company : PLUTONIUM
 * </p>
 */
public interface ConcoursRepository extends JpaRepository<Concours, Integer> {

    public Page<Concours> findAllByOrderByDateAsc(Pageable pageable);

}
