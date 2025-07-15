public class Inheritance {
    public static void main(String args[]){
        
        // Dog d = new Dog();
        // d.eat();
        // d.breathes();
        // d.bark();

        Lion L = new Lion();
        L.color = "Yellow";
        L.legs = 4;
        L.eat();
        System.out.println("Color: " + L.color);
        System.out.println("Legs: " + L.legs);
    }
}


class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Lion extends Mammal{
    void roar(){
        System.out.println("roars");
    }
}



// class Dog extends Animal{
//     void bark(){
//         System.out.println("barks");
//     }

//     void sleep(){
//         System.out.println("sleeps");
//     }
// }