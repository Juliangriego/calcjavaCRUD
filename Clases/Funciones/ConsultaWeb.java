package Clases.Funciones;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConsultaWeb {
    public static void paginaCompleta(String uerreele) throws IOException {
        URL link = new URL(uerreele);
        URLConnection yc = link.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}