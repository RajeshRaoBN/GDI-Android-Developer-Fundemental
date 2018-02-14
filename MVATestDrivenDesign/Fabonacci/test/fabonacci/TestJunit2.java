/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabonacci;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author rbnra
 */
class TestJunit2 {
    
   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
    
}
