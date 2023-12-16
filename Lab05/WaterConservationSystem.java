interface WaterConservationSystem {
    int calculateTrappedWater(int[] blockHeights);
    //takes array of integers as input and returns integer representing total volume of water conserved
}

class RainySeasonConservation implements WaterConservationSystem {

    @Override
    public int calculateTrappedWater(int[] blockHeights) {
        int n = blockHeights.length;
        if (n <= 2) {
            return 0; // Not enough blocks to trap water
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Calculate the maximum height to the left of each block
        leftMax[0] = blockHeights[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], blockHeights[i]);
        }

        // Calculate the maximum height to the right of each block
        rightMax[n - 1] = blockHeights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], blockHeights[i]);
        }

        // Calculate the trapped water for each block
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            trappedWater += Math.max(0, minHeight - blockHeights[i]);
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        WaterConservationSystem waterConservationSystem = new RainySeasonConservation();

        // Test Case
        int[] blockHeights = {3, 0, 0, 2, 0, 1};
        int trappedWater = waterConservationSystem.calculateTrappedWater(blockHeights);
        System.out.println("Total trapped water: " + trappedWater + " units");
    }
}
