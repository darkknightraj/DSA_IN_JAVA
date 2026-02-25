import java.util.Arrays;

public class Segeregate {
    public static void main(String[] args) {
        int [] arr = {1,1,0,0,0,1,0,1,1,0,0};
           // Arrays.sort(arr);
           int [] res = segregate(arr);
        System.out.println("Segeregate " + Arrays.toString(res));
    }
    public static int[] segregate(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] ==0){
                i++;
        }else if(arr[j] ==1){
            j--;
            }
            else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return arr;

    }
    public static int[] swap (int[] arr,int i ,int j){

        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            return arr;
    }


}
