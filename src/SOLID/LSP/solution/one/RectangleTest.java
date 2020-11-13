package SOLID.LSP.solution.one;


import SOLID.LSP.problem.one.Rectangle;
import SOLID.LSP.problem.one.Square;
import SOLID.LSP.solution.one.RectangleSolution;
import SOLID.LSP.solution.one.SquareSolution;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    /**Problem Test**/
    @org.junit.Test
    public void testAreaRectangle() {
        Rectangle r = new Rectangle();
        r.setWidth(5);
        r.setHeight(4);
        assertEquals(20, r.calculateArea());
    }


    @org.junit.Test
    public void testAreaSquare() {
        Rectangle r = new Square();
        r.setWidth(5);
        r.setHeight(4);
        assertEquals(20, r.calculateArea());
    }

    /************************/
    /**Solution test***/

    @org.junit.Test
    public void testAreaRectangleSolution() {
        RectangleSolution r = new RectangleSolution(5,4);

        assertEquals(20, r.calculateArea());
    }


    @org.junit.Test
    public void testAreaSquareSolution() {
        RectangleSolution r = new SquareSolution(4);

        assertEquals(16, r.calculateArea());
    }





}