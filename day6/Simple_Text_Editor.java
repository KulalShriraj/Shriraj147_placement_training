package day6;

import java.util.*;
import java.util.Stack;

class Operations
{
    StringBuilder sb;
    Stack<String> history;
    Operations()
    {
        sb=new StringBuilder();
        history=new Stack<String>();
    }
    void append(String txt)
    {
        history.push(sb.toString());
        sb.append(txt.trim());
    }
    void delete(int n)
    {
        if(n>sb.length())
            n=sb.length();
        history.push(sb.toString());
        sb.delete(sb.length()-n, sb.length());

    }
    void undo()
    {
        if(!history.isEmpty())
            sb=new StringBuilder(history.pop());

    }
    void print(int n)
    {
        System.out.println(sb.charAt(n));
    }
}
public class Simple_Text_Editor {

    public static void main(String[] args) {
        Operations op=new Operations();
        Scanner sc=new Scanner(System.in);
        int query=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<query;i++)
        {
            int operation=sc.nextInt();
            switch(operation)
            {
                case 1:String el=sc.nextLine();
                        op.append(el);
                        break;
                case 2:int n=sc.nextInt();
                        op.delete(n);
                        break;
                case 3:int num=sc.nextInt();
                        op.print(num-1);
                        break;
                case 4:op.undo();
                        break;
                        
            }
        }
    }
}

