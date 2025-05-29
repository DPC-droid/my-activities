package activity;
class Fish {
    public void eat() {
        System.out.println("Fish is Eating");
    }
}

class Shark extends Fish {
    public void eat() {
        System.out.println("Shark is Eating");
    }


public static void main( String args[]){
    Shark obj = new Shark();
    obj.eat();
}
}