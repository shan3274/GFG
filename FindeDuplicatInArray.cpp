class Solution{
  public:
    vector<int> duplicates(int arr[], int n) {
        if(n==0)return {0};
        else if(n==1) return {-1};
        vector<int> ret;
        sort(arr,arr+n);

        for(int i = 0; i < n-1 ; i++){
            if(arr[i]==arr[i+1]){
                int index = i;
                while(arr[i]==arr[index+1]){
                    index++;
                }

                ret.push_back(arr[index]);

                i = index;
            }

        }

        if(ret.size()==0)ret.push_back(-1);
        return ret;
    }
};
