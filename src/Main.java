import java.util.ArrayList;
import java.util.Locale;


public class Main {
    public static final Point test = new Point(2,3);

    public static void main(String[] args) {
        Style stylo = new Style("blue", "pink", 32);
        Shape poly = new Polygon(new Point[]{new Point(120,60), new Point(270,280), new Point(240,320), new Point(110,80)}, stylo);

        SvgScene scene=new SvgScene();
        scene.addShape(poly);
        String path = "C:\\Users\\puszk\\IdeaProjects\\powtorzenie_lab_1\\src\\";


        Style styla = new Style("red", "black", 1);
        Shape ellpise = new Ellipse(styla, test, 12, 3);
        scene.addShape(ellpise);
        System.out.println(ellpise.toSvg());

        scene.save(path);
    }
}