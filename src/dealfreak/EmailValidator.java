package dealfreak;

import java.net.URL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Ouranos
 */
public class EmailValidator {

    private final String key = "0ec512be82b13405d3bcbd0d5c6cba20";

    public boolean checkEmail(String email) throws Exception {
        boolean isValid = true;

        String url = "https://apilayer.net/api/check?access_key=" + key + "&email=" + email + "&format=1";

        URL urlobj = new URL(url);

        HttpURLConnection connection = (HttpURLConnection) urlobj.openConnection();
        
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/17.0");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //JSON response in a String
        String s = response.toString();
        //System.out.println(s);

        //Parse JSON response to MainParser to get all the elements
        try {
            ObjectMapper mapper = new ObjectMapper();
            MainParser mp = mapper.readValue(s, MainParser.class);
            //The score is given by an algorithm based on the legitimacy of the email
            double score = mp.getScore();
            boolean smtp = mp.isSmtp_check();
            //Anything below 0.8 is probably not a valid email
            if (score < 0.8 || smtp != true) {
                return false;
            }
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        return true;

    }

    //Testing
    /*public static void main(String[] args) {
    EmailValidator ec = new EmailValidator();
    
    try {
    ec.checkEmail("mg1109@live.max.ac.uk");
    
    } catch (Exception e) {
    
    e.printStackTrace();
    }
    }*/
}
