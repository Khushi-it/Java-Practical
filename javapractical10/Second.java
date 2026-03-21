class Car {
    void type() {
        System.out.println("There are different types of car:");
    }
}

class Bmw extends Car {
    void model() {
        System.out.println("BMW");
        System.out.println("501");
    }
}

class Color extends Bmw {
    void colour() {
        System.out.println("Blue");
    }
}

public class Second {
    public static void main(String[] args) {
        Color c = new Color();
        c.type();
        c.model();
        c.colour();
    }
}
