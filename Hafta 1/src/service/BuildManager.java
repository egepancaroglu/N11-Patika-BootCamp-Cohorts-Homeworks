package service;

import entity.House;
import entity.SummerCottage;
import entity.Villa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author egepancaroglu
 */
public class BuildManager {

    private List<House> houseList = new ArrayList<>();
    private List<SummerCottage> summerCottageList = new ArrayList<>();
    private List<Villa> villaList = new ArrayList<>();

    public BuildManager() {

        houseList.add(new House(3_500_000, 140, 4, 1));
        houseList.add(new House(5_500_000, 165, 4, 1));
        houseList.add(new House(8_750_000, 180, 3, 2));
        houseList.add(new House(6_250_000, 200, 3, 2));

        summerCottageList.add(new SummerCottage(14_230_000, 250, 5, 3));
        summerCottageList.add(new SummerCottage(5_500_000, 230, 3, 2));
        summerCottageList.add(new SummerCottage(15_500_000, 225, 4, 2));
        summerCottageList.add(new SummerCottage(8_500_000, 225, 3, 2));

        villaList.add(new Villa(9_000_000, 225, 4, 3));
        villaList.add(new Villa(18_650_000, 350, 6, 2));
        villaList.add(new Villa(35_000_000, 420, 7, 3));
        villaList.add(new Villa(22_550_000, 365, 6, 2));
    }

    public List<House> getHouseList() {
        return new ArrayList<>(houseList);
    }

    public List<Villa> getVillaList() {
        return new ArrayList<>(villaList);
    }

    public List<SummerCottage> getSummerCottageList() {
        return new ArrayList<>(summerCottageList);
    }

}
