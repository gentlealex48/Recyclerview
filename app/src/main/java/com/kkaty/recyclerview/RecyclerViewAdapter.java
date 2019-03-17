package com.kkaty.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
    ArrayList<Student> list;

    public RecyclerViewAdapter(Context context, ArrayList<String> passedList){
        this.context = context;
        this.list = passedList;
    }

    @NonNull
    @Override
    public RecyclerView viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder viewHolder
    }
        return null;
    }

@Override
public  int getTemCount() {
    return 0;
}

public class View