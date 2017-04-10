
package dealfreak;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ouranos
 */
public class AutoCheckBusinessTest {
    
    public AutoCheckBusinessTest() {
    }

    /**
     * Test of checkAuto method, of class AutoCheckBusiness.
     */
    @Test
    public void testCheckAuto() throws Exception {
        AutoCheckBusiness instance = new AutoCheckBusiness();
        
        //Valid business numbers -> expecting valid
        //Breakfast Cafe(10594276), Greek on the Green(08274558), Riverside cafe London(09826344)
        String number[] = {"10594276","08274558", "09826344"};
        for (String n : number){
            assertEquals(true, instance.checkAuto(n));
            System.out.println(n+" is a valid business");
        }
        
        //Inalid business numbers -> expecting invalid
        String number2[] = {"1059445726","081114558", "0989v444" , "11111111"};
        for (String n : number2){
            assertEquals(false, instance.checkAuto(n));
            System.out.println(n+" is NOT a valid business");
        }
        
    }

    
}
