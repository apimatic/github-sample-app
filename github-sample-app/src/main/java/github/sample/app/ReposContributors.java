package github.sample.app;

import java.io.IOException;
import java.util.List;
import com.github.api.Environment;
import com.github.api.GitHubAPIClient;
import com.github.api.controllers.ReposController;
import com.github.api.exceptions.ApiException;
import com.github.api.models.Contributor;

public class ReposContributors {

    public static void main(String[] args) throws ApiException, IOException {
        GitHubAPIClient client = new GitHubAPIClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(0))
                .accessToken(Secrets.GITHUB_ACCESS_TOKEN).environment(Environment.PRODUCTION)
                .build();

        ReposController reposController = client.getReposController();
        Integer perPage = 30;
        Integer page = 1;
        
        System.out.println("This example shows you the list the contributors of `"
                + Secrets.GITHUB_REPO_CONTRIBUTOR
                + "` repository using `reposListContributors` endpoint. \n\n");
        
        List<Contributor> contributors = reposController.reposListContributors(
                Secrets.GITHUB_USERNAME, Secrets.GITHUB_REPO_CONTRIBUTOR, null, perPage, page);
        
        System.out.println("Response from the API Call: ");
        
        for (Contributor contributor : contributors) {
            JsonPrinter.printJson(contributor.getClass().getSimpleName(), contributor);
        }
        System.exit(0);
    }

}
