import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode412 {
    //Fizzbuzz
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        List<String> result = Fizzbuzz(n);
        System.out.println(result);
}
        public static List<String> Fizzbuzz(int n1){
        List<String> list = new ArrayList<>();
        for(int i = 1 ;i<=n1;i++){
            if(i%3==0 &&i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
    }
    

