package com.example.gogaga.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gogaga.Model.Profile;
import com.example.gogaga.R;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>{
    private ArrayList<Profile> mProfileArrayList;
    private Context mCtx;

    public ProfileAdapter(ArrayList<Profile> mProfileArrayList, Context mCtx) {
        this.mProfileArrayList = mProfileArrayList;
        this.mCtx = mCtx;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(mCtx).inflate(R.layout.item_profile,parent,false);
        return new ProfileViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        holder.tvName.setText(mProfileArrayList.get(position).getName());
        holder.ivIcon.setImageDrawable(mCtx.getDrawable(mProfileArrayList.get(position).getIcon()));
    }

    @Override
    public int getItemCount() {
        return mProfileArrayList.size();
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivIcon;
        private TextView tvName;
        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            ivIcon=itemView.findViewById(R.id.ivIcon);
            tvName=itemView.findViewById(R.id.tvName);
        }
    }
}
