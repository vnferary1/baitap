/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author HLC_2021
 */
public class Phieu {

    protected String maPhieu, tenPhieu;
    private Scanner sc = new Scanner(System.in);
    private int i;
    DateTime date = new DateTime();
    SanPham[] x = new SanPham[100];

    public Phieu() {
    }

    public Phieu(String maPhieu, String tenPhieu) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public DateTime getA() {
        return date;
    }

    public SanPham[] getX() {
        return x;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public void setA(DateTime date) {
        this.date = date;
    }

    public void setX(SanPham[] x) {
        this.x = x;
    }

    public void inputPhieu() {
        System.out.println("Nhap ma phieu : ");
        sc.nextLine();
        System.out.println("Nhap ten phieu : ");
        sc.nextLine();
        System.out.println("Nhap ngay lap phieu: ");
        date.inputDate();
        System.out.println("Nhap so san pham mua : ");
        i = sc.nextInt();
        for (int j = 0; j < i; j++) {
            x[j].inputSP();
        }
    }
    public int thanhTien(int gia, int so){
        return gia*so;
    }
    public void outPutPhieu(){
        System.out.println("ma phieu : " + maPhieu);
        System.out.println("ten phieu : " + tenPhieu);
        System.out.print("ngay lap phieu : " );
        date.outputDate();
        for(int j=0;j<i;j++){
            System.out.println("San pham "+ (j+1) + " : ");
            x[j].outputSP();
            System.out.println("\t" + thanhTien(x[j].getDonGia(), x[j].getSoLuong()));
        }
        
    }
}
