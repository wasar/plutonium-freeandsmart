package com.plutonium.freeandsmart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "SOUS_FILIERE")
public class SousFiliere implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@Column(name = "NOM", nullable = false, length = 50)
    private String nom;
	
	@Column(name = "COMMENTAIRE", nullable = false, length = 200)
    private String commentaire;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SFI_FIL_ID", referencedColumnName = "ID", insertable = true, updatable = false, nullable = false)
    private Filiere filiere;
	
}