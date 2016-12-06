package com.example.thanhhang.mnsfimo;

/**
 * Created by ThanhHang on 12/6/2016.
 */

public class KQNode {
    private int ID;
    private String nameNode;
    private String address;
    private String PM;

    public KQNode(int ID, String nameNode, String address, String PM) {
        this.ID = ID;
        this.nameNode = nameNode;
        this.address = address;
        this.PM = PM;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameNode() {
        return nameNode;
    }

    public void setNameNode(String nameNode) {
        this.nameNode = nameNode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPM() {
        return PM;
    }

    public void setPM(String PM) {
        this.PM = PM;
    }
}
