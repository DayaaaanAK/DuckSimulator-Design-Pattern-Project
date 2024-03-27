package Goose;

public class SnowGoose extends Goose {
    public SnowGoose(){
        this.species = "Snow Goose";
    }
    @Override
    public void honk() {
        System.out.println("Snow Goose honks");
    }
}
