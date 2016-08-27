package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the type_etablissement database table.
 * 
 */
@Entity
@Table(name="type_etablissement")
@NamedQuery(name="TypeEtablissement.findAll", query="SELECT t FROM TypeEtablissement t")
public class TypeEtablissement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nom;

	//bi-directional many-to-one association to Etablissement
	@OneToMany(mappedBy="typeEtablissement")
	private List<Etablissement> etablissements;

	public TypeEtablissement() {
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

	public List<Etablissement> getEtablissements() {
		return this.etablissements;
	}

	public void setEtablissements(List<Etablissement> etablissements) {
		this.etablissements = etablissements;
	}

	public Etablissement addEtablissement(Etablissement etablissement) {
		getEtablissements().add(etablissement);
		etablissement.setTypeEtablissement(this);

		return etablissement;
	}

	public Etablissement removeEtablissement(Etablissement etablissement) {
		getEtablissements().remove(etablissement);
		etablissement.setTypeEtablissement(null);

		return etablissement;
	}

}