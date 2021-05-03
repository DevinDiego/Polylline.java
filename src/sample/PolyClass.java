package sample;

public class PolyClass {

    private int max_points;
    private int circle_width;
    private int line_width;


    public PolyClass(int max_points, int circle_width, int line_width) {
        this.max_points = max_points;
        this.circle_width = circle_width;
        this.line_width = line_width;
    }

    public int getMax_points() {
        return max_points;
    }

    public void setMax_points(int max_points) {
        this.max_points = max_points;
    }

    public int getCircle_width() {
        return circle_width;
    }

    public void setCircle_width(int circle_width) {
        this.circle_width = circle_width;
    }

    public int getLine_width() {
        return line_width;
    }

    public void setLine_width(int line_width) {
        this.line_width = line_width;
    }
}


