package com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "FORMATION")
public class Formation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@Column(name = "NOM", nullable = false, length = 50)
    private String nom;
	
	@Column(name = "DUREE", nullable = false)
    private Integer duree;
	
	@Column(name = "COUT", nullable = false)
    private Integer cout;
	
	@Column(name = "NOMBREPLACE", nullable = false)
    private Integer nombrePlace;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FOR_FIL_ID", referencedColumnName = "ID", insertable = true, updatable = true, nullable = false)
    private Filiere filiere;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "FOR_SFI_ID", referencedColumnName = "ID", insertable = true, updatable = true, nullable = false)
    private SousFiliere sousFiliere;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FOR_ETA_ID", referencedColumnName = "ID", insertable = true, updatable = true, nullable = false)
    private Etablissement etablissement;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FOR_DIP_ID", referencedColumnName = "ID", insertable = true, updatable = true, nullable = false)
    private Diplome diplome;
	
}
