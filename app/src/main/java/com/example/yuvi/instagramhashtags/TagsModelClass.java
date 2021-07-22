package com.example.yuvi.instagramhashtags;

import android.graphics.drawable.Drawable;

public class TagsModelClass {
    String toptext, tagsName;
    int imageforcopy;

    public TagsModelClass(String toptext, String tagsName, int imageforcopy) {
        this.toptext = toptext;
        this.tagsName = tagsName;
        this.imageforcopy = imageforcopy;
    }

    public String getToptext() {
        return toptext;
    }

    public void setToptext(String toptext) {
        this.toptext = toptext;
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName;
    }

    public int getImageforcopy() {
        return imageforcopy;
    }

    public void setImageforcopy(int imageforcopy) {
        this.imageforcopy = imageforcopy;
    }
}