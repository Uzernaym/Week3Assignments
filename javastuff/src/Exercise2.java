public class Exercise2 {
    public static void main(String args[]) {
        System.out.format("Distance from Baltimare to Manehattan = %.2f%n", distance(29, 16, 34, 8));
        System.out.format("Distance from Los Pegasus to Neighagra Falls = %.2f%n", distance(6, 19, 22, 7));
        System.out.format("Distance from Badlands to Ponyville = %.2f%n", distance(25, 24, 16, 14));
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
