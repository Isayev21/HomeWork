interface Guitar {
    default void sound() {
        System.out.println("Guitar playing...");
    }

    //abstract method
    void play();
}

class Musician implements Guitar {

    @Override
    public void play() {
        System.out.println("Musician singing song on guitar");
    }
}

public class InterfaceTask {
    public static void main(String[] args) {

        // anonymous class of interface
        Guitar guitar = new Guitar() {
            @Override
            public void play() {
                System.out.println("Musician singing on Acoustic guitar");
            }
        };
        guitar.play();

        Guitar guitarist = new Musician(); //polymorphism

        guitarist.play();
        guitarist.sound();
    }
}
