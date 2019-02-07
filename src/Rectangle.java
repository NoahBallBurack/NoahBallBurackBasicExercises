public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        double area=this.length*this.width;
        return area;
    }

    public double getDiagonal(){
        double diagonal = java.lang.Math.sqrt((this.length*this.length)+(this.width*this.width));
        return diagonal;
    }

    public boolean isSquare(){
        if(this.length==this.width){
            return true;
        }else{
            return false;
        }
    }
}
