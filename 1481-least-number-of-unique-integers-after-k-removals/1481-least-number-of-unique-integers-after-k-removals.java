class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {


       HashMap<Integer,Integer> map=new HashMap<>();

       for(int i=0; i<arr.length ; i++){
       map.put(arr[i],map.getOrDefault(arr[i],0)+1);  
       }
    
       
       List<Integer> l=new ArrayList<>(map.values());
       
       Collections.sort(l);
       int total=l.size();  
    
       for(int i=0; i<l.size() ; i++){
       
       int num=l.get(i);

       if(k-num >= 0 ){
        k-=num;
        total--;
       }
       else break;
       }
     

       

  return total;  }
}