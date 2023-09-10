package part2;

import part2.treatment.Treatment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Vlad");
        arrayList.add("Alexei");
        arrayList.add("Dovlet");
        arrayList.add("Dima");
        arrayList.add("Gleb");
        arrayList.add("Tania");
        arrayList.add("Roma");
        arrayList.add("Andrey");
        arrayList.add("Alexander");

        Treatment.findAllName(arrayList);
        Treatment.getFirst(arrayList);
    }

}
