/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author HLC_2021
 */
public class SoPhuc {

    private float phanThuc, phanAo;
    Scanner sc = new Scanner(System.in);

    public SoPhuc(float phanThuc, float phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public SoPhuc() {
    }

    public float getPhanThuc() {
        return phanThuc;
    }

    public float getPhanAo() {
        return phanAo;
    }

    public void setPhanThuc(float phanThuc) {
        this.phanThuc = phanThuc;
    }

    public void setPhanAo(float phanAo) {
        this.phanAo = phanAo;
    }

    public void Nhap() {
        System.out.println("Nhap phan thuc : ");
        phanThuc = sc.nextFloat();
        System.out.println("Nhap phan ao : ");
        phanAo = sc.nextFloat();
    }

    public void Xuat() {
        System.out.println(toString());
    }

    public float congThuc(float thuc1, float thuc2) {
        return thuc1 + thuc2;
    }

    public float truThuc(float thuc1, float thuc2) {
        return thuc1 - thuc2;
    }

    public float congAo(float ao1, float ao2) {
        return ao1 + ao2;
    }

    public float truAo(float ao1, float ao2) {
        return ao1 - ao2;
    }
    
    @Override
    public String toString() {
        return phanThuc + " + " + phanAo + "i."; //To change body of generated methods, choose Tools | Templates.
    }

}
