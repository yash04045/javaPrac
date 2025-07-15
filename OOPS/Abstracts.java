public class Abstracts {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.color = "Black";
        d.eat();
        Hen H = new Hen();
        H.eat();

        // Animal an = new Animal();   error statement, cannot instantiate abstract class

    }
}

abstract class Animal {
    String color;

    abstract void eat(); // Abstract method, no body
}
class Dog extends Animal {
    void eat(){
        System.out.println("Eat's pedigree");
    }
}

class Hen extends Animal {
    void eat(){
        System.out.println("Eat's Grains");
    }
}