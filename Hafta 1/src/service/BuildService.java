package service;

import entity.BaseBuild;

import java.util.List;

/**
 * @author egepancaroglu
 */
public interface BuildService {

    double totalPriceOfAllHouses();
    double totalPriceOfAllVillas();
    double totalPriceOfAllSummerCottages();
    double totalPriceOfAllBuilds();
    double averageAreaOfAllHouses();
    double averageAreaOfAllVillas();
    double averageAreaOfAllSummerCottages();
    double averageAreaOfAllBuilds();
    List<BaseBuild> FilterByNumberOfRoomAndHall(int numberOfRoom, int numberOfHall);

}
