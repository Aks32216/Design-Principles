public class RectangleShape implements Shape{

    private int x;
    private int y;
    private String color;
    private int l;
    private int b;

    RectangleShape(int x,int y,String color,int l,int b){
        this.x=x;
        this.y=y;
        this.color=color;
        this.l=l;
        this.b=b;
    }

    @Override
    public Shape clone() {
        return new RectangleShape(this.x,this.y,this.color,this.l,this.b);
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

    public void setDimensions(int l,int b){
        this.l=l;
        this.b=b;
    }

    public int[] getDimensions(){
        return new int[]{this.l,this.b};
    }
}
