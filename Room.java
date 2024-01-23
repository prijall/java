public class Room {
    private int length;
    private int breadth;

    Room(int x, int y){
        this.length= x;
        this.breadth=y;
    }

    int area(){
        return (length * breadth);
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }
}

class Living extends Room{
    private int height;

    Living(int x , int y, int z){
        super(x, y);
        this.height=z;
    }

    int volume(){
        return (getLength() * getBreadth() * height);
    }
}
