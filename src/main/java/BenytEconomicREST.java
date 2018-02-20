import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class BenytEconomicREST
{
    public static void main(String[] args)
    {
        Client client = ClientBuilder.newClient();
        Response res = client.target("https://restapi.e-conomic.com/?demo=true")
                .request(MediaType.APPLICATION_JSON).get();
        String svar = res.readEntity(String.class);
        System.out.println(svar);
    }
}
