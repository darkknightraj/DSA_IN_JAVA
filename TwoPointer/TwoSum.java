import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("Enter the array element ");
//        for(int i = 0;i<n;i++){
//           arr[i] = sc.nextInt();
//        }
        int [] arr={2,4,5,7,9};
        int target = 16;
        int [] res = twoSum(arr,target);
        // System.out.println("result "+Arrays.toString(res));
        System.out.println(res[0]+ " " + res[1]);

    }


    public static  int [] twoSum(int [] arr,int target ){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i < j) {
            int sum = arr[i]+ arr[j];
            if (sum == target) {
                return new int[]{arr[i],arr[j]};
            } else if (sum > target) {
                j--;
            } else
                i++;
        }
        return  new int[] {};
    }
}
