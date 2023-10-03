package Introduction;

import org.w3c.dom.ls.LSOutput;

public class FirstAndLastNumberSum {

    static int myNum;
    public static int findFirstAndLastNumberSum(int number){
        int  firstNum =number;
        int  lastNum = number;

        if(number<0)
            return -1;

        while(firstNum/10>0){
            firstNum/=10;
        }


        lastNum%=10;
        return  firstNum + lastNum;
    }





}
