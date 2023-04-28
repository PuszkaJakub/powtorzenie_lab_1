import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SvgScene {
    private ArrayList<Polygon> polygons;

    public SvgScene(ArrayList<Polygon> polygons) {
        this.polygons = polygons;
    }

    public void addPolygon(Polygon polygon){
        polygons.add(polygon);
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
            for(Polygon polygon : polygons){
                String line = "polygon:\n" + polygon.toSvg();

                file.write(line);
            }
            file.write("</body>\n</html>\n");
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
