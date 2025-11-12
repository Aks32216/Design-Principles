public interface Shape {
    Shape clone();
    void setCoordinates(int x,int y);
    int[] getCoordinates();
    void setColor(String color);
    String getColor();
}
