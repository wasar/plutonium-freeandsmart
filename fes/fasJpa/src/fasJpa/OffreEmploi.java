package fasJpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the offre_emploi database table.
 * 
 */
@Entity
@Table(name="offre_emploi")
@NamedQuery(name="OffreEmploi.findAll", query="SELECT o FROM OffreEmploi o")
public class OffreEmploi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Timestamp datedebut;

	private Timestamp datefin;

	private String description;

	private String nom;

	private Integer salaire;

	//bi-directional many-to-one association to Contrat
	@ManyToOne
	@JoinColumn(name="id_contrat")
	private Contrat contrat;

	//bi-directional many-to-one association to Entreprise
	@ManyToOne
	@JoinColumn(name="id_entreprise")
	private Entreprise entreprise;

	//bi-directional many-to-one association to NiveauDiplome
	@ManyToOne
	@JoinColumn(name="id_niveau_diplome")
	private NiveauDiplome niveauDiplome;

	//bi-directional many-to-one association to Poste
	@ManyToOne
	@JoinColumn(name="id_poste")
	private Poste poste;

	public OffreEmploi() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getDatedebut() {
		return this.datedebut;
	}

	public void setDatedebut(Timestamp datedebut) {
		this.datedebut = datedebut;
	}

	public Timestamp getDatefin() {
		return this.datefin;
	}

	public void setDatefin(Timestamp datefin) {
		this.datefin = datefin;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getSalaire() {
		return this.salaire;
	}

	public void setSalaire(Integer salaire) {
		this.salaire = salaire;
	}

	public Contrat getContrat() {
		return this.contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public Entreprise getEntreprise() {
		return this.entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public NiveauDiplome getNiveauDiplome() {
		return this.niveauDiplome;
	}

	public void setNiveauDiplome(NiveauDiplome niveauDiplome) {
		this.niveauDiplome = niveauDiplome;
	}

	public Poste getPoste() {
		return this.poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

}