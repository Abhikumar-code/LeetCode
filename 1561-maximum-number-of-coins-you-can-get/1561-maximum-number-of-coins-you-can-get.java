class Solution {
    public int maxCoins(int[] piles) {
    

    Arrays.sort(piles);

    int i=0;
    int k=piles.length-2;
    int cost=0;

    while(i<k){
    cost+=piles[k];
    k-=2;
    i++;    
    }

    return cost;}
}