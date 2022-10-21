class Solution {
    int binarysearch(int arr[], int n, int k) {
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(k==arr[mid])return mid;
            else if(k < arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}