package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the type_entreprise database table.
 * 
 */
@Entity
@Table(name="type_entreprise")
@NamedQuery(name="TypeEntreprise.findAll", query="SELECT t FROM TypeEntreprise t")
public class TypeEntreprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nom;

	//bi-directional many-to-one association to Entreprise
	@OneToMany(mappedBy="typeEntreprise")
	private List<Entreprise> entreprises;

	public TypeEntreprise() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Entreprise> getEntreprises() {
		return this.entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}

	public Entreprise addEntrepris(Entreprise entrepris) {
		getEntreprises().add(entrepris);
		entrepris.setTypeEntreprise(this);

		return entrepris;
	}

	public Entreprise removeEntrepris(Entreprise entrepris) {
		getEntreprises().remove(entrepris);
		entrepris.setTypeEntreprise(null);

		return entrepris;
	}

}