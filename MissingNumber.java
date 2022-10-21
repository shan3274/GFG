class Solution {
    int MissingNumber(int array[], int n) {
        Arrays.sort(array);
        if(n==2){
            if(array[0]>1){
                return 1;
            }else{
                 return array[0]+1;
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            if(array[0]!=1) return 1;
			if(array[i]+1 != array[i+1]) return array[i]+1;
		}
		
        return array[array.length-1]+1;
    }
}