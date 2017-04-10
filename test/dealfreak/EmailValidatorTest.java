
package dealfreak;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ouranos
 */
public class EmailValidatorTest {
    
    public EmailValidatorTest() {
    }

    /**
     * Test of checkEmail method, of class EmailValidator.
     */
    @Test
    public void testCheckEmail() throws Exception {
        EmailValidator instance = new EmailValidator();
        System.out.println("Testing EmailValidator");
        //Test on Valid emails --> expecting true from EmailValidator
        String[] email = {"mariosge90@gmail.com", "mg1109@live.mdx.ac.uk", "georgiage99@gmail.com", "sales@jpappas.net"};
        boolean expResult = true;
        for (String selectedEmail : email){
            boolean result = instance.checkEmail(selectedEmail);
            assertEquals(expResult, result);
            System.out.println("Pass -- >"+ selectedEmail);
        }
        
        //Test on invalid emails --> expecting false from EmailValidator
        String[] InvEmail = {"abcd@129.com", "marios", "32643716319", "marios@jmail.com", "abcfdfd.com", "salesuuuuu@jpappas.net"};
        expResult = false;
        for (String selectedEmail : InvEmail){
            boolean result = instance.checkEmail(selectedEmail);
            assertEquals(expResult, result);
            System.out.println("X Fail --> "+ selectedEmail);
        }
        
        //fail("The test case is a prototype.");
    }
    
}
