package com.example.beatbox.component;

import com.example.beatbox.BeatBoxFragment;
import com.example.beatbox.module.BeatBoxModule;
import com.example.beatbox.module.ContextModule;

import dagger.Component;


@Component (modules = {ContextModule.class, BeatBoxModule.class})
public interface AppComponent {
    void inject(BeatBoxFragment fragment);
}
