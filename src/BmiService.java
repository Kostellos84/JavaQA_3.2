public class BmiService {
public int Calculate (int weightKilograms, double heightMeters) {
    double index = (weightKilograms / Math.pow(heightMeters,2));
    int bmiIndex = (int) index;
    return bmiIndex;
}
}

