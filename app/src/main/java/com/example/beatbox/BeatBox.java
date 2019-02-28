package com.example.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUNdS_FOLDER = "sample_sounds";
    private List<Sound> mSounds = new ArrayList<>();

    private AssetManager mAsset;

    public BeatBox(Context context) {
        mAsset = context.getAssets();
        loadSounds();
    }

    private void loadSounds() {
        String[] soundNames;

        try {
            soundNames = mAsset.list(SOUNdS_FOLDER);
            Log.i(TAG, "Found " + soundNames.length + " sounds");
        } catch (IOException e) {
            Log.e(TAG, "Could not list assets " + e.getMessage());
            return;
        }

        for (String fileName : soundNames) {
            String path = SOUNdS_FOLDER + "/" + fileName;
            Sound sound = new Sound(path);
            mSounds.add(sound);
        }
    }

    public List<Sound> getSounds() {
        return mSounds;
    }
}
