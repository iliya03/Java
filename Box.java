

public class Box {
    private  int l, b, h;
    public Box(int L, int B, int H)
    {
        l=L;
        b=B;
        h=H;
    }

    public Box() {

    }
     public void display() {
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
        System.out.println("Height: " + h);
    }

    public static void main(String [] args)
    {
        Box obj = new Box(10, 7, 5);
        obj.display();
    }
}
