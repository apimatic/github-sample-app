package github.sample.app;

public class Secrets {

    private static String accessToken = System.getenv("GITHUB_ACCESS_TOKEN");
    public static final String GITHUB_USERNAME = System.getenv("GITHUB_USERNAME");
    public static final String GITHUB_ACCESS_TOKEN = (accessToken == null || accessToken.isEmpty())
            ? System.getenv("GITHUB_ACCESS_TOKEN_DEFAULT")
            : accessToken;
    public static final String GITHUB_REPO = System.getenv("GITHUB_REPO");
    public static final String GITHUB_REPO_CONTRIBUTOR = System.getenv("GITHUB_REPO_CONTRIBUTOR");

}
