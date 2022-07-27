package Adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.android.cricketscorer.BowlerFragment;

import Entity.Bowler;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1){
            BowlerFragment bowlerFragment = new BowlerFragment();
            //get bowlers from database
            Bowler[] bowlers = new Bowler[2];
            Bundle bundle = new Bundle();
            bundle.putSerializable("bowlers",bowlers);
            bowlerFragment.setArguments(bundle);
            return bowlerFragment;
        }
        else{
            return new BowlerFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
