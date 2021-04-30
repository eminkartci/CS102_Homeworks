import java.util.ArrayList;


public class MainProgram {

    public static void main(String[] args){

        ArrayList<Fruit> fruits = new ArrayList<Fruit>(); fruits.add(new Apple());
        fruits.add(new Banana());
        fruits.add(new Strawberry());
        fruits.add(new Blackberry()); prepareFruits(fruits);

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
