package Test;

import com.mic.model.entities.WineList;
import com.squareup.otto.Subscribe;

/**
 * Created by tomywu on 7/9/15.
 */
public class TestModel {


    public static void main(String[] args) {
        System.out.println("Tomy");

        //try {

            //Call<WineList> call = new RestWineSource().getWines();


            //WineList wine = call.execute().body();

            //System.out.println(wine.getTitle());



        //} catch (IOException e){
        //    System.out.println(e.getMessage());
        //}


    }


    @Subscribe
    public void onWineReceived(WineList wineList) {
        System.out.println(wineList.getTitle());
    }

}
