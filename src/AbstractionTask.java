abstract class Bike {
    int maxSpeed;

    public Bike(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void display(){
        System.out.println("Bike Class");
    }

    abstract void run();
}

class Honda extends Bike {

    public Honda(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    void run() {
        System.out.println("Honda running");
    }
}


public class AbstractionTask {
    public static void main(String[] args) {
        Bike bike = new Honda(260);
        bike.run();
        System.out.println("Max speed of Honda: " + bike.maxSpeed);

    }
}
