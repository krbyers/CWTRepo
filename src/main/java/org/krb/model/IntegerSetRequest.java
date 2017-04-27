package org.krb.model;

import java.util.List;


/**
 * Representation Class for request messages
 *
 * @author Ken.Byers
 */
public class IntegerSetRequest {
    private List<Integer> integerSet;

    /**
     * Gets integer set.
     *
     * @return the integer set
     */
    public List<Integer> getIntegerSet() {
        return integerSet;
    }

    /**
     * Sets integer set.
     *
     * @param integerSet the integer set
     */
    public void setIntegerSet(List<Integer> integerSet) {
        this.integerSet = integerSet;
    }
}
