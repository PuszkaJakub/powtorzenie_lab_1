public class Main {
    public static void main(String[] args) {


        Point p1 = new Point (1,2);
        Point p2 = new Point (4,5);
        Point p3 = new Point (6, 7);

        Point[] arr = {p1,p2,p3};

        Polygon test = new Polygon(3);
        test.setArr(arr);

        System.out.println(test.toSvg());

    }


}