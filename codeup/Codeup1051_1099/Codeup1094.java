package codeup.Codeup1051_1099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] nameList = br.readLine().split(" ");

        for (int i = n ; i > 0; i--) {
            System.out.printf("%s ",nameList[i-1]);
        }


    }
}
