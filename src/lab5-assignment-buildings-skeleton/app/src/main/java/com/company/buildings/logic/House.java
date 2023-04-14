package com.company.buildings.logic;

import java.util.Objects;

/**
 * This is the House class file that extends Building.
 */
public class House 
       extends Building {
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House (int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        mOwner = null;
        mPool = false;
    }
    public House (int length, int width, int lotLength, int lotWidth, String owner){
        super(length, width, lotLength, lotWidth);
        mOwner = owner;
        mPool = false;
    }
    public House (int length, int width, int lotLength, int lotWidth, String owner, boolean pool){
        super(length, width, lotLength, lotWidth);
        mOwner = owner;
        mPool = pool;
    }

    public String getOwner(){
        return mOwner;
    }

    public boolean hasPool(){
        return mPool;
    }

    public void setOwner(String owner){
        mOwner = owner;
    }
    public void setPool(boolean pool){
        mPool = pool;
    }

    @Override
    public String toString() {
        String result = (Objects.nonNull(getOwner())) ? "Owner: " + getOwner() : "";

        result += (calcBuildingArea() < calcLotArea()) ? "; has a big open space" : "";

        return result;
    }

    public boolean equals(Object o){
        House house = (House) o;
        return (mPool == house.hasPool()) && (calcBuildingArea() == house.calcBuildingArea());
    }

}
