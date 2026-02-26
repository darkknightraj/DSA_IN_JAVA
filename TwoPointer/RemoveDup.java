import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
//Remove Duplicate and print array in sorted order  using hashSet in O(nlogn) times;
public class RemoveDup {
        public static void main(String[] args) {
            int [] arr = {2,3,21,5,2,5,2,8,5};
            HashSet<Integer> res = duplicate(arr);
            List<Integer> li = new ArrayList<>(res);
            Collections.sort(li);
            System.out.println(li);
        }

        public static HashSet<Integer> duplicate(int[] arr){
            HashSet<Integer> set = new HashSet<>();
            for(int num:arr){
                set.add(num);
            }
            return set;
        }
}
