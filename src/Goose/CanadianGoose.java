package Goose;

public class CanadianGoose extends Goose {
    public CanadianGoose(){
        this.species = "Canadian Goose";
    }
    @Override
    public void honk(){
        System.out.println("Canadian Goose honks");
    }
}
