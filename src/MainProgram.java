import java.util.ArrayList;


public class MainProgram {

    public static void main(String[] args){


    }

    public static void prepareFruits (ArrayList<Fruit> fruits) {
        
        for (Fruit f : fruits){

            if (f instanceof TreeFruit){
                
                TreeFruit tf = (TreeFruit) f;
                tf.peel();

            }else if (f instanceof GroundFruit){

                GroundFruit tf = (GroundFruit) f;
                tf.pick();

            }

        }

   }
    
}
