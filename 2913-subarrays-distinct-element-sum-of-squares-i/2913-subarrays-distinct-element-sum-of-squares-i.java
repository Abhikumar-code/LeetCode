class Solution {
    public int sumCounts(List<Integer> nums) {

     HashSet<Integer> set=new HashSet<>();
     int maxpro=0;
     for(int i=0; i<nums.size() ; i++){
        for(int j=i; j<nums.size() ; j++){
          set.add(nums.get(j));
          maxpro=maxpro+set.size()*set.size();
        }
        set.clear();
     }  
   return maxpro; }
}