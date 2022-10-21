class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int res = 0, min = 100,max = 0;
        
        for (int i = 0; i < N; i++) {
			if(min > A[i]) min = A[i];
			if(max < A[i]) max = A[i];
		}
        res = min+max;
        return res;
    }
}
