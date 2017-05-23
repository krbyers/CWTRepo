package org.krb.model;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Detect dupe model.
 */
@Component
public class DetectDupeModel {
    private static final Logger log = LoggerFactory.getLogger(DetectDupeModel.class);
    private IntegerSetRequest message;
    private HashMap<Integer, Integer> resultMap;

    /**
     * Aggregate all the integers, inserting a count on a map object.  Then filter the results to include only items with more than one
     *
     * @param requestMessage the request message
     * @return the hash map
     */
    public HashMap<Integer, Integer> doAnalysis(IntegerSetRequest requestMessage) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        ;
        for (Integer reqint : requestMessage.getIntegerSet()) {
            if (resultMap.containsKey(reqint))
                // Increment the current member by 1
                resultMap.put(reqint, resultMap.get(reqint) + 1);
            else
                // Initialize the new member
                resultMap.put(reqint, 1);

        }
        return filterResult(resultMap);
    }

    /**
     * Filter the inbound raw result to only include those keys that appear more than once.
     */
    private HashMap<Integer, Integer> filterResult(Map<Integer, Integer> rawResult) {
        HashMap<Integer, Integer> filteredMap = new HashMap<>();
        ;
        for (Map.Entry<Integer, Integer> entry : rawResult.entrySet()) {
            if (entry.getValue() > 1)
                filteredMap.put(entry.getKey(), entry.getValue());
        }
        return filteredMap;
    }

}