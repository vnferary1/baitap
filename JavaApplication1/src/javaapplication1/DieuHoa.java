/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author HLC_2021
 */
public class DieuHoa extends SanPham{
    private Float congSuat, gia;

    public DieuHoa() {
    }

    public DieuHoa(Float congSuat, Float gia) {
        this.congSuat = congSuat;
        this.gia = gia;
    }

    public DieuHoa(Float congSuat, Float gia, String tenSP, String tenNSX, String ngay, String maSP) {
        super(tenSP, tenNSX, ngay, maSP);
        this.congSuat = congSuat;
        this.gia = gia;
    }
    @Override
    public void Nhap(){
        System.out.println("Nhap thong tin san pham");
        System.out.println("nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.println("nhap ma san pham : ");
        maSP = sc.nextLine();
        System.out.println("nhap ten nha san xuat : ");
        tenNSX = sc.nextLine();
        System.out.println("nhap ngay nhap san pham : ");
        ngay = sc.nextLine();
        System.out.println("nhap cong suat dieu hoa : ");
        congSuat = sc.nextFloat();
        System.out.println("nhap gia san pham : ");
        gia = sc.nextFloat();
        sc.nextLine();
    }
    public Float getCongSuat() {
        return congSuat;
    }

    public Float getGia() {
        return gia;
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

    public Scanner getSc() {
        return sc;
    }

    public void setCongSuat(Float congSuat) {
        this.congSuat = congSuat;
    }

    public void setGia(Float gia) {
        this.gia = gia;
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

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public String toString() {
        return super.toString() + ',' + gia + ',' +congSuat; 
    }
    
}
