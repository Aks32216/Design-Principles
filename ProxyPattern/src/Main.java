//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.png");

        // No image loading yet
        System.out.println("Image created.");

        // Actual loading happens only when display() is called
        image.display();
    }
}