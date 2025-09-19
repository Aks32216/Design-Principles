interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {
        System.out.println("Robot working...");
    }
    public void eat() {
        // What should a robot do here? 🤔
    }
}

//-------------------------------------------------------------------

interface Workable{
    public void work();
}

interface Eatable{
    public void eat();
}

class Robot implements Workable{
    @Override
    public void work(){
        System.out.println("Robot is working.......");
    }
}