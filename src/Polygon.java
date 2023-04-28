public class Polygon {
    private Point[] arr;
    public Style style;


    public Polygon(Point[] arr, Style style) {
        this.arr = arr;
        this.style = style;
    }

    public Polygon(int vertices, Style style) {
        this.arr = new Point[vertices];
        this.style = style;
    }

    public void setPointInArr(int index, Point point){
        if(index < arr.length) {
            this.arr[index] = point;
        }
    }

    public void setArr(Point[] newArr){
        this.arr = newArr;
    }

    public String toSvg(){
        String result = "<svg height=\"210\" width=\"500\">\n<line ";
        for(Point point : arr){
            result += "x=\"" + point.x + "\" y=\"" + point.y + "\" ";
        }

        if(style != null){
            result += style.toSvg();
        }
        else{
            result += "style=\"fill:none;stroke:black;stroke-width:1\"";
        }

        result += "/>\n</svg>\n";
        return result;
    }


    public static Polygon square(Segment line, Style style){
//        Point a = new Point(line.getP1().x, line.getP1().y);
//        Point b = new Point(line.getP1().x, line.getP2().y);
//        Point c = new Point(line.getP2().x, line.getP2().y);
//        Point d = new Point(line.getP2().x, line.getP1().y);

        Point[] tempArr = {new Point(line.getP1().x, line.getP1().y),   //a
                new Point(line.getP1().x, line.getP2().y),  //b
                new Point(line.getP2().x, line.getP2().y),  //c
                new Point(line.getP2().x, line.getP1().y)}; //d
        return new Polygon(tempArr, style);
    }
}
