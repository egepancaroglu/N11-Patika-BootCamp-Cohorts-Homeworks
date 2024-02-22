package service.impl;

/**
 * @author egepancaroglu
 */

import entity.BaseBuild;
import entity.House;
import entity.SummerCottage;
import entity.Villa;
import service.BuildManager;
import service.BuildService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author egepancaroglu
 */
public class BuildServiceImpl implements BuildService {

    private final BuildManager buildManager;

    public BuildServiceImpl(BuildManager buildManager) {
        this.buildManager = buildManager;
    }

    @Override
    public double totalPriceOfAllHouses() {
        return buildManager.getHouseList().stream().mapToDouble(House::getPropertyPrice).sum();
    }

    @Override
    public double totalPriceOfAllVillas() {
        return buildManager.getVillaList().stream().mapToDouble(Villa::getPropertyPrice).sum();
    }

    @Override
    public double totalPriceOfAllSummerCottages() {
        return buildManager.getSummerCottageList().stream().mapToDouble(SummerCottage::getPropertyPrice).sum();
    }

    @Override
    public double totalPriceOfAllBuilds() {
        return totalPriceOfAllHouses() + totalPriceOfAllVillas() + totalPriceOfAllSummerCottages();
    }

    @Override
    public double averageAreaOfAllHouses() {
        return buildManager.getHouseList().stream().mapToInt(House::getTotalLivingArea).average().orElse(0);
    }

    @Override
    public double averageAreaOfAllVillas() {
        return buildManager.getVillaList().stream().mapToInt(Villa::getTotalLivingArea).average().orElse(0);
    }

    @Override
    public double averageAreaOfAllSummerCottages() {
        return buildManager.getSummerCottageList().stream().mapToInt(SummerCottage::getTotalLivingArea).average().orElse(0);
    }

    @Override
    public double averageAreaOfAllBuilds() {
        double totalArea = buildManager.getHouseList().stream().mapToInt(House::getTotalLivingArea).sum() +
                buildManager.getVillaList().stream().mapToInt(Villa::getTotalLivingArea).sum() +
                buildManager.getSummerCottageList().stream().mapToInt(SummerCottage::getTotalLivingArea).sum();
        int totalBuildCount = buildManager.getHouseList().size() + buildManager.getVillaList().size() + buildManager.getSummerCottageList().size();
        return totalBuildCount > 0 ? totalArea / totalBuildCount : 0;
    }

    @Override
    public List<BaseBuild> FilterByNumberOfRoomAndHall(int numberOfRoom, int numberOfHall) {
        List<BaseBuild> filteredList = new ArrayList<>();
        filteredList.addAll(buildManager.getHouseList().stream()
                .filter(ev -> ev.getNumberOfRooms() == numberOfRoom && ev.getNumberOfHalls() == numberOfHall)
                .collect(Collectors.toList()));
        filteredList.addAll(buildManager.getVillaList().stream()
                .filter(villa -> villa.getNumberOfRooms() == numberOfRoom && villa.getNumberOfHalls() == numberOfHall)
                .collect(Collectors.toList()));
        filteredList.addAll(buildManager.getSummerCottageList().stream()
                .filter(summerCottage -> summerCottage.getNumberOfRooms() == numberOfRoom && summerCottage.getNumberOfHalls() == numberOfHall)
                .collect(Collectors.toList()));
        return filteredList;
    }
}

