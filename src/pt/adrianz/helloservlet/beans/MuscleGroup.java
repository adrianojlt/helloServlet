package pt.adrianz.helloservlet.beans;

import java.io.Serializable;
import java.util.List;

public class MuscleGroup implements Serializable{
	
	private Integer id;
	private String name;
	private List<Exercice> exercices;

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
	
	public List<Exercice> getExercices() {
		return this.exercices;
	}
}
