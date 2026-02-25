import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumBrute {
    public static void main(String[] args) {
        int [] arr = {4,1,6,2,9,5};
        int target = 8;
//        for(int i = 0;i<arr.length-1;i++){
//            for(int j =1;j< arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(arr[i] + " "+ arr[j]);
//                    return;
//                }
//            }
//        }
//        System.out.println("Not found the number ");
        System.out.println(Arrays.toString(twosumhashmap(arr,target)));
    }

    public static  int[] twosumhashmap(int [] arr , int target){
        HashMap<Integer , Integer> hmap = new HashMap<>();
        for(int i = 0;i< arr.length ;i++){
            int complement = target-arr[i];
            if(hmap.containsKey(complement)){
               // return  new int[] {arr[i],complement};
                return new int[] {hmap.get(complement),i};//to return index
            }
            hmap.put(arr[i],i);
        }
        return  new int[] {};
    }
}

