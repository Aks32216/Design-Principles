//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.add(new MobileObserver());
        weatherStation.add(new TVObserver());

        weatherStation.setData(12,15);
        weatherStation.setData(65,14);
    }
}