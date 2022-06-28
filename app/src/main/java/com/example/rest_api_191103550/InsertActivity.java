package com.example.rest_api_191103550;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rest_api_191103550.Model.PostPutDelKontak;
import com.example.rest_api_191103550.Rest.ApiClient;
import com.example.rest_api_191103550.Rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InsertActivity extends AppCompatActivity {
    EditText editNama, editNomor;
    Button btnInsert, btnBack;
    ApiInterface mApiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        editNama =(EditText) findViewById(R.id.editNama);
        editNomor = (EditText) findViewById(R.id.editNomor);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btnInsert = (Button) findViewById(R.id.btnInserting);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<PostPutDelKontak> postKontakCall = mApiInterface.postKontak(editNama.getText().toString(),editNomor.getText().toString());
                postKontakCall.enqueue(new Callback<PostPutDelKontak>() {
                    @Override
                    public void onResponse(Call<PostPutDelKontak> call, Response<PostPutDelKontak> response) {
                        MainActivity.ma.refresh();
                        finish();
                    }

                    @Override
                    public void onFailure(Call<PostPutDelKontak> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                    }
                });
                }

        });
        btnBack = (Button) findViewById(R.id.btnBackGo);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            MainActivity.ma.refresh();
                finish();
            }
        });
    }
}