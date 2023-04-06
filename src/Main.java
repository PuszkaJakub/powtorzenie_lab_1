public class Main {
    public static void main(String[] args) {


        Point p1 = new Point (1,2);
        Point p2 = new Point (4,5);

        Segment line = new Segment(p1,p2);

        System.out.println(line.toSvg());

    }


}