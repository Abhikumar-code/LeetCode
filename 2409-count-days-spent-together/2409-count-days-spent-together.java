class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

       
        int x=Math.max(today(arriveAlice,days), today(arriveBob,days));
        int y=Math.min(today(leaveAlice,days), today(leaveBob, days));
        
        return Math.max(0,y-x+1);
    }

    private int today(String date , int[] days){
      
      int M=Integer.parseInt(date.substring(0,2));
      int D=Integer.parseInt(date.substring(3,5));

      int day=D;

      for(int i=0; i<M-1 ; i++){
        day+=days[i];
      }
      return day;
    }
}