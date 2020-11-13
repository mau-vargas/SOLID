package SOLID.LSP;

import SOLID.LSP.problem.two.Bird;
import SOLID.LSP.problem.two.Penguin;
import SOLID.LSP.solution.two.BirdSolution;
import SOLID.LSP.solution.two.DuckSolution;
import SOLID.LSP.solution.two.FlyingBird;
import SOLID.LSP.solution.two.PenguinSolution;
import org.junit.Assert;


public class MainBindsTest {

    @org.junit.Test
    public void testPenguinError() {
        Bird penguin = new Penguin();
        //penguin.fly();

       new MainBinds().startFlying(penguin);
    }

    //**********SUCCESS
    @org.junit.Test
    public void testDuckSuccess() {
        FlyingBird duck = new DuckSolution();
        duck.fly();
    }

    @org.junit.Test
    public void testPenguinSuccess() {
        BirdSolution son = new PenguinSolution();

        BirdSolution father = new BirdSolution();


        Assert.assertNotNull(son.eat(), father.eat());
        Assert.assertNotNull(son.tweet(), father.tweet());
    }


}