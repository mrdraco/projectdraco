package chris.transformers;

public class LandVehicles extends Automobile {
    private int noOfWheels;
    private String typeOfBreak;

    public LandVehicles(String name, int bhp, float length, String fuelType, int noOfWheels, String typeOfBreak) {
        super(name, bhp, length, fuelType);
        this.noOfWheels = noOfWheels;
        this.typeOfBreak = typeOfBreak;
    }

    public void move() {
        super.move();
        System.out.println("having " + noOfWheels + " wheels " + "and a " + typeOfBreak + " break");
    }
}
