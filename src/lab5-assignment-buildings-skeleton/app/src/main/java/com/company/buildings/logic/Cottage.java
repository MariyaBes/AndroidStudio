package com.company.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {
       
    // TODO - Put your code here.
    private  boolean mSecondFloor;

    public Cottage (int dimension, int lotLength, int lotWidth){
        super(dimension, dimension, lotLength, lotWidth);
        mSecondFloor = false;
    }
    public Cottage (int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor){
        super(dimension, dimension, lotLength, lotWidth, owner);
        mSecondFloor = secondFloor;
    }

    public boolean hasSecondFloor(){
        return mSecondFloor;
    }

    @Override
    public String toString(){
        return super.toString() + (hasSecondFloor() ? "; is a two story cottage" : "");
//        if (hasSecondFloor() == true){
//            return super.toString() + "; is a two story cottage";
//        }
//        else {
//            return super.toString() + " ";
//        }
    }
}

