/**
 *
 */
package org.krb.services;

import org.krb.model.DetectDupeModel;
import org.krb.model.IntegerSetRequest;
import org.krb.model.IntegerSetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Services associated with DeDupe project
 *
 * @author Ken.Byers
 */
@Service
public class DetectDupeService {

    private static final Logger log = LoggerFactory.getLogger(DetectDupeService.class);
    private final DetectDupeModel model;

    /**
     * Instantiates a new Detect dupe service.
     *
     * @param model the model
     */
    public DetectDupeService(DetectDupeModel model) {
        this.model = model;
    }

    /**
     * Init.
     */
    @PostConstruct
    public void init() {

    }


    /**
     * Do analysis integer set response.
     *
     * @param requestMessage the request message
     * @return the integer set response
     */
    public IntegerSetResponse doAnalysis(IntegerSetRequest requestMessage) {
        return new IntegerSetResponse(model.doAnalysis(requestMessage));
    }
}
