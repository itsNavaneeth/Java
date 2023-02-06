// abstract keyword
abstract class Animal {
    abstract void walk();
    Animal(){
        System.out.println("You created a new Animal");
    }
    public void eat(){
        System.out.println("Eats food");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("You created a new Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();
        // Animal animal = new Animal();
        horse.eat();
    }
}