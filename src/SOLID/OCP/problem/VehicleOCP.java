package SOLID.OCP.problem;

import static SOLID.OCP.problem.VehicleType.CAR;

public class VehicleOCP {

    public VehicleType getType() {
        return CAR;
    }

    public void draw(VehicleOCP vehicle) {
        switch (vehicle.getType()) {
            case CAR:
                 drawCar(vehicle);
                break;
            case MOTORBIKE:
                 drawMotorbike(vehicle);
                break;
        }
    }



    private void drawCar(VehicleOCP vehicle){
        System.out.print(vehicle);
    }

    private void drawMotorbike(VehicleOCP vehicle){
        System.out.print(vehicle);
    }

}
