package SOLID.OCP.solution;

abstract class VehicleOCP {

    public int getWheelCount() {
        return 4;
    }

    public int getMaxSpeed() {
        return 200;
    }
    public abstract void draw();


}
