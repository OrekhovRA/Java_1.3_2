public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = 180;
        float weight = 75;
        float result = service.calculate(growth, weight);
        System.out.println(result);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        float growth = 180;
//        float weight = 75;
//        float index = weight / ((growth / 100) * (growth / 100));
//        System.out.println(index);
//    }
//}