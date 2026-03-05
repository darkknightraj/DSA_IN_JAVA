import java.util.Arrays;

public class SquareofNumber {
    public static void main(String[] args) {
        
    
    int [] num = {-4,-1,0,3,10};
    int [] res = square(num);
   System.out.println(Arrays.toString(res));

    }
     public static int[] square(int[] num){
        int n = num.length;
        int [] res = new int[n];
        int left = 0;
        int right = n-1;
        int k = n-1;
        while(left <= right){
            int leftSquare = num[left]*num[left];
            int rightSquare = num[right]*num[right];
            if(leftSquare>rightSquare){
                res[k]= leftSquare;
                left++;
            }else{
                res[k]=rightSquare;
                right--;
            }
            k--;

        }
        return res;
    }
}

//brute force O(nlogn)
/* in main method sort the array then print 
in the method just use for (int i = 0 ;i<num.length ; i++){
num[i] = num[i]* num[i];
and return the num ;
} */

