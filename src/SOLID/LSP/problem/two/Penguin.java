package SOLID.LSP.problem.two;

public class Penguin extends Bird {

    @Override
    public String eat(){
        return "Fish";
    }

    @Override
    public String tweet(){
        return "Squawk";
    }

    @Override
    public void fly()  {
        try {
            throw new Exception("Penguins can’t fly");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}