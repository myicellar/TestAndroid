package com.mic.model.entities;

/**
 * Created by tomywu on 7/9/15.
 */
public class WineList {
    private String id;
    private String title;

    public WineList(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

}
