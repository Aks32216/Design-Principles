public class CircleShape implements Shape{
    private int x;
    private int y;
    private String color;
    private int r;

    CircleShape(int x,int y,String color,int r){
        this.x=x;
        this.y=y;
        this.color=color;
        this.r=r;
    }

    @Override
    public Shape clone() {
        return new CircleShape(this.x,this.y,this.color,this.r);
    }

    @Override
    public void setCoordinates(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public int[] getCoordinates() {
        return new int[]{x, y};
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public void setRadius(int r){
        this.r=r;
    }

    public int getRadius(){
        return this.r;
    }
}
