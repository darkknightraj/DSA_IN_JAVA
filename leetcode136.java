import java.util.HashSet;

public class leetcode136 {
    public static void main(String[] args) {
        int[] arr  = {2,2,3,1,1};
        //int res = singleNumber(arr);
        System.out.println(xorSingle(arr));
       // System.out.println(res);
        
    }
    public static int singleNumber(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : arr){
            if(hashSet.contains(num)){
                hashSet.remove(num);
            }else{
                hashSet.add(num);
            }
        }
        return hashSet.iterator().next();

    }
    //using xor bitwise operator which reduce the sapce complexity from O(n) to O(1)
    public static int xorSingle(int[] arr){
        int single = 0;
        for(int num : arr){
            single = single^num;
        }
        return single;
    }
    
}
