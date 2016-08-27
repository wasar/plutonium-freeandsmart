package fasJpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the diplome database table.
 * 
 */
@Entity
@NamedQuery(name="Diplome.findAll", query="SELECT d FROM Diplome d")
public class Diplome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String commentaire;

	private String niveau;

	private String nom;

	//bi-directional many-to-one association to Formation
	@OneToMany(mappedBy="diplome")
	private List<Formation> formations;

	//bi-directional many-to-one association to NiveauDiplome
	@OneToMany(mappedBy="diplome")
	private List<NiveauDiplome> niveauDiplomes;

	public Diplome() {
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

	public String getNiveau() {
		return this.niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
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
		formation.setDiplome(this);

		return formation;
	}

	public Formation removeFormation(Formation formation) {
		getFormations().remove(formation);
		formation.setDiplome(null);

		return formation;
	}

	public List<NiveauDiplome> getNiveauDiplomes() {
		return this.niveauDiplomes;
	}

	public void setNiveauDiplomes(List<NiveauDiplome> niveauDiplomes) {
		this.niveauDiplomes = niveauDiplomes;
	}

	public NiveauDiplome addNiveauDiplome(NiveauDiplome niveauDiplome) {
		getNiveauDiplomes().add(niveauDiplome);
		niveauDiplome.setDiplome(this);

		return niveauDiplome;
	}

	public NiveauDiplome removeNiveauDiplome(NiveauDiplome niveauDiplome) {
		getNiveauDiplomes().remove(niveauDiplome);
		niveauDiplome.setDiplome(null);

		return niveauDiplome;
	}

}