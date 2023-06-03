package com.example.project_space;

public class planet {

    private String name;
    private String planetDescription;
    private int planetResource;


    public planet(String name, String planetDescription, int planetResource) {
        this.name = name;
        this.planetDescription = planetDescription;
        this.planetResource = planetResource;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanetDescription() {
        return planetDescription;
    }

    public void setPlanetDescription(String planetDescription) {
        this.planetDescription = planetDescription;
    }
    public int getPlanetResource() {
        return planetResource;
    }

    public void setPlanetResource(int planetResource) {
        this.planetResource = planetResource;
    }

}