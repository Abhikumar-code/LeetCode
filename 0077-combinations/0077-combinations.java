class Solution {
    public List<List<Integer>> combine(int n, int k) {

    List<List<Integer>> ans=new ArrayList<>();

    List<Integer> output=new ArrayList<>();
    method(n,k,1,ans,output);

    return ans;    
    }

    private void method(int n, int k, int f, List<List<Integer>> ans ,List<Integer> output){
    

    if(output.size() == k ){
    ans.add(new ArrayList<>(output));
    return;
    }
    if(f>n) return;
    output.add(f);
    
    method(n,k,f+1,ans,output);
    
    output.remove(output.size()-1);
    method(n,k,f+1,ans,output);
    }
}