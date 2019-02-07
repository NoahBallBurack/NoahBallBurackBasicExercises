public class Runner {
    public static void main(String[] args){
        Car prius= new Car(2015, "Toyota", "prius");
        System.out.println(prius.toString());
        prius.setMiles(100);
        System.out.println(prius.toString());
        Rectangle notASquare=new Rectangle(4.9, 6.33);
        System.out.println("Area: "+notASquare.getArea());
        System.out.println("Diagonal: "+notASquare.getDiagonal());
        System.out.println("This is a square: "+notASquare.isSquare());
    }
}
