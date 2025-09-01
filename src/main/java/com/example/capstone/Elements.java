package com.example.capstone;

import java.util.HashMap;

/**
 * This is the class used for all of the elements in the perodic table, and stores their data
 */
public abstract class Elements {
    /**
     * This is used to get the elements name as a string
     * @return - the element name
     */
    public abstract String getElementname();
    /**
     * This is used to get the atomic number of an element
     * @return - the atomic number
     */
    public abstract int getAtomicnumber();
    /**
     * This is used to get the atomic mass of an element
     * @return - the atomic mass
     */
    public abstract float getAtomicmass();
    /**
     * This is used to get the group number of an element
     * @return - the group number
     */
    public abstract int getGroupnumber();
    /**
     *This is used to get the number of valence elctrons
     * @return - returns the number of valence electrons
     */
    public abstract int getvalenceelectrons();
    /**
     * This is used to get the periodic number of an element
     * @return - the periodic number
     */
    public abstract int getPeriodnumber();
    /**
     * This is used to get the family name of an element
     * @return - the family name
     */
    public abstract String getFamilyname();
    /**
     * This is used to get the common uses of an element
     * @return - the common uses
     */
    public abstract String getcommonuses();
    /**
     * This is used to get the ionic state of the element
     * @return - the ionic state
     */
    public abstract int getionicstate();
    /**
     * This is used to get the image name of an element
     * @return - the image name
     */
    public abstract String getImagename();
    /**
     * This is used to get how many electrons are in each shell of an element
     * @return - returns a hashnmap of all the shells
     */
    public abstract HashMap<String, Integer> getshelltotals();
}
