package com.example.eyasu.dhugaatokkicha.model;

/**
 * Created by EYASU on 9/16/2019.
 */

public class Note {
    private String NoteText;
    private long Notedate;
    public Note(String NoteText,Long Notedate){
        this.NoteText=NoteText;
        this.Notedate=Notedate;
    }

    public String getNoteText() {
        return NoteText;
    }

    public void setNoteText(String noteText) {
        NoteText = noteText;
    }

    public long getNotedate() {
        return Notedate;
    }

    public void setNotedate(long notedate) {
        Notedate = notedate;
    }
}
