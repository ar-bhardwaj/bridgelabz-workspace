public class VolofEarth_7 {
    public static void main(String[] args) {

        double radius = 6378;

        // formula for the volume of a sphere: (4/3) * π * r^3
        double vol_Km3 = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        // using (1 mile = 1.6 km) -> volume conversion factor = 1.6^3
        double vol_Miles3 = vol_Km3 / Math.pow(1.6, 3);

        System.out.print("The volume of Earth in cubic kilometers is " + vol_Km3 + " and cubic miles is " + vol_Miles3);

    }

}
