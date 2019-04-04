package strings;

//https://www.youtube.com/watch?v=U7rxgP-fp8E&list=PLamzFoFxwoNjPfxzaWqs7cZGsPYy0x_gI&index=78

import java.util.Arrays;

public class NonRepatingChar {


    public static void main(String[] args) {
        String s1="ABCDEFDEAECB";
        int tempArr[] = new int[256];


        for(int i=0;i<s1.length();i++){
           tempArr[i]=-1;
        }

        for(int i=0;i<s1.length();i++){
            if(tempArr[s1.charAt(i)]==-1){
                tempArr[s1.charAt(i)] = i;
            }else{
                tempArr[s1.charAt(i)] = -2;
            }
        }


        int minIdx = s1.length(); // Index of first non repeating character
        for(int i = 0; i < 256; i++) {
            if(tempArr[i] >= 0 && minIdx > tempArr[i]) {
                minIdx = tempArr[i];
            }
        }
        char c = (minIdx >= 0 && minIdx < s1.length()) ? s1.charAt(minIdx) : null;
        System.out.println(c);


    }
}
