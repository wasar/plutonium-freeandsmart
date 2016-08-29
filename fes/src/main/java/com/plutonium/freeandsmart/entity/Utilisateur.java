package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Temporal(TemporalType.DATE)
	private Date datenaissance;

	private String email;

	private String lieu;

	private String nom;

	private String pays;

	private String prenom;

	private String telephone;

	private String ville;

	//bi-directional many-to-one association to Avi
	@OneToMany(mappedBy="utilisateur")
	private List<Avis> avis;

	//bi-directional many-to-one association to NotesScolaire
	@OneToMany(mappedBy="utilisateur")
	private List<NotesScolaire> notesScolaires;

	public Utilisateur() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDatenaissance() {
		return this.datenaissance;
	}

	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Avis> getAvis() {
		return this.avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	public Avis addAvi(Avis avi) {
		getAvis().add(avi);
		avi.setUtilisateur(this);

		return avi;
	}

	public Avis removeAvi(Avis avi) {
		getAvis().remove(avi);
		avi.setUtilisateur(null);

		return avi;
	}

	public List<NotesScolaire> getNotesScolaires() {
		return this.notesScolaires;
	}

	public void setNotesScolaires(List<NotesScolaire> notesScolaires) {
		this.notesScolaires = notesScolaires;
	}

	public NotesScolaire addNotesScolaire(NotesScolaire notesScolaire) {
		getNotesScolaires().add(notesScolaire);
		notesScolaire.setUtilisateur(this);

		return notesScolaire;
	}

	public NotesScolaire removeNotesScolaire(NotesScolaire notesScolaire) {
		getNotesScolaires().remove(notesScolaire);
		notesScolaire.setUtilisateur(null);

		return notesScolaire;
	}

}