package app;

import java.util.List;
import java.util.Map;

import app.utils.DataImport;
/**
 * @@author Luis gurrieri
 *
 * Programa de ejemplo para exponer ejemplos de colecciones del tipo map y del tipo List.
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        /*List<MarvelHeroData> heroInfoList = DataImport.getHeroDataList("marvel-wikia-data.csv");

        for (MarvelHeroData marvelHeroData : heroInfoList) {
            System.out.println(marvelHeroData);
        }*/


        Map<String, MarvelHeroData> marvelHeroDataMap = DataImport.getHerDataMapByGender("marvel-wikia-data.csv");

        for (Map.Entry<String, MarvelHeroData> entry : marvelHeroDataMap.entrySet()) {
            String pageId = entry.getKey();
            MarvelHeroData marvelHeroData = entry.getValue();

            System.out.println("pageId: "+pageId+" Hero Info: "+marvelHeroData);

        }
    }
}