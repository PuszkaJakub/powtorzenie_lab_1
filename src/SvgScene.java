import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SvgScene {
    private ArrayList<Shape> shapes;

    public SvgScene(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public SvgScene() {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void save(String path){
        try{
            path += "myHTMLFile.html";


            try{
                File myFile = new File(path);
                if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                } else {
                    System.out.println("File already exists.");
                }
                myFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            FileWriter file = new FileWriter(path);
            file.write("<!DOCTYPE html>\n<html>\n<body>\n");
            for(Shape shape : shapes){
                String line = "shape:\n" + shape.toSvg();

                file.write(line);
            }
            file.write("</body>\n</html>\n");
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
