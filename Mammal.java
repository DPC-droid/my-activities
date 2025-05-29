package activity;
import java.util.*;

public class Mammal {
    public void breathe() {
        System.out.println("I breathe like a Mammal");
    }

    public static void main(String[] args) {
        List<Mammal> mammals = new LinkedList<Mammal>();
        mammals.add(new Mammal());
        mammals.add(new Cat());
        mammals.add(new Dog());
        mammals.add(new Dalmatian());

        for (Mammal currentMammal : mammals) {
            currentMammal.breathe();
        }
    }
}