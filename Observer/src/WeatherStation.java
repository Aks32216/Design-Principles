import java.util.ArrayList;

public class WeatherStation implements Subject {

    private final ArrayList<Observer> observers;
    private int temp;
    private int humidity;

    WeatherStation(){
        this.observers=new ArrayList<>();
        this.temp = 0;
        this.humidity = 0;
    }

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUsers() {
        System.out.println("Sending Notification to users about update");
        for (Observer observer : observers) {
            observer.update(temp,humidity);
        }
    }

    public void getData(){
        System.out.println("Today Weathers: Temp: "+this.temp+"C  Humidity: "+this.humidity+"%");
    }

    public void setData(int humidity,int temp){
        this.humidity = humidity;
        this.temp = temp;
        this.notifyUsers();
    }
}
