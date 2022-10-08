package java;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL.*;

public class RestApi {
    public static void main(String[] args) throws IOException{
        Url url = new Url("http://api.nbp.pl/api/cenyzlota");
        InputStreamReader reader = new InputStreamReader(url.openStream());

        GoldInfo goldInfo = new Gson().fromJson(reader, Goldinfo.class);

        System.out.println(goldInfo);




    }



}