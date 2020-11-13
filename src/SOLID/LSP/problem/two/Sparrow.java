package SOLID.LSP.problem.two;

public class Sparrow extends Bird {

    @Override
    public String eat(){
        return "Insect";
    }

    @Override
    public String tweet(){
        return "Chirp";
    }

}