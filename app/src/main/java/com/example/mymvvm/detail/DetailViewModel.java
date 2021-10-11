package com.example.mymvvm.detail;

import android.app.Application;

import androidx.lifecycle.ViewModel;

import com.example.mymvvm.data.Note;
import com.example.mymvvm.data.NoteRepository;

public class DetailViewModel extends ViewModel {

    private NoteRepository mNoteRepository;


    public DetailViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }
    public void insert(Note note ){
        mNoteRepository.insert(note);
    }
    public void update(Note note){
        mNoteRepository.update(note);
    }
    public void delete(Note note){
        mNoteRepository.delete(note);
    }
}
