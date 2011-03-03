package chris.transformers;

public class TransformersAction {

    public static void main(String[] args) {
        LandVehicles ml = new LandVehicles("ml 500", 200, 3.5F, "petrol", 4, "disk");
        LandVehicles truck = new LandVehicles("Lorry", 300, 6, "diesel", 16, "air");
        ml.move();
        truck.move();

    }
}
