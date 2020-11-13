package SOLID.SRP.solution;

public class VehicleSRP {

    public VehicleSRP() {
    }

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

    public void print(VehiclePrinter printer) {
        printer.print(this);
    }


}
