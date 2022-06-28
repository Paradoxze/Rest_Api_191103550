package com.example.rest_api_191103550.Model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelKontak {
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private String result;
    @SerializedName("message")
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
