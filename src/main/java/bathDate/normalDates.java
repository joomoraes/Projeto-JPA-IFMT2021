package bathDate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class normalDates implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double tempoB;
	private double tempoV;
	private double tempoR;
	private Integer banho;
	private Integer vasilhas;
	private Integer roupas;
	 
	public normalDates(Integer id, String name, double tempoB, double tempoV, double tempoR, Integer banho,
			Integer vasilhas, Integer roupas) {
		super();
		this.id = id;
		this.name = name;
		this.tempoB = tempoB;
		this.tempoV = tempoV;
		this.tempoR = tempoR;
		this.banho = banho;
		this.vasilhas = vasilhas;
		this.roupas = roupas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTempoB() {
		return tempoB;
	}

	public void setTempoB(double tempoB) {
		this.tempoB = tempoB;
	}

	public double getTempoV() {
		return tempoV;
	}

	public void setTempoV(double tempoV) {
		this.tempoV = tempoV;
	}

	public double getTempoR() {
		return tempoR;
	}

	public void setTempoR(double tempoR) {
		this.tempoR = tempoR;
	}

	public Integer getBanho() {
		return banho;
	}

	public void setBanho(Integer banho) {
		this.banho = banho;
	}

	public Integer getVasilhas() {
		return vasilhas;
	}

	public void setVasilhas(Integer vasilhas) {
		this.vasilhas = vasilhas;
	}

	public Integer getRoupas() {
		return roupas;
	}

	public void setRoupas(Integer roupas) {
		this.roupas = roupas;
	}

	@Override
	public String toString() {
		return "normalDates [id=" + id + ", name=" + name + ", tempoB=" + tempoB + ", tempoV=" + tempoV + ", tempoR="
				+ tempoR + ", banho=" + banho + ", vasilhas=" + vasilhas + ", roupas=" + roupas + "]";
	}
	
	
	
	

}
