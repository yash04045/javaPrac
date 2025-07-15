public class Class {
    public static void main(String args[]){
        Pen p1 = new Pen(); // created pen object called p1
        p1.setTip(5); // setting the tip of p1 to 5
        p1.steColor("Blue"); // setting the color of p1 to Blue
        System.out.println("Pen color: " + p1.color + ", Tip: " + p1.tip);
        p1.color = "Red"; // changing the color of p1 to Red
        System.out.println("Updated Pen color: " + p1.color + ", Tip: " + p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    void setTip(int newTip){
        tip = newTip;
    }

    void steColor(String newcColor){
        color = newcColor;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void calcPercent(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}