public class Scope extends Decorator{
    public Scope(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getName() {
        return weapon.getName() + " Scope";
    }

    @Override
    public int getPrice() {
        return weapon.getPrice() + 50;
    }
}
