import org.jboss.pnc.client.ArtifactClient;
import org.jboss.pnc.client.Configuration;

public class Main {
    public static void main(String[] args) throws Exception {
        Configuration configuration = Configuration.builder()
                .protocol("http")
                .host("pnc-instance.com")
                .pageSize(50)
                .build();

        // example of using the ArtifactClient
        ArtifactClient client = new ArtifactClient(configuration);
        System.out.println(client.getSpecific(100));
    }
}
