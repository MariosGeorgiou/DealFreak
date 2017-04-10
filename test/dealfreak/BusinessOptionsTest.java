
package dealfreak;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ouranos
 */
public class BusinessOptionsTest {
    
    public BusinessOptionsTest() {
    }

    @Test
    public void testEnable() {
        BusinessOptions instance = new BusinessOptions();
        boolean businessAccount;
        boolean success;
        
        //Trying to enable the business options when the businessAccount is set to false -> Expecting success
        businessAccount = false;
        success = instance.enable(businessAccount);
        System.out.println("BusinessAccount= "+businessAccount + " EnableBusinessOptions= "+success);
        assertNotEquals(success, businessAccount);
        
        //Trying to enable the business options when the businessAccount is set to tue -> Expecting fail
        businessAccount = true;
        success = instance.enable(businessAccount);
        System.out.println("BusinessAccount= "+businessAccount + " EnableBusinessOptions= "+success);
        assertNotEquals(success, businessAccount);
    }
    
}
