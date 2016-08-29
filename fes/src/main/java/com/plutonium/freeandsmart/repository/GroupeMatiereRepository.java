package com.plutonium.freeandsmart.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonium.freeandsmart.entity.GroupeMatiere;

/**
 * <p>
 * Title : GroupeMatiereRepository.java
 * </p>
 * <p>
 * Copyright : Copyright (c) 2016
 * </p>
 * <p>
 * Company : PLUTONIUM
 * </p>
 */
public interface GroupeMatiereRepository extends JpaRepository<GroupeMatiere, Integer> {

    public Page<GroupeMatiere> findAllByOrderByNomAsc(Pageable pageable);
}
