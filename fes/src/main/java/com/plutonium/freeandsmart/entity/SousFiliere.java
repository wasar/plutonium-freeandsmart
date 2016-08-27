package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sous_filiere database table.
 * 
 */
@Entity
@Table(name="sous_filiere")
@NamedQuery(name="SousFiliere.findAll", query="SELECT s FROM SousFiliere s")
public class SousFiliere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String commentaire;

	private String nom;

	//bi-directional many-to-one association to Formation
	@OneToMany(mappedBy="sousFiliere")
	private List<Formation> formations;

	//bi-directional many-to-one association to Filiere
	@ManyToOne
	@JoinColumn(name="id_filiere")
	private Filiere filiere;

	public SousFiliere() {
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
		formation.setSousFiliere(this);

		return formation;
	}

	public Formation removeFormation(Formation formation) {
		getFormations().remove(formation);
		formation.setSousFiliere(null);

		return formation;
	}

	public Filiere getFiliere() {
		return this.filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

}