package strings;

public class SubStringOfOtherString {


    private boolean isSubString(String s1,String s2){
        int i=0;
        int j=0;
        int  count=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                count++;
                j++;
            }else{
                count=0;
                j=0;
            }
            i++;
            if(count==s2.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new SubStringOfOtherString().isSubString("fogeeksforgeeks","for"));


        String s1 = "mxabbachhcllo";

    }
}
