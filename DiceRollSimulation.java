import java.util.Random;

public class DiceRollSimulation {
    public static void main(String[] args) {
        int[] sumFrequency = new int[11];
        Random random = new Random();
        int totalRolls = 1296;
        
        for (int i = 0; i < totalRolls; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;
            sumFrequency[sum - 2]++;
        }
        
        System.out.println("Sum\tFrequency");
        for (int i = 0; i < sumFrequency.length; i++) {
            System.out.println((i + 2) + "\t" + sumFrequency[i]);
        }
        
        double[] expectedFrequency = {1.0/36, 2.0/36, 3.0/36, 4.0/36, 5.0/36, 6.0/36, 5.0/36, 4.0/36, 3.0/36, 2.0/36, 1.0/36};
        double chiSquare = 0;
        for (int i = 0; i < sumFrequency.length; i++) {
            chiSquare += Math.pow((sumFrequency[i] - (expectedFrequency[i] * totalRolls)), 2) / (expectedFrequency[i] * totalRolls);
        }
        
        System.out.println("Chi-square value: " + chiSquare);
        if (chiSquare < 18.307) {
            System.out.println("The dice are unbiased");
        } else {
            System.out.println("The dice are biased");
        }
    }
}
