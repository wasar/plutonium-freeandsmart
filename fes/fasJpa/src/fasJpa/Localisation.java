package fasJpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the localisation database table.
 * 
 */
@Entity
@NamedQuery(name="Localisation.findAll", query="SELECT l FROM Localisation l")
public class Localisation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String adresse;

	private Integer codepostal;

	private String pays;

	private String ville;

	public Localisation() {
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

	public Integer getCodepostal() {
		return this.codepostal;
	}

	public void setCodepostal(Integer codepostal) {
		this.codepostal = codepostal;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}