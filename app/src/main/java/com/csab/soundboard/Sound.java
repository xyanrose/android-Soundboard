/*
 * Copyright (C) 2014 Caleb Sabatini
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.csab.soundboard;

public class Sound {

    private String mName;
    private int mAudioResourceId;
    private int mImageResourceId;

    public Sound(String name, int mAudioResourceId, int mImageResourceId) {
        this.mName = name;
        this.mAudioResourceId = mAudioResourceId;
        this.mImageResourceId = mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public void setAudioResourceId(int audioResourceId) {
        this.mAudioResourceId = audioResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    @Override
    public String toString() {
        return mName;
    }
}
