package Goose;

public abstract class Goose {
    protected String species;
    public abstract void honk();
    public String getSpecies(){
        return  this.species;
    }
}
