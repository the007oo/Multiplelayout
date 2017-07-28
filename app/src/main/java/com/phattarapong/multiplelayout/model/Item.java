package com.phattarapong.multiplelayout.model;

/**
 * Created by Phattarapong on 28-Jul-17.
 */

public class Item {
    public static final int TYPE_EDITTEXT = 1;
    public static final int TYPE_TEXTVIEW = 2;
    public static final int TYPE_IMAGEVIEW = 3;

    private String data;
    private int type;

    public Item(String data, int type) {
        this.data = data;
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
