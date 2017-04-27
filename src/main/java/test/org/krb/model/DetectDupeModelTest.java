package test.org.krb.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.krb.model.DetectDupeModel;
import org.krb.model.IntegerSetRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * DetectDupeModel Tests.
 * Intended to demonstrate that I understand TDD and unit testing...
 *
 * @author Ken.Byers
 * @version 1.0
 * @since <pre>Apr 27, 2017</pre>
 */
public class DetectDupeModelTest {
    private DetectDupeModel model;

    @Before
    public void before() throws Exception {
        model = new DetectDupeModel();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: doAnalysis(IntegerSetRequest requestMessage)
     */
    @Test
    public void testDoAnalysis() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: filterResult(HashMap<Integer, Integer> rawResult)
     */
    @Test
    public void testFilterResult() throws Exception {
        IntegerSetRequest testReq = new IntegerSetRequest();
        List<Integer> testSet = new ArrayList<>();
        // Provide sample data
        testSet.add(1);
        testSet.add(1);
        testSet.add(1);
        testSet.add(2);

        testReq.setIntegerSet(testSet);

        Map<Integer, Integer> result = model.doAnalysis(testReq);
        // Should contain 1 entry for result

        Assert.assertEquals("Non-Empty result set", 1, result.size());
        Assert.assertEquals( "Unexpected result", 1,result.entrySet().size());
        // More tests would be nice here...
    }

} 
