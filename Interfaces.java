interface Animal{
    public void walk();
    // void eat();
}

interface Herbivore {
    void eat();

}

class Horse implements Animal, Herbivore {
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    public void eat(){
        System.out.println("Eats grass");
    }
}

public class Interfaces{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}