/**
Este programa es un CRUD de órdenes de compra y de trabajo,
 vinculado con las hojas de calculo de Google.
 La idea es que se ingrese información mediante una interfaz simple,
 se guarde en una hoja de cálculo online (para evitar vincularlas
 mediante una red física y pueda potencialmente ser revisada en otro
 lugar además de la empresa) y mediante cierto permiso pueda
 aprobarse o no órdenes de trabajo y compras.
 */
import Clases.Funciones.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Principal {
    public static void main(String[] args) throws IOException {
        String url = "https://docs.google.com/spreadsheets/d/1tWc5QkekBx1wvfwblW_Q0GEvSxCnZwtnbld5ipl60Mw";
        Clases.Funciones.ConsultaWeb.paginaCompleta(url);
    }
    
}
