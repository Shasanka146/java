import com.sun.source.util.SourcePositions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class URL_model {
    public static void main(String[] args)throws Exception
    {
        URL u=new URL("http://www.facebook.com");
        URLConnection con=u.openConnection();
        BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
        while(true)
        {
            String line=br.readLine();
            if(null==line)
            {
                break;
            }
            System.out.println(line);
        }
    }
}
