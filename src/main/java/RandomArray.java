import java.util.Arrays;

/**
 * @author Pavel Fedorov
 */

public class RandomArray {
    public static void main(String[] args) {
        double[] randArray = new double[20];
        double maxNeg = -10.1;
        double minPos = 10.1;
        int minPosIndex = 0, maxNegIndex = 0;
        double buffer;
        for (int i = 0; i < randArray.length; i++){
            randArray[i] = Math.random() * 20 - 10;
        }
        /*for (double d : randArray)
            System.out.println(d);*/
        for (int i = 0; i < randArray.length; i++) {
            if (randArray[i] < 0 & randArray[i] > maxNeg){
                maxNeg = randArray[i];
                maxNegIndex = i;
            }
            if (randArray[i] > 0 & randArray[i] < minPos){
                minPos = randArray[i];
                minPosIndex = i;
            }
        }
        buffer = randArray[maxNegIndex];
        randArray[maxNegIndex] = randArray[minPosIndex];
        randArray[minPosIndex] = buffer;
        System.out.printf("Min positive = %f, Max negative = %f", minPos, maxNeg);
    }
}
