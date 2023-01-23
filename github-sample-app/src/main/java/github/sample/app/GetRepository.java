package github.sample.app;

import java.io.IOException;
import com.github.api.Environment;
import com.github.api.GitHubAPIClient;
import com.github.api.controllers.ReposController;
import com.github.api.exceptions.ApiException;
import com.github.api.models.ReposResponse;

public class GetRepository {
    public static void main(String[] args) throws ApiException, IOException {
        GitHubAPIClient client = new GitHubAPIClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(0))
                .accessToken(Secrets.GITHUB_ACCESS_TOKEN).environment(Environment.PRODUCTION)
                .build();

        ReposController reposController = client.getReposController();
        String repoName = Secrets.GITHUB_REPO;
        
        System.out.println("This example shows you to get the GitHub repository "
                + "with the help of `reposGet` endpoint. \n\n");
        
        ReposResponse repoResponse = reposController.reposGet(Secrets.GITHUB_USERNAME, repoName);
        System.out.println("Response from the API Call: ");
        JsonPrinter.printJson(repoResponse.getClass().getSimpleName(), repoResponse);
        System.exit(0);
    }

}
