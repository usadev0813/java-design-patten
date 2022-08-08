package com.example.designpatten.builder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = tourDirector.cancunTrip();
        TourPlan tourPlan1 = tourDirector.longBeachTrip();
    }
}
