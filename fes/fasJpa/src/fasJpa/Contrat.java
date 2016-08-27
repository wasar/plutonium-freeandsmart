package fasJpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the contrat database table.
 * 
 */
@Entity
@NamedQuery(name="Contrat.findAll", query="SELECT c FROM Contrat c")
public class Contrat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String commentaire;

	private String nom;

	//bi-directional many-to-one association to OffreEmploi
	@OneToMany(mappedBy="contrat")
	private List<OffreEmploi> offreEmplois;

	public Contrat() {
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
		offreEmploi.setContrat(this);

		return offreEmploi;
	}

	public OffreEmploi removeOffreEmploi(OffreEmploi offreEmploi) {
		getOffreEmplois().remove(offreEmploi);
		offreEmploi.setContrat(null);

		return offreEmploi;
	}

}