package location;

import java.util.Random;
import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng mảng số: ");
        int quanlity = sc.nextInt();

        System.out.println("Nhập số lượng trong mảng số: ");
        int lengthArr = sc.nextInt();

        double[][]arrNum = inputArrAll(quanlity, lengthArr);
        displayArrAll(arrNum);

        Location locationMax = new Location(quanlity, lengthArr, arrNum[0][0]);
        locationMax.locateLargest(arrNum);
    }

    private static double[][] inputArrAll(int quanlity, int lengthArr){
        Random rd = new Random();
        double[][]arrNum = new double[quanlity][lengthArr];
        int i =0, j=0;
        for (i=0;i<quanlity;i++){
            for (j=0;j<lengthArr;j++){
                arrNum[i][j] = (double) rd.nextInt(100)*0.5;
            }
        }
        return arrNum;
    }

    private static void displayArrAll(double[][]arrNum){
        System.out.println("Mảng số gồm: ArrNum{");
        for (int i =0;i<arrNum.length;i++){
            System.out.println("\t{");
            for (int j =0; j< arrNum[i].length;j++){
                System.out.print(arrNum[i][j] + " ");
            }
            System.out.print("}\n");
        }
        System.out.println("}");
    }
}
