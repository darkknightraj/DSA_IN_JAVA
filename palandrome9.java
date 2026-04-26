public class palandrome9 {
    public static void main(String[] args){
        int n = 124321;
       // System.out.println(checkPalan(n));
       //System.out.println(revTravel(n));
       System.out.println(isPalandrome(n));

    }
    public static boolean checkPalan(int n){
        int pal = 0;
        int newN = n;
        while(newN>0){
        int rem = newN%10;
        pal = pal*10+rem;
        newN = newN/10;
        }
        if(pal == n){
            return true;
        }
        return false;
    }
    //Let's do in log(n)complexity we reverse only half and check 
    public static boolean revTravel(int n){
        if(n<0 || (n != 0 && n%10 == 0)) return false;
        int reverseTravel = 0;
        while(n>reverseTravel){
            int rem = n%10;
            reverseTravel = reverseTravel*10+rem;
            n = n/10;
        }
        //check even or odd number if odd means skip the middle one
        return(n==reverseTravel) ||(n==reverseTravel/10);
    }
    //Let's try using two pointer technique where we have to convert
    // number into string 
    public static boolean isPalandrome(int n){
        if(n<0) return false;
        String s = String.valueOf(n);
        int left = 0;
        int right = s.length()-1;
        while (left<right) {
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
}
