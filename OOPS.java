class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing");
    }
    public void printColor(){
        System.out.println(color);
    }

    Pen(){
        System.out.println("Pen object created");
    }
}

class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen1.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();
    }
}