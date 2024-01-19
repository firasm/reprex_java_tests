package model;

public class Sample {

    private String name;
    private int seeds;

    public Sample(String name){
        this.name = name;
        this.seeds = 0;
    }

    public void addSeed() {
        this.seeds++;
    }


}