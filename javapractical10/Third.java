class Animal {
    void ability() {
        System.out.println("Different animals have different abilities");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks!!");
    }

    void eat() {
        System.out.println("Dog eats bones and meat!!");
    }
}

class Catt extends Animal {
    void meow() {
        System.out.println("Cat does meow");
    }

    void eat() {
        System.out.println("Cat drinks milk");
    }
}

public class Third {
    public static void main(String[] args) {
        Dog d = new Dog();
        Catt c = new Catt();

        d.ability();
        d.bark();
        d.eat();

        c.ability();
        c.meow();
        c.eat();
    }
}
