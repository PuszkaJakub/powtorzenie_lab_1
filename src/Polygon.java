public class Polygon {
    private Point[] arr;

    public Polygon(int vertices) {
        this.arr = new Point[vertices];
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
        result += "/>\n</svg>\n";
        return result;
    }
}
