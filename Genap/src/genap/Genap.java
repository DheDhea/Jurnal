/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genap;

    import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class Genap {

    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
        int aw, ak, bil; 
        System.out.println("Program Pengurut Bilangan Prima");
        System.out.print("Masukkan batas awal\t: "); aw=in.nextInt();
        System.out.print("Masukkan batas akhir\t: "); ak=in.nextInt();
        System.out.printf("Bilangan prima antara %d sampai %d adalah \n", aw, ak);
        int ang=aw;
        while (ang <= ak) {
            int tmp = 0;
            for (int bagi = 2; bagi < ang; bagi++) {
                if (ang%bagi==0) {
                    tmp=1;
                }
            }
            if (tmp != 1) {
                System.out.println(ang);
                }
            ang++;
        }
    }
}

