package by.epam.application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Fene4ka_ on 31.01.2017.
 */
public class Application {
    public static void main(String[] args){
        clientTest("http://localhost:9080/common_war_exploded/jaxrs/xml/railwayTickets/getTicketByNumber/98dfbcd4-f3ae-46ca-aae3-04946ae0736d");
        System.out.println("\n\n\n\n");
        clientTest("http://localhost:9080/common_war_exploded/jaxrs/text/railwayTickets/getTicketByNumber/98dfbcd4-f3ae-46ca-aae3-04946ae0736d");
    }

    public static void clientTest(String link){
        try {
            URL url = new URL(link);
            URLConnection conn = url.openConnection();

            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String inputLine;

            while ((inputLine = br.readLine()) != null) {
                System.out.println(inputLine);
            }
            br.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
