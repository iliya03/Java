class Cube {
    protected double height, width, depth;
    Cube(int x)
    {
        System.out.println("inside default Constructor: Cube");
    }
    double volume(){
        return height*width*depth;
    }
}

class Cubeweight extends Cube{
    double weight;
    Cubeweight(double h, double w, double d, double m)
    {
        super(5);
        System.out.println("inside Constructor: CUBEWEIGHT");
        height=h;
        width=w;
        depth=d;
        weight=m;
    }

}

class CubeInherit{
    public static void main (String []args)
    {
        Cubeweight cw1 = new Cubeweight(10, 10, 10, 20.5);
        Cubeweight cw2 = new Cubeweight(100, 100, 100, 200.5);
        System.out.println("cw1.volume()=" + cw1.volume());
        System.out.println("cw2.volume()=" + cw2.volume());

    }

}
