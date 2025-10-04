abstract public class Decorator extends Weapon {
    protected Weapon weapon;

    public Decorator(Weapon weapon){
        this.weapon=weapon;
    }
}
