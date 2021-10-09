/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Win10
 */
public class ListaPokemons {
    private String id;
    private String name;
    private String generation_id;
    private String height;
    private String weight;
    private String species;
    private String color;
    private String habitat;
    private String base_experience;

    public ListaPokemons(String id, String name, String generation_id, String height, String weight, String species, String color, String habitat, String base_experience) {
        this.id = id;
        this.name = name;
        this.generation_id = generation_id;
        this.height = height;
        this.weight = weight;
        this.species = species;
        this.color = color;
        this.habitat = habitat;
        this.base_experience = base_experience;
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

    public String getGeneration_id() {
        return generation_id;
    }

    public void setGeneration_id(String generation_id) {
        this.generation_id = generation_id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(String base_experience) {
        this.base_experience = base_experience;
    }
    
    
}
