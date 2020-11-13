package SOLID.SRP.problem;

public class VehicleSRP {

    public int getWheelCount() {
        return 4;
    }

    public int getMaxSpeed() {
        return 200;
    }

    @Override
    public String toString() {
        return "wheelCount=" + getWheelCount() + ", maxSpeed=" + getMaxSpeed();
    }

    public void print() {
        System.out.print(toString());
    }

}
