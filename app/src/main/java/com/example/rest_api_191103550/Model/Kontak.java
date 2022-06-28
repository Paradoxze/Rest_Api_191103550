package com.example.rest_api_191103550.Model;

import com.google.gson.annotations.SerializedName;

public class Kontak {
    @SerializedName("id")
    private String id;
    @SerializedName("nama")
    private String nama;
    @SerializedName("nomor")
    private String nomor;

    public Kontak(){}

    public Kontak(String id, String nama, String nomor){
        this.id = id;
        this.id = nama;
        this.id = nomor;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNomor() {
        return nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
}
