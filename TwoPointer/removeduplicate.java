import java.util.Arrays;

public class removeduplicate{
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,4,42,45};
        int len = duplicate(arr);
        System.out.println(len);
        int [] res = Arrays.copyOf(arr, len);
      //  int fianl_res = arr.length-res; to count the duplicate element 
      // if only want unique than return slow + 1 ; 
        System.out.println((Arrays.toString(res)));
    }
    public static int duplicate (int [] arr){
        int slow = 0;
        for(int fast = 1 ;fast < arr.length;fast++ ){
            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow]=arr[fast];

            }
          //  System.out.println(Arrays.toString(arr)); 
        }
        //return slow+1; to return the numbe of unique element for m the array in soting order 
        return slow+1;      
}
}