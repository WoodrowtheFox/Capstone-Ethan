package com.example.capstone;

import java.util.HashMap;

/**
 * This is for the data of Yttrium
 */
public class Yttrium extends Elements{
    /**
     * This is used to get the elements name as a string
     *
     * @return - the element name
     */
    @Override
    public String getElementname() {
        return "Yttrium";
    }

    /**
     * This is used to get the atomic number of an element
     *
     * @return - the atomic number
     */
    @Override
    public int getAtomicnumber() {
        return 39;
    }

    /**
     * This is used to get the atomic mass of an element
     *
     * @return - the atomic mass
     */
    @Override
    public float getAtomicmass() {
        return 88.90584f;
    }

    /**
     * This is used to get the group number of an element
     *
     * @return - the group number
     */
    @Override
    public int getGroupnumber() {
        return 3;
    }

    /**
     * This is used to get the number of valence elctrons
     *
     * @return - returns the number of valence electrons
     */
    @Override
    public int getvalenceelectrons() {
        return 2;
    }

    /**
     * This is used to get the periodic number of an element
     *
     * @return - the periodic number
     */
    @Override
    public int getPeriodnumber() {
        return 5;
    }

    /**
     * This is used to get the family name of an element
     *
     * @return - the family name
     */
    @Override
    public String getFamilyname() {
        return "Transition Metal";
    }

    /**
     * This is used to get the common uses of an element
     *
     * @return - the common uses
     */
    @Override
    public String getcommonuses() {
        return "High_Temp Semiconductors";
    }

    /**
     * This is used to get the ionic state of the element
     *
     * @return - the ionic state
     */
    @Override
    public int getionicstate() {
        return 3;
    }

    /**
     * This is used to get the image name of an element
     *
     * @return - the image name
     */
    @Override
    public String getImagename() {
        return "Y-base.png";
    }

    /**
     * This is used to get how many electrons are in each shell of an element
     *
     * @return - returns a hashnmap of all the shells
     */
    @Override
    public HashMap<String, Integer> getshelltotals() {
        HashMap<String, Integer> myhash = new HashMap<>();
        myhash.put("1s",2);
        myhash.put("2s",2);
        myhash.put("2p", 6);
        myhash.put("3s", 2);
        myhash.put("3p", 6);
        myhash.put("3d", 10);
        myhash.put("4s", 2);
        myhash.put("4p", 6);
        myhash.put("4d", 1);
        myhash.put("5s", 2);
        return myhash;
    }
}
