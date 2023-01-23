package github.sample.app;

import java.io.IOException;
import com.github.api.Environment;
import com.github.api.GitHubAPIClient;
import com.github.api.controllers.BillingController;
import com.github.api.exceptions.ApiException;
import com.github.api.models.ActionsBillingUsage;

public class GithubActionsBilling {

    public static void main(String[] args) throws ApiException, IOException {
        GitHubAPIClient client = new GitHubAPIClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(0))
                .accessToken(Secrets.GITHUB_ACCESS_TOKEN).environment(Environment.PRODUCTION)
                .build();
        
        BillingController billingController = client.getBillingController();
        
        System.out.println("This example shows you the billing of GitHub packages for a user "
                + "with the help of `billingGetGithubActionsBillingUser` endpoint. \n\n");
        
        ActionsBillingUsage actionBillingUsage =
                billingController.billingGetGithubActionsBillingUser(Secrets.GITHUB_USERNAME);
        
        System.out.println("Response from the API Call: ");
        JsonPrinter.printJson(actionBillingUsage.getClass().getSimpleName(), actionBillingUsage);
        System.exit(0);
    }
}
