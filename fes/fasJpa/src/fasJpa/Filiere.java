package fasJpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the filiere database table.
 * 
 */
@Entity
@NamedQuery(name="Filiere.findAll", query="SELECT f FROM Filiere f")
public class Filiere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String commentaire;

	private String nom;

	//bi-directional many-to-one association to Formation
	@OneToMany(mappedBy="filiere")
	private List<Formation> formations;

	//bi-directional many-to-one association to SousFiliere
	@OneToMany(mappedBy="filiere")
	private List<SousFiliere> sousFilieres;

	public Filiere() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Formation> getFormations() {
		return this.formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public Formation addFormation(Formation formation) {
		getFormations().add(formation);
		formation.setFiliere(this);

		return formation;
	}

	public Formation removeFormation(Formation formation) {
		getFormations().remove(formation);
		formation.setFiliere(null);

		return formation;
	}

	public List<SousFiliere> getSousFilieres() {
		return this.sousFilieres;
	}

	public void setSousFilieres(List<SousFiliere> sousFilieres) {
		this.sousFilieres = sousFilieres;
	}

	public SousFiliere addSousFiliere(SousFiliere sousFiliere) {
		getSousFilieres().add(sousFiliere);
		sousFiliere.setFiliere(this);

		return sousFiliere;
	}

	public SousFiliere removeSousFiliere(SousFiliere sousFiliere) {
		getSousFilieres().remove(sousFiliere);
		sousFiliere.setFiliere(null);

		return sousFiliere;
	}

}