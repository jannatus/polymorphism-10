class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat");
    }
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats flesh");
    }
    void sound() {
        System.out.println("Tiger growls");
    }
}

class Panther extends Animal {
    void eat() {
        System.out.println("Panther eats small animals");
    }
    void sound() {
        System.out.println("Panther snarls");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;
        a = new Lion();
        a.eat();
        a.sound();

        a = new Tiger();
        a.eat();
        a.sound();

        a = new Panther();
        a.eat();
        a.sound();
    }
}
