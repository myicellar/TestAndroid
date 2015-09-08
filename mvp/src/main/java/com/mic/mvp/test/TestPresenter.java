package com.mic.mvp.test;

import com.mic.model.rest.RestWineSource;
import com.mic.mvp.pst.CellarPresenter;
import com.squareup.otto.Bus;

/**
 * Created by tomywu on 8/9/15.
 */
public class TestPresenter {

    public static void main(String[] args) {
        System.out.println("Tomy");

        Bus bus = new Bus();
        CellarPresenter pst = new CellarPresenter(bus);
        pst.start();

        RestWineSource source = new RestWineSource(bus);
        source.getWines();

        //try {

        //Call<WineList> call = new RestWineSource().getWines();


        //WineList wine = call.execute().body();

        //System.out.println(wine.getTitle());



        //} catch (IOException e){
        //    System.out.println(e.getMessage());
        //}


    }
}
