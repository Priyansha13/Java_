// Abstract class Robber

import java.util.Arrays;

abstract class Robber {
    //methods
    public void RobbingClass(){
        System.out.println("MScAI&ML");
    };

    abstract int RowHouses(int[] money);
    abstract int RoundHouses(int[] money);
    abstract int SquareHouses(int[] money);
    abstract int MultiHouseBuilding(int[] money);

    // Default method
    void MachineLearning() {
        System.out.println("I love Machine Learning.");
    }
}

// child class
class JAVAProfessionalRobber extends Robber {
    // Implementation of abstract method RowHouses
    @Override
    int RowHouses(int[] moneyInEachRowHouse) {
        if (moneyInEachRowHouse.length != 4) {
            throw new IllegalArgumentException("RowHouses array must have exactly 4 elements.");
        }
    
        // Calculate the three possible outcomes
        int option1 = moneyInEachRowHouse[0] + moneyInEachRowHouse[2];
        int option2 = moneyInEachRowHouse[1] + moneyInEachRowHouse[3];
        int option3 = moneyInEachRowHouse[0] + moneyInEachRowHouse[3];

        // Find and return the maximum of the three options
        return Math.max(option1, Math.max(option2, option3));
    }

        

    // Implementation of abstract method RoundHouses
    @Override
    int RoundHouses(int[] moneyInEachRoundHouse) {
        if (moneyInEachRoundHouse.length != 4) {
            throw new IllegalArgumentException("RoundHouses array must have exactly 4 elements.");
        }
        
        // Calculate the two possible outcomes
        int option1 = moneyInEachRoundHouse[0] + moneyInEachRoundHouse[2];
        int option2 = moneyInEachRoundHouse[1] + moneyInEachRoundHouse[3];

        // Find and return the maximum of the two options
        return Math.max(option1, option2);
    }
    
    // Implementation of abstract method SquareHouses
    @Override
    int SquareHouses(int[] moneyInEachSquareHouse) {
        if (moneyInEachSquareHouse.length != 4) {
            throw new IllegalArgumentException("SquareHouses array must have exactly 4 elements.");
        }

        // Calculate the two possible outcomes
        int option1 = moneyInEachSquareHouse[0] + moneyInEachSquareHouse[2];
        int option2 = moneyInEachSquareHouse[1] + moneyInEachSquareHouse[3];

        // Find and return the maximum of the two options
        return Math.max(option1, option2);
    }

    // Implementation of abstract method multiple housee
    @Override
    int MultiHouseBuilding(int[] moneyInEachHouseType) {
        if (moneyInEachHouseType.length != 6) {
            throw new IllegalArgumentException("MultiHouseBuilding array must have exactly 6 elements.");
        }

        int n = moneyInEachHouseType.length;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return moneyInEachHouseType[0];
        }

        int[] dp = new int[n];
        dp[0] = moneyInEachHouseType[0];
        dp[1] = Math.max(moneyInEachHouseType[0], moneyInEachHouseType[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + moneyInEachHouseType[i]);
        }

        return dp[n - 1];
    }
}

class MainRobber {
    public static void main(String[] args) {
        // Create an instance of JAVAProfessionalRobber
        JAVAProfessionalRobber javaRobber = new JAVAProfessionalRobber();

        // Example arrays
        int[] rowHouseMoney = {8, 6, 9, 30};
        int[] roundHouseMoney = {2, 7, 9, 5};
        int[] squareHouseMoney = {4, 10, 1, 10};
        int[] multiHouseMoney = {3, 2, 7, 10, 2, 5};

        // Call the methods
        System.out.println("Maximum amount from RowHouses: " + javaRobber.RowHouses(rowHouseMoney));
        System.out.println("Maximum amount from RoundHouses: " + javaRobber.RoundHouses(roundHouseMoney));
        System.out.println("Maximum amount from SquareHouses: " + javaRobber.SquareHouses(squareHouseMoney));
        System.out.println("Maximum amount from MultiHouseBuilding: " + javaRobber.MultiHouseBuilding(multiHouseMoney));

        

        // Call the default method
        javaRobber.MachineLearning();
    }
}
