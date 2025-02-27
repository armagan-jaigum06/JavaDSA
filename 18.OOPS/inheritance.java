public class inheritance {
    public static void main(String[] args) {
        
    }
}

// Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}



// Derived Class

// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in Water");
//     }
// }
