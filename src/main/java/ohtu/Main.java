package ohtu;

import java.util.ArrayList;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Collections;
import org.apache.http.client.fluent.Request;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                
        

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        ArrayList<Player> finp = new ArrayList<Player>();
        System.out.println("Players from FIN:");
        for (Player player : players) {
            if (player.getNationality().equals("FIN")) {
                finp.add(player);
                //System.out.println(player.getPoints()); 
            }        
        }   
        int max = 0;
        for (Player p : finp) {
            if (p.getPoints()>max) {
                max=p.getPoints();               
            }
        }
        while (max>=0) {
            for (Player p1 : finp) {
                if (p1.getPoints()==max) {
                    System.out.println(p1.getName() + " " + p1.getPoints());
                }
            }
            max--;
        }
        
    }
  
}