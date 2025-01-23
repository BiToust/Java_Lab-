package task_1001;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> r = new ArrayList<String>();

        while(true){
            if (input.hasNextLong()){
                Double t = Math.sqrt(input.nextLong());
                r.add(String.format("%.4f", t));
            } else{
                for(int i=r.size() - 1;i>=0;i--){
                    System.out.println(r.get(i));}
                break;
            }

        }
    }
}