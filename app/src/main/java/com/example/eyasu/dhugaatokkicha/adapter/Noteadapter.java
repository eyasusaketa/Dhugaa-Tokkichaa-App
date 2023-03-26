package com.example.eyasu.dhugaatokkicha.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eyasu.dhugaatokkicha.R;
import com.example.eyasu.dhugaatokkicha.model.Note;
import com.example.eyasu.dhugaatokkicha.utils.Noteutils;

import java.util.ArrayList;

/**
 * Created by EYASU on 9/16/2019.
 */

public class Noteadapter extends RecyclerView.Adapter<Noteadapter.NoteHolder>{
    private Context context;
    private ArrayList<Note> notes;


    public Noteadapter(Context context, ArrayList<Note> notes) {
        this.context = context;
        this.notes = notes;
    }

    @Override
    public NoteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.notelatout,parent,false);

        return new NoteHolder(v);
    }

    @Override
    public void onBindViewHolder(NoteHolder holder, int position) {
Note note=getNote(position);
if(note!=null){

    holder.noteText.setText(note.getNoteText());
    holder.noteDate.setText(Noteutils.dataFromLong(note.getNotedate()));


}
    }
private Note getNote(int position){
return  notes.get(position);

}
    @Override
    public int getItemCount() {
        return notes.size();
    }

    class NoteHolder extends RecyclerView.ViewHolder {
        TextView noteText,noteDate;


        public NoteHolder(View itemView) {

            super(itemView);
            noteDate=itemView.findViewById(R.id.note_date);
            noteText=itemView.findViewById(R.id.note);
        }
    }
}
