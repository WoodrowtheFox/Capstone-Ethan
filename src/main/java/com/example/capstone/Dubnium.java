package com.example.capstone;

import java.util.HashMap;

/**
 * This is for the data of Dubnium
 */
public class Dubnium extends Elements{
    /**
     * This is used to get the elements name as a string
     *
     * @return - the element name
     */
    @Override
    public String getElementname() {
        return "Dubnium";
    }

    /**
     * This is used to get the atomic number of an element
     *
     * @return - the atomic number
     */
    @Override
    public int getAtomicnumber() {
        return 105;
    }

    /**
     * This is used to get the atomic mass of an element
     *
     * @return - the atomic mass
     */
    @Override
    public float getAtomicmass() {
        return 268.126f;
    }

    /**
     * This is used to get the group number of an element
     *
     * @return - the group number
     */
    @Override
    public int getGroupnumber() {
        return 5;
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
        return 7;
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
        return "No Uses";
    }

    /**
     * This is used to get the ionic state of the element
     *
     * @return - the ionic state
     */
    @Override
    public int getionicstate() {
        return 0;
    }

    /**
     * This is used to get the image name of an element
     *
     * @return - the image name
     */
    @Override
    public String getImagename() {
        return "Db-base.png";
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
        myhash.put("4d", 10);
        myhash.put("4f", 14);
        myhash.put("5s", 2);
        myhash.put("5p", 6);
        myhash.put("5d", 10);
        myhash.put("5f", 14);
        myhash.put("6s", 2);
        myhash.put("6p", 6);
        myhash.put("6d", 3);
        myhash.put("7s", 2);
        return myhash;
    }
}
