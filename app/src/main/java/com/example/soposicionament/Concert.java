package com.example.soposicionament;

public class Concert {


    private String data;
    private String ubicacio;
    private int imatge;

    public Concert(String data, String ubicacio, int imatge) {
        this.data = data;
        this.ubicacio = ubicacio;
        this.imatge = imatge;
    }

    public int getImatge() {
        return imatge;
    }

    public void setImatge(int imatge) {
        this.imatge = imatge;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }
}
