package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the poste database table.
 * 
 */
@Entity
@NamedQuery(name="Poste.findAll", query="SELECT p FROM Poste p")
public class Poste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String commentaire;

	private String nom;

	//bi-directional many-to-one association to OffreEmploi
	@OneToMany(mappedBy="poste")
	private List<OffreEmploi> offreEmplois;

	public Poste() {
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

	public List<OffreEmploi> getOffreEmplois() {
		return this.offreEmplois;
	}

	public void setOffreEmplois(List<OffreEmploi> offreEmplois) {
		this.offreEmplois = offreEmplois;
	}

	public OffreEmploi addOffreEmploi(OffreEmploi offreEmploi) {
		getOffreEmplois().add(offreEmploi);
		offreEmploi.setPoste(this);

		return offreEmploi;
	}

	public OffreEmploi removeOffreEmploi(OffreEmploi offreEmploi) {
		getOffreEmplois().remove(offreEmploi);
		offreEmploi.setPoste(null);

		return offreEmploi;
	}

}