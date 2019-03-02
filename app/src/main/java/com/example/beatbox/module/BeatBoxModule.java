package com.example.beatbox.module;

import android.content.Context;

import com.example.beatbox.BeatBox;

import dagger.Module;
import dagger.Provides;

@Module
public class BeatBoxModule {

    @Provides
    public BeatBox getBeatBox(Context context) {
        return new BeatBox(context);
    }
}
