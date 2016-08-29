package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the formation database table.
 * 
 */
@Entity
@NamedQuery(name="Formation.findAll", query="SELECT f FROM Formation f")
public class Formation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private BigDecimal cout;

	private Integer duree;

	private String nom;

	private BigDecimal nombreplace;

	//bi-directional many-to-one association to Concour
	@OneToMany(mappedBy="formation")
	private List<Concours> concours;

	//bi-directional many-to-one association to Diplome
	@ManyToOne
	@JoinColumn(name="id_diplome")
	private Diplome diplome;

	//bi-directional many-to-one association to Etablissement
	@ManyToOne
	@JoinColumn(name="id_etablissement")
	private Etablissement etablissement;

	//bi-directional many-to-one association to Filiere
	@ManyToOne
	@JoinColumn(name="id_filiere")
	private Filiere filiere;

	//bi-directional many-to-one association to SousFiliere
	@ManyToOne
	@JoinColumn(name="id_sous_filiere")
	private SousFiliere sousFiliere;

	public Formation() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCout() {
		return this.cout;
	}

	public void setCout(BigDecimal cout) {
		this.cout = cout;
	}

	public Integer getDuree() {
		return this.duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public BigDecimal getNombreplace() {
		return this.nombreplace;
	}

	public void setNombreplace(BigDecimal nombreplace) {
		this.nombreplace = nombreplace;
	}

	public List<Concours> getConcours() {
		return this.concours;
	}

	public void setConcours(List<Concours> concours) {
		this.concours = concours;
	}

	public Concours addConcour(Concours concour) {
		getConcours().add(concour);
		concour.setFormation(this);

		return concour;
	}

	public Concours removeConcour(Concours concour) {
		getConcours().remove(concour);
		concour.setFormation(null);

		return concour;
	}

	public Diplome getDiplome() {
		return this.diplome;
	}

	public void setDiplome(Diplome diplome) {
		this.diplome = diplome;
	}

	public Etablissement getEtablissement() {
		return this.etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}

	public Filiere getFiliere() {
		return this.filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public SousFiliere getSousFiliere() {
		return this.sousFiliere;
	}

	public void setSousFiliere(SousFiliere sousFiliere) {
		this.sousFiliere = sousFiliere;
	}

}