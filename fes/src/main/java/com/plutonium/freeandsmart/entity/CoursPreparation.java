package  com.plutonium.freeandsmart.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the cours_preparation database table.
 * 
 */
@Entity
@Table(name="cours_preparation")
@NamedQuery(name="CoursPreparation.findAll", query="SELECT c FROM CoursPreparation c")
public class CoursPreparation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Integer cout;

	private Timestamp datedebut;

	private Timestamp datefin;

	private String lieu;

	private String organisme;

	//bi-directional many-to-one association to Concour
	@ManyToOne
	@JoinColumn(name="id_concours")
	private Concours concour;

	public CoursPreparation() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCout() {
		return this.cout;
	}

	public void setCout(Integer cout) {
		this.cout = cout;
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

	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getOrganisme() {
		return this.organisme;
	}

	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}

	public Concours getConcour() {
		return this.concour;
	}

	public void setConcour(Concours concour) {
		this.concour = concour;
	}

}