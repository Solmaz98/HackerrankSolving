package Introduction;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{}
class Rockstar{   }
class Hacker{}


public class InstanceOFTutorial {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();

        while (it.hasNext()) {
            Object element = it.next();


            if(element instanceof Integer){
               break;
            }


        }



        return it;

    }

//    public static void main(String[] args)  {
//
//        Scanner scanner = new Scanner(System.in);
//
//        BigInteger a = scanner.nextBigInteger();
//        BigInteger b = scanner.nextBigInteger();
//
//
//        BigInteger c = a.add(b);
//        BigInteger d = a.multiply(b);
//
//
//
////        ArrayList mylist = new ArrayList();
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int m = sc.nextInt();
////        for (int i = 0; i < n; i++) {
////            mylist.add(sc.nextInt());
////        }
////
////        mylist.add("###");
////        for (int i = 0; i < m; i++) {
////            mylist.add(sc.next());
////        }
////
////        Iterator it = func(mylist);
////
////        while (it.hasNext()) {
////            Object element = it.next();
////            System.out.println((String) element);
////        }
//    }
}