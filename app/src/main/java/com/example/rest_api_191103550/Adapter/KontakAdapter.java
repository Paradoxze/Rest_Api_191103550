package com.example.rest_api_191103550.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rest_api_191103550.Model.Kontak;
import com.example.rest_api_191103550.R;

import java.util.List;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.MyViewHolder> {
    List<Kontak> mKontakList;

    public KontakAdapter(List<Kontak> KontakList){
        mKontakList = KontakList;
    }

    @NonNull
    @Override
    public KontakAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mview = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontak_list,parent,false);
        MyViewHolder mViewHolder = new MyViewHolder(mview);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KontakAdapter.MyViewHolder holder, int position) {
        holder.mTextViewId.setText("id = "+mKontakList.get(position).getId());
        holder.mTextViewNama.setText("id = "+mKontakList.get(position).getNama());
        holder.mTextViewNomor.setText("id = "+mKontakList.get(position).getNomor());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(),EditActivity.class);
                mIntent.putExtra("Id", mKontakList.get(position).getId());
                mIntent.putExtra("Nama", mKontakList.get(position).getNama());
                mIntent.putExtra("Nomor", mKontakList.get(position).getNomor());
                view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mKontakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextViewId, mTextViewNama, mTextViewNomor;

        public MyViewHolder(View itemView){
            super(itemView);
            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            mTextViewNama = (TextView) itemView.findViewById(R.id.tvNama);
            mTextViewNomor = (TextView) itemView.findViewById(R.id.tvNomor);
        }
    }
}
