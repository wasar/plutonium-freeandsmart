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
import javax.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "CONCOURS")
public class Concours implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@Column(name = "NOM", nullable = false, length = 50)
    private String nom;
	
	@Column(name = "DATE", nullable = false)
    private Date date;
	
	@Column(name = "DUREE", nullable = false)
    private Integer duree;
	
	@Column(name = "DATE", nullable = false)
    private Integer nombrePlaces;
	
	@Column(name = "LIEU", nullable = false, length = 50)
    private String lieu;
	
	@Column(name = "AGEMIN", nullable = false)
    private Integer ageMin;
	
	@Column(name = "AGEMAX", nullable = false)
    private Integer ageMax;
	
	@Column(name = "COUT", nullable = false)
    private Integer cout;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CON_ETA_ID", referencedColumnName = "ID", insertable = true, updatable = true, nullable = false)
    private Etablissement etablissement;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CON_FOR_ID", referencedColumnName = "ID", insertable = true, updatable = true, nullable = false)
    private Formation formation;
	
}
