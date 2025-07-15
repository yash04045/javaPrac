public class Interface {
    public static void main(String[] args){
        Bear b = new Bear();
        b.eatMeat();
        b.eatGrass();
    }
}

interface Carnivore{
    void eatMeat();
}

interface Herbivore{
    void eatGrass();
}

class Bear implements Carnivore, Herbivore{
    public void eatMeat(){
        System.out.println("Bear eats meat");
    }

    public void eatGrass(){
        System.out.println("Bear Eats Grass");
    }
}