import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Compare -3.1756 and -3.175: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("Compare 3.175 and 3.176: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("Compare 3.0 and 3.0: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("Compare -3.123 and 3.123: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static class DecimalComparator
    {
        public static boolean areEqualByThreeDecimalPlaces(double dNumberOne, double dNumberTwo)
        {
            BigDecimal bd1 = new BigDecimal(Double.toString(dNumberOne)); // Convert double to Big Decimal String
            BigDecimal bd2 = new BigDecimal(Double.toString(dNumberTwo)); // Convert doulbe to Big Decimal String

            bd1 = bd1.setScale(3, BigDecimal.ROUND_HALF_EVEN); // Set decimal places to 3
            bd2 = bd2.setScale(3, BigDecimal.ROUND_HALF_EVEN); // Set decimal places to 3

            if (bd1.equals(bd2)) return true;   // If values are equal then return true
            else return false;
        }
    }
}