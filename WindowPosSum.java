public static void windowPosSum(int[] a, int n){
	for(int i = 0; i < a.length-1; i++){
		if(a[i] > 0){
			for(int j = i + 1; j <= i + n; j++){
				if(i >= a.length - n){
					n--;
				}
				a[i] += a[j];
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
