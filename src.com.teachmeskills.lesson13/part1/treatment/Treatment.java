package part1.treatment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Treatment {
    public static String createScanner(){
        System.out.println("Put size of arrayList");
        Scanner scan = new Scanner(System.in);
        String sc = scan.next();
        return sc;
    }
    public static boolean checkValid(String sc){
        return (sc.matches("\\d+"));
    }
    public static int getSizeOfList(){
        String str = createScanner();
        if(checkValid(str)){
           int size = Integer.parseInt(str);
           return size;
        }else{
            System.out.println("Input error. Restart application and put data correctly");
            System.exit(0);
        }
        return 0;
    }
    public static ArrayList<Integer> getList(){
        int size = getSizeOfList();
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for(int i =0; i < size; i++) {
            arrayList.add((int)(Math.random()*10));
        }
        return arrayList;
    }
    public static void distct(ArrayList<Integer>arrayList){
        System.out.println(arrayList.stream().distinct().collect(Collectors.toList()));
    }
    public static void getEven(ArrayList<Integer> arrayList){
        arrayList.stream().skip(7).limit(10).forEach(integer -> {
            if((integer%2)==0 & integer!=0)
                System.out.print(integer + " ");
        });
        System.out.println();
    }
    public static void multiplyByTwo(ArrayList<Integer> arrayList){
            arrayList.stream().peek(integer -> {
            System.out.print(integer*2);
            System.out.print(" ");
        }).collect(Collectors.toList());
        System.out.println();
    }

    public static void getFirstFour(ArrayList<Integer> arrayList){
        arrayList.stream().sorted().limit(4).forEach(integer -> {
            System.out.print(integer + " ");
        });
        System.out.println();
    }
    public static void getAmount(ArrayList<Integer> arrayList){
        System.out.println(arrayList.stream().count());
    }
    public static void getAvg(ArrayList<Integer>arrayList){
        System.out.println(arrayList.stream().mapToInt(a->a).average().orElse(0));
    }

}
