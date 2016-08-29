package com.plutonium.freeandsmart.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonium.freeandsmart.entity.CoursPreparation;

/**
 * <p>
 * Title : CoursPreparationRepository.java
 * </p>
 * <p>
 * Copyright : Copyright (c) 2016
 * </p>
 * <p>
 * Company : PLUTONIUM
 * </p>
 */
public interface CoursPreparationRepository extends JpaRepository<CoursPreparation, Integer> {

    public Page<CoursPreparation> findAllByOrderByOrganismeAsc(Pageable pageable);

}
