package SOLID.LSP.solution.two;

public class DuckSolution extends FlyingBird{
    @Override
    public String eat(){
        return "Fish";
    }

    @Override
    public String tweet(){
        return "Quack";
    }

}
