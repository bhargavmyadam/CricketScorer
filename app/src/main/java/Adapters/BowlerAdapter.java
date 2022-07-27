package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.cricketscorer.R;

import Entity.Bowler;

public class BowlerAdapter extends RecyclerView.Adapter<BowlerAdapter.BowlerViewHolder> {

    Bowler[] bowlers;

    public BowlerAdapter(Bowler[] bowlers){
        this.bowlers = bowlers;
    }
    @NonNull
    @Override
    public BowlerAdapter.BowlerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bowler_card,parent,false);
        return new BowlerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BowlerAdapter.BowlerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return bowlers.length;
    }

    public static class BowlerViewHolder extends RecyclerView.ViewHolder{

        public BowlerViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
