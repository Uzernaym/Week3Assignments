public class Exercise3 {
    public static void main(String args[]) {
     String startingDestination = "Baltimare";
     int[] dl = {29, 16};
     String destination2 = "Badlands";
     int [] d2 = {25, 24};
     String destination3 = "Neighagra Falls";
     int [] d3 = {22, 7};
     System.out.format("The shortest distance between " + startingDestination + ", " + destination2 + " and " + destination3 + " starting at " + startingDestination + " is %.2f", distance3(dl[0], dl[1], d2[0], d2[1], d3[0],d3[1]));
    }
    public static double distance3(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.min(Math.min(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2))), Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
    }
}
