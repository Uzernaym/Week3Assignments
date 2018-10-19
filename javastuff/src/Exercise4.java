public class Exercise4 {
    public static void main(String args[]) {
        String name1 = "Baltimare"; //Starting point
        int[] coord1 = {29, 16};
        String name2 = "Manehattan";
        int[] coord2 = {34, 8};
        String name3 = "Los Pegasus";
        int[] coord3 = {6, 19};
        String name4 = "Ponyville";
        int[] coord4 = {16, 14};
        System.out.format("The distance from " + name1 + " to " + name2 + " to " + name3 + " to " + name4 + " and back is %.2f", totalTrip(coord1[0], coord1[1], coord2[0], coord2[1], coord3[0], coord3[1], coord4[0], coord4[1]));
    }
    public static double totalTrip(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)) + Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)) + Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
    }
}
