//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Weapon handGun = new HandGun();

        System.out.println(handGun.getName());
        System.out.println(handGun.getPrice());

        handGun = new Scope(new arm(new Knife()));

        System.out.println(handGun.getPrice());
        System.out.println(handGun.getName());
    }
}