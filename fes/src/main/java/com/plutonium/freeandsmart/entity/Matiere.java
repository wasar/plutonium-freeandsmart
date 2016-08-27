package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the matiere database table.
 * 
 */
@Entity
@NamedQuery(name="Matiere.findAll", query="SELECT m FROM Matiere m")
public class Matiere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nom;

	//bi-directional many-to-one association to GroupeMatiere
	@ManyToOne
	@JoinColumn(name="id_groupe_matiere")
	private GroupeMatiere groupeMatiere;

	//bi-directional many-to-one association to NotesScolaire
	@OneToMany(mappedBy="matiere")
	private List<NotesScolaire> notesScolaires;

	public Matiere() {
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

	public GroupeMatiere getGroupeMatiere() {
		return this.groupeMatiere;
	}

	public void setGroupeMatiere(GroupeMatiere groupeMatiere) {
		this.groupeMatiere = groupeMatiere;
	}

	public List<NotesScolaire> getNotesScolaires() {
		return this.notesScolaires;
	}

	public void setNotesScolaires(List<NotesScolaire> notesScolaires) {
		this.notesScolaires = notesScolaires;
	}

	public NotesScolaire addNotesScolaire(NotesScolaire notesScolaire) {
		getNotesScolaires().add(notesScolaire);
		notesScolaire.setMatiere(this);

		return notesScolaire;
	}

	public NotesScolaire removeNotesScolaire(NotesScolaire notesScolaire) {
		getNotesScolaires().remove(notesScolaire);
		notesScolaire.setMatiere(null);

		return notesScolaire;
	}

}