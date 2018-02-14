/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabonacci;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

/**
 *
 * @author rbnra
 */
public class TestJunit5 extends TestResult{
    // add the error
    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test) test, t);
    }
    
    // add the failure
    public synchronized void addFailure(Test test, AssertionFailedError t) {
        super.addFailure((junit.framework.Test) test, t);
    }
    
    @Test
    public void testAdd() {
        // add any test
    }
    
    // Marks that the test run should stop.
    public synchronized void stop() {
        // stop the test here
    }
}
