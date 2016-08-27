package fasJpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the niveau_diplome database table.
 * 
 */
@Entity
@Table(name="niveau_diplome")
@NamedQuery(name="NiveauDiplome.findAll", query="SELECT n FROM NiveauDiplome n")
public class NiveauDiplome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String commentaire;

	private String nom;

	//bi-directional many-to-one association to Diplome
	@ManyToOne
	@JoinColumn(name="id_diplome")
	private Diplome diplome;

	//bi-directional many-to-one association to OffreEmploi
	@OneToMany(mappedBy="niveauDiplome")
	private List<OffreEmploi> offreEmplois;

	public NiveauDiplome() {
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

	public Diplome getDiplome() {
		return this.diplome;
	}

	public void setDiplome(Diplome diplome) {
		this.diplome = diplome;
	}

	public List<OffreEmploi> getOffreEmplois() {
		return this.offreEmplois;
	}

	public void setOffreEmplois(List<OffreEmploi> offreEmplois) {
		this.offreEmplois = offreEmplois;
	}

	public OffreEmploi addOffreEmploi(OffreEmploi offreEmploi) {
		getOffreEmplois().add(offreEmploi);
		offreEmploi.setNiveauDiplome(this);

		return offreEmploi;
	}

	public OffreEmploi removeOffreEmploi(OffreEmploi offreEmploi) {
		getOffreEmplois().remove(offreEmploi);
		offreEmploi.setNiveauDiplome(null);

		return offreEmploi;
	}

}