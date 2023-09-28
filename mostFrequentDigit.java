public static int mostFrequentDigit(int number){
        int[] A = new int[10];
        while (number > 0){
            int digit = number % 10;
            A[digit]++;
            number = number / 10;
        }
        int idx = 0;
        for(int i = 1; i < A.length; i++){
            if(A[i] > A[idx]){
                idx = i;
            }
        }
        return idx;
    }