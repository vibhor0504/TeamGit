package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-11));
    }

    public static boolean isPalindrome(int x) {

        if( x < 0)
            return false;

        List<Integer> digits = new ArrayList<>();
        int temp = x;
        double reverseNum = 0;
        while( temp != 0){
           digits.add(temp%10);
           temp = temp/10;
        }

        for(int i = 0;i<digits.size();i++)
        reverseNum = reverseNum + digits.get(i) * Math.pow(10,digits.size()-i -1);

        return reverseNum==(double)x;

/*        String str = Integer.valueOf(x).toString();
        int left = 0, right = str.length()-1;
        while(left < right){
            if(str.charAt(left) == str.charAt(right))
            {
                left++;
                right--;
            }else
                return false;
        }

        return true;*/


//        if(x < 0)
//            return false;
//        else
//            return x/11

    }
}
