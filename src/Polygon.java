public class Polygon {
    private Point[] arr;
    public Style style;

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
}
