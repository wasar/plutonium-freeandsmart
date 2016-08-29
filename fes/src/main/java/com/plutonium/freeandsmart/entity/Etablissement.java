package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the etablissement database table.
 * 
 */
@Entity
@NamedQuery(name="Etablissement.findAll", query="SELECT e FROM Etablissement e")
public class Etablissement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String adresse;

	@Temporal(TemporalType.DATE)
	private Date datecreation;

	private String description;

	private String email;

	private String nom;

	private String pays;

	private String telephone;

	private String ville;

	//bi-directional many-to-one association to Concour
	@OneToMany(mappedBy="etablissement")
	private List<Concours> concours;

	//bi-directional many-to-one association to TypeEtablissement
	@ManyToOne
	@JoinColumn(name="id_type")
	private TypeEtablissement typeEtablissement;

	//bi-directional many-to-one association to Formation
	@OneToMany(mappedBy="etablissement")
	private List<Formation> formations;

	public Etablissement() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDatecreation() {
		return this.datecreation;
	}

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<Concours> getConcours() {
		return this.concours;
	}

	public void setConcours(List<Concours> concours) {
		this.concours = concours;
	}

	public Concours addConcour(Concours concour) {
		getConcours().add(concour);
		concour.setEtablissement(this);

		return concour;
	}

	public Concours removeConcour(Concours concour) {
		getConcours().remove(concour);
		concour.setEtablissement(null);

		return concour;
	}

	public TypeEtablissement getTypeEtablissement() {
		return this.typeEtablissement;
	}

	public void setTypeEtablissement(TypeEtablissement typeEtablissement) {
		this.typeEtablissement = typeEtablissement;
	}

	public List<Formation> getFormations() {
		return this.formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public Formation addFormation(Formation formation) {
		getFormations().add(formation);
		formation.setEtablissement(this);

		return formation;
	}

	public Formation removeFormation(Formation formation) {
		getFormations().remove(formation);
		formation.setEtablissement(null);

		return formation;
	}

}