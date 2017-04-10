
package dealfreak;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ouranos
 */
public class RegisterTest {

    public RegisterTest() {

    }

    @Test
    public void testGetCustomer() throws Exception {
        Register instance = new Register("Marios" , "Hendon", "132424", "mariosge90@gmail.com", "123");
        String expResult = "mariosge90@gmail.com";
        assertEquals(expResult, instance.getEmail());
        System.out.println("Successful registration for "+instance.getName()+" with the email "+ instance.getEmail());
        
        instance = new Register("Adam" , "Hendon", "132424", "adadd@122fdfd33.com", "123");
        expResult = null;
        assertEquals(expResult, instance.getEmail());
    }
    

    
    
}
