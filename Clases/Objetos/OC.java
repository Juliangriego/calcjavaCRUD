package Clases.Objetos;

public class OC {


    String nombreEmpresa, domicilio, contacto, solicitante, item;
    int iD;
    float precioUnitario,cantidad,precioTotal;

    public OC() {}
    public OC(String nombreEmpresa, String domicilio, String contacto, String solicitante, String item, int iD, float precioUnitario, float cantidad, float precioTotal) {
        this.nombreEmpresa = nombreEmpresa;
        this.domicilio = domicilio;
        this.contacto = contacto;
        this.solicitante = solicitante;
        this.item = item;
        this.iD = iD;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }


}
/*import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.io.Reader;
        import java.net.HttpURLConnection;
        import java.net.URL;

public class ReadGoogleSheets {

    public static void main(String[] args) throws IOException {
        // Obtén la clave API de Google Sheets
        String apiKey = "your_api_key";

        // Crea una URL para la hoja de cálculo
        URL url = new URL("https://sheets.googleapis.com/v4/spreadsheets/YOUR_SHEET_ID/values?key=" + apiKey);

        // Realiza una solicitud GET a la hoja de cálculo
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Obtén la respuesta de la solicitud
        InputStream responseStream = connection.getInputStream();
        Reader reader = new InputStreamReader(responseStream);

        // Lee los datos de la hoja de cálculo
        String data = reader.readLine();

        // Imprime los datos de la hoja de cálculo
        System.out.println(data);
    }
}
*/