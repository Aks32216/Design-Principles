public class TVObserver implements Observer{

    private int temp;
    private int humidity;

    @Override
    public void update(int temp,int humidity) {
        this.temp = temp;
        this.humidity=humidity;
    }

    void display(){
        System.out.println("Today Weathers: Temp: "+this.temp+"C  Humidity: "+this.humidity+"%");
    }
}
