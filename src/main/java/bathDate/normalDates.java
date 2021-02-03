package bathDate;

import java.io.Serializable;

public class normalDates implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private double time;
	private Integer banho;
	private Integer vasilhas;
	private Integer roupas;
	
	public normalDates(Integer id, String name, double time, Integer banho, Integer vasilhas, Integer roupas) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
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

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
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
		return "normalDates [id=" + id + ", name=" + name + ", time=" + time + ", banho=" + banho + ", vasilhas="
				+ vasilhas + ", roupas=" + roupas + "]";
	}	

}
