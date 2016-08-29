package com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the concours database table.
 * 
 */
@Entity
@Table(name="concours")
@NamedQuery(name="Concour.findAll", query="SELECT c FROM Concours c")
public class Concours implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer agemax;

	private Integer agemin;

	private Integer cout;

	//TODO Timestamp ?
	private Timestamp date;

	private Integer duree;

	private String lieu;

	private String nom;

	private BigDecimal nombreplace;

	//bi-directional many-to-one association to Etablissement
	@ManyToOne
	@JoinColumn(name="id_etablissement")
	private Etablissement etablissement;

	//bi-directional many-to-one association to Formation
	@ManyToOne
	@JoinColumn(name="id_formation")
	private Formation formation;

	//bi-directional many-to-one association to CoursPreparation
	@OneToMany(mappedBy="concour")
	private List<CoursPreparation> coursPreparations;

	public Concours() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAgemax() {
		return this.agemax;
	}

	public void setAgemax(Integer agemax) {
		this.agemax = agemax;
	}

	public Integer getAgemin() {
		return this.agemin;
	}

	public void setAgemin(Integer agemin) {
		this.agemin = agemin;
	}

	public Integer getCout() {
		return this.cout;
	}

	public void setCout(Integer cout) {
		this.cout = cout;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getDuree() {
		return this.duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public BigDecimal getNombreplace() {
		return this.nombreplace;
	}

	public void setNombreplace(BigDecimal nombreplace) {
		this.nombreplace = nombreplace;
	}

	public Etablissement getEtablissement() {
		return this.etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}

	public Formation getFormation() {
		return this.formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public List<CoursPreparation> getCoursPreparations() {
		return this.coursPreparations;
	}

	public void setCoursPreparations(List<CoursPreparation> coursPreparations) {
		this.coursPreparations = coursPreparations;
	}

	public CoursPreparation addCoursPreparation(CoursPreparation coursPreparation) {
		getCoursPreparations().add(coursPreparation);
		coursPreparation.setConcour(this);

		return coursPreparation;
	}

	public CoursPreparation removeCoursPreparation(CoursPreparation coursPreparation) {
		getCoursPreparations().remove(coursPreparation);
		coursPreparation.setConcour(null);

		return coursPreparation;
	}

}