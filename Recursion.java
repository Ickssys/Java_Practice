public class Recursion {
    public static void main(String[] args) {
        
    }

    //linear recursion
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }


    //tail recursion
    public static int factIter(int product, int counter, int maxCount){
        if(counter > maxCount){
            return product;
        }
        return factIter(counter * product, counter + 1, maxCount);
    }
}
