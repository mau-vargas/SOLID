package SOLID.LSP.solution.one;

//inmutabilidad

public class RectangleSolution  {

    public final int width;
    public final int height;

    public RectangleSolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }


}
