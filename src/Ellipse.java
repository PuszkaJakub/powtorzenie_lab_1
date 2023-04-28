public class Ellipse extends Shape{
    private Point center;
    private double r1;
    private double r2;
    private Style style;

    public Ellipse(Style style, Point center, double r1, double r2) {
        this.center = center;
        this.r1 = r1;
        this.r2 = r2;
        this.style = style;
    }

    @Override
    public String toSvg(){
        String result = "<svg height=\"140\" width=\"500\">";
        result += "<ellipse cx=\"" + center.x + " cy=\"" + center.y + " rx=\"" + r1 + " ry=\"" + r2 + "\"\n";
        result += style.toSvg();
        result += "</svg>\n";
        return result;
    }
}
//<svg height="140" width="500">
//<ellipse cx="200" cy="80" rx="100" ry="50"
//        style="fill:yellow;stroke:purple;stroke-width:2" />
//</svg>