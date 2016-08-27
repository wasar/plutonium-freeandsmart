package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the entreprise database table.
 * 
 */
@Entity
@NamedQuery(name="Entreprise.findAll", query="SELECT e FROM Entreprise e")
public class Entreprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String commentaire;

	private String nom;

	//bi-directional many-to-one association to TypeEntreprise
	@ManyToOne
	@JoinColumn(name="id_type_entreprise")
	private TypeEntreprise typeEntreprise;

	//bi-directional many-to-one association to OffreEmploi
	@OneToMany(mappedBy="entreprise")
	private List<OffreEmploi> offreEmplois;

	public Entreprise() {
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

	public TypeEntreprise getTypeEntreprise() {
		return this.typeEntreprise;
	}

	public void setTypeEntreprise(TypeEntreprise typeEntreprise) {
		this.typeEntreprise = typeEntreprise;
	}

	public List<OffreEmploi> getOffreEmplois() {
		return this.offreEmplois;
	}

	public void setOffreEmplois(List<OffreEmploi> offreEmplois) {
		this.offreEmplois = offreEmplois;
	}

	public OffreEmploi addOffreEmploi(OffreEmploi offreEmploi) {
		getOffreEmplois().add(offreEmploi);
		offreEmploi.setEntreprise(this);

		return offreEmploi;
	}

	public OffreEmploi removeOffreEmploi(OffreEmploi offreEmploi) {
		getOffreEmplois().remove(offreEmploi);
		offreEmploi.setEntreprise(null);

		return offreEmploi;
	}

}