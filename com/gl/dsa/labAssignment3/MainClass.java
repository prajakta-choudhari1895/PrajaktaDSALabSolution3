package com.gl.dsa.labAssignment3;


public class MainClass {
    public static void main(String [] args){
        String expr1 = "([[{ }]])";
        System.out.println("The given expression is: "+expr1);

        balancedBrackets balancedBrackets = new balancedBrackets();

        if(balancedBrackets.areBracketsBalanced(expr1))
            System.out.println("The entered string has balanced brackets!");
        else
            System.out.println("The entered string does not contain balanced brackets!");

        String expr2 = "([{}})";
        System.out.println("The given expression is: "+expr2);
        if(balancedBrackets.areBracketsBalanced(expr2))
            System.out.println("The entered string has balanced brackets!");
        else
            System.out.println("The entered string does not contain balanced brackets!");

    }
}
