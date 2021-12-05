public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        double height = 1.62;
        double BMI = service.calculate(weight, height);
        System.out.println(BMI);
    }
}