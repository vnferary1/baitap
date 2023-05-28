/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HLC_2021
 */
public class SanPham {

    protected String tenSP, tenNSX, ngay, maSP;
    Scanner sc = new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String tenSP, String tenNSX, String ngay, String maSP) {
        this.tenSP = tenSP;
        this.tenNSX = tenNSX;
        this.ngay = ngay;
        this.maSP = maSP;
    }

    public void Nhap() {
        System.out.println("Nhap thong tin san pham");
        System.out.println("nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("nhap ma san pham : ");
        maSP = sc.nextLine();
        System.out.println("nhap ten nha san xuat : ");
        tenNSX = sc.nextLine();
        System.out.println("nhap ngay nhap san pham : ");
        ngay = sc.nextLine();
    }



    public String getTenSP() {
        return tenSP;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public String getNgay() {
        return ngay;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    @Override
    public String toString() {
        return  tenSP + ',' + maSP + ',' + tenNSX + ',' + ngay;
    }

}
