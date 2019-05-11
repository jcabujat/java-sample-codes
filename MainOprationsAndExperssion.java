package com.company;

public class Main {

    public static void main(String[] args) {
        // ARITHMETIC OPERATORS
	    // addition/plus
        int result1 = 1 + 2;
        System.out.println("1 + 2 = " + result1);
        // subtraction/minus
        int result2 = result1 - 1;
        System.out.println(result1 + " - 1 = " + result2);
        // multiplication/times
        int result3 = result2 * result1;
        System.out.println(result2 + " * " + result1 + " = " + result3);
        //division/divided by
        int result4 = result3 / result2;
        System.out.println(result3+" / "+result2+" = "+result4);
        // remainder
        result3 = 9;
        int result5 = result3 % result4;
        System.out.println(result3+" % "+result4+" = "+result5);
        // sample code to determine if result3 is odd or even
        int remainder = result3 % 2;
        System.out.println(remainder);

        boolean isEven = true;
        if (remainder == 0){
            isEven = true;
        }
        else {
            isEven = false;
        }
        if(isEven) { /* same as (isEven == true)*/
            System.out.println(result3 + " is even.\n");
        }
        else {
            System.out.println(result3 + " is odd.\n");
        }

        //UNARY, ASSIGNMENT OPERATORS
        //increment by 1
        result2++;
        System.out.println("increment result: "+result2);
        result2++;
        System.out.println("increment result: "+result2);

        //decrement by 1
        result2--;
        System.out.println("decrement result: "+result2);
        result2--;
        System.out.println("decrement result: "+result2);

        //increment by n
        result2+=3;
        System.out.println("increment by n: "+ result2);
        result2+=3;
        System.out.println("increment by n: "+ result2);

        //decrement by n
        result2-=2;
        System.out.println("decrement by n: "+ result2);
        result2-=2;
        System.out.println("decrement by n: "+ result2);

        //multiply by n
        result2*=2;
        System.out.println("multiply by n: "+result2);
        result2*=2;
        System.out.println("multiply by n: "+result2);

        //divide by n
        result2/=2;
        System.out.println("divide by n: "+result2);
        result2/=2;
        System.out.println("divide by n: "+result2);

        //remainder
        result2%=3;
        System.out.println("remainder from 3 is "+result2 +"\n");

        //EQUALITY, RELATIONAL, COMPARISON OPERATORS
        //equal
        if (result2 == 1)
            System.out.println("result2 is equal to 1");

        //not equal
        if(result2 != 2)
            System.out.println("result2 is not equal to 2");

        //greater than
        if (result2 > 0)
            System.out.println("result2 is greater than 0");

        //less than
        if (result2 < 4)
            System.out.println("result2 is less than 4");

        //greater than equal
        if (result2 >= 1)
            System.out.println("result2 is greater than or equal to 1");
        //less than equal
        if (result2 <= 1)
            System.out.println("result2 is less than or equal to 1\n");

        //tricky boolean code
        boolean isImpossible = false;
        if (isImpossible = true)
            System.out.println("This should not write as isImpossible was set to false");
        // the reason for the above code is that the if condition is always set to 'true' since it only has one '=' sign
        // the if code is accepting boolean statement (which is the case of isImpossible variable) that's why it did see it asan error
        // the if statement should have "==" for proper conditional statement

        //CONDITIONAL,LOGICAL OPERATORS
        //equal equal
        isImpossible = false;
        if (isImpossible == false)
            System.out.println("isImpossible was set to false");
        //AND
        isEven = true;
        if ((isImpossible == false) && (isEven == true))
            System.out.println("This is an example of AND logical/conditional statement");
        //OR
        isEven= false;
        if ((isImpossible == false) || (isEven == true))
            System.out.println("This is an example of OR logical/conditionak statement");




    }
}
