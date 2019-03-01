package com.example.beatbox.component;

import com.example.beatbox.BeatBox;
import com.example.beatbox.module.BeatBoxModule;

import dagger.Component;

@Component (modules = BeatBoxModule.class)
public interface BeatBoxComponent {
    BeatBox getBeatBox();
}
