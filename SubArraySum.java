class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(s == 0){
             res.add(-1);
             return res;
        }
		for (int i = 0; i < n; i++) {
		    int start = i+1;
		    int sum = 0;
		    int hold = 0;
			for(int j = i; j < n; j++){
			    if(sum >= s) break;
			    sum += arr[j];
			    hold = j;
			}
			 if(sum==s){
			    res.add(start);
			    res.add(hold+1);
			    break;
			}
		}
		if(res.size()==0) res.add(-1);
		return res;
    }
}