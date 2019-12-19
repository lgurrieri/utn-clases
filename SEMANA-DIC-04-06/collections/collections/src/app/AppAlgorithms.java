package app;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import app.utils.DataImport;
/**
 * 
 * 
 */
public class AppAlgorithms {
    public static void main(String[]args)throws Exception {
        Comparator < MarvelHeroData > customComparator = new Comparator < MarvelHeroData > () {

            @Override
            public int compare(MarvelHeroData o1, MarvelHeroData o2) {

                return o1
                    .getName()
                    .compareTo(o2.getName());
            }

        };

        List < MarvelHeroData > heroInfoList = DataImport.getHeroDataList("marvel-wikia-data.csv");

        heroInfoList.sort(customComparator);

        for (MarvelHeroData marvelHeroData : heroInfoList) {
            System
                .out
                .println(marvelHeroData.getName());
        }

       Collections.reverse(heroInfoList);

        for (MarvelHeroData marvelHeroData : heroInfoList) {
            System
                .out
                .println(marvelHeroData.getName());
        }
    }

}