    public class Main {
        public static void main(String[] args) {
            BmiService bmiService = new BmiService();
            double weightInKg = 98;
            double heightInM = 1.87;
            int bmi = bmiService.calculate(weightInKg, heightInM);
            System.out.println("BMI: " + bmi);
        }
    }
