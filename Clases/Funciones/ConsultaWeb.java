package Clases.Funciones;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class ConsultaWeb {
    public static void paginaCompleta(String uerreele) throws IOException {
        URL link = new URL(uerreele);
        URLConnection yc = link.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        BufferedReader br = new BufferedReader(new FileReader("mezcla.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"));

        String inputLine="";
        while (!inputLine.equals("try{")){
            inputLine = in.readLine();
            bw.write(inputLine + "\n");
        }
        in.close();

        inputLine="";
        while (inputLine != null){
            inputLine = br.readLine();
            int i = 1;
            System.out.println(i + ". " + inputLine);
        }

    }

}