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
public class SanPham {
    protected String maSP, tenSP;
    protected int soLuong, donGia;
    protected Scanner sc = new Scanner(System.in);
    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, int donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public void inputSP(){
        sc.nextLine();
        System.out.println("Nhap ma SP: ");
        maSP = sc.nextLine();
        System.out.println("Nhap ten SP: ");
        tenSP = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextInt();
        sc.nextLine();
    }
    public void outputSP(){
        System.out.print(maSP + " " + tenSP + " " + donGia + " " + soLuong );
    }
}
