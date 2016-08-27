package fasJpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the groupe_matiere database table.
 * 
 */
@Entity
@Table(name="groupe_matiere")
@NamedQuery(name="GroupeMatiere.findAll", query="SELECT g FROM GroupeMatiere g")
public class GroupeMatiere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nom;

	//bi-directional many-to-one association to Matiere
	@OneToMany(mappedBy="groupeMatiere")
	private List<Matiere> matieres;

	public GroupeMatiere() {
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

	public List<Matiere> getMatieres() {
		return this.matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public Matiere addMatiere(Matiere matiere) {
		getMatieres().add(matiere);
		matiere.setGroupeMatiere(this);

		return matiere;
	}

	public Matiere removeMatiere(Matiere matiere) {
		getMatieres().remove(matiere);
		matiere.setGroupeMatiere(null);

		return matiere;
	}

}