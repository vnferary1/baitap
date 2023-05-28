/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author HLC_2021
 */
public class Baitap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SoPhuc sp1= new SoPhuc();
        System.out.println("Nhap so thuc thu nhat : ");
        sp1.Nhap();
        SoPhuc sp2 = new SoPhuc();
        System.out.println("Nhap so thuc thu 2 : ");
        sp2.Nhap();
        sp1.Xuat();
        sp2.Xuat();
        SoPhuc sp3 = new SoPhuc();
        sp3.setPhanThuc(sp3.congThuc(sp1.getPhanThuc(), sp2.getPhanThuc()));
        sp3.setPhanAo(sp3.congThuc(sp1.getPhanAo(), sp2.getPhanAo()));
        System.out.print("Tong 2 so phuc : ");
        sp3.Xuat();
        sp3.setPhanThuc(sp3.truThuc(sp1.getPhanThuc(), sp2.getPhanThuc()));
        sp3.setPhanAo(sp3.truAo(sp1.getPhanAo(), sp2.getPhanAo()));
        System.out.print("Hieu 2 so phuc : ");
        sp3.Xuat();
    }
    
}
