package part2.treatment;

import java.util.ArrayList;

public class Treatment {
    public static void findAllName(ArrayList<String> arrayList){
        arrayList.stream().forEach(s -> {
            if(s.toLowerCase().startsWith("a")){
                System.out.print(s + " ");
            }
        });
        System.out.println();
    }
    public static void getFirst(ArrayList<String > arrayList){
        System.out.println(arrayList.stream().sorted().findFirst());
    }
}
