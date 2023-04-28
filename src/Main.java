import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point (1,2);
        Point p2 = new Point (4,5);
        Point p3 = new Point (6, 7);

        Point[] arr = {p1,p2,p3};

        Style testStyle = new Style("czerwony", "zielony", 2);

        Polygon testPolygon1 = new Polygon(3, testStyle);
        Polygon testPolygon2 = new Polygon(3, null);
        testPolygon1.setArr(arr);
        testPolygon2.setArr(arr);

//        System.out.println("Z uzyciem Styla:\n");
//        System.out.println(testPolygon1.toSvg());
//        System.out.println("Bez uzycia Styla:\n");
//        System.out.println(testPolygon2.toSvg());

        ArrayList<Polygon> polygons = new ArrayList<>();
        polygons.add(testPolygon1);
        polygons.add(testPolygon2);

        SvgScene scene = new SvgScene(polygons);

        String path = "C:\\Users\\puszk\\IdeaProjects\\powtorzenie_lab_1\\src\\";
        scene.save(path);


    }


}