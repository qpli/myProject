package com.lqp.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main2 {


    public static void main(String[] args)
    {
        boolean result = isValid("((");
        System.out.println(""+result+"   s.length():"+ "((".length());
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char a;
        Map m1=new HashMap();
        m1.put('(',')');
        m1.put('{','}');
        m1.put('[',']');
        if(s.length()==1)
            return false;
        else if(s.length()==0)
            return true;
        else{

            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
                {
                    if(stack.isEmpty())
                        return false;
                    else
                    {
                        a = stack.pop();
                        if(s.charAt(i)!=(char)m1.get(a))
                        {
                            System.out.println("s.charAt(i)"+s.charAt(i)+" "+"m1.get(a):"+m1.get(a));
                                return false;
                        }
                    }
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            }
        }

        if(stack.empty())
        {
            return true;
        }
        else {
            return false;
        }


    }


}
