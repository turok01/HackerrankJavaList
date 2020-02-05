//https://www.hackerrank.com/challenges/java-list/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int initialSizeList = sc.nextInt();
        int inputInt;
        int queries;
        int index;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<initialSizeList; i++){
            inputInt=sc.nextInt();
            list.addLast(inputInt);
        }
        queries = sc.nextInt();
        for(int q=0; q<queries; q++ ){
            sc.skip("[\r\n]");
            //sc.nextLine();
            String query = sc.nextLine();
            if(query.equals("Insert")){
                index = sc.nextInt();
                inputInt = sc.nextInt();
                list.add(index,inputInt);
                }
            if(query.equals("Delete")) {
                index = sc.nextInt();
                list.remove(index);
            }
        }
        //list.forEach(i -> System.out.print(i));
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
            if(i!=(list.size()-1)) System.out.print(" ");
        }
    }
}
