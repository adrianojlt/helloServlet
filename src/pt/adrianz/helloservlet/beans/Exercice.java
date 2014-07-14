package pt.adrianz.helloservlet.beans;

import java.io.Serializable;

public class Exercice implements Serializable {

	private Integer id;
	private String name;

	private static final long serialVersionUID = 1L;
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
