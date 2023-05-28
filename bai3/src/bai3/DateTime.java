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
public class DateTime {

    protected int ngay, thang, nam;
    Scanner sc = new Scanner(System.in);

    public DateTime() {
    }

    public DateTime(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void inputDate() {
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        nam = sc.nextInt();
    }

    public void outputDate() {
        System.out.println(ngay + "/" + thang + " / " + nam);
    }


}
