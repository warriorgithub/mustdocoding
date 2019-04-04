package strings;

import sun.jvm.hotspot.utilities.Hashtable;

import java.util.HashMap;

public class AnagramSubString {

    public static void main(String[] args) {
        String s1 = "ideserve";
        String s2="veer";
        HashMap<Character,Integer> s1Map = new HashMap<>();
        HashMap<Character,Integer> s2Map = new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        while(i<s2.length()){
            if(s1Map.containsKey(s1.charAt(j))) {
                s1Map.put(s1.charAt(j), s1Map.get(s1.charAt(j)) + 1);
                j++;
            } else {
                s1Map.put(s1.charAt(j), 1);
                j++;
            }
            if(count==0) {
                if (s2Map.containsKey(s2.charAt(i))) {
                    s2Map.put(s2.charAt(i), s2Map.get(s2.charAt(i)) + 1);
                    i++;
                } else {
                    s2Map.put(s2.charAt(i), 1);
                    i++;
                }
            }
        }
        if(s1Map.equals(s2Map)){
            System.out.println("found");
        }else{
            s1Map.remove(count);
            i=count+1;
        }

    }
}
