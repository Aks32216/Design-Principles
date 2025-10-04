public class arm extends Decorator{
    public arm(Weapon weapon){
        super(weapon);
    }

    @Override
    public String getName() {
        return weapon.getName() + " arm";
    }

    @Override
    public int getPrice() {
        return weapon.getPrice() + 35;
    }
}
