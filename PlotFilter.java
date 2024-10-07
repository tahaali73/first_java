public class PlotFilter{
    public static void main(String[] argc){
        double xmin = StdIn.readDouble();
        double xmax = StdIn.readDouble();
        double ymin = StdIn.readDouble();
        double ymax = StdIn.readDouble();
        StdDraw.setXscale(xmin - 5, xmax + 5 );
        StdDraw.setYscale(ymin - 5, ymax + 5);
        while(!StdIn.isEmpty()){
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.setPenRadius(0.01);
            StdDraw.point(x,y);
        }
    }
}