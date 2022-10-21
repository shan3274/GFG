class Solution
{
    static int majorityElement(int a[], int size)
    {
		int N = a.length;
        int count = 1;
        int res = 0;
        for (int i = 0; i < N; i++) {
			if(a[res]==a[i])
				count++;
			else
				count--;
			if(count==0){
				count=1;
				res = i;
			}
			
		}
		count = 0;
		for(int i = 0; i < size ; i++){
		    if(a[res]==a[i])
		        count++;
		    
		}
		if(count<=N/2)
		        return -1;
		    else   
		        return a[res];
    }
}