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

        Musician musician = new Musician()
            //anonymous class of Musician
        {
            public void play(){
                System.out.println("Alex singing on guitar");
            }
            public void sound(){
                System.out.println("Piano playing...");
            }
        };
        musician.play();
        musician.sound();
        System.out.println("\n");

        // anonymous class of interface
        Guitar guitar = new Guitar() {
            @Override
            public void play() {
                System.out.println("Musician singing on Acoustic guitar");
            }
        };
        guitar.play();

        System.out.println("\n");

        Guitar guitarist = new Musician(); //polymorphism

        guitarist.play();
        guitarist.sound();
    }
}
