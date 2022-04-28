package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Transport []v = new Transport[4];
        int n = in.nextInt();
        v[0] = new Transport();
        v[0].sum(n);
        n = in.nextInt();
        v[1] = new StandardTaxi();
        v[1].sum(n);
        n = in.nextInt();
        v[2] = new ComfortTaxi();
        v[2].sum(n);
        n = in.nextInt();
        v[3] = new BusinessTaxi();
        v[3].sum(n);
    }
}
