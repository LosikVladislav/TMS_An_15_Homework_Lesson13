package part1;

import part1.treatment.Treatment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = Treatment.getList();
        System.out.println(arrayList);
        Treatment.distct(arrayList);
        Treatment.getEven(arrayList);
        Treatment.multiplyByTwo(arrayList);
        Treatment.getFirstFour(arrayList);
        Treatment.getAmount(arrayList);
        Treatment.getAvg(arrayList);
    }
}
