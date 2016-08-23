package com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@Column(name = "NOM", nullable = false, length = 50)
    private String nom;
	
	@Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;
	
	@Column(name = "DATENAISSANCE", nullable = false)
    private Date dateNaissance;
	
	//Renommer en base
	@Column(name = "LIEUNAISSANCE", nullable = false, length = 50)
    private String lieu;
	
	@Column(name = "EMAIL", length = 50)
    private String email;
	
	@Column(name = "TELEPHONE", nullable = false, length = 50)
    private String telephone;
	
	@Column(name = "PAYS", nullable = false, length = 50)
    private String pays;
	
	@Column(name = "VILLE", nullable = false, length = 50)
    private String ville;
	
	@Column(name = "DATEINSCRIPTION", nullable = false)
    private Date dateInscription;
	
}
