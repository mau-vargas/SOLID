package SOLID.LSP;


import SOLID.LSP.problem.two.Bird;
import SOLID.LSP.problem.two.Penguin;

public class MainBinds {


    public void startFlying(Bird bird){
        if(Penguin.class.isInstance(bird)){
            // can’t fly
            System.out.print("can’t fly");
        }else{
            bird.fly();
        }
    }

}


