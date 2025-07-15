public class Abstract2 {
    public static void main(String[] args) {
        Hen h = new Hen(); // Heirarchy: Animal -> Dog -> Hen
    }
}

abstract class Animal {
    String color;

    Animal(){
        System.out.println("Animal constructor called");
    }

    abstract void eat(); // Abstract method, no body
}

class Dog extends Animal {

    Dog(){
        System.out.println("Dog constructor called");
    }
    void eat(){
        System.out.println("Eat's pedigree");
    }
}

class Hen extends Dog {

    Hen(){
        System.out.println("Hen constructor called");
    }
    void eat(){
        System.out.println("Eat's Grains");
    }
}