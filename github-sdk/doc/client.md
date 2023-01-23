
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `accessToken` | `String` | The OAuth 2.0 Access Token to use for API requests. |

The API client can be initialized as follows:

```java
GitHubAPIClient client = new GitHubAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .accessToken("AccessToken")
    .environment(Environment.PRODUCTION)
    .build();
```

## GitHub APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getActionsController()` | Provides access to Actions controller. | `ActionsController` |
| `getActivityController()` | Provides access to Activity controller. | `ActivityController` |
| `getAppsController()` | Provides access to Apps controller. | `AppsController` |
| `getBillingController()` | Provides access to Billing controller. | `BillingController` |
| `getChecksController()` | Provides access to Checks controller. | `ChecksController` |
| `getCodeScanningController()` | Provides access to CodeScanning controller. | `CodeScanningController` |
| `getCodesOfConductController()` | Provides access to CodesOfConduct controller. | `CodesOfConductController` |
| `getCodespacesController()` | Provides access to Codespaces controller. | `CodespacesController` |
| `getEmojisController()` | Provides access to Emojis controller. | `EmojisController` |
| `getEnterpriseAdminController()` | Provides access to EnterpriseAdmin controller. | `EnterpriseAdminController` |
| `getDependabotController()` | Provides access to Dependabot controller. | `DependabotController` |
| `getDependencyGraphController()` | Provides access to DependencyGraph controller. | `DependencyGraphController` |
| `getGistsController()` | Provides access to Gists controller. | `GistsController` |
| `getGitController()` | Provides access to Git controller. | `GitController` |
| `getGitignoreController()` | Provides access to Gitignore controller. | `GitignoreController` |
| `getInteractionsController()` | Provides access to Interactions controller. | `InteractionsController` |
| `getIssuesController()` | Provides access to Issues controller. | `IssuesController` |
| `getLicensesController()` | Provides access to Licenses controller. | `LicensesController` |
| `getMarkdownController()` | Provides access to Markdown controller. | `MarkdownController` |
| `getMetaController()` | Provides access to Meta controller. | `MetaController` |
| `getMigrationsController()` | Provides access to Migrations controller. | `MigrationsController` |
| `getOrgsController()` | Provides access to Orgs controller. | `OrgsController` |
| `getPackagesController()` | Provides access to Packages controller. | `PackagesController` |
| `getProjectsController()` | Provides access to Projects controller. | `ProjectsController` |
| `getPullsController()` | Provides access to Pulls controller. | `PullsController` |
| `getRateLimitController()` | Provides access to RateLimit controller. | `RateLimitController` |
| `getReactionsController()` | Provides access to Reactions controller. | `ReactionsController` |
| `getReposController()` | Provides access to Repos controller. | `ReposController` |
| `getSearchController()` | Provides access to Search controller. | `SearchController` |
| `getSecretScanningController()` | Provides access to SecretScanning controller. | `SecretScanningController` |
| `getTeamsController()` | Provides access to Teams controller. | `TeamsController` |
| `getUsersController()` | Provides access to Users controller. | `UsersController` |
| `getOidcController()` | Provides access to Oidc controller. | `OidcController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBearerAuthCredentials()` | The credentials to use with BearerAuth. | `BearerAuthCredentials` |
| `getAccessToken()` | OAuth 2.0 Access Token. | `String` |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

