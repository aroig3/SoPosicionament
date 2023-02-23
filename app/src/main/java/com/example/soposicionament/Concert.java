package com.example.soposicionament;

public class Concert {


    private String data;
    private String ubicacio;

    public Concert(String data, String ubicacio) {
        this.data = data;
        this.ubicacio = ubicacio;
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
