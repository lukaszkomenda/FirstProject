package CodeWars;

public class Calculate {
    public static String bmi(double weight, double height) {

        double bmiValue = weight / Math.pow(height,2);

        if (bmiValue <= 18.5){
            return "Underweight";
        } else if (bmiValue > 18.5 && bmiValue <= 25.0){
            return "Normal";
        } else if (bmiValue > 25.0 && bmiValue <= 30.0){
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
