
package dealfreak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Ouranos
 */
public class AutoCheckBusiness {
    
    public boolean checkAuto(String number) throws IOException{
        String url = "https://companycheck.co.uk/company/"+number;

        URL urlobj = new URL(url);

        HttpsURLConnection connection = (HttpsURLConnection) urlobj.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/17.0");
        
        try{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //String s = response.toString();
        //System.out.println(s);
        return true;
        }
        catch(Exception e){
            //System.out.print(e);
            return false;
        }
        
    }
    
    /*
    public static void main(String[] args) throws IOException {
        AutoCheckBusiness acb = new AutoCheckBusiness();
        
        System.out.println(acb.checkAuto("1059445726"));
        System.out.println(acb.checkAuto("10594276"));
        
    }
    */
}
