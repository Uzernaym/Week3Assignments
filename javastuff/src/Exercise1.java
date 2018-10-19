public class Exercise1 {
    public static void main(String args[]) {
        double diameter = 10; //Can be changed
        System.out.format("The length of the trip is %.2f", roadTrip(diameter)); //Prints result of circumference
    }
    public static double roadTrip(double d) {
        return Math.PI*d; //PI times diameter = circumference
    }
}
