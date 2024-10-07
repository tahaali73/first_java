public class draw{
    public static void main(String[] args){
        StdDraw.setPenRadius(0.02);
        double c = Math.sqrt(2.0)/2.0;
        StdDraw.line(0.0,0.0,1.0,0.0);
        StdDraw.line(1.0,0.0,0.5,c);
        StdDraw.line(0.5,c,0.0,0.0);
        StdDraw.point(0.5,c);
        StdDraw.text(0.5,0.3, "TAHA");

    }
}