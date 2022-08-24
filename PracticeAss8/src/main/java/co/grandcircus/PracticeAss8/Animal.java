package co.grandcircus.PracticeAss8;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("animals")
public class Animal {
	@Id
	private String id;
	private String name;
	private String species;
	private int weight;
	private ArrayList<String> traits;
	
	
	public Animal() {
		super();
	}

	public Animal(String name, String species, int weight, ArrayList<String> traits) {
		super();
		this.name = name;
		this.species = species;
		this.weight = weight;
		this.traits = traits;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public ArrayList<String> getTraits() {
		return traits;
	}
	public void setTraits(ArrayList<String> traits) {
		this.traits = traits;
	}
	
}
