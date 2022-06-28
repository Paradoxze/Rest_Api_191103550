package com.example.rest_api_191103550.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetKontak {
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    List<Kontak> listdatakontak;
    String message;

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public String getMessage(){
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public List<Kontak> getListdatakontak(){
        return listdatakontak;
    }

    public void setListdatakontak(List<Kontak> listdatakontak) {
        this.listdatakontak = listdatakontak;
    }
}
