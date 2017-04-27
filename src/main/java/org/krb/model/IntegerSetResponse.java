package org.krb.model;

import java.util.HashMap;

/**
 * Representation for response messsages
 * Created by Ken.Byers on 4/27/2017.
 */
public class IntegerSetResponse {

    private HashMap<Integer, Integer> resultMap;

    /**
     * Instantiates a new Integer set response.
     *
     * @param integerIntegerHashMap the integer integer hash map
     */
    public IntegerSetResponse(HashMap<Integer, Integer> integerIntegerHashMap) {
        this.resultMap = integerIntegerHashMap;
    }

    /**
     * Gets result map.
     *
     * @return the result map
     */
    public HashMap<Integer, Integer> getResultMap() {
        return resultMap;
    }

    /**
     * Sets result map.
     *
     * @param resultMap the result map
     */
    public void setResultMap(HashMap<Integer, Integer> resultMap) {
        this.resultMap = resultMap;
    }
}
