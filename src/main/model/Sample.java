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
    public int getSeedNum() {
        return seeds;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        new Sample("mySample");
        System.out.println("I created a new sample.");
    }
}

