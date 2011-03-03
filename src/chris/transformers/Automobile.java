package chris.transformers;

public class Automobile {
    private String name;
    private int bhp;
    private float length;
    private String fuelType;

    public Automobile(String name, int bhp, float length, String fuelType) {
        this.name = name;
        this.bhp = bhp;
        this.length = length;
        this.fuelType = fuelType;
    }

    public void move() {
        System.out.print(name + " having a bhp of " + bhp + " and a length of " + length + " and a fuelType of " + fuelType + " is now moving ");

    }

}
