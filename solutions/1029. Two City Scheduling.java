class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int cost = 0;
        Arrays.sort(costs, (c1, c2) -> (c1[0] - c2[0]) - (c1[1] - c2[1]));
        
        for(int i = 0; i < costs.length/2; i++) {
            cost += costs[i][0];
            cost += costs[costs.length-i-1][1];
        }
        return cost;
    }
}
