class Solution{
    static ArrayList<Integer> produceStepingNumber(int i) {
		ArrayList<Integer> ret = new ArrayList<>();
		int rem = i%10;
		int num1 = i*10+rem-1;
		int num2 = i*10+rem+1;
		if(rem==0) {
			ret.add(num2);
		}else if(rem==9){
			ret.add(num1);
		}else {
			ret.add(num1);
			ret.add(num2);
		}
		
		return ret;
	}
	
    int steppingNumbers(int n, int m){
        if(m==0) return 0;
		int c = 0;
		int index = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= 9;i++ )arr.add(i);
		while(m > c) {
			ArrayList<Integer> hold = produceStepingNumber(arr.get(index));
			index++;
			for (int k : hold) {
				if(k<=m)arr.add(k);
			}
			c = hold.get(hold.size()-1);
		}
		int counter = 0;
		for(int i : arr) {
			if(i>=n && i<=m) counter++;
		}
		if(n==0) return counter+1;
        return counter;
    }
}
