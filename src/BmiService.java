public class BmiService {
    public int calculate(double weightInKg, double heightInM) {
        double bmi = weightInKg / (heightInM * heightInM);
        return (int) bmi;
    }
}

