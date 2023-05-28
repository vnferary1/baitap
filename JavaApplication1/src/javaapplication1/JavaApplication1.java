/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HLC_2021
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 

        ArrayList<DieuHoa> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong san pham can nhap: ");
        int i = sc.nextInt();
        sc.nextLine();
        for (int j = 0; j < i; j++) {
            DieuHoa d = new DieuHoa();
            d.Nhap();
            list.add(d);
        }
        for (int j = 0; j < i; j++) {
            System.out.print("[" + list.get(j) + "]" + ",\n");
        }
        String search = sc.nextLine();
        int[] num = new int[i];
        int k = 0;
        for (int j = 0; j < i; j++) {
            if (list.get(j).getTenSP().equals(search)) {
                num[k] = j;
                k++;
            }
        }
        System.out.println("Nhung san phan co ten " + search);
        for (int j = 0; j < k; j++) {
            System.out.print("[" + list.get(num[j]) + "]" + ",\n");
        }
        float Min = list.get(0).getGia();
        for (int j = 0; j < i; j++) {
            if ( Min > list.get(j).getGia()) {
                Min = list.get(j).getGia();
            }
        }
        System.out.println("San pham " + search + " co gia re nhat : ");
        for (int j = 0; j < i; j++) {
            if(list.get(j).getTenSP().equals(search) && list.get(j).getGia() ==Min)
                System.out.print("[" + list.get(j) + "]" + ",\n");            
        }
    }

}
