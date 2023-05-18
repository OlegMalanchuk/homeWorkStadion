import java.util.Scanner;

public class BuyTickets {
    static Scanner scanner = new Scanner(System.in);

    public static void freePlaces(){
        int[][]array1 = new int[5][5];
        int[][]array2 = new int[5][5];
        int[][]array3 = new int[5][5];
        int[][]array4 = new int[5][5];

        System.out.println("сектор1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                double choice =Math.random() *2;
                if ((i==3)&&(j==3)||(i==4)&&(j==4)||(i==4)&&(j==3)||(i==3)&&(j==4)) {array1[i][j] = 8;}
                else {array1[i][j] = (int) choice;}
                System.out.print("["+array1[i][j] + "]");}
            System.out.println();
        }
        System.out.println("сектор2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                double choice = Math.random() * 2;
                if ((i == 0) && (j == 3) || (i == 0) && (j == 4) || (i == 1) && (j == 3) || (i == 1) && (j == 4)) {
                    array2[i][j] = 8;
                } else {
                    array2[i][j] = (int) choice;
                }
                System.out.print("[" + array2[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("сектор3");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                double choice =Math.random() *2;
                if ((i==3)&&(j==0)||(i==4)&&(j==0)||(i==4)&&(j==1)||(i==3)&&(j==1)) {array3[i][j] = 8;}
                else {array3[i][j] = (int) choice;}
                System.out.print("["+array3[i][j] + "]");}
            System.out.println();
        }
        System.out.println("сектор4");
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                double choice =Math.random() *2;
                if ((i==0)&&(j==0)||(i==0)&&(j==1)||(i==1)&&(j==1)||(i==1)&&(j==0)) {array4[i][j] = 8;}
                else {array4[i][j] = (int) choice;}
                System.out.print("["+array4[i][j] + "]");}
            System.out.println();
        }
        Helpers.choiseSector();
        System.out.print("Виберіть сектор в якому хочуте сидіти : ");
        int input = scanner.nextInt();
        if (input ==1){
            System.out.println("@1");
            for (int[]row :array1) {
                for (int elem: row) {
                    System.out.print("["+elem + "]");
                }
                System.out.println(" ");
            }
        }
        if (input ==2){
            System.out.println("@2");
            for (int[]row :array2) {
            for (int elem: row) {
                System.out.print("["+elem + "]");

            }
            System.out.println(" ");

        }}
        if (input ==3){
            System.out.println("@3");
            for (int[]row :array3) {
            for (int elem: row) {
                System.out.print("["+elem + "]");

            }
            System.out.println(" ");

        }}
        if (input ==4){
            System.out.println("@4");
            for (int[]row :array4) {
            for (int elem: row) {
                System.out.print("["+elem + "]");

            }
            System.out.println(" ");

        }}














    }



























}
