package github.sample.app;

import java.io.IOException;
import java.text.ParseException;
import com.github.api.Environment;
import com.github.api.GitHubAPIClient;
import com.github.api.controllers.MetaController;
import com.github.api.exceptions.ApiException;
import com.github.api.models.DynamicResponse;

public class OctoCat {
    public static void main(String[] args) throws ApiException, IOException, ParseException {
        GitHubAPIClient client = new GitHubAPIClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(0))
                .accessToken(Secrets.GITHUB_ACCESS_TOKEN).environment(Environment.PRODUCTION)
                .build();

        MetaController metaController = client.getMetaController();
        DynamicResponse dynamicResponse = metaController.metaGetOctocat(null);
        
        System.out.println("This example shows you the OctoCat with the help of `metaGetOctocat` endpoint. \n\n");
        System.out.println("Response from the API Call: ");
        System.out.println(dynamicResponse.parseAsString());
        System.exit(0);
    }
}
