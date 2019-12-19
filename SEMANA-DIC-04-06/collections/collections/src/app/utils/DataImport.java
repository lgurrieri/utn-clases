package app.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.MarvelHeroData;

/**
 * DataImport
 * @@author Luis Gurrieri
 *
 *
 */
public class DataImport {


    private static String[][] getMatrixData(String url) throws IOException {
        Path path = Paths.get(url);

        List<String> filesLines = Files.readAllLines(path);

        String[][] matrixData = new String[filesLines.size()-1][];

        for (int i = 1; i < filesLines.size(); i++) {

            String string = filesLines.get(i);
            String[] fields = string.split(",", -1);

            matrixData[i-1] = fields;
        }
        return matrixData;
    }

    public static List<MarvelHeroData> getHeroDataList(String url) throws IOException{

        ArrayList<MarvelHeroData> heroInfoList = new ArrayList<>();


        String[][] matrixsData = getMatrixData(url);

        for (int i = 0; i < matrixsData.length; i++) {
            String[] fields = matrixsData[i];
            MarvelHeroData marvelHeroData = new MarvelHeroData(fields[0], fields[1], fields[2], fields[3], fields[4]);

            heroInfoList.add(marvelHeroData);
        }

        return heroInfoList;
    }

    public static Map<String, MarvelHeroData> getHerDataMapByGender(String url) throws IOException {

        HashMap<String, MarvelHeroData> heroDataMap = new HashMap<>();

        String[][] matrixsData = getMatrixData(url);

        for (int i = 0; i < matrixsData.length; i++) {
            String[] fields = matrixsData[i];
            MarvelHeroData marvelHeroData = new MarvelHeroData(fields[0], fields[1], fields[2], fields[3], fields[4]);
            heroDataMap.put(fields[0], marvelHeroData);
        }
        return heroDataMap;
    }

}