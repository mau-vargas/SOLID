package SOLID.LSP.problem.two;

public class Duck extends Bird {

    @Override
    public String eat(){
        return "Fish";
    }

    @Override
    public String tweet(){
        return "Quack";
    }

}
