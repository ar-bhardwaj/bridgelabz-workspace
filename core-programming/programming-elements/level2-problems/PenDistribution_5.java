public class PenDistribution_5 {
    public static void main(String[] args) {

        int totalPen = 14;
        int students = 3;

        int pensPerStudent = totalPen / students; // equally divions

        int remainingPens = totalPen % students; // remaining pens

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is "
                + remainingPens);
    }

}
