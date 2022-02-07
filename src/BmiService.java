public class BmiService {
    public float calculate(float growth, float weight) {
//        float growth = 180;
//        float weight = 75;
        float index = weight / ((growth / 100) * (growth / 100));
        return index;
    }
}
