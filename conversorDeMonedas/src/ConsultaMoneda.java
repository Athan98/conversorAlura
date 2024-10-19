import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda obtenerValoresMoneda(String moneda){
        String apiKEY="7e8328e209191b5e43603699";
        URI direccion = URI.create(
                "https://v6.exchangerate-api.com/v6/"+apiKEY+"/latest/"
                        +moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public double filtrarMonedas(Moneda moneda,String cotizacionBuscada){
        return moneda.conversion_rates().get(cotizacionBuscada);
    }

}
