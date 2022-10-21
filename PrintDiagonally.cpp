class Solution{
	
	public:
	vector<int> downwardDigonal(int n, vector<vector<int>> arr)
	{
	vector<int> st;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n-i ; j++){
            int k = i;
            int m = n-1;
            if(i == 0){
                m = j;
            }

            while(m>=0 && k < n){
                st.push_back(arr[k][m]);
                k++;
                m--;
            }
            if(k >= n) break;

        }
    }
    return st;
	}

};