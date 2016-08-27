package fasJpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the notes_scolaires database table.
 * 
 */
@Entity
@Table(name="notes_scolaires")
@NamedQuery(name="NotesScolaire.findAll", query="SELECT n FROM NotesScolaire n")
public class NotesScolaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer notemax;

	private Integer noteobtenu;

	//bi-directional many-to-one association to Matiere
	@ManyToOne
	@JoinColumn(name="id_matiere")
	private Matiere matiere;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;

	public NotesScolaire() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNotemax() {
		return this.notemax;
	}

	public void setNotemax(Integer notemax) {
		this.notemax = notemax;
	}

	public Integer getNoteobtenu() {
		return this.noteobtenu;
	}

	public void setNoteobtenu(Integer noteobtenu) {
		this.noteobtenu = noteobtenu;
	}

	public Matiere getMatiere() {
		return this.matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}