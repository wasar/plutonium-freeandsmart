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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "ETABLISSEMENT")
public class Etablissement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@Column(name = "NOM", nullable = false, length = 50)
    private String nom;
	
	@Column(name = "VILLE", nullable = false, length = 50)
    private String ville;
	
	@Column(name = "PAYS", nullable = false, length = 50)
    private String pays;
	
	@Column(name = "ADRESSE", nullable = false, length = 50)
    private String adresse;
	
	@Column(name = "DATECREATION", nullable = false)
    private Date dateCreation;
	
	@Column(name = "TELEPHONE", nullable = false, length = 50)
    private String telephone;
	
	@Column(name = "EMAIL", nullable = false, length = 50)
    private String email;
	
	@Column(name = "DESCRIPTION", nullable = false, length = 50)
    private String description;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ETA_TYE_ID", referencedColumnName = "ID", insertable = true, updatable = false, nullable = false)
    private TypeEtablissement typeEtablissement;
	
}
