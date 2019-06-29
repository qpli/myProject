package com.lqp.easy;

public class Main6 {

    public int lengthOfLastWord(String s) {
        if(s.charAt(s.length()-1)==(char)(' '))
            return 0;
        String[] ss=s.split(" ");
        return ss[ss.length-1].length();

    }

}
