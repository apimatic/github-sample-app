package github.sample.app;

import java.io.IOException;
import com.github.api.Environment;
import com.github.api.GitHubAPIClient;
import com.github.api.controllers.ReposController;
import com.github.api.exceptions.ApiException;
import com.github.api.models.ReposResponse;
import com.github.api.models.UserReposRequest;
import com.github.api.models.UserReposResponse;;

public class RepositoryFlow {

    public static void main(String[] args) throws ApiException, IOException {
        GitHubAPIClient client = new GitHubAPIClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(0))
                .accessToken(Secrets.GITHUB_ACCESS_TOKEN).environment(Environment.PRODUCTION)
                .build();

        ReposController reposController = client.getReposController();
        String repoName = Secrets.GITHUB_REPO;
        
        System.out.println("This example shows you the Repository flow: \n"
                + "\t1. Create Repository by 'reposCreateForAuthenticatedUser' endpoint\n"
                + "\t2. Get Repository by 'reposGet' endpoint\n"
                + "\t3. Delete the repository by 'reposDelete' endpoint\n");
        
        UserReposRequest userReposRequest =
                new UserReposRequest.Builder().name(repoName).mPrivate(false).build();
        
        // create a repository
        System.out.println("Creating a repository " + repoName);
        UserReposResponse repo = reposController.reposCreateForAuthenticatedUser(userReposRequest);
        JsonPrinter.printJson(repo.getClass().getSimpleName(), repo);
        System.out.println();

        // get a repository
        System.out.println("Getting a repository " + repoName);
        ReposResponse updatedRepo = reposController.reposGet(Secrets.GITHUB_USERNAME, repoName);
        JsonPrinter.printJson(updatedRepo.getClass().getSimpleName(), updatedRepo);
        System.out.println();
        
        // delete the repository
        System.out.println("Deleting a repository " + repoName);
        reposController.reposDelete(Secrets.GITHUB_USERNAME, repoName);
        System.out.println("Deleted a repository " + repoName);
        System.exit(0);
    }
}
