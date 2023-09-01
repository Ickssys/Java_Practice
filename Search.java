public class Search {
    public static int binarySearch(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        // int i = 1;
        while (low <= high) {
            //System.out.println("Number of Instructions performed: " + i);
            // i++;
            // mid is the middle index on each iteration
            int mid = (high + low) / 2; //you can also take each indivual part and divide by 2 and then add them togther high/2 + low/2
            int guess = arr[mid]; 
                                        // 
            if (n == guess) {
                return mid;
            } else if (n < guess) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int lh, int rh, int key){
        if(lh >= rh){
            return -1;
        }
        int mid = (lh/2) + (rh/2);
        if(key == arr[mid]){
            return mid;
        }
        else if(key < arr[mid]){
            //key is on the left side
            return recursiveBinarySearch(arr, lh, mid - 1, key);
        }
        else if(key > arr[mid]){
            //key is on the right side
            return recursiveBinarySearch(arr, mid + 1, rh, key);
        }
        return -1;

    }

    public static int linearSearch(int[] arr, int key){
        //int instruction = 1; 
        for(int i = 0; i < arr.length; i++){
             //System.out.println("Number of  Instructions performed: " + (instruction));
            if (arr[i] == key){
                 return i; 
            }
            //instruction++;
        } 
        return -1;
    } 
}
