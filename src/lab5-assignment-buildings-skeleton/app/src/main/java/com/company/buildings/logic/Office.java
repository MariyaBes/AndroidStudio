package com.company.buildings.logic;

import java.util.Objects;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office 
       extends Building {
       
    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    //constructors


    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }

    public static int getTotalOffices(){
        return sTotalOffices;
    }

    //getters
    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    //setters
    public void setBusinessName(String businessName) {
        this.mBusinessName = businessName;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.mParkingSpaces = parkingSpaces;
    }


    @Override
    public String toString() {
        String res = "Business: ";

        res += (Objects.nonNull(getBusinessName())) ?  mBusinessName : "unoccupied";

        res += mParkingSpaces !=0 ? "; has " + mParkingSpaces + " parking spaces" : "";

        res += " (total offices: " + sTotalOffices + ")";

        return res;
//        if (mBusinessName != null){
//            return " unoccupied";
//        } else if (mParkingSpaces !=0) {
//            return "; has " + mParkingSpaces + " parking spaces";
//        } else {
//            return " (total offices: " + sTotalOffices + ")";
//        }
    }

    @Override
    public boolean equals(Object x) {
        Office office = (Office) x;
        return (getParkingSpaces() == office.getParkingSpaces()) && (calcBuildingArea() == office.calcBuildingArea());
    }
    
}
