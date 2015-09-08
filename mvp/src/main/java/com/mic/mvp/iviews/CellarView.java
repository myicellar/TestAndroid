package com.mic.mvp.iviews;

import com.mic.model.entities.WineList;

import java.util.List;

/**
 * Created by tomywu on 7/9/15.
 */
public interface CellarView extends MVPView {

    void showCellar(List<WineList> wineList);
}
