class Solution {
    public boolean isPalindrome(int x) {


        int reversedNumber = 0;
        int y = x;

        if (x < 0) {
            return false;
        }

        if(x < 10 && x >= 0){
            return true;
        }

        while(y != 0){
            reversedNumber = (reversedNumber * 10) + (y % 10);
            y /= 10;
        }
        
        return x == reversedNumber;


    }
}