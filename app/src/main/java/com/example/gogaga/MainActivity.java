package com.example.gogaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.gogaga.Adapter.ProfileAdapter;
import com.example.gogaga.Model.Profile;
import com.flaviofaria.kenburnsview.KenBurnsView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView rvProfile=findViewById(R.id.rvProfile);
        rvProfile.setLayoutManager(new LinearLayoutManager(this));
        rvProfile.setHasFixedSize(true);

        ArrayList<Profile> profileArrayList=new ArrayList<>();
        profileArrayList.add(new Profile("Did you know?",R.drawable.ic_info));
        profileArrayList.add(new Profile("My Profile",R.drawable.ic_user));
        profileArrayList.add(new Profile("Preferences",R.drawable.ic_sliders));
        profileArrayList.add(new Profile("Support",R.drawable.ic_help_circle));
        profileArrayList.add(new Profile("Speak to the CEO",R.drawable.ic_phone_call));
        profileArrayList.add(new Profile("Leaderboard",R.drawable.ic_award));

        ProfileAdapter adapter=new ProfileAdapter(profileArrayList,this);
        rvProfile.setAdapter(adapter);
    }
}
