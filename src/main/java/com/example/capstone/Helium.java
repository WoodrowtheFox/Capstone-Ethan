package com.example.capstone;

import java.util.HashMap;

/**
 * This is the class for Helium
 */
public class Helium extends Elements{
    /**
     * This is used to get the elements name as a string
     *
     * @return - the element name
     */
    @Override
    public String getElementname() {
        return "Helium";
    }

    /**
     * This is used to get the atomic number of an element
     *
     * @return - the atomic number
     */
    @Override
    public int getAtomicnumber() {
        return 2;
    }

    /**
     * This is used to get the atomic mass of an element
     *
     * @return - the atomic mass
     */
    @Override
    public float getAtomicmass() {
        return 4.0026f;
    }

    /**
     * This is used to get the group number of an element
     *
     * @return - the group number
     */
    @Override
    public int getGroupnumber() {
        return 18;
    }

    /**
     * This is used to get the number of valence elctrons
     *
     * @return - returns the number of valence electrons
     */
    @Override
    public int getvalenceelectrons() {
        return 8;
    }

    /**
     * This is used to get the periodic number of an element
     *
     * @return - the periodic number
     */
    @Override
    public int getPeriodnumber() {
        return 1;
    }

    /**
     * This is used to get the family name of an element
     *
     * @return - the family name
     */
    @Override
    public String getFamilyname() {
        return "Noble Gas";
    }

    /**
     * This is used to get the common uses of an element
     *
     * @return - the common uses
     */
    @Override
    public String getcommonuses() {
        return "Ballons, Lasers, Refrigerant";
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
        return "He-base.png";
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
        return myhash;
    }
}
