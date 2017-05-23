package org.krb.resources;

import org.krb.model.IntegerSetRequest;
import org.krb.model.IntegerSetResponse;
import org.krb.services.DetectDupeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON;


/**
 * Resources - defines endpoints for this applicaiton
 * The type Detect dupe resource.
 */
@RestController
@RequestMapping("/dedup")
public class DetectDupeResource {
    private static final Logger log = LoggerFactory.getLogger(DetectDupeResource.class);
    private DetectDupeService detectDupeService;
    private IntegerSetRequest requestMessage;

    /**
     * Instantiates a new Detect dupe resource.
     *
     * @param detectDupeService the detect dupe service
     */
    public DetectDupeResource(DetectDupeService detectDupeService) {
        this.detectDupeService = detectDupeService;
    }


    /**
     * Process integer set response entity.
     *
     * @param requestMessage the request message
     * @return the response entity
     */
    @RequestMapping(value = "/set", method = RequestMethod.POST)
    //
    public ResponseEntity<IntegerSetResponse> processIntegerSet(@RequestBody IntegerSetRequest requestMessage) {
        log.debug(" *** Message Rx IntegerSet ");
        IntegerSetResponse response = detectDupeService.doAnalysis(requestMessage);

        return ResponseEntity.ok(response);
    }


    @Override
    public String toString() {
        return "DetectDupeResource{" +
                "detectDupeService=" + detectDupeService +
                ", requestMessage=" + requestMessage +
                '}';
    }
}