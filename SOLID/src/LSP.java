class Bird {
    void fly() {
        System.out.println("Flying...");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

// ---------------------------------------------------------------------


interface Aves{
    // some common methods from all the aves
}

interface Flyable{
    void fly();
}

interface NonFlyable{
    void walk();
}

class Bird implements Flyable{
    @Override
    void fly(){
        System.out.println("Bird is flying");
    }
}

class Penguin implements NonFlyable{
    @Override
    void walk(){
        System.out.println("Penguin is walking");
    }
}