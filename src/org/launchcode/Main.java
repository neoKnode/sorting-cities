package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);
        printCities(cities);


        StateComparator comparators = new StateComparator();
        cities.sort(comparators);
        printStates(cities);


        PopulationComparator comparatorss = new PopulationComparator();
        cities.sort(comparatorss);
        printPopulation(cities);

        AreaComparator comparatorsss = new AreaComparator();
        cities.sort(comparatorsss);
        printArea(cities);



    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

        System.out.println("");
    }


    private static void printStates(ArrayList<City> states) {

        System.out.println(City.getTableHeader());

        for(City state : states) {
            System.out.println(state);

        }

        System.out.println("");
    }

    private static void printPopulation(ArrayList<City> populations) {

        System.out.println(City.getTableHeader());

        for(City population : populations) {
            System.out.println(population);
        }

        System.out.println("");
    }


    private static void printArea(ArrayList<City> populations) {

        System.out.println(City.getTableHeader());

        for(City population : populations) {
            System.out.println(population);
        }

        System.out.println("");
    }

}
