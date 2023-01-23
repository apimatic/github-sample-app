# Actions

Endpoints to manage GitHub Actions using the REST API.

```java
ActionsController actionsController = client.getActionsController();
```

## Class Name

`ActionsController`

## Methods

* [Actions Get-Actions-Cache-Usage-for-Org](../../doc/controllers/actions.md#actions-get-actions-cache-usage-for-org)
* [Actions Get-Actions-Cache-Usage-by-Repo-for-Org](../../doc/controllers/actions.md#actions-get-actions-cache-usage-by-repo-for-org)
* [Actions Get-Github-Actions-Permissions-Organization](../../doc/controllers/actions.md#actions-get-github-actions-permissions-organization)
* [Actions Set-Github-Actions-Permissions-Organization](../../doc/controllers/actions.md#actions-set-github-actions-permissions-organization)
* [Actions List-Selected-Repositories-Enabled-Github-Actions-Organization](../../doc/controllers/actions.md#actions-list-selected-repositories-enabled-github-actions-organization)
* [Actions Set-Selected-Repositories-Enabled-Github-Actions-Organization](../../doc/controllers/actions.md#actions-set-selected-repositories-enabled-github-actions-organization)
* [Actions Enable-Selected-Repository-Github-Actions-Organization](../../doc/controllers/actions.md#actions-enable-selected-repository-github-actions-organization)
* [Actions Disable-Selected-Repository-Github-Actions-Organization](../../doc/controllers/actions.md#actions-disable-selected-repository-github-actions-organization)
* [Actions Get-Allowed-Actions-Organization](../../doc/controllers/actions.md#actions-get-allowed-actions-organization)
* [Actions Set-Allowed-Actions-Organization](../../doc/controllers/actions.md#actions-set-allowed-actions-organization)
* [Actions Get-Github-Actions-Default-Workflow-Permissions-Organization](../../doc/controllers/actions.md#actions-get-github-actions-default-workflow-permissions-organization)
* [Actions Set-Github-Actions-Default-Workflow-Permissions-Organization](../../doc/controllers/actions.md#actions-set-github-actions-default-workflow-permissions-organization)
* [Actions List-Required-Workflows](../../doc/controllers/actions.md#actions-list-required-workflows)
* [Actions Create-Required-Workflow](../../doc/controllers/actions.md#actions-create-required-workflow)
* [Actions Get-Required-Workflow](../../doc/controllers/actions.md#actions-get-required-workflow)
* [Actions Update-Required-Workflow](../../doc/controllers/actions.md#actions-update-required-workflow)
* [Actions Delete-Required-Workflow](../../doc/controllers/actions.md#actions-delete-required-workflow)
* [Actions List-Selected-Repositories-Required-Workflow](../../doc/controllers/actions.md#actions-list-selected-repositories-required-workflow)
* [Actions Set-Selected-Repos-to-Required-Workflow](../../doc/controllers/actions.md#actions-set-selected-repos-to-required-workflow)
* [Actions Add-Selected-Repo-to-Required-Workflow](../../doc/controllers/actions.md#actions-add-selected-repo-to-required-workflow)
* [Actions Remove-Selected-Repo-From-Required-Workflow](../../doc/controllers/actions.md#actions-remove-selected-repo-from-required-workflow)
* [Actions List-Self-Hosted-Runner-Groups-for-Org](../../doc/controllers/actions.md#actions-list-self-hosted-runner-groups-for-org)
* [Actions Create-Self-Hosted-Runner-Group-for-Org](../../doc/controllers/actions.md#actions-create-self-hosted-runner-group-for-org)
* [Actions Get-Self-Hosted-Runner-Group-for-Org](../../doc/controllers/actions.md#actions-get-self-hosted-runner-group-for-org)
* [Actions Update-Self-Hosted-Runner-Group-for-Org](../../doc/controllers/actions.md#actions-update-self-hosted-runner-group-for-org)
* [Actions Delete-Self-Hosted-Runner-Group-From-Org](../../doc/controllers/actions.md#actions-delete-self-hosted-runner-group-from-org)
* [Actions List-Repo-Access-to-Self-Hosted-Runner-Group-in-Org](../../doc/controllers/actions.md#actions-list-repo-access-to-self-hosted-runner-group-in-org)
* [Actions Set-Repo-Access-to-Self-Hosted-Runner-Group-in-Org](../../doc/controllers/actions.md#actions-set-repo-access-to-self-hosted-runner-group-in-org)
* [Actions Remove-Repo-Access-to-Self-Hosted-Runner-Group-in-Org](../../doc/controllers/actions.md#actions-remove-repo-access-to-self-hosted-runner-group-in-org)
* [Actions List-Self-Hosted-Runners-in-Group-for-Org](../../doc/controllers/actions.md#actions-list-self-hosted-runners-in-group-for-org)
* [Actions Set-Self-Hosted-Runners-in-Group-for-Org](../../doc/controllers/actions.md#actions-set-self-hosted-runners-in-group-for-org)
* [Actions Add-Self-Hosted-Runner-to-Group-for-Org](../../doc/controllers/actions.md#actions-add-self-hosted-runner-to-group-for-org)
* [Actions Remove-Self-Hosted-Runner-From-Group-for-Org](../../doc/controllers/actions.md#actions-remove-self-hosted-runner-from-group-for-org)
* [Actions List-Self-Hosted-Runners-for-Org](../../doc/controllers/actions.md#actions-list-self-hosted-runners-for-org)
* [Actions List-Runner-Applications-for-Org](../../doc/controllers/actions.md#actions-list-runner-applications-for-org)
* [Actions Create-Registration-Token-for-Org](../../doc/controllers/actions.md#actions-create-registration-token-for-org)
* [Actions Create-Remove-Token-for-Org](../../doc/controllers/actions.md#actions-create-remove-token-for-org)
* [Actions Get-Self-Hosted-Runner-for-Org](../../doc/controllers/actions.md#actions-get-self-hosted-runner-for-org)
* [Actions Delete-Self-Hosted-Runner-From-Org](../../doc/controllers/actions.md#actions-delete-self-hosted-runner-from-org)
* [Actions List-Labels-for-Self-Hosted-Runner-for-Org](../../doc/controllers/actions.md#actions-list-labels-for-self-hosted-runner-for-org)
* [Actions Add-Custom-Labels-to-Self-Hosted-Runner-for-Org](../../doc/controllers/actions.md#actions-add-custom-labels-to-self-hosted-runner-for-org)
* [Actions Set-Custom-Labels-for-Self-Hosted-Runner-for-Org](../../doc/controllers/actions.md#actions-set-custom-labels-for-self-hosted-runner-for-org)
* [Actions Remove-All-Custom-Labels-From-Self-Hosted-Runner-for-Org](../../doc/controllers/actions.md#actions-remove-all-custom-labels-from-self-hosted-runner-for-org)
* [Actions Remove-Custom-Label-From-Self-Hosted-Runner-for-Org](../../doc/controllers/actions.md#actions-remove-custom-label-from-self-hosted-runner-for-org)
* [Actions List-Org-Secrets](../../doc/controllers/actions.md#actions-list-org-secrets)
* [Actions Get-Org-Public-Key](../../doc/controllers/actions.md#actions-get-org-public-key)
* [Actions Get-Org-Secret](../../doc/controllers/actions.md#actions-get-org-secret)
* [Actions Create-or-Update-Org-Secret](../../doc/controllers/actions.md#actions-create-or-update-org-secret)
* [Actions Delete-Org-Secret](../../doc/controllers/actions.md#actions-delete-org-secret)
* [Actions List-Selected-Repos-for-Org-Secret](../../doc/controllers/actions.md#actions-list-selected-repos-for-org-secret)
* [Actions Set-Selected-Repos-for-Org-Secret](../../doc/controllers/actions.md#actions-set-selected-repos-for-org-secret)
* [Actions Add-Selected-Repo-to-Org-Secret](../../doc/controllers/actions.md#actions-add-selected-repo-to-org-secret)
* [Actions Remove-Selected-Repo-From-Org-Secret](../../doc/controllers/actions.md#actions-remove-selected-repo-from-org-secret)
* [Actions List-Org-Variables](../../doc/controllers/actions.md#actions-list-org-variables)
* [Actions Create-Org-Variable](../../doc/controllers/actions.md#actions-create-org-variable)
* [Actions Get-Org-Variable](../../doc/controllers/actions.md#actions-get-org-variable)
* [Actions Update-Org-Variable](../../doc/controllers/actions.md#actions-update-org-variable)
* [Actions Delete-Org-Variable](../../doc/controllers/actions.md#actions-delete-org-variable)
* [Actions List-Selected-Repos-for-Org-Variable](../../doc/controllers/actions.md#actions-list-selected-repos-for-org-variable)
* [Actions Set-Selected-Repos-for-Org-Variable](../../doc/controllers/actions.md#actions-set-selected-repos-for-org-variable)
* [Actions Add-Selected-Repo-to-Org-Variable](../../doc/controllers/actions.md#actions-add-selected-repo-to-org-variable)
* [Actions Remove-Selected-Repo-From-Org-Variable](../../doc/controllers/actions.md#actions-remove-selected-repo-from-org-variable)
* [Actions List-Repo-Required-Workflows](../../doc/controllers/actions.md#actions-list-repo-required-workflows)
* [Actions Get-Repo-Required-Workflow](../../doc/controllers/actions.md#actions-get-repo-required-workflow)
* [Actions Get-Repo-Required-Workflow-Usage](../../doc/controllers/actions.md#actions-get-repo-required-workflow-usage)
* [Actions List-Artifacts-for-Repo](../../doc/controllers/actions.md#actions-list-artifacts-for-repo)
* [Actions Get-Artifact](../../doc/controllers/actions.md#actions-get-artifact)
* [Actions Delete-Artifact](../../doc/controllers/actions.md#actions-delete-artifact)
* [Actions Download-Artifact](../../doc/controllers/actions.md#actions-download-artifact)
* [Actions Get-Actions-Cache-Usage](../../doc/controllers/actions.md#actions-get-actions-cache-usage)
* [Actions Get-Actions-Cache-List](../../doc/controllers/actions.md#actions-get-actions-cache-list)
* [Actions Delete-Actions-Cache-by-Key](../../doc/controllers/actions.md#actions-delete-actions-cache-by-key)
* [Actions Delete-Actions-Cache-by-Id](../../doc/controllers/actions.md#actions-delete-actions-cache-by-id)
* [Actions Get-Job-for-Workflow-Run](../../doc/controllers/actions.md#actions-get-job-for-workflow-run)
* [Actions Download-Job-Logs-for-Workflow-Run](../../doc/controllers/actions.md#actions-download-job-logs-for-workflow-run)
* [Actions Re-Run-Job-for-Workflow-Run](../../doc/controllers/actions.md#actions-re-run-job-for-workflow-run)
* [Actions Get-Custom-Oidc-Sub-Claim-for-Repo](../../doc/controllers/actions.md#actions-get-custom-oidc-sub-claim-for-repo)
* [Actions Set-Custom-Oidc-Sub-Claim-for-Repo](../../doc/controllers/actions.md#actions-set-custom-oidc-sub-claim-for-repo)
* [Actions Get-Github-Actions-Permissions-Repository](../../doc/controllers/actions.md#actions-get-github-actions-permissions-repository)
* [Actions Set-Github-Actions-Permissions-Repository](../../doc/controllers/actions.md#actions-set-github-actions-permissions-repository)
* [Actions Get-Workflow-Access-to-Repository](../../doc/controllers/actions.md#actions-get-workflow-access-to-repository)
* [Actions Set-Workflow-Access-to-Repository](../../doc/controllers/actions.md#actions-set-workflow-access-to-repository)
* [Actions Get-Allowed-Actions-Repository](../../doc/controllers/actions.md#actions-get-allowed-actions-repository)
* [Actions Set-Allowed-Actions-Repository](../../doc/controllers/actions.md#actions-set-allowed-actions-repository)
* [Actions Get-Github-Actions-Default-Workflow-Permissions-Repository](../../doc/controllers/actions.md#actions-get-github-actions-default-workflow-permissions-repository)
* [Actions Set-Github-Actions-Default-Workflow-Permissions-Repository](../../doc/controllers/actions.md#actions-set-github-actions-default-workflow-permissions-repository)
* [Actions List-Required-Workflow-Runs](../../doc/controllers/actions.md#actions-list-required-workflow-runs)
* [Actions List-Self-Hosted-Runners-for-Repo](../../doc/controllers/actions.md#actions-list-self-hosted-runners-for-repo)
* [Actions List-Runner-Applications-for-Repo](../../doc/controllers/actions.md#actions-list-runner-applications-for-repo)
* [Actions Create-Registration-Token-for-Repo](../../doc/controllers/actions.md#actions-create-registration-token-for-repo)
* [Actions Create-Remove-Token-for-Repo](../../doc/controllers/actions.md#actions-create-remove-token-for-repo)
* [Actions Get-Self-Hosted-Runner-for-Repo](../../doc/controllers/actions.md#actions-get-self-hosted-runner-for-repo)
* [Actions Delete-Self-Hosted-Runner-From-Repo](../../doc/controllers/actions.md#actions-delete-self-hosted-runner-from-repo)
* [Actions List-Labels-for-Self-Hosted-Runner-for-Repo](../../doc/controllers/actions.md#actions-list-labels-for-self-hosted-runner-for-repo)
* [Actions Add-Custom-Labels-to-Self-Hosted-Runner-for-Repo](../../doc/controllers/actions.md#actions-add-custom-labels-to-self-hosted-runner-for-repo)
* [Actions Set-Custom-Labels-for-Self-Hosted-Runner-for-Repo](../../doc/controllers/actions.md#actions-set-custom-labels-for-self-hosted-runner-for-repo)
* [Actions Remove-All-Custom-Labels-From-Self-Hosted-Runner-for-Repo](../../doc/controllers/actions.md#actions-remove-all-custom-labels-from-self-hosted-runner-for-repo)
* [Actions Remove-Custom-Label-From-Self-Hosted-Runner-for-Repo](../../doc/controllers/actions.md#actions-remove-custom-label-from-self-hosted-runner-for-repo)
* [Actions List-Workflow-Runs-for-Repo](../../doc/controllers/actions.md#actions-list-workflow-runs-for-repo)
* [Actions Get-Workflow-Run](../../doc/controllers/actions.md#actions-get-workflow-run)
* [Actions Delete-Workflow-Run](../../doc/controllers/actions.md#actions-delete-workflow-run)
* [Actions Get-Reviews-for-Run](../../doc/controllers/actions.md#actions-get-reviews-for-run)
* [Actions Approve-Workflow-Run](../../doc/controllers/actions.md#actions-approve-workflow-run)
* [Actions List-Workflow-Run-Artifacts](../../doc/controllers/actions.md#actions-list-workflow-run-artifacts)
* [Actions Get-Workflow-Run-Attempt](../../doc/controllers/actions.md#actions-get-workflow-run-attempt)
* [Actions List-Jobs-for-Workflow-Run-Attempt](../../doc/controllers/actions.md#actions-list-jobs-for-workflow-run-attempt)
* [Actions Download-Workflow-Run-Attempt-Logs](../../doc/controllers/actions.md#actions-download-workflow-run-attempt-logs)
* [Actions Cancel-Workflow-Run](../../doc/controllers/actions.md#actions-cancel-workflow-run)
* [Actions List-Jobs-for-Workflow-Run](../../doc/controllers/actions.md#actions-list-jobs-for-workflow-run)
* [Actions Download-Workflow-Run-Logs](../../doc/controllers/actions.md#actions-download-workflow-run-logs)
* [Actions Delete-Workflow-Run-Logs](../../doc/controllers/actions.md#actions-delete-workflow-run-logs)
* [Actions Get-Pending-Deployments-for-Run](../../doc/controllers/actions.md#actions-get-pending-deployments-for-run)
* [Actions Review-Pending-Deployments-for-Run](../../doc/controllers/actions.md#actions-review-pending-deployments-for-run)
* [Actions Re-Run-Workflow](../../doc/controllers/actions.md#actions-re-run-workflow)
* [Actions Re-Run-Workflow-Failed-Jobs](../../doc/controllers/actions.md#actions-re-run-workflow-failed-jobs)
* [Actions Get-Workflow-Run-Usage](../../doc/controllers/actions.md#actions-get-workflow-run-usage)
* [Actions List-Repo-Secrets](../../doc/controllers/actions.md#actions-list-repo-secrets)
* [Actions Get-Repo-Public-Key](../../doc/controllers/actions.md#actions-get-repo-public-key)
* [Actions Get-Repo-Secret](../../doc/controllers/actions.md#actions-get-repo-secret)
* [Actions Create-or-Update-Repo-Secret](../../doc/controllers/actions.md#actions-create-or-update-repo-secret)
* [Actions Delete-Repo-Secret](../../doc/controllers/actions.md#actions-delete-repo-secret)
* [Actions List-Repo-Variables](../../doc/controllers/actions.md#actions-list-repo-variables)
* [Actions Create-Repo-Variable](../../doc/controllers/actions.md#actions-create-repo-variable)
* [Actions Get-Repo-Variable](../../doc/controllers/actions.md#actions-get-repo-variable)
* [Actions Update-Repo-Variable](../../doc/controllers/actions.md#actions-update-repo-variable)
* [Actions Delete-Repo-Variable](../../doc/controllers/actions.md#actions-delete-repo-variable)
* [Actions List-Repo-Workflows](../../doc/controllers/actions.md#actions-list-repo-workflows)
* [Actions Get-Workflow](../../doc/controllers/actions.md#actions-get-workflow)
* [Actions Disable-Workflow](../../doc/controllers/actions.md#actions-disable-workflow)
* [Actions Create-Workflow-Dispatch](../../doc/controllers/actions.md#actions-create-workflow-dispatch)
* [Actions Enable-Workflow](../../doc/controllers/actions.md#actions-enable-workflow)
* [Actions List-Workflow-Runs](../../doc/controllers/actions.md#actions-list-workflow-runs)
* [Actions Get-Workflow-Usage](../../doc/controllers/actions.md#actions-get-workflow-usage)
* [Actions List-Environment-Secrets](../../doc/controllers/actions.md#actions-list-environment-secrets)
* [Actions Get-Environment-Public-Key](../../doc/controllers/actions.md#actions-get-environment-public-key)
* [Actions Get-Environment-Secret](../../doc/controllers/actions.md#actions-get-environment-secret)
* [Actions Create-or-Update-Environment-Secret](../../doc/controllers/actions.md#actions-create-or-update-environment-secret)
* [Actions Delete-Environment-Secret](../../doc/controllers/actions.md#actions-delete-environment-secret)
* [Actions List-Environment-Variables](../../doc/controllers/actions.md#actions-list-environment-variables)
* [Actions Create-Environment-Variable](../../doc/controllers/actions.md#actions-create-environment-variable)
* [Actions Get-Environment-Variable](../../doc/controllers/actions.md#actions-get-environment-variable)
* [Actions Update-Environment-Variable](../../doc/controllers/actions.md#actions-update-environment-variable)
* [Actions Delete-Environment-Variable](../../doc/controllers/actions.md#actions-delete-environment-variable)


# Actions Get-Actions-Cache-Usage-for-Org

Gets the total GitHub Actions cache usage for an organization.
The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-github-actions-cache-usage-for-an-organization](https://docs.github.com/rest/reference/actions#get-github-actions-cache-usage-for-an-organization)

```java
CompletableFuture<ActionsCacheUsageOrgEnterprise> actionsGetActionsCacheUsageForOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`ActionsCacheUsageOrgEnterprise`](../../doc/models/actions-cache-usage-org-enterprise.md)

## Example Usage

```java
String org = "org6";

actionsController.actionsGetActionsCacheUsageForOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_active_caches_size_in_bytes": 3344284,
  "total_active_caches_count": 5
}
```


# Actions Get-Actions-Cache-Usage-by-Repo-for-Org

Lists repositories and their GitHub Actions cache usage for an organization.
The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-repositories-with-github-actions-cache-usage-for-an-organization](https://docs.github.com/rest/reference/actions#list-repositories-with-github-actions-cache-usage-for-an-organization)

```java
CompletableFuture<OrgsActionsCacheUsageByRepositoryResponse> actionsGetActionsCacheUsageByRepoForOrgAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsActionsCacheUsageByRepositoryResponse`](../../doc/models/orgs-actions-cache-usage-by-repository-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsGetActionsCacheUsageByRepoForOrgAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "repository_cache_usages": [
    {
      "full_name": "octo-org/Hello-World",
      "active_caches_size_in_bytes": 2322142,
      "active_caches_count": 3
    },
    {
      "full_name": "octo-org/server",
      "active_caches_size_in_bytes": 1022142,
      "active_caches_count": 2
    }
  ]
}
```


# Actions Get-Github-Actions-Permissions-Organization

Gets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#get-github-actions-permissions-for-an-organization](https://docs.github.com/rest/reference/actions#get-github-actions-permissions-for-an-organization)

```java
CompletableFuture<ActionsOrganizationPermissions> actionsGetGithubActionsPermissionsOrganizationAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`ActionsOrganizationPermissions`](../../doc/models/actions-organization-permissions.md)

## Example Usage

```java
String org = "org6";

actionsController.actionsGetGithubActionsPermissionsOrganizationAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "enabled_repositories": "all",
  "allowed_actions": "selected",
  "selected_actions_url": "https://api.github.com/organizations/42/actions/permissions/selected-actions"
}
```


# Actions Set-Github-Actions-Permissions-Organization

Sets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.

If the organization belongs to an enterprise that has set restrictive permissions at the enterprise level, such as `allowed_actions` to `selected` actions and reusable workflows, then you cannot override them for the organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#set-github-actions-permissions-for-an-organization](https://docs.github.com/rest/reference/actions#set-github-actions-permissions-for-an-organization)

```java
CompletableFuture<Void> actionsSetGithubActionsPermissionsOrganizationAsync(
    final String org,
    final OrgsActionsPermissionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsActionsPermissionsRequest`](../../doc/models/orgs-actions-permissions-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
OrgsActionsPermissionsRequest body = new OrgsActionsPermissionsRequest();
body.setEnabledRepositories(EnabledRepositoriesEnum.ALL);
body.setAllowedActions(AllowedActionsEnum.SELECTED);

actionsController.actionsSetGithubActionsPermissionsOrganizationAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Selected-Repositories-Enabled-Github-Actions-Organization

Lists the selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#list-selected-repositories-enabled-for-github-actions-in-an-organization](https://docs.github.com/rest/reference/actions#list-selected-repositories-enabled-for-github-actions-in-an-organization)

```java
CompletableFuture<OrgsActionsPermissionsRepositoriesResponse> actionsListSelectedRepositoriesEnabledGithubActionsOrganizationAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsActionsPermissionsRepositoriesResponse`](../../doc/models/orgs-actions-permissions-repositories-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListSelectedRepositoriesEnabledGithubActionsOrganizationAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World",
      "homepage": "https://github.com",
      "language": null,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues_count": 0,
      "is_template": true,
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "allow_rebase_merge": true,
      "template_repository": null,
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "allow_squash_merge": true,
      "allow_auto_merge": false,
      "delete_branch_on_merge": true,
      "allow_merge_commit": true,
      "subscribers_count": 42,
      "network_count": 0,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA==",
        "html_url": "https://github.com/licenses/mit"
      },
      "forks": 1,
      "open_issues": 1,
      "watchers": 1
    }
  ]
}
```


# Actions Set-Selected-Repositories-Enabled-Github-Actions-Organization

Replaces the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#set-selected-repositories-enabled-for-github-actions-in-an-organization](https://docs.github.com/rest/reference/actions#set-selected-repositories-enabled-for-github-actions-in-an-organization)

```java
CompletableFuture<Void> actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationAsync(
    final String org,
    final OrgsActionsPermissionsRepositoriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsActionsPermissionsRepositoriesRequest`](../../doc/models/orgs-actions-permissions-repositories-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
OrgsActionsPermissionsRepositoriesRequest body = new OrgsActionsPermissionsRepositoriesRequest();
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(32);
selectedRepositoryIds.add(42);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsSetSelectedRepositoriesEnabledGithubActionsOrganizationAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Enable-Selected-Repository-Github-Actions-Organization

Adds a repository to the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#enable-a-selected-repository-for-github-actions-in-an-organization](https://docs.github.com/rest/reference/actions#enable-a-selected-repository-for-github-actions-in-an-organization)

```java
CompletableFuture<Void> actionsEnableSelectedRepositoryGithubActionsOrganizationAsync(
    final String org,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int repositoryId = 254;

actionsController.actionsEnableSelectedRepositoryGithubActionsOrganizationAsync(org, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Disable-Selected-Repository-Github-Actions-Organization

Removes a repository from the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#disable-a-selected-repository-for-github-actions-in-an-organization](https://docs.github.com/rest/reference/actions#disable-a-selected-repository-for-github-actions-in-an-organization)

```java
CompletableFuture<Void> actionsDisableSelectedRepositoryGithubActionsOrganizationAsync(
    final String org,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int repositoryId = 254;

actionsController.actionsDisableSelectedRepositoryGithubActionsOrganizationAsync(org, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Allowed-Actions-Organization

Gets the selected actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).""

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#get-allowed-actions-for-an-organization](https://docs.github.com/rest/reference/actions#get-allowed-actions-for-an-organization)

```java
CompletableFuture<SelectedActions> actionsGetAllowedActionsOrganizationAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`SelectedActions`](../../doc/models/selected-actions.md)

## Example Usage

```java
String org = "org6";

actionsController.actionsGetAllowedActionsOrganizationAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "github_owned_allowed": true,
  "verified_allowed": false,
  "patterns_allowed": [
    "monalisa/octocat@*",
    "docker/*"
  ]
}
```


# Actions Set-Allowed-Actions-Organization

Sets the actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."

If the organization belongs to an enterprise that has `selected` actions and reusable workflows set at the enterprise level, then you cannot override any of the enterprise's allowed actions and reusable workflows settings.

To use the `patterns_allowed` setting for private repositories, the organization must belong to an enterprise. If the organization does not belong to an enterprise, then the `patterns_allowed` setting only applies to public repositories in the organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#set-allowed-actions-for-an-organization](https://docs.github.com/rest/reference/actions#set-allowed-actions-for-an-organization)

```java
CompletableFuture<Void> actionsSetAllowedActionsOrganizationAsync(
    final String org,
    final SelectedActions body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`SelectedActions`](../../doc/models/selected-actions.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
SelectedActions body = new SelectedActions();
body.setGithubOwnedAllowed(true);
body.setVerifiedAllowed(false);
List<String> patternsAllowed = new LinkedList<>();
patternsAllowed.add("monalisa/octocat@*");
patternsAllowed.add("docker/*");

body.setPatternsAllowed(patternsAllowed);

actionsController.actionsSetAllowedActionsOrganizationAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Github-Actions-Default-Workflow-Permissions-Organization

Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization,
as well as whether GitHub Actions can submit approving pull request reviews. For more information, see
"[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#get-default-workflow-permissions](https://docs.github.com/rest/reference/actions#get-default-workflow-permissions)

```java
CompletableFuture<ActionsGetDefaultWorkflowPermissions> actionsGetGithubActionsDefaultWorkflowPermissionsOrganizationAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`ActionsGetDefaultWorkflowPermissions`](../../doc/models/actions-get-default-workflow-permissions.md)

## Example Usage

```java
String org = "org6";

actionsController.actionsGetGithubActionsDefaultWorkflowPermissionsOrganizationAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "default_workflow_permissions": "read",
  "can_approve_pull_request_reviews": true
}
```


# Actions Set-Github-Actions-Default-Workflow-Permissions-Organization

Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization, and sets if GitHub Actions
can submit approving pull request reviews. For more information, see
"[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."

You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#set-default-workflow-permissions](https://docs.github.com/rest/reference/actions#set-default-workflow-permissions)

```java
CompletableFuture<Void> actionsSetGithubActionsDefaultWorkflowPermissionsOrganizationAsync(
    final String org,
    final ActionsSetDefaultWorkflowPermissions body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`ActionsSetDefaultWorkflowPermissions`](../../doc/models/actions-set-default-workflow-permissions.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
ActionsSetDefaultWorkflowPermissions body = new ActionsSetDefaultWorkflowPermissions();
body.setDefaultWorkflowPermissions(ActionsDefaultWorkflowPermissionsEnum.READ);
body.setCanApprovePullRequestReviews(true);

actionsController.actionsSetGithubActionsDefaultWorkflowPermissionsOrganizationAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict response when changing a setting is prevented by the owning enterprise | `ApiException` |


# Actions List-Required-Workflows

List all required workflows in an organization.

You must authenticate using an access token with the `read:org` scope to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#list-required-workflows](https://docs.github.com/rest/reference/actions#list-required-workflows)

```java
CompletableFuture<OrgsActionsRequiredWorkflowsResponse> actionsListRequiredWorkflowsAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsActionsRequiredWorkflowsResponse`](../../doc/models/orgs-actions-required-workflows-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListRequiredWorkflowsAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "required_workflows": [
    {
      "id": 30433642,
      "name": "Required CI",
      "path": ".github/workflows/ci.yml",
      "scope": "selected",
      "ref": "refs/head/main",
      "state": "active",
      "selected_repositories_url": "https://api.github.com/organizations/org/actions/required_workflows/1/repositories",
      "created_at": "2020-01-22T19:33:08Z",
      "updated_at": "2020-01-22T19:33:08Z",
      "repository": {
        "id": 1296269,
        "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
        "name": "Hello-World",
        "full_name": "octocat/Hello-World",
        "owner": {
          "login": "octocat",
          "id": 1,
          "node_id": "MDQ6VXNlcjE=",
          "avatar_url": "https://github.com/images/error/octocat_happy.gif",
          "gravatar_id": "",
          "url": "https://api.github.com/users/octocat",
          "html_url": "https://github.com/octocat",
          "followers_url": "https://api.github.com/users/octocat/followers",
          "following_url": "https://api.github.com/users/octocat/following{/other_user}",
          "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
          "organizations_url": "https://api.github.com/users/octocat/orgs",
          "repos_url": "https://api.github.com/users/octocat/repos",
          "events_url": "https://api.github.com/users/octocat/events{/privacy}",
          "received_events_url": "https://api.github.com/users/octocat/received_events",
          "type": "User",
          "site_admin": false
        },
        "private": false,
        "html_url": "https://github.com/octocat/Hello-World",
        "description": "This your first repo!",
        "fork": false,
        "url": "https://api.github.com/repos/octocat/Hello-World",
        "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
        "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
        "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
        "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
        "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
        "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
        "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
        "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
        "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
        "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
        "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
        "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
        "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
        "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
        "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
        "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
        "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
        "git_url": "git:github.com/octocat/Hello-World.git",
        "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
        "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
        "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
        "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
        "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
        "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
        "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
        "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
        "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
        "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
        "ssh_url": "git@github.com:octocat/Hello-World.git",
        "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
        "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
        "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
        "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
        "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
        "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
        "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
        "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
      }
    },
    {
      "id": 30433643,
      "name": "Required Linter",
      "path": ".github/workflows/lint.yml",
      "scope": "all",
      "ref": "refs/head/main",
      "state": "active",
      "created_at": "2020-01-22T19:33:08Z",
      "updated_at": "2020-01-22T19:33:08Z",
      "repository": {
        "id": 1296269,
        "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
        "name": "Hello-World",
        "full_name": "octocat/Hello-World",
        "owner": {
          "login": "octocat",
          "id": 1,
          "node_id": "MDQ6VXNlcjE=",
          "avatar_url": "https://github.com/images/error/octocat_happy.gif",
          "gravatar_id": "",
          "url": "https://api.github.com/users/octocat",
          "html_url": "https://github.com/octocat",
          "followers_url": "https://api.github.com/users/octocat/followers",
          "following_url": "https://api.github.com/users/octocat/following{/other_user}",
          "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
          "organizations_url": "https://api.github.com/users/octocat/orgs",
          "repos_url": "https://api.github.com/users/octocat/repos",
          "events_url": "https://api.github.com/users/octocat/events{/privacy}",
          "received_events_url": "https://api.github.com/users/octocat/received_events",
          "type": "User",
          "site_admin": false
        },
        "private": false,
        "html_url": "https://github.com/octocat/Hello-World",
        "description": "This your first repo!",
        "fork": false,
        "url": "https://api.github.com/repos/octocat/Hello-World",
        "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
        "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
        "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
        "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
        "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
        "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
        "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
        "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
        "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
        "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
        "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
        "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
        "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
        "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
        "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
        "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
        "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
        "git_url": "git:github.com/octocat/Hello-World.git",
        "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
        "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
        "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
        "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
        "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
        "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
        "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
        "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
        "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
        "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
        "ssh_url": "git@github.com:octocat/Hello-World.git",
        "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
        "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
        "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
        "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
        "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
        "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
        "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
        "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
      }
    }
  ]
}
```


# Actions Create-Required-Workflow

Create a required workflow in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#create-a-required-workflow](https://docs.github.com/rest/reference/actions#create-a-required-workflow)

```java
CompletableFuture<RequiredWorkflow> actionsCreateRequiredWorkflowAsync(
    final String org,
    final OrgsActionsRequiredWorkflowsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsActionsRequiredWorkflowsRequest`](../../doc/models/orgs-actions-required-workflows-request.md) | Body, Required | - |

## Response Type

[`RequiredWorkflow`](../../doc/models/required-workflow.md)

## Example Usage

```java
String org = "org6";
OrgsActionsRequiredWorkflowsRequest body = new OrgsActionsRequiredWorkflowsRequest();
body.setWorkflowFilePath(".github/workflows/ci.yaml");
body.setRepositoryId("53");
body.setScope(Scope7Enum.SELECTED);
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(32);
selectedRepositoryIds.add(91);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsCreateRequiredWorkflowAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 30433642,
  "name": "Required CI",
  "path": ".github/workflows/ci.yml",
  "scope": "selected",
  "ref": "refs/head/main",
  "state": "active",
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/required_workflows/1/repositories",
  "created_at": "2020-01-22T19:33:08Z",
  "updated_at": "2020-01-22T19:33:08Z",
  "repository": {
    "id": 1296269,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Hello-World",
    "full_name": "octocat/Hello-World",
    "owner": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/octocat/Hello-World",
    "description": "This your first repo!",
    "fork": false,
    "url": "https://api.github.com/repos/octocat/Hello-World",
    "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
    "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
    "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
    "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
    "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
    "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
    "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
    "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
    "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
    "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
    "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
    "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
    "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
    "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
    "git_url": "git:github.com/octocat/Hello-World.git",
    "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
    "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
    "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
    "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
    "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
    "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
    "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
    "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
    "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsActionsRequiredWorkflows422ErrorException`](../../doc/models/orgs-actions-required-workflows-422-error-exception.md) |


# Actions Get-Required-Workflow

Get a required workflow configured in an organization.

You must authenticate using an access token with the `read:org` scope to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-required-workflow](https://docs.github.com/rest/reference/actions#get-a-required-workflow)

```java
CompletableFuture<RequiredWorkflow> actionsGetRequiredWorkflowAsync(
    final String org,
    final int requiredWorkflowId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `requiredWorkflowId` | `int` | Template, Required | The unique identifier of the required workflow. |

## Response Type

[`RequiredWorkflow`](../../doc/models/required-workflow.md)

## Example Usage

```java
String org = "org6";
int requiredWorkflowId = 142;

actionsController.actionsGetRequiredWorkflowAsync(org, requiredWorkflowId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 30433642,
  "name": "Required CI",
  "path": ".github/workflows/ci.yml",
  "scope": "selected",
  "ref": "refs/head/main",
  "state": "active",
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/required_workflows/1/repositories",
  "created_at": "2020-01-22T19:33:08Z",
  "updated_at": "2020-01-22T19:33:08Z",
  "repository": {
    "id": 1296269,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Hello-World",
    "full_name": "octocat/Hello-World",
    "owner": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/octocat/Hello-World",
    "description": "This your first repo!",
    "fork": false,
    "url": "https://api.github.com/repos/octocat/Hello-World",
    "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
    "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
    "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
    "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
    "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
    "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
    "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
    "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
    "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
    "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
    "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
    "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
    "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
    "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
    "git_url": "git:github.com/octocat/Hello-World.git",
    "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
    "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
    "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
    "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
    "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
    "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
    "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
    "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
    "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
  }
}
```


# Actions Update-Required-Workflow

Update a required workflow in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#update-a-required-workflow](https://docs.github.com/rest/reference/actions#update-a-required-workflow)

```java
CompletableFuture<RequiredWorkflow> actionsUpdateRequiredWorkflowAsync(
    final String org,
    final int requiredWorkflowId,
    final OrgsActionsRequiredWorkflowsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `requiredWorkflowId` | `int` | Template, Required | The unique identifier of the required workflow. |
| `body` | [`OrgsActionsRequiredWorkflowsRequest1`](../../doc/models/orgs-actions-required-workflows-request-1.md) | Body, Required | - |

## Response Type

[`RequiredWorkflow`](../../doc/models/required-workflow.md)

## Example Usage

```java
String org = "org6";
int requiredWorkflowId = 142;
OrgsActionsRequiredWorkflowsRequest1 body = new OrgsActionsRequiredWorkflowsRequest1();
body.setWorkflowFilePath(".github/workflows/ci.yaml");
body.setRepositoryId("53");
body.setScope(Scope7Enum.SELECTED);
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(32);
selectedRepositoryIds.add(91);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsUpdateRequiredWorkflowAsync(org, requiredWorkflowId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 30433642,
  "name": "Required CI",
  "path": ".github/workflows/ci.yml",
  "scope": "selected",
  "ref": "refs/head/main",
  "state": "active",
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/required_workflows/1/repositories",
  "created_at": "2020-01-22T19:33:08Z",
  "updated_at": "2020-01-22T19:33:08Z",
  "repository": {
    "id": 1296269,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Hello-World",
    "full_name": "octocat/Hello-World",
    "owner": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/octocat/Hello-World",
    "description": "This your first repo!",
    "fork": false,
    "url": "https://api.github.com/repos/octocat/Hello-World",
    "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
    "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
    "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
    "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
    "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
    "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
    "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
    "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
    "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
    "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
    "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
    "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
    "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
    "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
    "git_url": "git:github.com/octocat/Hello-World.git",
    "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
    "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
    "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
    "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
    "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
    "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
    "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
    "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
    "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsActionsRequiredWorkflows422ErrorException`](../../doc/models/orgs-actions-required-workflows-422-error-exception.md) |


# Actions Delete-Required-Workflow

Deletes a required workflow configured in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#delete-a-required-workflow](https://docs.github.com/rest/reference/actions#delete-a-required-workflow)

```java
CompletableFuture<Void> actionsDeleteRequiredWorkflowAsync(
    final String org,
    final int requiredWorkflowId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `requiredWorkflowId` | `int` | Template, Required | The unique identifier of the required workflow. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int requiredWorkflowId = 142;

actionsController.actionsDeleteRequiredWorkflowAsync(org, requiredWorkflowId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Selected-Repositories-Required-Workflow

Lists the selected repositories that are configured for a required workflow in an organization. To use this endpoint, the required workflow must be configured to run on selected repositories.

You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation https://docs.github.com/rest/reference/actions#list-selected-repositories-required-workflows: [https://docs.github.com/rest/reference/actions#list-selected-repositories-required-workflows](https://docs.github.com/rest/reference/actions#list-selected-repositories-required-workflows)

```java
CompletableFuture<OrgsActionsPermissionsRepositoriesResponse> actionsListSelectedRepositoriesRequiredWorkflowAsync(
    final String org,
    final int requiredWorkflowId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `requiredWorkflowId` | `int` | Template, Required | The unique identifier of the required workflow. |

## Response Type

[`OrgsActionsPermissionsRepositoriesResponse`](../../doc/models/orgs-actions-permissions-repositories-response.md)

## Example Usage

```java
String org = "org6";
int requiredWorkflowId = 142;

actionsController.actionsListSelectedRepositoriesRequiredWorkflowAsync(org, requiredWorkflowId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World",
      "homepage": "https://github.com",
      "language": null,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues_count": 0,
      "is_template": true,
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "allow_rebase_merge": true,
      "template_repository": null,
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "allow_squash_merge": true,
      "allow_auto_merge": false,
      "delete_branch_on_merge": true,
      "allow_merge_commit": true,
      "subscribers_count": 42,
      "network_count": 0,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA==",
        "html_url": "https://github.com/licenses/mit"
      },
      "forks": 1,
      "open_issues": 1,
      "watchers": 1
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource Not Found | `ApiException` |


# Actions Set-Selected-Repos-to-Required-Workflow

Sets the repositories for a required workflow that is required for selected repositories.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#set-selected-repositories-for-a-required-workflow](https://docs.github.com/rest/reference/actions#set-selected-repositories-for-a-required-workflow)

```java
CompletableFuture<Void> actionsSetSelectedReposToRequiredWorkflowAsync(
    final String org,
    final int requiredWorkflowId,
    final OrgsActionsRequiredWorkflowsRepositoriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `requiredWorkflowId` | `int` | Template, Required | The unique identifier of the required workflow. |
| `body` | [`OrgsActionsRequiredWorkflowsRepositoriesRequest`](../../doc/models/orgs-actions-required-workflows-repositories-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int requiredWorkflowId = 142;
OrgsActionsRequiredWorkflowsRepositoriesRequest body = new OrgsActionsRequiredWorkflowsRepositoriesRequest();
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(32);
selectedRepositoryIds.add(91);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsSetSelectedReposToRequiredWorkflowAsync(org, requiredWorkflowId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Add-Selected-Repo-to-Required-Workflow

Adds a repository to a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#add-a-repository-to-selected-repositories-list-for-a-required-workflow](https://docs.github.com/rest/reference/actions#add-a-repository-to-selected-repositories-list-for-a-required-workflow)

```java
CompletableFuture<Void> actionsAddSelectedRepoToRequiredWorkflowAsync(
    final String org,
    final int requiredWorkflowId,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `requiredWorkflowId` | `int` | Template, Required | The unique identifier of the required workflow. |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int requiredWorkflowId = 142;
int repositoryId = 254;

actionsController.actionsAddSelectedRepoToRequiredWorkflowAsync(org, requiredWorkflowId, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource Not Found | `ApiException` |
| 422 | Validation Error | `ApiException` |


# Actions Remove-Selected-Repo-From-Required-Workflow

Removes a repository from a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#remove-a-repository-from-selected-repositories-list-for-a-required-workflow](https://docs.github.com/rest/reference/actions#remove-a-repository-from-selected-repositories-list-for-a-required-workflow)

```java
CompletableFuture<Void> actionsRemoveSelectedRepoFromRequiredWorkflowAsync(
    final String org,
    final int requiredWorkflowId,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `requiredWorkflowId` | `int` | Template, Required | The unique identifier of the required workflow. |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int requiredWorkflowId = 142;
int repositoryId = 254;

actionsController.actionsRemoveSelectedRepoFromRequiredWorkflowAsync(org, requiredWorkflowId, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource Not Found | `ApiException` |
| 422 | Validation Error | `ApiException` |


# Actions List-Self-Hosted-Runner-Groups-for-Org

Lists all self-hosted runner groups configured in an organization and inherited from an enterprise.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-self-hosted-runner-groups-for-an-organization](https://docs.github.com/rest/reference/actions#list-self-hosted-runner-groups-for-an-organization)

```java
CompletableFuture<OrgsActionsRunnerGroupsResponse> actionsListSelfHostedRunnerGroupsForOrgAsync(
    final String org,
    final Integer perPage,
    final Integer page,
    final String visibleToRepository)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `visibleToRepository` | `String` | Query, Optional | Only return runner groups that are allowed to be used by this repository. |

## Response Type

[`OrgsActionsRunnerGroupsResponse`](../../doc/models/orgs-actions-runner-groups-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListSelfHostedRunnerGroupsForOrgAsync(org, perPage, page, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 3,
  "runner_groups": [
    {
      "id": 1,
      "name": "Default",
      "visibility": "all",
      "default": true,
      "runners_url": "https://api.github.com/orgs/octo-org/actions/runner_groups/1/runners",
      "inherited": false,
      "allows_public_repositories": true,
      "restricted_to_workflows": false,
      "selected_workflows": [],
      "workflow_restrictions_read_only": false
    },
    {
      "id": 2,
      "name": "octo-runner-group",
      "visibility": "selected",
      "default": false,
      "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/runner_groups/2/repositories",
      "runners_url": "https://api.github.com/orgs/octo-org/actions/runner_groups/2/runners",
      "inherited": true,
      "allows_public_repositories": true,
      "restricted_to_workflows": true,
      "selected_workflows": [
        "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
      ],
      "workflow_restrictions_read_only": true
    },
    {
      "id": 3,
      "name": "expensive-hardware",
      "visibility": "private",
      "default": false,
      "runners_url": "https://api.github.com/orgs/octo-org/actions/runner_groups/3/runners",
      "inherited": false,
      "allows_public_repositories": true,
      "restricted_to_workflows": false,
      "selected_workflows": [
        "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
      ],
      "workflow_restrictions_read_only": false
    }
  ]
}
```


# Actions Create-Self-Hosted-Runner-Group-for-Org

Creates a new self-hosted runner group for an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#create-a-self-hosted-runner-group-for-an-organization](https://docs.github.com/rest/reference/actions#create-a-self-hosted-runner-group-for-an-organization)

```java
CompletableFuture<RunnerGroupsOrg> actionsCreateSelfHostedRunnerGroupForOrgAsync(
    final String org,
    final OrgsActionsRunnerGroupsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsActionsRunnerGroupsRequest`](../../doc/models/orgs-actions-runner-groups-request.md) | Body, Required | - |

## Response Type

[`RunnerGroupsOrg`](../../doc/models/runner-groups-org.md)

## Example Usage

```java
String org = "org6";
OrgsActionsRunnerGroupsRequest body = new OrgsActionsRunnerGroupsRequest();
body.setName("Expensive hardware runners");
body.setVisibility(Visibility79Enum.SELECTED);
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(32);
selectedRepositoryIds.add(91);

body.setSelectedRepositoryIds(selectedRepositoryIds);
List<Integer> runners = new LinkedList<>();
runners.add(9);
runners.add(2);

body.setRunners(runners);

actionsController.actionsCreateSelfHostedRunnerGroupForOrgAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 2,
  "name": "octo-runner-group",
  "visibility": "selected",
  "default": false,
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/runner-groups/2/repositories",
  "runners_url": "https://api.github.com/orgs/octo-org/actions/runner_groups/2/runners",
  "inherited": false,
  "allows_public_repositories": true,
  "restricted_to_workflows": true,
  "selected_workflows": [
    "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
  ],
  "workflow_restrictions_read_only": false
}
```


# Actions Get-Self-Hosted-Runner-Group-for-Org

Gets a specific self-hosted runner group for an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-self-hosted-runner-group-for-an-organization](https://docs.github.com/rest/reference/actions#get-a-self-hosted-runner-group-for-an-organization)

```java
CompletableFuture<RunnerGroupsOrg> actionsGetSelfHostedRunnerGroupForOrgAsync(
    final String org,
    final int runnerGroupId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |

## Response Type

[`RunnerGroupsOrg`](../../doc/models/runner-groups-org.md)

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;

actionsController.actionsGetSelfHostedRunnerGroupForOrgAsync(org, runnerGroupId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 2,
  "name": "octo-runner-group",
  "visibility": "selected",
  "default": false,
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/runner_groups/2/repositories",
  "runners_url": "https://api.github.com/orgs/octo-org/actions/runner_groups/2/runners",
  "inherited": false,
  "allows_public_repositories": true,
  "restricted_to_workflows": true,
  "selected_workflows": [
    "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
  ],
  "workflow_restrictions_read_only": false
}
```


# Actions Update-Self-Hosted-Runner-Group-for-Org

Updates the `name` and `visibility` of a self-hosted runner group in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#update-a-self-hosted-runner-group-for-an-organization](https://docs.github.com/rest/reference/actions#update-a-self-hosted-runner-group-for-an-organization)

```java
CompletableFuture<RunnerGroupsOrg> actionsUpdateSelfHostedRunnerGroupForOrgAsync(
    final String org,
    final int runnerGroupId,
    final OrgsActionsRunnerGroupsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `body` | [`OrgsActionsRunnerGroupsRequest1`](../../doc/models/orgs-actions-runner-groups-request-1.md) | Body, Required | - |

## Response Type

[`RunnerGroupsOrg`](../../doc/models/runner-groups-org.md)

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;
OrgsActionsRunnerGroupsRequest1 body = new OrgsActionsRunnerGroupsRequest1();
body.setName("Expensive hardware runners");
body.setVisibility(Visibility80Enum.SELECTED);

actionsController.actionsUpdateSelfHostedRunnerGroupForOrgAsync(org, runnerGroupId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 2,
  "name": "octo-runner-group",
  "visibility": "selected",
  "default": false,
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/runner-groups/2/repositories",
  "runners_url": "https://api.github.com/orgs/octo-org/actions/runner_groups/2/runners",
  "inherited": false,
  "allows_public_repositories": true,
  "restricted_to_workflows": true,
  "selected_workflows": [
    "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
  ],
  "workflow_restrictions_read_only": false
}
```


# Actions Delete-Self-Hosted-Runner-Group-From-Org

Deletes a self-hosted runner group for an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-a-self-hosted-runner-group-from-an-organization](https://docs.github.com/rest/reference/actions#delete-a-self-hosted-runner-group-from-an-organization)

```java
CompletableFuture<Void> actionsDeleteSelfHostedRunnerGroupFromOrgAsync(
    final String org,
    final int runnerGroupId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;

actionsController.actionsDeleteSelfHostedRunnerGroupFromOrgAsync(org, runnerGroupId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Repo-Access-to-Self-Hosted-Runner-Group-in-Org

Lists the repositories with access to a self-hosted runner group configured in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-repository-access-to-a-self-hosted-runner-group-in-an-organization](https://docs.github.com/rest/reference/actions#list-repository-access-to-a-self-hosted-runner-group-in-an-organization)

```java
CompletableFuture<OrgsActionsRunnerGroupsRepositoriesResponse> actionsListRepoAccessToSelfHostedRunnerGroupInOrgAsync(
    final String org,
    final int runnerGroupId,
    final Integer page,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`OrgsActionsRunnerGroupsRepositoriesResponse`](../../doc/models/orgs-actions-runner-groups-repositories-response.md)

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;
Integer page = 1;
Integer perPage = 30;

actionsController.actionsListRepoAccessToSelfHostedRunnerGroupInOrgAsync(org, runnerGroupId, page, perPage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World",
      "homepage": "https://github.com",
      "language": null,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues_count": 0,
      "is_template": true,
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "template_repository": {
        "id": 1296269,
        "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
        "name": "Hello-World",
        "full_name": "octocat/Hello-World",
        "owner": {
          "login": "octocat",
          "id": 1,
          "node_id": "MDQ6VXNlcjE=",
          "avatar_url": "https://github.com/images/error/octocat_happy.gif",
          "gravatar_id": "",
          "url": "https://api.github.com/users/octocat",
          "html_url": "https://github.com/octocat",
          "followers_url": "https://api.github.com/users/octocat/followers",
          "following_url": "https://api.github.com/users/octocat/following{/other_user}",
          "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
          "organizations_url": "https://api.github.com/users/octocat/orgs",
          "repos_url": "https://api.github.com/users/octocat/repos",
          "events_url": "https://api.github.com/users/octocat/events{/privacy}",
          "received_events_url": "https://api.github.com/users/octocat/received_events",
          "type": "User",
          "site_admin": false
        },
        "private": false,
        "html_url": "https://github.com/octocat/Hello-World",
        "description": "This your first repo!",
        "fork": false,
        "url": "https://api.github.com/repos/octocat/Hello-World",
        "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
        "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
        "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
        "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
        "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
        "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
        "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
        "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
        "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
        "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
        "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
        "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
        "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
        "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
        "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
        "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
        "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
        "git_url": "git:github.com/octocat/Hello-World.git",
        "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
        "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
        "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
        "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
        "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
        "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
        "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
        "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
        "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
        "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
        "ssh_url": "git@github.com:octocat/Hello-World.git",
        "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
        "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
        "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
        "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
        "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
        "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
        "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
        "clone_url": "https://github.com/octocat/Hello-World.git",
        "mirror_url": "git:git.example.com/octocat/Hello-World",
        "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
        "svn_url": "https://svn.github.com/octocat/Hello-World",
        "homepage": "https://github.com",
        "organization": null,
        "language": null,
        "forks": 9,
        "forks_count": 9,
        "stargazers_count": 80,
        "watchers_count": 80,
        "watchers": 80,
        "size": 108,
        "default_branch": "master",
        "open_issues": 0,
        "open_issues_count": 0,
        "is_template": true,
        "license": {
          "key": "mit",
          "name": "MIT License",
          "url": "https://api.github.com/licenses/mit",
          "spdx_id": "MIT",
          "node_id": "MDc6TGljZW5zZW1pdA==",
          "html_url": "https://api.github.com/licenses/mit"
        },
        "topics": [
          "octocat",
          "atom",
          "electron",
          "api"
        ],
        "has_issues": true,
        "has_projects": true,
        "has_wiki": true,
        "has_pages": false,
        "has_downloads": true,
        "archived": false,
        "disabled": false,
        "visibility": "public",
        "pushed_at": "2011-01-26T19:06:43Z",
        "created_at": "2011-01-26T19:01:12Z",
        "updated_at": "2011-01-26T19:14:43Z",
        "permissions": {
          "admin": false,
          "push": false,
          "pull": true
        },
        "allow_rebase_merge": true,
        "template_repository": null,
        "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
        "allow_squash_merge": true,
        "allow_auto_merge": false,
        "delete_branch_on_merge": true,
        "allow_merge_commit": true,
        "subscribers_count": 42,
        "network_count": 0
      },
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "delete_branch_on_merge": true,
      "subscribers_count": 42,
      "network_count": 0,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA=="
      },
      "forks": 1,
      "open_issues": 1,
      "watchers": 1
    }
  ]
}
```


# Actions Set-Repo-Access-to-Self-Hosted-Runner-Group-in-Org

Replaces the list of repositories that have access to a self-hosted runner group configured in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#set-repository-access-to-a-self-hosted-runner-group-in-an-organization](https://docs.github.com/rest/reference/actions#set-repository-access-to-a-self-hosted-runner-group-in-an-organization)

```java
CompletableFuture<Void> actionsSetRepoAccessToSelfHostedRunnerGroupInOrgAsync(
    final String org,
    final int runnerGroupId,
    final OrgsActionsRunnerGroupsRepositoriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `body` | [`OrgsActionsRunnerGroupsRepositoriesRequest`](../../doc/models/orgs-actions-runner-groups-repositories-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;
OrgsActionsRunnerGroupsRepositoriesRequest body = new OrgsActionsRunnerGroupsRepositoriesRequest();
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(32);
selectedRepositoryIds.add(91);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsSetRepoAccessToSelfHostedRunnerGroupInOrgAsync(org, runnerGroupId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Remove-Repo-Access-to-Self-Hosted-Runner-Group-in-Org

Removes a repository from the list of selected repositories that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see "[Create a self-hosted runner group for an organization](#create-a-self-hosted-runner-group-for-an-organization)."

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#remove-repository-access-to-a-self-hosted-runner-group-in-an-organization](https://docs.github.com/rest/reference/actions#remove-repository-access-to-a-self-hosted-runner-group-in-an-organization)

```java
CompletableFuture<Void> actionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgAsync(
    final String org,
    final int runnerGroupId,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;
int repositoryId = 254;

actionsController.actionsRemoveRepoAccessToSelfHostedRunnerGroupInOrgAsync(org, runnerGroupId, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Self-Hosted-Runners-in-Group-for-Org

Lists self-hosted runners that are in a specific organization group.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-self-hosted-runners-in-a-group-for-an-organization](https://docs.github.com/rest/reference/actions#list-self-hosted-runners-in-a-group-for-an-organization)

```java
CompletableFuture<OrgsActionsRunnerGroupsRunnersResponse> actionsListSelfHostedRunnersInGroupForOrgAsync(
    final String org,
    final int runnerGroupId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsActionsRunnerGroupsRunnersResponse`](../../doc/models/orgs-actions-runner-groups-runners-response.md)

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListSelfHostedRunnersInGroupForOrgAsync(org, runnerGroupId, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "runners": [
    {
      "id": 23,
      "name": "linux_runner",
      "os": "linux",
      "status": "online",
      "busy": true,
      "labels": [
        {
          "id": 5,
          "name": "self-hosted",
          "type": "read-only"
        },
        {
          "id": 7,
          "name": "X64",
          "type": "read-only"
        },
        {
          "id": 11,
          "name": "Linux",
          "type": "read-only"
        }
      ]
    },
    {
      "id": 24,
      "name": "mac_runner",
      "os": "macos",
      "status": "offline",
      "busy": false,
      "labels": [
        {
          "id": 5,
          "name": "self-hosted",
          "type": "read-only"
        },
        {
          "id": 7,
          "name": "X64",
          "type": "read-only"
        },
        {
          "id": 20,
          "name": "macOS",
          "type": "read-only"
        },
        {
          "id": 21,
          "name": "no-gpu",
          "type": "custom"
        }
      ]
    }
  ]
}
```


# Actions Set-Self-Hosted-Runners-in-Group-for-Org

Replaces the list of self-hosted runners that are part of an organization runner group.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#set-self-hosted-runners-in-a-group-for-an-organization](https://docs.github.com/rest/reference/actions#set-self-hosted-runners-in-a-group-for-an-organization)

```java
CompletableFuture<Void> actionsSetSelfHostedRunnersInGroupForOrgAsync(
    final String org,
    final int runnerGroupId,
    final OrgsActionsRunnerGroupsRunnersRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `body` | [`OrgsActionsRunnerGroupsRunnersRequest`](../../doc/models/orgs-actions-runner-groups-runners-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;
OrgsActionsRunnerGroupsRunnersRequest body = new OrgsActionsRunnerGroupsRunnersRequest();
List<Integer> runners = new LinkedList<>();
runners.add(9);
runners.add(2);

body.setRunners(runners);

actionsController.actionsSetSelfHostedRunnersInGroupForOrgAsync(org, runnerGroupId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Add-Self-Hosted-Runner-to-Group-for-Org

Adds a self-hosted runner to a runner group configured in an organization.

You must authenticate using an access token with the `admin:org`
scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#add-a-self-hosted-runner-to-a-group-for-an-organization](https://docs.github.com/rest/reference/actions#add-a-self-hosted-runner-to-a-group-for-an-organization)

```java
CompletableFuture<Void> actionsAddSelfHostedRunnerToGroupForOrgAsync(
    final String org,
    final int runnerGroupId,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;
int runnerId = 22;

actionsController.actionsAddSelfHostedRunnerToGroupForOrgAsync(org, runnerGroupId, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Remove-Self-Hosted-Runner-From-Group-for-Org

Removes a self-hosted runner from a group configured in an organization. The runner is then returned to the default group.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#remove-a-self-hosted-runner-from-a-group-for-an-organization](https://docs.github.com/rest/reference/actions#remove-a-self-hosted-runner-from-a-group-for-an-organization)

```java
CompletableFuture<Void> actionsRemoveSelfHostedRunnerFromGroupForOrgAsync(
    final String org,
    final int runnerGroupId,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int runnerGroupId = 142;
int runnerId = 22;

actionsController.actionsRemoveSelfHostedRunnerFromGroupForOrgAsync(org, runnerGroupId, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Self-Hosted-Runners-for-Org

Lists all self-hosted runners configured in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-self-hosted-runners-for-an-organization](https://docs.github.com/rest/reference/actions#list-self-hosted-runners-for-an-organization)

```java
CompletableFuture<OrgsActionsRunnersResponse> actionsListSelfHostedRunnersForOrgAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsActionsRunnersResponse`](../../doc/models/orgs-actions-runners-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListSelfHostedRunnersForOrgAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "runners": [
    {
      "id": 23,
      "name": "linux_runner",
      "os": "linux",
      "status": "online",
      "busy": true,
      "labels": [
        {
          "id": 5,
          "name": "self-hosted",
          "type": "read-only"
        },
        {
          "id": 7,
          "name": "X64",
          "type": "read-only"
        },
        {
          "id": 11,
          "name": "Linux",
          "type": "read-only"
        }
      ]
    },
    {
      "id": 24,
      "name": "mac_runner",
      "os": "macos",
      "status": "offline",
      "busy": false,
      "labels": [
        {
          "id": 5,
          "name": "self-hosted",
          "type": "read-only"
        },
        {
          "id": 7,
          "name": "X64",
          "type": "read-only"
        },
        {
          "id": 20,
          "name": "macOS",
          "type": "read-only"
        },
        {
          "id": 21,
          "name": "no-gpu",
          "type": "custom"
        }
      ]
    }
  ]
}
```


# Actions List-Runner-Applications-for-Org

Lists binaries for the runner application that you can download and run.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-runner-applications-for-an-organization](https://docs.github.com/rest/reference/actions#list-runner-applications-for-an-organization)

```java
CompletableFuture<List<RunnerApplication>> actionsListRunnerApplicationsForOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`List<RunnerApplication>`](../../doc/models/runner-application.md)

## Example Usage

```java
String org = "org6";

actionsController.actionsListRunnerApplicationsForOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "os": "osx",
    "architecture": "x64",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-osx-x64-2.164.0.tar.gz",
    "filename": "actions-runner-osx-x64-2.164.0.tar.gz"
  },
  {
    "os": "linux",
    "architecture": "x64",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-linux-x64-2.164.0.tar.gz",
    "filename": "actions-runner-linux-x64-2.164.0.tar.gz"
  },
  {
    "os": "linux",
    "architecture": "arm",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-linux-arm-2.164.0.tar.gz",
    "filename": "actions-runner-linux-arm-2.164.0.tar.gz"
  },
  {
    "os": "win",
    "architecture": "x64",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-win-x64-2.164.0.zip",
    "filename": "actions-runner-win-x64-2.164.0.zip"
  },
  {
    "os": "linux",
    "architecture": "arm64",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-linux-arm64-2.164.0.tar.gz",
    "filename": "actions-runner-linux-arm64-2.164.0.tar.gz"
  }
]
```


# Actions Create-Registration-Token-for-Org

Returns a token that you can pass to the `config` script. The token expires after one hour.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

#### Example using registration token

Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.

```
./config.sh --url https://github.com/octo-org --token TOKEN
```

API method documentation: [https://docs.github.com/rest/reference/actions#create-a-registration-token-for-an-organization](https://docs.github.com/rest/reference/actions#create-a-registration-token-for-an-organization)

```java
CompletableFuture<OrgsActionsRunnersRegistrationTokenResponse> actionsCreateRegistrationTokenForOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsActionsRunnersRegistrationTokenResponse`](../../doc/models/orgs-actions-runners-registration-token-response.md)

## Example Usage

```java
String org = "org6";

actionsController.actionsCreateRegistrationTokenForOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "LLBF3JGZDX3P5PMEXLND6TS6FCWO6",
  "expires_at": "2020-01-22T12:13:35.123-08:00"
}
```


# Actions Create-Remove-Token-for-Org

Returns a token that you can pass to the `config` script to remove a self-hosted runner from an organization. The token expires after one hour.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

#### Example using remove token

To remove your self-hosted runner from an organization, replace `TOKEN` with the remove token provided by this
endpoint.

```
./config.sh remove --token TOKEN
```

API method documentation: [https://docs.github.com/rest/reference/actions#create-a-remove-token-for-an-organization](https://docs.github.com/rest/reference/actions#create-a-remove-token-for-an-organization)

```java
CompletableFuture<OrgsActionsRunnersRemoveTokenResponse> actionsCreateRemoveTokenForOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsActionsRunnersRemoveTokenResponse`](../../doc/models/orgs-actions-runners-remove-token-response.md)

## Example Usage

```java
String org = "org6";

actionsController.actionsCreateRemoveTokenForOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "AABF3JGZDX3P5PMEXLND6TS6FCWO6",
  "expires_at": "2020-01-29T12:13:35.123-08:00"
}
```


# Actions Get-Self-Hosted-Runner-for-Org

Gets a specific self-hosted runner configured in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-self-hosted-runner-for-an-organization](https://docs.github.com/rest/reference/actions#get-a-self-hosted-runner-for-an-organization)

```java
CompletableFuture<OrgsActionsRunnersResponse2> actionsGetSelfHostedRunnerForOrgAsync(
    final String org,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

[`OrgsActionsRunnersResponse2`](../../doc/models/orgs-actions-runners-response-2.md)

## Example Usage

```java
String org = "org6";
int runnerId = 22;

actionsController.actionsGetSelfHostedRunnerForOrgAsync(org, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 23,
  "name": "MBP",
  "os": "macos",
  "status": "online",
  "busy": true,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```


# Actions Delete-Self-Hosted-Runner-From-Org

Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-a-self-hosted-runner-from-an-organization](https://docs.github.com/rest/reference/actions#delete-a-self-hosted-runner-from-an-organization)

```java
CompletableFuture<Void> actionsDeleteSelfHostedRunnerFromOrgAsync(
    final String org,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int runnerId = 22;

actionsController.actionsDeleteSelfHostedRunnerFromOrgAsync(org, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Labels-for-Self-Hosted-Runner-for-Org

Lists all labels for a self-hosted runner configured in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-labels-for-a-self-hosted-runner-for-an-organization](https://docs.github.com/rest/reference/actions#list-labels-for-a-self-hosted-runner-for-an-organization)

```java
CompletableFuture<ActionsRunnerLabels> actionsListLabelsForSelfHostedRunnerForOrgAsync(
    final String org,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String org = "org6";
int runnerId = 22;

actionsController.actionsListLabelsForSelfHostedRunnerForOrgAsync(org, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsActionsRunnersLabels404ErrorException`](../../doc/models/orgs-actions-runners-labels-404-error-exception.md) |


# Actions Add-Custom-Labels-to-Self-Hosted-Runner-for-Org

Add custom labels to a self-hosted runner configured in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#add-custom-labels-to-a-self-hosted-runner-for-an-organization](https://docs.github.com/rest/reference/actions#add-custom-labels-to-a-self-hosted-runner-for-an-organization)

```java
CompletableFuture<ActionsRunnerLabels> actionsAddCustomLabelsToSelfHostedRunnerForOrgAsync(
    final String org,
    final int runnerId,
    final EnterprisesActionsRunnersLabelsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |
| `body` | [`EnterprisesActionsRunnersLabelsRequest`](../../doc/models/enterprises-actions-runners-labels-request.md) | Body, Required | - |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String org = "org6";
int runnerId = 22;
EnterprisesActionsRunnersLabelsRequest body = new EnterprisesActionsRunnersLabelsRequest();
List<String> labels = new LinkedList<>();
labels.add("gpu");
labels.add("accelerated");

body.setLabels(labels);

actionsController.actionsAddCustomLabelsToSelfHostedRunnerForOrgAsync(org, runnerId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsActionsRunnersLabels404ErrorException`](../../doc/models/orgs-actions-runners-labels-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsActionsRunnersLabels422ErrorException`](../../doc/models/orgs-actions-runners-labels-422-error-exception.md) |


# Actions Set-Custom-Labels-for-Self-Hosted-Runner-for-Org

Remove all previous custom labels and set the new custom labels for a specific
self-hosted runner configured in an organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#set-custom-labels-for-a-self-hosted-runner-for-an-organization](https://docs.github.com/rest/reference/actions#set-custom-labels-for-a-self-hosted-runner-for-an-organization)

```java
CompletableFuture<ActionsRunnerLabels> actionsSetCustomLabelsForSelfHostedRunnerForOrgAsync(
    final String org,
    final int runnerId,
    final OrgsActionsRunnersLabelsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |
| `body` | [`OrgsActionsRunnersLabelsRequest1`](../../doc/models/orgs-actions-runners-labels-request-1.md) | Body, Required | - |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String org = "org6";
int runnerId = 22;
OrgsActionsRunnersLabelsRequest1 body = new OrgsActionsRunnersLabelsRequest1();
List<String> labels = new LinkedList<>();
labels.add("gpu");
labels.add("accelerated");

body.setLabels(labels);

actionsController.actionsSetCustomLabelsForSelfHostedRunnerForOrgAsync(org, runnerId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsActionsRunnersLabels404ErrorException`](../../doc/models/orgs-actions-runners-labels-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsActionsRunnersLabels422ErrorException`](../../doc/models/orgs-actions-runners-labels-422-error-exception.md) |


# Actions Remove-All-Custom-Labels-From-Self-Hosted-Runner-for-Org

Remove all custom labels from a self-hosted runner configured in an
organization. Returns the remaining read-only labels from the runner.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#remove-all-custom-labels-from-a-self-hosted-runner-for-an-organization](https://docs.github.com/rest/reference/actions#remove-all-custom-labels-from-a-self-hosted-runner-for-an-organization)

```java
CompletableFuture<ActionsRunnerLabels> actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrgAsync(
    final String org,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String org = "org6";
int runnerId = 22;

actionsController.actionsRemoveAllCustomLabelsFromSelfHostedRunnerForOrgAsync(org, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 3,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsActionsRunnersLabels404ErrorException`](../../doc/models/orgs-actions-runners-labels-404-error-exception.md) |


# Actions Remove-Custom-Label-From-Self-Hosted-Runner-for-Org

Remove a custom label from a self-hosted runner configured
in an organization. Returns the remaining labels from the runner.

This endpoint returns a `404 Not Found` status if the custom label is not
present on the runner.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#remove-a-custom-label-from-a-self-hosted-runner-for-an-organization](https://docs.github.com/rest/reference/actions#remove-a-custom-label-from-a-self-hosted-runner-for-an-organization)

```java
CompletableFuture<ActionsRunnerLabels> actionsRemoveCustomLabelFromSelfHostedRunnerForOrgAsync(
    final String org,
    final int runnerId,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |
| `name` | `String` | Template, Required | The name of a self-hosted runner's custom label. |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String org = "org6";
int runnerId = 22;
String name = "name0";

actionsController.actionsRemoveCustomLabelFromSelfHostedRunnerForOrgAsync(org, runnerId, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsActionsRunnersLabelsName404ErrorException`](../../doc/models/orgs-actions-runners-labels-name-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsActionsRunnersLabelsName422ErrorException`](../../doc/models/orgs-actions-runners-labels-name-422-error-exception.md) |


# Actions List-Org-Secrets

Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-organization-secrets](https://docs.github.com/rest/reference/actions#list-organization-secrets)

```java
CompletableFuture<OrgsActionsSecretsResponse> actionsListOrgSecretsAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsActionsSecretsResponse`](../../doc/models/orgs-actions-secrets-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListOrgSecretsAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 3,
  "secrets": [
    {
      "name": "GIST_ID",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z",
      "visibility": "private"
    },
    {
      "name": "DEPLOY_TOKEN",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z",
      "visibility": "all"
    },
    {
      "name": "GH_TOKEN",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z",
      "visibility": "selected",
      "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/secrets/SUPER_SECRET/repositories"
    }
  ]
}
```


# Actions Get-Org-Public-Key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-an-organization-public-key](https://docs.github.com/rest/reference/actions#get-an-organization-public-key)

```java
CompletableFuture<OrgsActionsSecretsPublicKeyResponse> actionsGetOrgPublicKeyAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsActionsSecretsPublicKeyResponse`](../../doc/models/orgs-actions-secrets-public-key-response.md)

## Example Usage

```java
String org = "org6";

actionsController.actionsGetOrgPublicKeyAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key_id": "012345678912345678",
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"
}
```


# Actions Get-Org-Secret

Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-an-organization-secret](https://docs.github.com/rest/reference/actions#get-an-organization-secret)

```java
CompletableFuture<OrgsActionsSecretsResponse2> actionsGetOrgSecretAsync(
    final String org,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`OrgsActionsSecretsResponse2`](../../doc/models/orgs-actions-secrets-response-2.md)

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";

actionsController.actionsGetOrgSecretAsync(org, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "GH_TOKEN",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z",
  "visibility": "selected",
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/secrets/SUPER_SECRET/repositories"
}
```


# Actions Create-or-Update-Org-Secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using
[LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to
use this endpoint.

#### Example encrypting a secret using Node.js

Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.

```
const sodium = require('libsodium-wrappers')
const secret = 'plain-text-secret' // replace with the secret you want to encrypt
const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key

//Check if libsodium is ready and then proceed.
sodium.ready.then(() => {
  // Convert Secret & Base64 key to Uint8Array.
  let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
  let binsec = sodium.from_string(secret)

  //Encrypt the secret using LibSodium
  let encBytes = sodium.crypto_box_seal(binsec, binkey)

  // Convert encrypted Uint8Array to Base64
  let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)

  console.log(output)
});
```

#### Example encrypting a secret using Python

Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.

```
from base64 import b64encode
from nacl import encoding, public

def encrypt(public_key: str, secret_value: str) -> str:
  """Encrypt a Unicode string using the public key."""
  public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
  sealed_box = public.SealedBox(public_key)
  encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
  return b64encode(encrypted).decode("utf-8")
```

#### Example encrypting a secret using C#

Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.

```
var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");

var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);

Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
```

#### Example encrypting a secret using Ruby

Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.

```ruby
require "rbnacl"
require "base64"

key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
public_key = RbNaCl::PublicKey.new(key)

box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
encrypted_secret = box.encrypt("my_secret")

# Print the base64 encoded secret
puts Base64.strict_encode64(encrypted_secret)
```

API method documentation: [https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret)

```java
CompletableFuture<Object> actionsCreateOrUpdateOrgSecretAsync(
    final String org,
    final String secretName,
    final OrgsActionsSecretsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`OrgsActionsSecretsRequest`](../../doc/models/orgs-actions-secrets-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
OrgsActionsSecretsRequest body = new OrgsActionsSecretsRequest();
body.setVisibility(Visibility81Enum.SELECTED);
body.setEncryptedValue("c2VjcmV0");
body.setKeyId("012345678912345678");
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(1296269);
selectedRepositoryIds.add(1296280);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsCreateOrUpdateOrgSecretAsync(org, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Delete-Org-Secret

Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-an-organization-secret](https://docs.github.com/rest/reference/actions#delete-an-organization-secret)

```java
CompletableFuture<Void> actionsDeleteOrgSecretAsync(
    final String org,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";

actionsController.actionsDeleteOrgSecretAsync(org, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Selected-Repos-for-Org-Secret

Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-selected-repositories-for-an-organization-secret](https://docs.github.com/rest/reference/actions#list-selected-repositories-for-an-organization-secret)

```java
CompletableFuture<OrgsActionsSecretsRepositoriesResponse> actionsListSelectedReposForOrgSecretAsync(
    final String org,
    final String secretName,
    final Integer page,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`OrgsActionsSecretsRepositoriesResponse`](../../doc/models/orgs-actions-secrets-repositories-response.md)

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
Integer page = 1;
Integer perPage = 30;

actionsController.actionsListSelectedReposForOrgSecretAsync(org, secretName, page, perPage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
    }
  ]
}
```


# Actions Set-Selected-Repos-for-Org-Secret

Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#set-selected-repositories-for-an-organization-secret](https://docs.github.com/rest/reference/actions#set-selected-repositories-for-an-organization-secret)

```java
CompletableFuture<Void> actionsSetSelectedReposForOrgSecretAsync(
    final String org,
    final String secretName,
    final OrgsActionsSecretsRepositoriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`OrgsActionsSecretsRepositoriesRequest`](../../doc/models/orgs-actions-secrets-repositories-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
OrgsActionsSecretsRepositoriesRequest body = new OrgsActionsSecretsRepositoriesRequest();
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(64780797);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsSetSelectedReposForOrgSecretAsync(org, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Add-Selected-Repo-to-Org-Secret

Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#add-selected-repository-to-an-organization-secret](https://docs.github.com/rest/reference/actions#add-selected-repository-to-an-organization-secret)

```java
CompletableFuture<Void> actionsAddSelectedRepoToOrgSecretAsync(
    final String org,
    final String secretName,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
int repositoryId = 254;

actionsController.actionsAddSelectedRepoToOrgSecretAsync(org, secretName, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict when visibility type is not set to selected | `ApiException` |


# Actions Remove-Selected-Repo-From-Org-Secret

Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#remove-selected-repository-from-an-organization-secret](https://docs.github.com/rest/reference/actions#remove-selected-repository-from-an-organization-secret)

```java
CompletableFuture<Void> actionsRemoveSelectedRepoFromOrgSecretAsync(
    final String org,
    final String secretName,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
int repositoryId = 254;

actionsController.actionsRemoveSelectedRepoFromOrgSecretAsync(org, secretName, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict when visibility type not set to selected | `ApiException` |


# Actions List-Org-Variables

Lists all organization variables. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#list-organization-variables](https://docs.github.com/rest/actions/variables#list-organization-variables)

```java
CompletableFuture<OrgsActionsVariablesResponse> actionsListOrgVariablesAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 30).<br>**Default**: `10` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsActionsVariablesResponse`](../../doc/models/orgs-actions-variables-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 10;
Integer page = 1;

actionsController.actionsListOrgVariablesAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 3,
  "variables": [
    {
      "name": "USERNAME",
      "value": "octocat",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z",
      "visibility": "private"
    },
    {
      "name": "ACTIONS_RUNNER_DEBUG",
      "value": "true",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z",
      "visibility": "all"
    },
    {
      "name": "ADMIN_EMAIL",
      "value": "octocat@github.com",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z",
      "visibility": "selected",
      "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/variables/ADMIN_EMAIL/repositories"
    }
  ]
}
```


# Actions Create-Org-Variable

Creates an organization variable that you can reference in a GitHub Actions workflow.
You must authenticate using an access token with the `admin:org` scope to use this endpoint.
GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#create-an-organization-variable](https://docs.github.com/rest/actions/variables#create-an-organization-variable)

```java
CompletableFuture<Object> actionsCreateOrgVariableAsync(
    final String org,
    final OrgsActionsVariablesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsActionsVariablesRequest`](../../doc/models/orgs-actions-variables-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String org = "org6";
OrgsActionsVariablesRequest body = new OrgsActionsVariablesRequest();
body.setName("USERNAME");
body.setValue("octocat");
body.setVisibility(Visibility82Enum.SELECTED);
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(1296269);
selectedRepositoryIds.add(1296280);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsCreateOrgVariableAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Org-Variable

Gets a specific variable in an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#get-an-organization-variable](https://docs.github.com/rest/actions/variables#get-an-organization-variable)

```java
CompletableFuture<OrgsActionsVariablesResponse2> actionsGetOrgVariableAsync(
    final String org,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |

## Response Type

[`OrgsActionsVariablesResponse2`](../../doc/models/orgs-actions-variables-response-2.md)

## Example Usage

```java
String org = "org6";
String name = "name0";

actionsController.actionsGetOrgVariableAsync(org, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "USERNAME",
  "value": "octocat",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z",
  "visibility": "selected",
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/actions/variables/USERNAME/repositories"
}
```


# Actions Update-Org-Variable

Updates an organization variable that you can reference in a GitHub Actions workflow.
You must authenticate using an access token with the `admin:org` scope to use this endpoint.
GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#update-an-organization-variable](https://docs.github.com/rest/actions/variables#update-an-organization-variable)

```java
CompletableFuture<Void> actionsUpdateOrgVariableAsync(
    final String org,
    final String name,
    final OrgsActionsVariablesRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |
| `body` | [`OrgsActionsVariablesRequest1`](../../doc/models/orgs-actions-variables-request-1.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String name = "name0";
OrgsActionsVariablesRequest1 body = new OrgsActionsVariablesRequest1();
body.setName("USERNAME");
body.setValue("octocat");
body.setVisibility(Visibility82Enum.SELECTED);
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(1296269);
selectedRepositoryIds.add(1296280);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsUpdateOrgVariableAsync(org, name, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Delete-Org-Variable

Deletes an organization variable using the variable name.
You must authenticate using an access token with the `admin:org` scope to use this endpoint.
GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#delete-an-organization-variable](https://docs.github.com/rest/actions/variables#delete-an-organization-variable)

```java
CompletableFuture<Void> actionsDeleteOrgVariableAsync(
    final String org,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String name = "name0";

actionsController.actionsDeleteOrgVariableAsync(org, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Selected-Repos-for-Org-Variable

Lists all repositories that can access an organization variable that is available to selected repositories. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#list-selected-repositories-for-an-organization-variable](https://docs.github.com/rest/actions/variables#list-selected-repositories-for-an-organization-variable)

```java
CompletableFuture<OrgsActionsSecretsRepositoriesResponse> actionsListSelectedReposForOrgVariableAsync(
    final String org,
    final String name,
    final Integer page,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`OrgsActionsSecretsRepositoriesResponse`](../../doc/models/orgs-actions-secrets-repositories-response.md)

## Example Usage

```java
String org = "org6";
String name = "name0";
Integer page = 1;
Integer perPage = 30;

actionsController.actionsListSelectedReposForOrgVariableAsync(org, name, page, perPage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Response when the visibility of the variable is not set to `selected` | `ApiException` |


# Actions Set-Selected-Repos-for-Org-Variable

Replaces all repositories for an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#set-selected-repositories-for-an-organization-variable](https://docs.github.com/rest/actions/variables#set-selected-repositories-for-an-organization-variable)

```java
CompletableFuture<Void> actionsSetSelectedReposForOrgVariableAsync(
    final String org,
    final String name,
    final OrgsActionsVariablesRepositoriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |
| `body` | [`OrgsActionsVariablesRepositoriesRequest`](../../doc/models/orgs-actions-variables-repositories-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String name = "name0";
OrgsActionsVariablesRepositoriesRequest body = new OrgsActionsVariablesRepositoriesRequest();
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(64780797);

body.setSelectedRepositoryIds(selectedRepositoryIds);

actionsController.actionsSetSelectedReposForOrgVariableAsync(org, name, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Response when the visibility of the variable is not set to `selected` | `ApiException` |


# Actions Add-Selected-Repo-to-Org-Variable

Adds a repository to an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#add-selected-repository-to-an-organization-variable](https://docs.github.com/rest/actions/variables#add-selected-repository-to-an-organization-variable)

```java
CompletableFuture<Void> actionsAddSelectedRepoToOrgVariableAsync(
    final String org,
    final String name,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String name = "name0";
int repositoryId = 254;

actionsController.actionsAddSelectedRepoToOrgVariableAsync(org, name, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Response when the visibility of the variable is not set to `selected` | `ApiException` |


# Actions Remove-Selected-Repo-From-Org-Variable

Removes a repository from an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#remove-selected-repository-from-an-organization-variable](https://docs.github.com/rest/actions/variables#remove-selected-repository-from-an-organization-variable)

```java
CompletableFuture<Void> actionsRemoveSelectedRepoFromOrgVariableAsync(
    final String org,
    final String name,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String name = "name0";
int repositoryId = 254;

actionsController.actionsRemoveSelectedRepoFromOrgVariableAsync(org, name, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Response when the visibility of the variable is not set to `selected` | `ApiException` |


# Actions List-Repo-Required-Workflows

Lists the required workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#list-repository-required-workflows](https://docs.github.com/rest/reference/actions#list-repository-required-workflows)

```java
CompletableFuture<ReposActionsRequiredWorkflowsResponse> actionsListRepoRequiredWorkflowsAsync(
    final String org,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsRequiredWorkflowsResponse`](../../doc/models/repos-actions-required-workflows-response.md)

## Example Usage

```java
String org = "org6";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListRepoRequiredWorkflowsAsync(org, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "required_workflows": [
    {
      "id": 161335,
      "node_id": "MDg6V29ya2Zsb3cxNjEzMzU=",
      "name": "RequiredCI",
      "path": ".github/workflows/required_ci.yaml",
      "state": "active",
      "created_at": "2020-01-08T23:48:37.000-08:00",
      "updated_at": "2020-01-08T23:50:21.000-08:00",
      "url": "https://api.github.com/repos/octo-org/octo-repo/actions/required_workflows/161335",
      "html_url": "https://github.com/octo-org/octo-repo/blob/master/octo-org/hello-world/.github/workflows/required_ci.yaml",
      "badge_url": "https://github.com/octo-org/octo-repo/workflows/required/octo-org/hello-world/.github/workflows/required_ci.yaml/badge.svg",
      "source_repository": {
        "id": 1296269,
        "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
        "name": "Hello-World",
        "full_name": "octo-org/Hello-World",
        "owner": {
          "login": "octo-org",
          "id": 1,
          "node_id": "MDQ6VXNlcjE=",
          "avatar_url": "https://github.com/images/error/octo-org_happy.gif",
          "gravatar_id": "",
          "url": "https://api.github.com/users/octo-org",
          "html_url": "https://github.com/octo-org",
          "followers_url": "https://api.github.com/users/octo-org/followers",
          "following_url": "https://api.github.com/users/octo-org/following{/other_user}",
          "gists_url": "https://api.github.com/users/octo-org/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octo-org/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octo-org/subscriptions",
          "organizations_url": "https://api.github.com/users/octo-org/orgs",
          "repos_url": "https://api.github.com/users/octo-org/repos",
          "events_url": "https://api.github.com/users/octo-org/events{/privacy}",
          "received_events_url": "https://api.github.com/users/octo-org/received_events",
          "type": "User",
          "site_admin": false
        },
        "private": false,
        "html_url": "https://github.com/octo-org/Hello-World",
        "description": "This your first repo!",
        "fork": false,
        "url": "https://api.github.com/repos/octo-org/Hello-World",
        "archive_url": "https://api.github.com/repos/octo-org/Hello-World/{archive_format}{/ref}",
        "assignees_url": "https://api.github.com/repos/octo-org/Hello-World/assignees{/user}",
        "blobs_url": "https://api.github.com/repos/octo-org/Hello-World/git/blobs{/sha}",
        "branches_url": "https://api.github.com/repos/octo-org/Hello-World/branches{/branch}",
        "collaborators_url": "https://api.github.com/repos/octo-org/Hello-World/collaborators{/collaborator}",
        "comments_url": "https://api.github.com/repos/octo-org/Hello-World/comments{/number}",
        "commits_url": "https://api.github.com/repos/octo-org/Hello-World/commits{/sha}",
        "compare_url": "https://api.github.com/repos/octo-org/Hello-World/compare/{base}...{head}",
        "contents_url": "https://api.github.com/repos/octo-org/Hello-World/contents/{+path}",
        "contributors_url": "https://api.github.com/repos/octo-org/Hello-World/contributors",
        "deployments_url": "https://api.github.com/repos/octo-org/Hello-World/deployments",
        "downloads_url": "https://api.github.com/repos/octo-org/Hello-World/downloads",
        "events_url": "https://api.github.com/repos/octo-org/Hello-World/events",
        "forks_url": "https://api.github.com/repos/octo-org/Hello-World/forks",
        "git_commits_url": "https://api.github.com/repos/octo-org/Hello-World/git/commits{/sha}",
        "git_refs_url": "https://api.github.com/repos/octo-org/Hello-World/git/refs{/sha}",
        "git_tags_url": "https://api.github.com/repos/octo-org/Hello-World/git/tags{/sha}",
        "git_url": "git:github.com/octo-org/Hello-World.git",
        "issue_comment_url": "https://api.github.com/repos/octo-org/Hello-World/issues/comments{/number}",
        "issue_events_url": "https://api.github.com/repos/octo-org/Hello-World/issues/events{/number}",
        "issues_url": "https://api.github.com/repos/octo-org/Hello-World/issues{/number}",
        "keys_url": "https://api.github.com/repos/octo-org/Hello-World/keys{/key_id}",
        "labels_url": "https://api.github.com/repos/octo-org/Hello-World/labels{/name}",
        "languages_url": "https://api.github.com/repos/octo-org/Hello-World/languages",
        "merges_url": "https://api.github.com/repos/octo-org/Hello-World/merges",
        "milestones_url": "https://api.github.com/repos/octo-org/Hello-World/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/octo-org/Hello-World/notifications{?since,all,participating}",
        "pulls_url": "https://api.github.com/repos/octo-org/Hello-World/pulls{/number}",
        "releases_url": "https://api.github.com/repos/octo-org/Hello-World/releases{/id}",
        "ssh_url": "git@github.com:octo-org/Hello-World.git",
        "stargazers_url": "https://api.github.com/repos/octo-org/Hello-World/stargazers",
        "statuses_url": "https://api.github.com/repos/octo-org/Hello-World/statuses/{sha}",
        "subscribers_url": "https://api.github.com/repos/octo-org/Hello-World/subscribers",
        "subscription_url": "https://api.github.com/repos/octo-org/Hello-World/subscription",
        "tags_url": "https://api.github.com/repos/octo-org/Hello-World/tags",
        "teams_url": "https://api.github.com/repos/octo-org/Hello-World/teams",
        "trees_url": "https://api.github.com/repos/octo-org/Hello-World/git/trees{/sha}",
        "hooks_url": "http://api.github.com/repos/octo-org/Hello-World/hooks"
      }
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRequiredWorkflows404ErrorException`](../../doc/models/repos-actions-required-workflows-404-error-exception.md) |


# Actions Get-Repo-Required-Workflow

Gets a specific required workflow present in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#get-repository-required-workflow](https://docs.github.com/rest/reference/actions#get-repository-required-workflow)

```java
CompletableFuture<ReposActionsRequiredWorkflowsRequiredWorkflowIdForRepoResponse> actionsGetRepoRequiredWorkflowAsync(
    final String org,
    final String repo,
    final int requiredWorkflowIdForRepo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `requiredWorkflowIdForRepo` | `int` | Template, Required | The ID of the required workflow that has run at least once in a repository. |

## Response Type

[`ReposActionsRequiredWorkflowsRequiredWorkflowIdForRepoResponse`](../../doc/models/repos-actions-required-workflows-required-workflow-id-for-repo-response.md)

## Example Usage

```java
String org = "org6";
String repo = "repo4";
int requiredWorkflowIdForRepo = 38;

actionsController.actionsGetRepoRequiredWorkflowAsync(org, repo, requiredWorkflowIdForRepo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 161335,
  "node_id": "MDg6V29ya2Zsb3cxNjEzMzU=",
  "name": "RequiredCI",
  "path": ".github/workflows/required_ci.yaml",
  "state": "active",
  "created_at": "2020-01-08T23:48:37.000-08:00",
  "updated_at": "2020-01-08T23:50:21.000-08:00",
  "url": "https://api.github.com/repos/octo-org/octo-repo/actions/required_workflows/161335",
  "html_url": "https://github.com/octo-org/octo-repo/blob/master/octo-org/hello-world/.github/workflows/required_ci.yaml",
  "badge_url": "https://github.com/octo-org/octo-repo/workflows/required/octo-org/hello-world/.github/workflows/required_ci.yaml/badge.svg",
  "source_repository": {
    "id": 1296269,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Hello-World",
    "full_name": "octo-org/Hello-World",
    "owner": {
      "login": "octo-org",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octo-org_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octo-org",
      "html_url": "https://github.com/octo-org",
      "followers_url": "https://api.github.com/users/octo-org/followers",
      "following_url": "https://api.github.com/users/octo-org/following{/other_user}",
      "gists_url": "https://api.github.com/users/octo-org/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octo-org/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octo-org/subscriptions",
      "organizations_url": "https://api.github.com/users/octo-org/orgs",
      "repos_url": "https://api.github.com/users/octo-org/repos",
      "events_url": "https://api.github.com/users/octo-org/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octo-org/received_events",
      "type": "User",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/octo-org/Hello-World",
    "description": "This your first repo!",
    "fork": false,
    "url": "https://api.github.com/repos/octo-org/Hello-World",
    "archive_url": "https://api.github.com/repos/octo-org/Hello-World/{archive_format}{/ref}",
    "assignees_url": "https://api.github.com/repos/octo-org/Hello-World/assignees{/user}",
    "blobs_url": "https://api.github.com/repos/octo-org/Hello-World/git/blobs{/sha}",
    "branches_url": "https://api.github.com/repos/octo-org/Hello-World/branches{/branch}",
    "collaborators_url": "https://api.github.com/repos/octo-org/Hello-World/collaborators{/collaborator}",
    "comments_url": "https://api.github.com/repos/octo-org/Hello-World/comments{/number}",
    "commits_url": "https://api.github.com/repos/octo-org/Hello-World/commits{/sha}",
    "compare_url": "https://api.github.com/repos/octo-org/Hello-World/compare/{base}...{head}",
    "contents_url": "https://api.github.com/repos/octo-org/Hello-World/contents/{+path}",
    "contributors_url": "https://api.github.com/repos/octo-org/Hello-World/contributors",
    "deployments_url": "https://api.github.com/repos/octo-org/Hello-World/deployments",
    "downloads_url": "https://api.github.com/repos/octo-org/Hello-World/downloads",
    "events_url": "https://api.github.com/repos/octo-org/Hello-World/events",
    "forks_url": "https://api.github.com/repos/octo-org/Hello-World/forks",
    "git_commits_url": "https://api.github.com/repos/octo-org/Hello-World/git/commits{/sha}",
    "git_refs_url": "https://api.github.com/repos/octo-org/Hello-World/git/refs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octo-org/Hello-World/git/tags{/sha}",
    "git_url": "git:github.com/octo-org/Hello-World.git",
    "issue_comment_url": "https://api.github.com/repos/octo-org/Hello-World/issues/comments{/number}",
    "issue_events_url": "https://api.github.com/repos/octo-org/Hello-World/issues/events{/number}",
    "issues_url": "https://api.github.com/repos/octo-org/Hello-World/issues{/number}",
    "keys_url": "https://api.github.com/repos/octo-org/Hello-World/keys{/key_id}",
    "labels_url": "https://api.github.com/repos/octo-org/Hello-World/labels{/name}",
    "languages_url": "https://api.github.com/repos/octo-org/Hello-World/languages",
    "merges_url": "https://api.github.com/repos/octo-org/Hello-World/merges",
    "milestones_url": "https://api.github.com/repos/octo-org/Hello-World/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octo-org/Hello-World/notifications{?since,all,participating}",
    "pulls_url": "https://api.github.com/repos/octo-org/Hello-World/pulls{/number}",
    "releases_url": "https://api.github.com/repos/octo-org/Hello-World/releases{/id}",
    "ssh_url": "git@github.com:octo-org/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octo-org/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octo-org/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octo-org/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octo-org/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octo-org/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octo-org/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octo-org/Hello-World/git/trees{/sha}",
    "hooks_url": "http://api.github.com/repos/octo-org/Hello-World/hooks"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRequiredWorkflowsRequiredWorkflowIdForRepo404ErrorException`](../../doc/models/repos-actions-required-workflows-required-workflow-id-for-repo-404-error-exception.md) |


# Actions Get-Repo-Required-Workflow-Usage

Gets the number of billable minutes used by a specific required workflow during the current billing cycle.

Billable minutes only apply to required workflows running in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)."

Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-repository-required-workflow-usage](https://docs.github.com/rest/reference/actions#get-repository-required-workflow-usage)

```java
CompletableFuture<ReposActionsRequiredWorkflowsRequiredWorkflowIdForRepoTimingResponse> actionsGetRepoRequiredWorkflowUsageAsync(
    final String org,
    final String repo,
    final int requiredWorkflowIdForRepo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `requiredWorkflowIdForRepo` | `int` | Template, Required | The ID of the required workflow that has run at least once in a repository. |

## Response Type

[`ReposActionsRequiredWorkflowsRequiredWorkflowIdForRepoTimingResponse`](../../doc/models/repos-actions-required-workflows-required-workflow-id-for-repo-timing-response.md)

## Example Usage

```java
String org = "org6";
String repo = "repo4";
int requiredWorkflowIdForRepo = 38;

actionsController.actionsGetRepoRequiredWorkflowUsageAsync(org, repo, requiredWorkflowIdForRepo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "billable": {
    "UBUNTU": {
      "total_ms": 180000
    },
    "MACOS": {
      "total_ms": 240000
    },
    "WINDOWS": {
      "total_ms": 300000
    }
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRequiredWorkflowsRequiredWorkflowIdForRepoTiming404ErrorException`](../../doc/models/repos-actions-required-workflows-required-workflow-id-for-repo-timing-404-error-exception.md) |


# Actions List-Artifacts-for-Repo

Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-artifacts-for-a-repository](https://docs.github.com/rest/reference/actions#list-artifacts-for-a-repository)

```java
CompletableFuture<ReposActionsArtifactsResponse> actionsListArtifactsForRepoAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `name` | `String` | Query, Optional | Filters artifacts by exact match on their name field. |

## Response Type

[`ReposActionsArtifactsResponse`](../../doc/models/repos-actions-artifacts-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListArtifactsForRepoAsync(owner, repo, perPage, page, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "artifacts": [
    {
      "id": 11,
      "node_id": "MDg6QXJ0aWZhY3QxMQ==",
      "name": "Rails",
      "size_in_bytes": 556,
      "url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/11",
      "archive_download_url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/11/zip",
      "expired": false,
      "created_at": "2020-01-10T14:59:22Z",
      "expires_at": "2020-03-21T14:59:22Z",
      "updated_at": "2020-02-21T14:59:22Z",
      "workflow_run": {
        "id": 2332938,
        "repository_id": 1296269,
        "head_repository_id": 1296269,
        "head_branch": "main",
        "head_sha": "328faa0536e6fef19753d9d91dc96a9931694ce3"
      }
    },
    {
      "id": 13,
      "node_id": "MDg6QXJ0aWZhY3QxMw==",
      "name": "Test output",
      "size_in_bytes": 453,
      "url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/13",
      "archive_download_url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/13/zip",
      "expired": false,
      "created_at": "2020-01-10T14:59:22Z",
      "expires_at": "2020-03-21T14:59:22Z",
      "updated_at": "2020-02-21T14:59:22Z",
      "workflow_run": {
        "id": 2332942,
        "repository_id": 1296269,
        "head_repository_id": 1296269,
        "head_branch": "main",
        "head_sha": "178f4f6090b3fccad4a65b3e83d076a622d59652"
      }
    }
  ]
}
```


# Actions Get-Artifact

Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-an-artifact](https://docs.github.com/rest/reference/actions#get-an-artifact)

```java
CompletableFuture<ReposActionsArtifactsArtifactIdResponse> actionsGetArtifactAsync(
    final String owner,
    final String repo,
    final int artifactId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `artifactId` | `int` | Template, Required | The unique identifier of the artifact. |

## Response Type

[`ReposActionsArtifactsArtifactIdResponse`](../../doc/models/repos-actions-artifacts-artifact-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int artifactId = 168;

actionsController.actionsGetArtifactAsync(owner, repo, artifactId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 11,
  "node_id": "MDg6QXJ0aWZhY3QxMQ==",
  "name": "Rails",
  "size_in_bytes": 556,
  "url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/11",
  "archive_download_url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/11/zip",
  "expired": false,
  "created_at": "2020-01-10T14:59:22Z",
  "expires_at": "2020-01-21T14:59:22Z",
  "updated_at": "2020-01-21T14:59:22Z",
  "workflow_run": {
    "id": 2332938,
    "repository_id": 1296269,
    "head_repository_id": 1296269,
    "head_branch": "main",
    "head_sha": "328faa0536e6fef19753d9d91dc96a9931694ce3"
  }
}
```


# Actions Delete-Artifact

Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-an-artifact](https://docs.github.com/rest/reference/actions#delete-an-artifact)

```java
CompletableFuture<Void> actionsDeleteArtifactAsync(
    final String owner,
    final String repo,
    final int artifactId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `artifactId` | `int` | Template, Required | The unique identifier of the artifact. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int artifactId = 168;

actionsController.actionsDeleteArtifactAsync(owner, repo, artifactId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Download-Artifact

Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in
the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to
the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#download-an-artifact](https://docs.github.com/rest/reference/actions#download-an-artifact)

```java
CompletableFuture<Void> actionsDownloadArtifactAsync(
    final String owner,
    final String repo,
    final int artifactId,
    final String archiveFormat)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `artifactId` | `int` | Template, Required | The unique identifier of the artifact. |
| `archiveFormat` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int artifactId = 168;
String archiveFormat = "archive_format0";

actionsController.actionsDownloadArtifactAsync(owner, repo, artifactId, archiveFormat).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 410 | Gone | [`ReposActionsArtifactsArtifactIdArchiveFormat410ErrorException`](../../doc/models/repos-actions-artifacts-artifact-id-archive-format-410-error-exception.md) |


# Actions Get-Actions-Cache-Usage

Gets GitHub Actions cache usage for a repository.
The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-github-actions-cache-usage-for-a-repository](https://docs.github.com/rest/reference/actions#get-github-actions-cache-usage-for-a-repository)

```java
CompletableFuture<ReposActionsCacheUsageResponse> actionsGetActionsCacheUsageAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposActionsCacheUsageResponse`](../../doc/models/repos-actions-cache-usage-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsGetActionsCacheUsageAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "full_name": "octo-org/Hello-World",
  "active_caches_size_in_bytes": 2322142,
  "active_caches_count": 3
}
```


# Actions Get-Actions-Cache-List

Lists the GitHub Actions caches for a repository.
You must authenticate using an access token with the `repo` scope to use this endpoint.
GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/cache#list-github-actions-caches-for-a-repository](https://docs.github.com/rest/actions/cache#list-github-actions-caches-for-a-repository)

```java
CompletableFuture<ReposActionsCachesResponse> actionsGetActionsCacheListAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page,
    final String ref,
    final String key,
    final Sort71Enum sort,
    final Direction1Enum direction)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `ref` | `String` | Query, Optional | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. |
| `key` | `String` | Query, Optional | An explicit key or prefix for identifying the cache |
| `sort` | [`Sort71Enum`](../../doc/models/sort-71-enum.md) | Query, Optional | The property to sort the results by. `created_at` means when the cache was created. `last_accessed_at` means when the cache was last accessed. `size_in_bytes` is the size of the cache in bytes. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |

## Response Type

[`ReposActionsCachesResponse`](../../doc/models/repos-actions-caches-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsGetActionsCacheListAsync(owner, repo, perPage, page, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "actions_caches": [
    {
      "id": 505,
      "ref": "refs/heads/main",
      "key": "Linux-node-958aff96db2d75d67787d1e634ae70b659de937b",
      "version": "73885106f58cc52a7df9ec4d4a5622a5614813162cb516c759a30af6bf56e6f0",
      "last_accessed_at": "2019-01-24T22:45:36.000Z",
      "created_at": "2019-01-24T22:45:36.000Z",
      "size_in_bytes": 1024
    }
  ]
}
```


# Actions Delete-Actions-Cache-by-Key

Deletes one or more GitHub Actions caches for a repository, using a complete cache key. By default, all caches that match the provided key are deleted, but you can optionally provide a Git ref to restrict deletions to caches that match both the provided key and the Git ref.

You must authenticate using an access token with the `repo` scope to use this endpoint.

GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/cache#delete-github-actions-caches-for-a-repository-using-a-cache-key](https://docs.github.com/rest/actions/cache#delete-github-actions-caches-for-a-repository-using-a-cache-key)

```java
CompletableFuture<ReposActionsCachesResponse> actionsDeleteActionsCacheByKeyAsync(
    final String owner,
    final String repo,
    final String key,
    final String ref)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `key` | `String` | Query, Required | A key for identifying the cache. |
| `ref` | `String` | Query, Optional | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. |

## Response Type

[`ReposActionsCachesResponse`](../../doc/models/repos-actions-caches-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String key = "key0";

actionsController.actionsDeleteActionsCacheByKeyAsync(owner, repo, key, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "actions_caches": [
    {
      "id": 505,
      "ref": "refs/heads/main",
      "key": "Linux-node-958aff96db2d75d67787d1e634ae70b659de937b",
      "version": "73885106f58cc52a7df9ec4d4a5622a5614813162cb516c759a30af6bf56e6f0",
      "last_accessed_at": "2019-01-24T22:45:36.000Z",
      "created_at": "2019-01-24T22:45:36.000Z",
      "size_in_bytes": 1024
    }
  ]
}
```


# Actions Delete-Actions-Cache-by-Id

Deletes a GitHub Actions cache for a repository, using a cache ID.

You must authenticate using an access token with the `repo` scope to use this endpoint.

GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/cache#delete-a-github-actions-cache-for-a-repository-using-a-cache-id](https://docs.github.com/rest/actions/cache#delete-a-github-actions-cache-for-a-repository-using-a-cache-id)

```java
CompletableFuture<Void> actionsDeleteActionsCacheByIdAsync(
    final String owner,
    final String repo,
    final int cacheId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `cacheId` | `int` | Template, Required | The unique identifier of the GitHub Actions cache. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int cacheId = 4;

actionsController.actionsDeleteActionsCacheByIdAsync(owner, repo, cacheId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Job-for-Workflow-Run

Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-job-for-a-workflow-run](https://docs.github.com/rest/reference/actions#get-a-job-for-a-workflow-run)

```java
CompletableFuture<ReposActionsJobsJobIdResponse> actionsGetJobForWorkflowRunAsync(
    final String owner,
    final String repo,
    final int jobId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `jobId` | `int` | Template, Required | The unique identifier of the job. |

## Response Type

[`ReposActionsJobsJobIdResponse`](../../doc/models/repos-actions-jobs-job-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int jobId = 84;

actionsController.actionsGetJobForWorkflowRunAsync(owner, repo, jobId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 399444496,
  "run_id": 29679449,
  "run_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/29679449",
  "node_id": "MDEyOldvcmtmbG93IEpvYjM5OTQ0NDQ5Ng==",
  "head_sha": "f83a356604ae3c5d03e1b46ef4d1ca77d64a90b0",
  "url": "https://api.github.com/repos/octo-org/octo-repo/actions/jobs/399444496",
  "html_url": "https://github.com/octo-org/octo-repo/runs/399444496",
  "status": "completed",
  "conclusion": "success",
  "started_at": "2020-01-20T17:42:40Z",
  "completed_at": "2020-01-20T17:44:39Z",
  "name": "build",
  "steps": [
    {
      "name": "Set up job",
      "status": "completed",
      "conclusion": "success",
      "number": 1,
      "started_at": "2020-01-20T09:42:40.000-08:00",
      "completed_at": "2020-01-20T09:42:41.000-08:00"
    },
    {
      "name": "Run actions/checkout@v2",
      "status": "completed",
      "conclusion": "success",
      "number": 2,
      "started_at": "2020-01-20T09:42:41.000-08:00",
      "completed_at": "2020-01-20T09:42:45.000-08:00"
    },
    {
      "name": "Set up Ruby",
      "status": "completed",
      "conclusion": "success",
      "number": 3,
      "started_at": "2020-01-20T09:42:45.000-08:00",
      "completed_at": "2020-01-20T09:42:45.000-08:00"
    },
    {
      "name": "Run actions/cache@v3",
      "status": "completed",
      "conclusion": "success",
      "number": 4,
      "started_at": "2020-01-20T09:42:45.000-08:00",
      "completed_at": "2020-01-20T09:42:48.000-08:00"
    },
    {
      "name": "Install Bundler",
      "status": "completed",
      "conclusion": "success",
      "number": 5,
      "started_at": "2020-01-20T09:42:48.000-08:00",
      "completed_at": "2020-01-20T09:42:52.000-08:00"
    },
    {
      "name": "Install Gems",
      "status": "completed",
      "conclusion": "success",
      "number": 6,
      "started_at": "2020-01-20T09:42:52.000-08:00",
      "completed_at": "2020-01-20T09:42:53.000-08:00"
    },
    {
      "name": "Run Tests",
      "status": "completed",
      "conclusion": "success",
      "number": 7,
      "started_at": "2020-01-20T09:42:53.000-08:00",
      "completed_at": "2020-01-20T09:42:59.000-08:00"
    },
    {
      "name": "Deploy to Heroku",
      "status": "completed",
      "conclusion": "success",
      "number": 8,
      "started_at": "2020-01-20T09:42:59.000-08:00",
      "completed_at": "2020-01-20T09:44:39.000-08:00"
    },
    {
      "name": "Post actions/cache@v3",
      "status": "completed",
      "conclusion": "success",
      "number": 16,
      "started_at": "2020-01-20T09:44:39.000-08:00",
      "completed_at": "2020-01-20T09:44:39.000-08:00"
    },
    {
      "name": "Complete job",
      "status": "completed",
      "conclusion": "success",
      "number": 17,
      "started_at": "2020-01-20T09:44:39.000-08:00",
      "completed_at": "2020-01-20T09:44:39.000-08:00"
    }
  ],
  "check_run_url": "https://api.github.com/repos/octo-org/octo-repo/check-runs/399444496",
  "labels": [
    "self-hosted",
    "foo",
    "bar"
  ],
  "runner_id": 1,
  "runner_name": "my runner",
  "runner_group_id": 2,
  "runner_group_name": "my runner group",
  "workflow_name": "CI",
  "head_branch": "main"
}
```


# Actions Download-Job-Logs-for-Workflow-Run

Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look
for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can
use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must
have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#download-job-logs-for-a-workflow-run](https://docs.github.com/rest/reference/actions#download-job-logs-for-a-workflow-run)

```java
CompletableFuture<Void> actionsDownloadJobLogsForWorkflowRunAsync(
    final String owner,
    final String repo,
    final int jobId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `jobId` | `int` | Template, Required | The unique identifier of the job. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int jobId = 84;

actionsController.actionsDownloadJobLogsForWorkflowRunAsync(owner, repo, jobId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Re-Run-Job-for-Workflow-Run

Re-run a job and its dependent jobs in a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#re-run-job-for-workflow-run](https://docs.github.com/rest/reference/actions#re-run-job-for-workflow-run)

```java
CompletableFuture<Object> actionsReRunJobForWorkflowRunAsync(
    final String owner,
    final String repo,
    final int jobId,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `jobId` | `int` | Template, Required | The unique identifier of the job. |
| `body` | `Object` | Body, Optional | - |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int jobId = 84;

actionsController.actionsReRunJobForWorkflowRunAsync(owner, repo, jobId, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposActionsJobsJobIdRerun403ErrorException`](../../doc/models/repos-actions-jobs-job-id-rerun-403-error-exception.md) |


# Actions Get-Custom-Oidc-Sub-Claim-for-Repo

Gets the customization template for an OpenID Connect (OIDC) subject claim.
You must authenticate using an access token with the `repo` scope to use this
endpoint. GitHub Apps must have the `organization_administration:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/oidc#get-the-customization-template-for-an-oidc-subject-claim-for-a-repository](https://docs.github.com/rest/actions/oidc#get-the-customization-template-for-an-oidc-subject-claim-for-a-repository)

```java
CompletableFuture<ReposActionsOidcCustomizationSubResponse> actionsGetCustomOidcSubClaimForRepoAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposActionsOidcCustomizationSubResponse`](../../doc/models/repos-actions-oidc-customization-sub-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsGetCustomOidcSubClaimForRepoAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "use_default": false,
  "include_claim_keys": [
    "repo",
    "context"
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ReposActionsOidcCustomizationSub400ErrorException`](../../doc/models/repos-actions-oidc-customization-sub-400-error-exception.md) |
| 404 | Resource not found | [`ReposActionsOidcCustomizationSub404ErrorException`](../../doc/models/repos-actions-oidc-customization-sub-404-error-exception.md) |


# Actions Set-Custom-Oidc-Sub-Claim-for-Repo

Sets the customization template and `opt-in` or `opt-out` flag for an OpenID Connect (OIDC) subject claim for a repository.
You must authenticate using an access token with the `repo` scope to use this
endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/oidc#set-the-customization-template-for-an-oidc-subject-claim-for-a-repository](https://docs.github.com/rest/actions/oidc#set-the-customization-template-for-an-oidc-subject-claim-for-a-repository)

```java
CompletableFuture<Object> actionsSetCustomOidcSubClaimForRepoAsync(
    final String owner,
    final String repo,
    final ReposActionsOidcCustomizationSubRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposActionsOidcCustomizationSubRequest`](../../doc/models/repos-actions-oidc-customization-sub-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposActionsOidcCustomizationSubRequest body = new ReposActionsOidcCustomizationSubRequest();
body.setUseDefault(false);
List<String> includeClaimKeys = new LinkedList<>();
includeClaimKeys.add("repo");
includeClaimKeys.add("context");

body.setIncludeClaimKeys(includeClaimKeys);

actionsController.actionsSetCustomOidcSubClaimForRepoAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ReposActionsOidcCustomizationSub400ErrorException`](../../doc/models/repos-actions-oidc-customization-sub-400-error-exception.md) |
| 404 | Resource not found | [`ReposActionsOidcCustomizationSub404ErrorException`](../../doc/models/repos-actions-oidc-customization-sub-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposActionsOidcCustomizationSub422ErrorException`](../../doc/models/repos-actions-oidc-customization-sub-422-error-exception.md) |


# Actions Get-Github-Actions-Permissions-Repository

Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#get-github-actions-permissions-for-a-repository](https://docs.github.com/rest/reference/actions#get-github-actions-permissions-for-a-repository)

```java
CompletableFuture<ActionsRepositoryPermissions> actionsGetGithubActionsPermissionsRepositoryAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ActionsRepositoryPermissions`](../../doc/models/actions-repository-permissions.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsGetGithubActionsPermissionsRepositoryAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "enabled": true,
  "allowed_actions": "selected",
  "selected_actions_url": "https://api.github.com/repositories/42/actions/permissions/selected-actions"
}
```


# Actions Set-Github-Actions-Permissions-Repository

Sets the GitHub Actions permissions policy for enabling GitHub Actions and allowed actions and reusable workflows in the repository.

If the repository belongs to an organization or enterprise that has set restrictive permissions at the organization or enterprise levels, such as `allowed_actions` to `selected` actions and reusable workflows, then you cannot override them for the repository.

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#set-github-actions-permissions-for-a-repository](https://docs.github.com/rest/reference/actions#set-github-actions-permissions-for-a-repository)

```java
CompletableFuture<Void> actionsSetGithubActionsPermissionsRepositoryAsync(
    final String owner,
    final String repo,
    final ReposActionsPermissionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposActionsPermissionsRequest`](../../doc/models/repos-actions-permissions-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposActionsPermissionsRequest body = new ReposActionsPermissionsRequest();
body.setEnabled(true);
body.setAllowedActions(AllowedActionsEnum.SELECTED);

actionsController.actionsSetGithubActionsPermissionsRepositoryAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Workflow-Access-to-Repository

Gets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
This endpoint only applies to private repositories.
For more information, see "[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)."

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
repository `administration` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-workflow-access-level-to-a-repository](https://docs.github.com/rest/reference/actions#get-workflow-access-level-to-a-repository)

```java
CompletableFuture<ActionsWorkflowAccessToRepository> actionsGetWorkflowAccessToRepositoryAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ActionsWorkflowAccessToRepository`](../../doc/models/actions-workflow-access-to-repository.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsGetWorkflowAccessToRepositoryAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "access_level": "organization"
}
```


# Actions Set-Workflow-Access-to-Repository

Sets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
This endpoint only applies to private repositories.
For more information, see "[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)".

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
repository `administration` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#set-workflow-access-to-a-repository](https://docs.github.com/rest/reference/actions#set-workflow-access-to-a-repository)

```java
CompletableFuture<Void> actionsSetWorkflowAccessToRepositoryAsync(
    final String owner,
    final String repo,
    final ActionsWorkflowAccessToRepository body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ActionsWorkflowAccessToRepository`](../../doc/models/actions-workflow-access-to-repository.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ActionsWorkflowAccessToRepository body = new ActionsWorkflowAccessToRepository();
body.setAccessLevel(AccessLevelEnum.ORGANIZATION);

actionsController.actionsSetWorkflowAccessToRepositoryAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Allowed-Actions-Repository

Gets the settings for selected actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#get-allowed-actions-for-a-repository](https://docs.github.com/rest/reference/actions#get-allowed-actions-for-a-repository)

```java
CompletableFuture<SelectedActions> actionsGetAllowedActionsRepositoryAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`SelectedActions`](../../doc/models/selected-actions.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsGetAllowedActionsRepositoryAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "github_owned_allowed": true,
  "verified_allowed": false,
  "patterns_allowed": [
    "monalisa/octocat@*",
    "docker/*"
  ]
}
```


# Actions Set-Allowed-Actions-Repository

Sets the actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."

If the repository belongs to an organization or enterprise that has `selected` actions and reusable workflows set at the organization or enterprise levels, then you cannot override any of the allowed actions and reusable workflows settings.

To use the `patterns_allowed` setting for private repositories, the repository must belong to an enterprise. If the repository does not belong to an enterprise, then the `patterns_allowed` setting only applies to public repositories.

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#set-allowed-actions-for-a-repository](https://docs.github.com/rest/reference/actions#set-allowed-actions-for-a-repository)

```java
CompletableFuture<Void> actionsSetAllowedActionsRepositoryAsync(
    final String owner,
    final String repo,
    final SelectedActions body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`SelectedActions`](../../doc/models/selected-actions.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
SelectedActions body = new SelectedActions();
body.setGithubOwnedAllowed(true);
body.setVerifiedAllowed(false);
List<String> patternsAllowed = new LinkedList<>();
patternsAllowed.add("monalisa/octocat@*");
patternsAllowed.add("docker/*");

body.setPatternsAllowed(patternsAllowed);

actionsController.actionsSetAllowedActionsRepositoryAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Github-Actions-Default-Workflow-Permissions-Repository

Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository,
as well as if GitHub Actions can submit approving pull request reviews.
For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#get-default-workflow-permissions-for-a-repository](https://docs.github.com/rest/reference/actions#get-default-workflow-permissions-for-a-repository)

```java
CompletableFuture<ActionsGetDefaultWorkflowPermissions> actionsGetGithubActionsDefaultWorkflowPermissionsRepositoryAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ActionsGetDefaultWorkflowPermissions`](../../doc/models/actions-get-default-workflow-permissions.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsGetGithubActionsDefaultWorkflowPermissionsRepositoryAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "default_workflow_permissions": "read",
  "can_approve_pull_request_reviews": true
}
```


# Actions Set-Github-Actions-Default-Workflow-Permissions-Repository

Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository, and sets if GitHub Actions
can submit approving pull request reviews.
For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.

API method documentation: [https://docs.github.com/rest/reference/actions#set-default-workflow-permissions-for-a-repository](https://docs.github.com/rest/reference/actions#set-default-workflow-permissions-for-a-repository)

```java
CompletableFuture<Void> actionsSetGithubActionsDefaultWorkflowPermissionsRepositoryAsync(
    final String owner,
    final String repo,
    final ActionsSetDefaultWorkflowPermissions body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ActionsSetDefaultWorkflowPermissions`](../../doc/models/actions-set-default-workflow-permissions.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ActionsSetDefaultWorkflowPermissions body = new ActionsSetDefaultWorkflowPermissions();
body.setDefaultWorkflowPermissions(ActionsDefaultWorkflowPermissionsEnum.READ);
body.setCanApprovePullRequestReviews(true);

actionsController.actionsSetGithubActionsDefaultWorkflowPermissionsRepositoryAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict response when changing a setting is prevented by the owning organization or enterprise | `ApiException` |


# Actions List-Required-Workflow-Runs

List all workflow runs for a required workflow. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).

Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."

API method documentation: [https://docs.github.com/rest/reference/actions#list-required-workflow-runs](https://docs.github.com/rest/reference/actions#list-required-workflow-runs)

```java
CompletableFuture<ReposActionsRequiredWorkflowsRequiredWorkflowIdForRepoRunsResponse> actionsListRequiredWorkflowRunsAsync(
    final String owner,
    final String repo,
    final int requiredWorkflowIdForRepo,
    final String actor,
    final String branch,
    final String event,
    final Status81Enum status,
    final Integer perPage,
    final Integer page,
    final LocalDateTime created,
    final Boolean excludePullRequests,
    final Integer checkSuiteId,
    final String headSha)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `requiredWorkflowIdForRepo` | `int` | Template, Required | The ID of the required workflow that has run at least once in a repository. |
| `actor` | `String` | Query, Optional | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. |
| `branch` | `String` | Query, Optional | Returns workflow runs associated with a branch. Use the name of the branch of the `push`. |
| `event` | `String` | Query, Optional | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)." |
| `status` | [`Status81Enum`](../../doc/models/status-81-enum.md) | Query, Optional | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `created` | `LocalDateTime` | Query, Optional | Returns workflow runs created within the given date-time range. For more information on the syntax, see "[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates)." |
| `excludePullRequests` | `Boolean` | Query, Optional | If `true` pull requests are omitted from the response (empty array).<br>**Default**: `false` |
| `checkSuiteId` | `Integer` | Query, Optional | Returns workflow runs with the `check_suite_id` that you specify. |
| `headSha` | `String` | Query, Optional | Only returns workflow runs that are associated with the specified `head_sha`. |

## Response Type

[`ReposActionsRequiredWorkflowsRequiredWorkflowIdForRepoRunsResponse`](../../doc/models/repos-actions-required-workflows-required-workflow-id-for-repo-runs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int requiredWorkflowIdForRepo = 38;
Integer perPage = 30;
Integer page = 1;
Boolean excludePullRequests = false;

actionsController.actionsListRequiredWorkflowRunsAsync(owner, repo, requiredWorkflowIdForRepo, null, null, null, null, perPage, page, null, excludePullRequests, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Self-Hosted-Runners-for-Repo

Lists all self-hosted runners configured in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-self-hosted-runners-for-a-repository](https://docs.github.com/rest/reference/actions#list-self-hosted-runners-for-a-repository)

```java
CompletableFuture<OrgsActionsRunnersResponse> actionsListSelfHostedRunnersForRepoAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsActionsRunnersResponse`](../../doc/models/orgs-actions-runners-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListSelfHostedRunnersForRepoAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "runners": [
    {
      "id": 23,
      "name": "linux_runner",
      "os": "linux",
      "status": "online",
      "busy": true,
      "labels": [
        {
          "id": 5,
          "name": "self-hosted",
          "type": "read-only"
        },
        {
          "id": 7,
          "name": "X64",
          "type": "read-only"
        },
        {
          "id": 11,
          "name": "Linux",
          "type": "read-only"
        }
      ]
    },
    {
      "id": 24,
      "name": "mac_runner",
      "os": "macos",
      "status": "offline",
      "busy": false,
      "labels": [
        {
          "id": 5,
          "name": "self-hosted",
          "type": "read-only"
        },
        {
          "id": 7,
          "name": "X64",
          "type": "read-only"
        },
        {
          "id": 20,
          "name": "macOS",
          "type": "read-only"
        },
        {
          "id": 21,
          "name": "no-gpu",
          "type": "custom"
        }
      ]
    }
  ]
}
```


# Actions List-Runner-Applications-for-Repo

Lists binaries for the runner application that you can download and run.

You must authenticate using an access token with the `repo` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-runner-applications-for-a-repository](https://docs.github.com/rest/reference/actions#list-runner-applications-for-a-repository)

```java
CompletableFuture<List<RunnerApplication>> actionsListRunnerApplicationsForRepoAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`List<RunnerApplication>`](../../doc/models/runner-application.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsListRunnerApplicationsForRepoAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "os": "osx",
    "architecture": "x64",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-osx-x64-2.164.0.tar.gz",
    "filename": "actions-runner-osx-x64-2.164.0.tar.gz"
  },
  {
    "os": "linux",
    "architecture": "x64",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-linux-x64-2.164.0.tar.gz",
    "filename": "actions-runner-linux-x64-2.164.0.tar.gz"
  },
  {
    "os": "linux",
    "architecture": "arm",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-linux-arm-2.164.0.tar.gz",
    "filename": "actions-runner-linux-arm-2.164.0.tar.gz"
  },
  {
    "os": "win",
    "architecture": "x64",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-win-x64-2.164.0.zip",
    "filename": "actions-runner-win-x64-2.164.0.zip"
  },
  {
    "os": "linux",
    "architecture": "arm64",
    "download_url": "https://github.com/actions/runner/releases/download/v2.164.0/actions-runner-linux-arm64-2.164.0.tar.gz",
    "filename": "actions-runner-linux-arm64-2.164.0.tar.gz"
  }
]
```


# Actions Create-Registration-Token-for-Repo

Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate
using an access token with the `repo` scope to use this endpoint.

#### Example using registration token

Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.

```
./config.sh --url https://github.com/octo-org/octo-repo-artifacts --token TOKEN
```

API method documentation: [https://docs.github.com/rest/reference/actions#create-a-registration-token-for-a-repository](https://docs.github.com/rest/reference/actions#create-a-registration-token-for-a-repository)

```java
CompletableFuture<ReposActionsRunnersRegistrationTokenResponse> actionsCreateRegistrationTokenForRepoAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposActionsRunnersRegistrationTokenResponse`](../../doc/models/repos-actions-runners-registration-token-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsCreateRegistrationTokenForRepoAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "LLBF3JGZDX3P5PMEXLND6TS6FCWO6",
  "expires_at": "2020-01-22T12:13:35.123-08:00"
}
```


# Actions Create-Remove-Token-for-Repo

Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour.
You must authenticate using an access token with the `repo` scope to use this endpoint.

#### Example using remove token

To remove your self-hosted runner from a repository, replace TOKEN with the remove token provided by this endpoint.

```
./config.sh remove --token TOKEN
```

API method documentation: [https://docs.github.com/rest/reference/actions#create-a-remove-token-for-a-repository](https://docs.github.com/rest/reference/actions#create-a-remove-token-for-a-repository)

```java
CompletableFuture<ReposActionsRunnersRemoveTokenResponse> actionsCreateRemoveTokenForRepoAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposActionsRunnersRemoveTokenResponse`](../../doc/models/repos-actions-runners-remove-token-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsCreateRemoveTokenForRepoAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "token": "AABF3JGZDX3P5PMEXLND6TS6FCWO6",
  "expires_at": "2020-01-29T12:13:35.123-08:00"
}
```


# Actions Get-Self-Hosted-Runner-for-Repo

Gets a specific self-hosted runner configured in a repository.

You must authenticate using an access token with the `repo` scope to use this
endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-self-hosted-runner-for-a-repository](https://docs.github.com/rest/reference/actions#get-a-self-hosted-runner-for-a-repository)

```java
CompletableFuture<ReposActionsRunnersRunnerIdResponse> actionsGetSelfHostedRunnerForRepoAsync(
    final String owner,
    final String repo,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

[`ReposActionsRunnersRunnerIdResponse`](../../doc/models/repos-actions-runners-runner-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runnerId = 22;

actionsController.actionsGetSelfHostedRunnerForRepoAsync(owner, repo, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 23,
  "name": "MBP",
  "os": "macos",
  "status": "online",
  "busy": true,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```


# Actions Delete-Self-Hosted-Runner-From-Repo

Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.

You must authenticate using an access token with the `repo`
scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-a-self-hosted-runner-from-a-repository](https://docs.github.com/rest/reference/actions#delete-a-self-hosted-runner-from-a-repository)

```java
CompletableFuture<Void> actionsDeleteSelfHostedRunnerFromRepoAsync(
    final String owner,
    final String repo,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runnerId = 22;

actionsController.actionsDeleteSelfHostedRunnerFromRepoAsync(owner, repo, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Labels-for-Self-Hosted-Runner-for-Repo

Lists all labels for a self-hosted runner configured in a repository.

You must authenticate using an access token with the `repo` scope to use this
endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-labels-for-a-self-hosted-runner-for-a-repository](https://docs.github.com/rest/reference/actions#list-labels-for-a-self-hosted-runner-for-a-repository)

```java
CompletableFuture<ActionsRunnerLabels> actionsListLabelsForSelfHostedRunnerForRepoAsync(
    final String owner,
    final String repo,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runnerId = 22;

actionsController.actionsListLabelsForSelfHostedRunnerForRepoAsync(owner, repo, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRunnersRunnerIdLabels404ErrorException`](../../doc/models/repos-actions-runners-runner-id-labels-404-error-exception.md) |


# Actions Add-Custom-Labels-to-Self-Hosted-Runner-for-Repo

Add custom labels to a self-hosted runner configured in a repository.

You must authenticate using an access token with the `repo` scope to use this
endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#add-custom-labels-to-a-self-hosted-runner-for-a-repository](https://docs.github.com/rest/reference/actions#add-custom-labels-to-a-self-hosted-runner-for-a-repository)

```java
CompletableFuture<ActionsRunnerLabels> actionsAddCustomLabelsToSelfHostedRunnerForRepoAsync(
    final String owner,
    final String repo,
    final int runnerId,
    final EnterprisesActionsRunnersLabelsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |
| `body` | [`EnterprisesActionsRunnersLabelsRequest`](../../doc/models/enterprises-actions-runners-labels-request.md) | Body, Required | - |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runnerId = 22;
EnterprisesActionsRunnersLabelsRequest body = new EnterprisesActionsRunnersLabelsRequest();
List<String> labels = new LinkedList<>();
labels.add("gpu");
labels.add("accelerated");

body.setLabels(labels);

actionsController.actionsAddCustomLabelsToSelfHostedRunnerForRepoAsync(owner, repo, runnerId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRunnersRunnerIdLabels404ErrorException`](../../doc/models/repos-actions-runners-runner-id-labels-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposActionsRunnersRunnerIdLabels422ErrorException`](../../doc/models/repos-actions-runners-runner-id-labels-422-error-exception.md) |


# Actions Set-Custom-Labels-for-Self-Hosted-Runner-for-Repo

Remove all previous custom labels and set the new custom labels for a specific
self-hosted runner configured in a repository.

You must authenticate using an access token with the `repo` scope to use this
endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#set-custom-labels-for-a-self-hosted-runner-for-a-repository](https://docs.github.com/rest/reference/actions#set-custom-labels-for-a-self-hosted-runner-for-a-repository)

```java
CompletableFuture<ActionsRunnerLabels> actionsSetCustomLabelsForSelfHostedRunnerForRepoAsync(
    final String owner,
    final String repo,
    final int runnerId,
    final OrgsActionsRunnersLabelsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |
| `body` | [`OrgsActionsRunnersLabelsRequest1`](../../doc/models/orgs-actions-runners-labels-request-1.md) | Body, Required | - |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runnerId = 22;
OrgsActionsRunnersLabelsRequest1 body = new OrgsActionsRunnersLabelsRequest1();
List<String> labels = new LinkedList<>();
labels.add("gpu");
labels.add("accelerated");

body.setLabels(labels);

actionsController.actionsSetCustomLabelsForSelfHostedRunnerForRepoAsync(owner, repo, runnerId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRunnersRunnerIdLabels404ErrorException`](../../doc/models/repos-actions-runners-runner-id-labels-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposActionsRunnersRunnerIdLabels422ErrorException`](../../doc/models/repos-actions-runners-runner-id-labels-422-error-exception.md) |


# Actions Remove-All-Custom-Labels-From-Self-Hosted-Runner-for-Repo

Remove all custom labels from a self-hosted runner configured in a
repository. Returns the remaining read-only labels from the runner.

You must authenticate using an access token with the `repo` scope to use this
endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#remove-all-custom-labels-from-a-self-hosted-runner-for-a-repository](https://docs.github.com/rest/reference/actions#remove-all-custom-labels-from-a-self-hosted-runner-for-a-repository)

```java
CompletableFuture<ActionsRunnerLabels> actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepoAsync(
    final String owner,
    final String repo,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runnerId = 22;

actionsController.actionsRemoveAllCustomLabelsFromSelfHostedRunnerForRepoAsync(owner, repo, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 3,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRunnersRunnerIdLabels404ErrorException`](../../doc/models/repos-actions-runners-runner-id-labels-404-error-exception.md) |


# Actions Remove-Custom-Label-From-Self-Hosted-Runner-for-Repo

Remove a custom label from a self-hosted runner configured
in a repository. Returns the remaining labels from the runner.

This endpoint returns a `404 Not Found` status if the custom label is not
present on the runner.

You must authenticate using an access token with the `repo` scope to use this
endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#remove-a-custom-label-from-a-self-hosted-runner-for-a-repository](https://docs.github.com/rest/reference/actions#remove-a-custom-label-from-a-self-hosted-runner-for-a-repository)

```java
CompletableFuture<ActionsRunnerLabels> actionsRemoveCustomLabelFromSelfHostedRunnerForRepoAsync(
    final String owner,
    final String repo,
    final int runnerId,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |
| `name` | `String` | Template, Required | The name of a self-hosted runner's custom label. |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runnerId = 22;
String name = "name0";

actionsController.actionsRemoveCustomLabelFromSelfHostedRunnerForRepoAsync(owner, repo, runnerId, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRunnersRunnerIdLabelsName404ErrorException`](../../doc/models/repos-actions-runners-runner-id-labels-name-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposActionsRunnersRunnerIdLabelsName422ErrorException`](../../doc/models/repos-actions-runners-runner-id-labels-name-422-error-exception.md) |


# Actions List-Workflow-Runs-for-Repo

Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).

Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-workflow-runs-for-a-repository](https://docs.github.com/rest/reference/actions#list-workflow-runs-for-a-repository)

```java
CompletableFuture<ReposActionsRunsResponse> actionsListWorkflowRunsForRepoAsync(
    final String owner,
    final String repo,
    final String actor,
    final String branch,
    final String event,
    final Status81Enum status,
    final Integer perPage,
    final Integer page,
    final LocalDateTime created,
    final Boolean excludePullRequests,
    final Integer checkSuiteId,
    final String headSha)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `actor` | `String` | Query, Optional | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. |
| `branch` | `String` | Query, Optional | Returns workflow runs associated with a branch. Use the name of the branch of the `push`. |
| `event` | `String` | Query, Optional | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)." |
| `status` | [`Status81Enum`](../../doc/models/status-81-enum.md) | Query, Optional | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `created` | `LocalDateTime` | Query, Optional | Returns workflow runs created within the given date-time range. For more information on the syntax, see "[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates)." |
| `excludePullRequests` | `Boolean` | Query, Optional | If `true` pull requests are omitted from the response (empty array).<br>**Default**: `false` |
| `checkSuiteId` | `Integer` | Query, Optional | Returns workflow runs with the `check_suite_id` that you specify. |
| `headSha` | `String` | Query, Optional | Only returns workflow runs that are associated with the specified `head_sha`. |

## Response Type

[`ReposActionsRunsResponse`](../../doc/models/repos-actions-runs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;
Boolean excludePullRequests = false;

actionsController.actionsListWorkflowRunsForRepoAsync(owner, repo, null, null, null, null, perPage, page, null, excludePullRequests, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Workflow-Run

Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-workflow-run](https://docs.github.com/rest/reference/actions#get-a-workflow-run)

```java
CompletableFuture<ReposActionsRunsRunIdResponse> actionsGetWorkflowRunAsync(
    final String owner,
    final String repo,
    final int runId,
    final Boolean excludePullRequests)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `excludePullRequests` | `Boolean` | Query, Optional | If `true` pull requests are omitted from the response (empty array).<br>**Default**: `false` |

## Response Type

[`ReposActionsRunsRunIdResponse`](../../doc/models/repos-actions-runs-run-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;
Boolean excludePullRequests = false;

actionsController.actionsGetWorkflowRunAsync(owner, repo, runId, excludePullRequests).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 30433642,
  "name": "Build",
  "node_id": "MDEyOldvcmtmbG93IFJ1bjI2OTI4OQ==",
  "check_suite_id": 42,
  "check_suite_node_id": "MDEwOkNoZWNrU3VpdGU0Mg==",
  "head_branch": "main",
  "head_sha": "acb5820ced9479c074f688cc328bf03f341a511d",
  "path": ".github/workflows/build.yml@main",
  "run_number": 562,
  "event": "push",
  "display_title": "Update README.md",
  "status": "queued",
  "conclusion": null,
  "workflow_id": 159038,
  "url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642",
  "html_url": "https://github.com/octo-org/octo-repo/actions/runs/30433642",
  "pull_requests": [],
  "created_at": "2020-01-22T19:33:08Z",
  "updated_at": "2020-01-22T19:33:08Z",
  "actor": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  },
  "run_attempt": 1,
  "referenced_workflows": [
    {
      "path": "octocat/Hello-World/.github/workflows/deploy.yml@main",
      "sha": "86e8bc9ecf7d38b1ed2d2cfb8eb87ba9b35b01db",
      "ref": "refs/heads/main"
    },
    {
      "path": "octo-org/octo-repo/.github/workflows/report.yml@v2",
      "sha": "79e9790903e1c3373b1a3e3a941d57405478a232",
      "ref": "refs/tags/v2"
    },
    {
      "path": "octo-org/octo-repo/.github/workflows/secure.yml@1595d4b6de6a9e9751fb270a41019ce507d4099e",
      "sha": "1595d4b6de6a9e9751fb270a41019ce507d4099e"
    }
  ],
  "run_started_at": "2020-01-22T19:33:08Z",
  "triggering_actor": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  },
  "jobs_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/jobs",
  "logs_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/logs",
  "check_suite_url": "https://api.github.com/repos/octo-org/octo-repo/check-suites/414944374",
  "artifacts_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/artifacts",
  "cancel_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/cancel",
  "rerun_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/rerun",
  "previous_attempt_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/attempts/1",
  "workflow_url": "https://api.github.com/repos/octo-org/octo-repo/actions/workflows/159038",
  "head_commit": {
    "id": "acb5820ced9479c074f688cc328bf03f341a511d",
    "tree_id": "d23f6eedb1e1b9610bbc754ddb5197bfe7271223",
    "message": "Create linter.yaml",
    "timestamp": "2020-01-22T19:33:05Z",
    "author": {
      "name": "Octo Cat",
      "email": "octocat@github.com"
    },
    "committer": {
      "name": "GitHub",
      "email": "noreply@github.com"
    }
  },
  "repository": {
    "id": 1296269,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Hello-World",
    "full_name": "octocat/Hello-World",
    "owner": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/octocat/Hello-World",
    "description": "This your first repo!",
    "fork": false,
    "url": "https://api.github.com/repos/octocat/Hello-World",
    "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
    "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
    "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
    "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
    "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
    "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
    "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
    "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
    "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
    "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
    "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
    "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
    "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
    "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
    "git_url": "git:github.com/octocat/Hello-World.git",
    "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
    "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
    "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
    "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
    "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
    "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
    "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
    "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
    "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
  },
  "head_repository": {
    "id": 217723378,
    "node_id": "MDEwOlJlcG9zaXRvcnkyMTc3MjMzNzg=",
    "name": "octo-repo",
    "full_name": "octo-org/octo-repo",
    "private": true,
    "owner": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "html_url": "https://github.com/octo-org/octo-repo",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/octo-org/octo-repo",
    "forks_url": "https://api.github.com/repos/octo-org/octo-repo/forks",
    "keys_url": "https://api.github.com/repos/octo-org/octo-repo/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/octo-org/octo-repo/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/octo-org/octo-repo/teams",
    "hooks_url": "https://api.github.com/repos/octo-org/octo-repo/hooks",
    "issue_events_url": "https://api.github.com/repos/octo-org/octo-repo/issues/events{/number}",
    "events_url": "https://api.github.com/repos/octo-org/octo-repo/events",
    "assignees_url": "https://api.github.com/repos/octo-org/octo-repo/assignees{/user}",
    "branches_url": "https://api.github.com/repos/octo-org/octo-repo/branches{/branch}",
    "tags_url": "https://api.github.com/repos/octo-org/octo-repo/tags",
    "blobs_url": "https://api.github.com/repos/octo-org/octo-repo/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octo-org/octo-repo/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/octo-org/octo-repo/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/octo-org/octo-repo/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/octo-org/octo-repo/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/octo-org/octo-repo/languages",
    "stargazers_url": "https://api.github.com/repos/octo-org/octo-repo/stargazers",
    "contributors_url": "https://api.github.com/repos/octo-org/octo-repo/contributors",
    "subscribers_url": "https://api.github.com/repos/octo-org/octo-repo/subscribers",
    "subscription_url": "https://api.github.com/repos/octo-org/octo-repo/subscription",
    "commits_url": "https://api.github.com/repos/octo-org/octo-repo/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/octo-org/octo-repo/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/octo-org/octo-repo/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/octo-org/octo-repo/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/octo-org/octo-repo/contents/{+path}",
    "compare_url": "https://api.github.com/repos/octo-org/octo-repo/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/octo-org/octo-repo/merges",
    "archive_url": "https://api.github.com/repos/octo-org/octo-repo/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/octo-org/octo-repo/downloads",
    "issues_url": "https://api.github.com/repos/octo-org/octo-repo/issues{/number}",
    "pulls_url": "https://api.github.com/repos/octo-org/octo-repo/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/octo-org/octo-repo/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octo-org/octo-repo/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/octo-org/octo-repo/labels{/name}",
    "releases_url": "https://api.github.com/repos/octo-org/octo-repo/releases{/id}",
    "deployments_url": "https://api.github.com/repos/octo-org/octo-repo/deployments"
  }
}
```


# Actions Delete-Workflow-Run

Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is
private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use
this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-a-workflow-run](https://docs.github.com/rest/reference/actions#delete-a-workflow-run)

```java
CompletableFuture<Void> actionsDeleteWorkflowRunAsync(
    final String owner,
    final String repo,
    final int runId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsDeleteWorkflowRunAsync(owner, repo, runId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Reviews-for-Run

Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-the-review-history-for-a-workflow-run](https://docs.github.com/rest/reference/actions#get-the-review-history-for-a-workflow-run)

```java
CompletableFuture<List<EnvironmentApproval>> actionsGetReviewsForRunAsync(
    final String owner,
    final String repo,
    final int runId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |

## Response Type

[`List<EnvironmentApproval>`](../../doc/models/environment-approval.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsGetReviewsForRunAsync(owner, repo, runId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "state": "approved",
    "comment": "Ship it!",
    "environments": [
      {
        "id": 161088068,
        "node_id": "MDExOkVudmlyb25tZW50MTYxMDg4MDY4",
        "name": "staging",
        "url": "https://api.github.com/repos/github/hello-world/environments/staging",
        "html_url": "https://github.com/github/hello-world/deployments/activity_log?environments_filter=staging",
        "created_at": "2020-11-23T22:00:40Z",
        "updated_at": "2020-11-23T22:00:40Z"
      }
    ],
    "user": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    }
  }
]
```


# Actions Approve-Workflow-Run

Approves a workflow run for a pull request from a public fork of a first time contributor. For more information, see ["Approving workflow runs from public forks](https://docs.github.com/actions/managing-workflow-runs/approving-workflow-runs-from-public-forks)."

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#approve-a-workflow-run-for-a-fork-pull-request](https://docs.github.com/rest/reference/actions#approve-a-workflow-run-for-a-fork-pull-request)

```java
CompletableFuture<Object> actionsApproveWorkflowRunAsync(
    final String owner,
    final String repo,
    final int runId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsApproveWorkflowRunAsync(owner, repo, runId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposActionsRunsRunIdApprove403ErrorException`](../../doc/models/repos-actions-runs-run-id-approve-403-error-exception.md) |
| 404 | Resource not found | [`ReposActionsRunsRunIdApprove404ErrorException`](../../doc/models/repos-actions-runs-run-id-approve-404-error-exception.md) |


# Actions List-Workflow-Run-Artifacts

Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-workflow-run-artifacts](https://docs.github.com/rest/reference/actions#list-workflow-run-artifacts)

```java
CompletableFuture<ReposActionsArtifactsResponse> actionsListWorkflowRunArtifactsAsync(
    final String owner,
    final String repo,
    final int runId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsArtifactsResponse`](../../doc/models/repos-actions-artifacts-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListWorkflowRunArtifactsAsync(owner, repo, runId, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "artifacts": [
    {
      "id": 11,
      "node_id": "MDg6QXJ0aWZhY3QxMQ==",
      "name": "Rails",
      "size_in_bytes": 556,
      "url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/11",
      "archive_download_url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/11/zip",
      "expired": false,
      "created_at": "2020-01-10T14:59:22Z",
      "expires_at": "2020-03-21T14:59:22Z",
      "updated_at": "2020-02-21T14:59:22Z",
      "workflow_run": {
        "id": 2332938,
        "repository_id": 1296269,
        "head_repository_id": 1296269,
        "head_branch": "main",
        "head_sha": "328faa0536e6fef19753d9d91dc96a9931694ce3"
      }
    },
    {
      "id": 13,
      "node_id": "MDg6QXJ0aWZhY3QxMw==",
      "name": "Test output",
      "size_in_bytes": 453,
      "url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/13",
      "archive_download_url": "https://api.github.com/repos/octo-org/octo-docs/actions/artifacts/13/zip",
      "expired": false,
      "created_at": "2020-01-10T14:59:22Z",
      "expires_at": "2020-03-21T14:59:22Z",
      "updated_at": "2020-02-21T14:59:22Z",
      "workflow_run": {
        "id": 2332942,
        "repository_id": 1296269,
        "head_repository_id": 1296269,
        "head_branch": "main",
        "head_sha": "178f4f6090b3fccad4a65b3e83d076a622d59652"
      }
    }
  ]
}
```


# Actions Get-Workflow-Run-Attempt

Gets a specific workflow run attempt. Anyone with read access to the repository
can use this endpoint. If the repository is private you must use an access token
with the `repo` scope. GitHub Apps must have the `actions:read` permission to
use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-workflow-run-attempt](https://docs.github.com/rest/reference/actions#get-a-workflow-run-attempt)

```java
CompletableFuture<ReposActionsRunsRunIdAttemptsAttemptNumberResponse> actionsGetWorkflowRunAttemptAsync(
    final String owner,
    final String repo,
    final int runId,
    final int attemptNumber,
    final Boolean excludePullRequests)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `attemptNumber` | `int` | Template, Required | The attempt number of the workflow run. |
| `excludePullRequests` | `Boolean` | Query, Optional | If `true` pull requests are omitted from the response (empty array).<br>**Default**: `false` |

## Response Type

[`ReposActionsRunsRunIdAttemptsAttemptNumberResponse`](../../doc/models/repos-actions-runs-run-id-attempts-attempt-number-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;
int attemptNumber = 172;
Boolean excludePullRequests = false;

actionsController.actionsGetWorkflowRunAttemptAsync(owner, repo, runId, attemptNumber, excludePullRequests).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 30433642,
  "name": "Build",
  "node_id": "MDEyOldvcmtmbG93IFJ1bjI2OTI4OQ==",
  "check_suite_id": 42,
  "check_suite_node_id": "MDEwOkNoZWNrU3VpdGU0Mg==",
  "head_branch": "main",
  "head_sha": "acb5820ced9479c074f688cc328bf03f341a511d",
  "path": ".github/workflows/build.yml@main",
  "run_number": 562,
  "event": "push",
  "display_title": "Update README.md",
  "status": "queued",
  "conclusion": null,
  "workflow_id": 159038,
  "url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642",
  "html_url": "https://github.com/octo-org/octo-repo/actions/runs/30433642",
  "pull_requests": [],
  "created_at": "2020-01-22T19:33:08Z",
  "updated_at": "2020-01-22T19:33:08Z",
  "actor": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  },
  "run_attempt": 1,
  "referenced_workflows": [
    {
      "path": "octocat/Hello-World/.github/workflows/deploy.yml@main",
      "sha": "86e8bc9ecf7d38b1ed2d2cfb8eb87ba9b35b01db",
      "ref": "refs/heads/main"
    },
    {
      "path": "octo-org/octo-repo/.github/workflows/report.yml@v2",
      "sha": "79e9790903e1c3373b1a3e3a941d57405478a232",
      "ref": "refs/tags/v2"
    },
    {
      "path": "octo-org/octo-repo/.github/workflows/secure.yml@1595d4b6de6a9e9751fb270a41019ce507d4099e",
      "sha": "1595d4b6de6a9e9751fb270a41019ce507d4099e"
    }
  ],
  "run_started_at": "2020-01-22T19:33:08Z",
  "triggering_actor": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  },
  "jobs_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/jobs",
  "logs_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/logs",
  "check_suite_url": "https://api.github.com/repos/octo-org/octo-repo/check-suites/414944374",
  "artifacts_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/artifacts",
  "cancel_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/cancel",
  "rerun_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/rerun",
  "previous_attempt_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/30433642/attempts/1",
  "workflow_url": "https://api.github.com/repos/octo-org/octo-repo/actions/workflows/159038",
  "head_commit": {
    "id": "acb5820ced9479c074f688cc328bf03f341a511d",
    "tree_id": "d23f6eedb1e1b9610bbc754ddb5197bfe7271223",
    "message": "Create linter.yaml",
    "timestamp": "2020-01-22T19:33:05Z",
    "author": {
      "name": "Octo Cat",
      "email": "octocat@github.com"
    },
    "committer": {
      "name": "GitHub",
      "email": "noreply@github.com"
    }
  },
  "repository": {
    "id": 1296269,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Hello-World",
    "full_name": "octocat/Hello-World",
    "owner": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "private": false,
    "html_url": "https://github.com/octocat/Hello-World",
    "description": "This your first repo!",
    "fork": false,
    "url": "https://api.github.com/repos/octocat/Hello-World",
    "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
    "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
    "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
    "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
    "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
    "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
    "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
    "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
    "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
    "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
    "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
    "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
    "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
    "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
    "git_url": "git:github.com/octocat/Hello-World.git",
    "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
    "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
    "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
    "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
    "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
    "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
    "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
    "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
    "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
  },
  "head_repository": {
    "id": 217723378,
    "node_id": "MDEwOlJlcG9zaXRvcnkyMTc3MjMzNzg=",
    "name": "octo-repo",
    "full_name": "octo-org/octo-repo",
    "private": true,
    "owner": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "html_url": "https://github.com/octo-org/octo-repo",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/octo-org/octo-repo",
    "forks_url": "https://api.github.com/repos/octo-org/octo-repo/forks",
    "keys_url": "https://api.github.com/repos/octo-org/octo-repo/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/octo-org/octo-repo/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/octo-org/octo-repo/teams",
    "hooks_url": "https://api.github.com/repos/octo-org/octo-repo/hooks",
    "issue_events_url": "https://api.github.com/repos/octo-org/octo-repo/issues/events{/number}",
    "events_url": "https://api.github.com/repos/octo-org/octo-repo/events",
    "assignees_url": "https://api.github.com/repos/octo-org/octo-repo/assignees{/user}",
    "branches_url": "https://api.github.com/repos/octo-org/octo-repo/branches{/branch}",
    "tags_url": "https://api.github.com/repos/octo-org/octo-repo/tags",
    "blobs_url": "https://api.github.com/repos/octo-org/octo-repo/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octo-org/octo-repo/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/octo-org/octo-repo/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/octo-org/octo-repo/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/octo-org/octo-repo/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/octo-org/octo-repo/languages",
    "stargazers_url": "https://api.github.com/repos/octo-org/octo-repo/stargazers",
    "contributors_url": "https://api.github.com/repos/octo-org/octo-repo/contributors",
    "subscribers_url": "https://api.github.com/repos/octo-org/octo-repo/subscribers",
    "subscription_url": "https://api.github.com/repos/octo-org/octo-repo/subscription",
    "commits_url": "https://api.github.com/repos/octo-org/octo-repo/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/octo-org/octo-repo/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/octo-org/octo-repo/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/octo-org/octo-repo/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/octo-org/octo-repo/contents/{+path}",
    "compare_url": "https://api.github.com/repos/octo-org/octo-repo/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/octo-org/octo-repo/merges",
    "archive_url": "https://api.github.com/repos/octo-org/octo-repo/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/octo-org/octo-repo/downloads",
    "issues_url": "https://api.github.com/repos/octo-org/octo-repo/issues{/number}",
    "pulls_url": "https://api.github.com/repos/octo-org/octo-repo/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/octo-org/octo-repo/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octo-org/octo-repo/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/octo-org/octo-repo/labels{/name}",
    "releases_url": "https://api.github.com/repos/octo-org/octo-repo/releases{/id}",
    "deployments_url": "https://api.github.com/repos/octo-org/octo-repo/deployments"
  }
}
```


# Actions List-Jobs-for-Workflow-Run-Attempt

Lists jobs for a specific workflow run attempt. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).

API method documentation: [https://docs.github.com/rest/reference/actions#list-jobs-for-a-workflow-run-attempt](https://docs.github.com/rest/reference/actions#list-jobs-for-a-workflow-run-attempt)

```java
CompletableFuture<ReposActionsRunsRunIdAttemptsAttemptNumberJobsResponse> actionsListJobsForWorkflowRunAttemptAsync(
    final String owner,
    final String repo,
    final int runId,
    final int attemptNumber,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `attemptNumber` | `int` | Template, Required | The attempt number of the workflow run. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsRunsRunIdAttemptsAttemptNumberJobsResponse`](../../doc/models/repos-actions-runs-run-id-attempts-attempt-number-jobs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;
int attemptNumber = 172;
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListJobsForWorkflowRunAttemptAsync(owner, repo, runId, attemptNumber, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "jobs": [
    {
      "id": 399444496,
      "run_id": 29679449,
      "run_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/29679449",
      "node_id": "MDEyOldvcmtmbG93IEpvYjM5OTQ0NDQ5Ng==",
      "head_sha": "f83a356604ae3c5d03e1b46ef4d1ca77d64a90b0",
      "url": "https://api.github.com/repos/octo-org/octo-repo/actions/jobs/399444496",
      "html_url": "https://github.com/octo-org/octo-repo/runs/399444496",
      "status": "completed",
      "conclusion": "success",
      "started_at": "2020-01-20T17:42:40Z",
      "completed_at": "2020-01-20T17:44:39Z",
      "name": "build",
      "steps": [
        {
          "name": "Set up job",
          "status": "completed",
          "conclusion": "success",
          "number": 1,
          "started_at": "2020-01-20T09:42:40.000-08:00",
          "completed_at": "2020-01-20T09:42:41.000-08:00"
        },
        {
          "name": "Run actions/checkout@v2",
          "status": "completed",
          "conclusion": "success",
          "number": 2,
          "started_at": "2020-01-20T09:42:41.000-08:00",
          "completed_at": "2020-01-20T09:42:45.000-08:00"
        },
        {
          "name": "Set up Ruby",
          "status": "completed",
          "conclusion": "success",
          "number": 3,
          "started_at": "2020-01-20T09:42:45.000-08:00",
          "completed_at": "2020-01-20T09:42:45.000-08:00"
        },
        {
          "name": "Run actions/cache@v3",
          "status": "completed",
          "conclusion": "success",
          "number": 4,
          "started_at": "2020-01-20T09:42:45.000-08:00",
          "completed_at": "2020-01-20T09:42:48.000-08:00"
        },
        {
          "name": "Install Bundler",
          "status": "completed",
          "conclusion": "success",
          "number": 5,
          "started_at": "2020-01-20T09:42:48.000-08:00",
          "completed_at": "2020-01-20T09:42:52.000-08:00"
        },
        {
          "name": "Install Gems",
          "status": "completed",
          "conclusion": "success",
          "number": 6,
          "started_at": "2020-01-20T09:42:52.000-08:00",
          "completed_at": "2020-01-20T09:42:53.000-08:00"
        },
        {
          "name": "Run Tests",
          "status": "completed",
          "conclusion": "success",
          "number": 7,
          "started_at": "2020-01-20T09:42:53.000-08:00",
          "completed_at": "2020-01-20T09:42:59.000-08:00"
        },
        {
          "name": "Deploy to Heroku",
          "status": "completed",
          "conclusion": "success",
          "number": 8,
          "started_at": "2020-01-20T09:42:59.000-08:00",
          "completed_at": "2020-01-20T09:44:39.000-08:00"
        },
        {
          "name": "Post actions/cache@v3",
          "status": "completed",
          "conclusion": "success",
          "number": 16,
          "started_at": "2020-01-20T09:44:39.000-08:00",
          "completed_at": "2020-01-20T09:44:39.000-08:00"
        },
        {
          "name": "Complete job",
          "status": "completed",
          "conclusion": "success",
          "number": 17,
          "started_at": "2020-01-20T09:44:39.000-08:00",
          "completed_at": "2020-01-20T09:44:39.000-08:00"
        }
      ],
      "check_run_url": "https://api.github.com/repos/octo-org/octo-repo/check-runs/399444496",
      "labels": [
        "self-hosted",
        "foo",
        "bar"
      ],
      "runner_id": 1,
      "runner_name": "my runner",
      "runner_group_id": 2,
      "runner_group_name": "my runner group",
      "workflow_name": "CI",
      "head_branch": "main"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposActionsRunsRunIdAttemptsAttemptNumberJobs404ErrorException`](../../doc/models/repos-actions-runs-run-id-attempts-attempt-number-jobs-404-error-exception.md) |


# Actions Download-Workflow-Run-Attempt-Logs

Gets a redirect URL to download an archive of log files for a specific workflow run attempt. This link expires after
1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to
the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#download-workflow-run-attempt-logs](https://docs.github.com/rest/reference/actions#download-workflow-run-attempt-logs)

```java
CompletableFuture<Void> actionsDownloadWorkflowRunAttemptLogsAsync(
    final String owner,
    final String repo,
    final int runId,
    final int attemptNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `attemptNumber` | `int` | Template, Required | The attempt number of the workflow run. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;
int attemptNumber = 172;

actionsController.actionsDownloadWorkflowRunAttemptLogsAsync(owner, repo, runId, attemptNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Cancel-Workflow-Run

Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#cancel-a-workflow-run](https://docs.github.com/rest/reference/actions#cancel-a-workflow-run)

```java
CompletableFuture<Object> actionsCancelWorkflowRunAsync(
    final String owner,
    final String repo,
    final int runId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsCancelWorkflowRunAsync(owner, repo, runId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict | [`ReposActionsRunsRunIdCancel409ErrorException`](../../doc/models/repos-actions-runs-run-id-cancel-409-error-exception.md) |


# Actions List-Jobs-for-Workflow-Run

Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).

API method documentation: [https://docs.github.com/rest/reference/actions#list-jobs-for-a-workflow-run](https://docs.github.com/rest/reference/actions#list-jobs-for-a-workflow-run)

```java
CompletableFuture<ReposActionsRunsRunIdAttemptsAttemptNumberJobsResponse> actionsListJobsForWorkflowRunAsync(
    final String owner,
    final String repo,
    final int runId,
    final Filter41Enum filter,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `filter` | [`Filter41Enum`](../../doc/models/filter-41-enum.md) | Query, Optional | Filters jobs by their `completed_at` timestamp. `latest` returns jobs from the most recent execution of the workflow run. `all` returns all jobs for a workflow run, including from old executions of the workflow run. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsRunsRunIdAttemptsAttemptNumberJobsResponse`](../../doc/models/repos-actions-runs-run-id-attempts-attempt-number-jobs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListJobsForWorkflowRunAsync(owner, repo, runId, null, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "jobs": [
    {
      "id": 399444496,
      "run_id": 29679449,
      "run_url": "https://api.github.com/repos/octo-org/octo-repo/actions/runs/29679449",
      "node_id": "MDEyOldvcmtmbG93IEpvYjM5OTQ0NDQ5Ng==",
      "head_sha": "f83a356604ae3c5d03e1b46ef4d1ca77d64a90b0",
      "url": "https://api.github.com/repos/octo-org/octo-repo/actions/jobs/399444496",
      "html_url": "https://github.com/octo-org/octo-repo/runs/399444496",
      "status": "completed",
      "conclusion": "success",
      "started_at": "2020-01-20T17:42:40Z",
      "completed_at": "2020-01-20T17:44:39Z",
      "name": "build",
      "steps": [
        {
          "name": "Set up job",
          "status": "completed",
          "conclusion": "success",
          "number": 1,
          "started_at": "2020-01-20T09:42:40.000-08:00",
          "completed_at": "2020-01-20T09:42:41.000-08:00"
        },
        {
          "name": "Run actions/checkout@v2",
          "status": "completed",
          "conclusion": "success",
          "number": 2,
          "started_at": "2020-01-20T09:42:41.000-08:00",
          "completed_at": "2020-01-20T09:42:45.000-08:00"
        },
        {
          "name": "Set up Ruby",
          "status": "completed",
          "conclusion": "success",
          "number": 3,
          "started_at": "2020-01-20T09:42:45.000-08:00",
          "completed_at": "2020-01-20T09:42:45.000-08:00"
        },
        {
          "name": "Run actions/cache@v3",
          "status": "completed",
          "conclusion": "success",
          "number": 4,
          "started_at": "2020-01-20T09:42:45.000-08:00",
          "completed_at": "2020-01-20T09:42:48.000-08:00"
        },
        {
          "name": "Install Bundler",
          "status": "completed",
          "conclusion": "success",
          "number": 5,
          "started_at": "2020-01-20T09:42:48.000-08:00",
          "completed_at": "2020-01-20T09:42:52.000-08:00"
        },
        {
          "name": "Install Gems",
          "status": "completed",
          "conclusion": "success",
          "number": 6,
          "started_at": "2020-01-20T09:42:52.000-08:00",
          "completed_at": "2020-01-20T09:42:53.000-08:00"
        },
        {
          "name": "Run Tests",
          "status": "completed",
          "conclusion": "success",
          "number": 7,
          "started_at": "2020-01-20T09:42:53.000-08:00",
          "completed_at": "2020-01-20T09:42:59.000-08:00"
        },
        {
          "name": "Deploy to Heroku",
          "status": "completed",
          "conclusion": "success",
          "number": 8,
          "started_at": "2020-01-20T09:42:59.000-08:00",
          "completed_at": "2020-01-20T09:44:39.000-08:00"
        },
        {
          "name": "Post actions/cache@v3",
          "status": "completed",
          "conclusion": "success",
          "number": 16,
          "started_at": "2020-01-20T09:44:39.000-08:00",
          "completed_at": "2020-01-20T09:44:39.000-08:00"
        },
        {
          "name": "Complete job",
          "status": "completed",
          "conclusion": "success",
          "number": 17,
          "started_at": "2020-01-20T09:44:39.000-08:00",
          "completed_at": "2020-01-20T09:44:39.000-08:00"
        }
      ],
      "check_run_url": "https://api.github.com/repos/octo-org/octo-repo/check-runs/399444496",
      "labels": [
        "self-hosted",
        "foo",
        "bar"
      ],
      "runner_id": 1,
      "runner_name": "my runner",
      "runner_group_id": 2,
      "runner_group_name": "my runner group",
      "workflow_name": "CI",
      "head_branch": "main"
    }
  ]
}
```


# Actions Download-Workflow-Run-Logs

Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for
`Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use
this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have
the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#download-workflow-run-logs](https://docs.github.com/rest/reference/actions#download-workflow-run-logs)

```java
CompletableFuture<Void> actionsDownloadWorkflowRunLogsAsync(
    final String owner,
    final String repo,
    final int runId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsDownloadWorkflowRunLogsAsync(owner, repo, runId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Delete-Workflow-Run-Logs

Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-workflow-run-logs](https://docs.github.com/rest/reference/actions#delete-workflow-run-logs)

```java
CompletableFuture<Void> actionsDeleteWorkflowRunLogsAsync(
    final String owner,
    final String repo,
    final int runId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsDeleteWorkflowRunLogsAsync(owner, repo, runId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposActionsRunsRunIdLogs403ErrorException`](../../doc/models/repos-actions-runs-run-id-logs-403-error-exception.md) |
| 500 | Internal Error | [`ReposActionsRunsRunIdLogs500ErrorException`](../../doc/models/repos-actions-runs-run-id-logs-500-error-exception.md) |


# Actions Get-Pending-Deployments-for-Run

Get all deployment environments for a workflow run that are waiting for protection rules to pass.

Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-pending-deployments-for-a-workflow-run](https://docs.github.com/rest/reference/actions#get-pending-deployments-for-a-workflow-run)

```java
CompletableFuture<List<PendingDeployment>> actionsGetPendingDeploymentsForRunAsync(
    final String owner,
    final String repo,
    final int runId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |

## Response Type

[`List<PendingDeployment>`](../../doc/models/pending-deployment.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsGetPendingDeploymentsForRunAsync(owner, repo, runId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "environment": {
      "id": 161088068,
      "node_id": "MDExOkVudmlyb25tZW50MTYxMDg4MDY4",
      "name": "staging",
      "url": "https://api.github.com/repos/github/hello-world/environments/staging",
      "html_url": "https://github.com/github/hello-world/deployments/activity_log?environments_filter=staging"
    },
    "wait_timer": 30,
    "wait_timer_started_at": "2020-11-23T22:00:40Z",
    "current_user_can_approve": true,
    "reviewers": [
      {
        "type": "User",
        "reviewer": {
          "login": "octocat",
          "id": 1,
          "node_id": "MDQ6VXNlcjE=",
          "avatar_url": "https://github.com/images/error/octocat_happy.gif",
          "gravatar_id": "",
          "url": "https://api.github.com/users/octocat",
          "html_url": "https://github.com/octocat",
          "followers_url": "https://api.github.com/users/octocat/followers",
          "following_url": "https://api.github.com/users/octocat/following{/other_user}",
          "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
          "organizations_url": "https://api.github.com/users/octocat/orgs",
          "repos_url": "https://api.github.com/users/octocat/repos",
          "events_url": "https://api.github.com/users/octocat/events{/privacy}",
          "received_events_url": "https://api.github.com/users/octocat/received_events",
          "type": "User",
          "site_admin": false
        }
      },
      {
        "type": "Team",
        "reviewer": {
          "id": 1,
          "node_id": "MDQ6VGVhbTE=",
          "url": "https://api.github.com/teams/1",
          "html_url": "https://github.com/orgs/github/teams/justice-league",
          "name": "Justice League",
          "slug": "justice-league",
          "description": "A great team.",
          "privacy": "closed",
          "permission": "admin",
          "members_url": "https://api.github.com/teams/1/members{/member}",
          "repositories_url": "https://api.github.com/teams/1/repos",
          "parent": null
        }
      }
    ]
  }
]
```


# Actions Review-Pending-Deployments-for-Run

Approve or reject pending deployments that are waiting on approval by a required reviewer.

Required reviewers with read access to the repository contents and deployments can use this endpoint. Required reviewers must authenticate using an access token with the `repo` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#review-pending-deployments-for-a-workflow-run](https://docs.github.com/rest/reference/actions#review-pending-deployments-for-a-workflow-run)

```java
CompletableFuture<List<Deployment>> actionsReviewPendingDeploymentsForRunAsync(
    final String owner,
    final String repo,
    final int runId,
    final ReposActionsRunsRunIdPendingDeploymentsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `body` | [`ReposActionsRunsRunIdPendingDeploymentsRequest`](../../doc/models/repos-actions-runs-run-id-pending-deployments-request.md) | Body, Required | - |

## Response Type

[`List<Deployment>`](../../doc/models/deployment.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;
ReposActionsRunsRunIdPendingDeploymentsRequest body = new ReposActionsRunsRunIdPendingDeploymentsRequest();
List<Integer> environmentIds = new LinkedList<>();
environmentIds.add(161171787);

body.setEnvironmentIds(environmentIds);
body.setState(State171Enum.APPROVED);
body.setComment("Ship it!");

actionsController.actionsReviewPendingDeploymentsForRunAsync(owner, repo, runId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "url": "https://api.github.com/repos/octocat/example/deployments/1",
    "id": 1,
    "node_id": "MDEwOkRlcGxveW1lbnQx",
    "sha": "a84d88e7554fc1fa21bcbc4efae3c782a70d2b9d",
    "ref": "topic-branch",
    "task": "deploy",
    "payload": {},
    "original_environment": "staging",
    "environment": "production",
    "description": "Deploy request from hubot",
    "creator": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "created_at": "2012-07-20T01:19:13Z",
    "updated_at": "2012-07-20T01:19:13Z",
    "statuses_url": "https://api.github.com/repos/octocat/example/deployments/1/statuses",
    "repository_url": "https://api.github.com/repos/octocat/example",
    "transient_environment": false,
    "production_environment": true
  }
]
```


# Actions Re-Run-Workflow

Re-runs your workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#re-run-a-workflow](https://docs.github.com/rest/reference/actions#re-run-a-workflow)

```java
CompletableFuture<Object> actionsReRunWorkflowAsync(
    final String owner,
    final String repo,
    final int runId,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `body` | `Object` | Body, Optional | - |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsReRunWorkflowAsync(owner, repo, runId, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Re-Run-Workflow-Failed-Jobs

Re-run all of the failed jobs and their dependent jobs in a workflow run using the `id` of the workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#re-run-workflow-failed-jobs](https://docs.github.com/rest/reference/actions#re-run-workflow-failed-jobs)

```java
CompletableFuture<Object> actionsReRunWorkflowFailedJobsAsync(
    final String owner,
    final String repo,
    final int runId,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |
| `body` | `Object` | Body, Optional | - |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsReRunWorkflowFailedJobsAsync(owner, repo, runId, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Workflow-Run-Usage

Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".

Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-workflow-run-usage](https://docs.github.com/rest/reference/actions#get-workflow-run-usage)

```java
CompletableFuture<ReposActionsRunsRunIdTimingResponse> actionsGetWorkflowRunUsageAsync(
    final String owner,
    final String repo,
    final int runId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `runId` | `int` | Template, Required | The unique identifier of the workflow run. |

## Response Type

[`ReposActionsRunsRunIdTimingResponse`](../../doc/models/repos-actions-runs-run-id-timing-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int runId = 236;

actionsController.actionsGetWorkflowRunUsageAsync(owner, repo, runId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "billable": {
    "UBUNTU": {
      "total_ms": 180000,
      "jobs": 1,
      "job_runs": [
        {
          "job_id": 1,
          "duration_ms": 180000
        }
      ]
    },
    "MACOS": {
      "total_ms": 240000,
      "jobs": 4,
      "job_runs": [
        {
          "job_id": 2,
          "duration_ms": 60000
        },
        {
          "job_id": 3,
          "duration_ms": 60000
        },
        {
          "job_id": 4,
          "duration_ms": 60000
        },
        {
          "job_id": 5,
          "duration_ms": 60000
        }
      ]
    },
    "WINDOWS": {
      "total_ms": 300000,
      "jobs": 2,
      "job_runs": [
        {
          "job_id": 6,
          "duration_ms": 150000
        },
        {
          "job_id": 7,
          "duration_ms": 150000
        }
      ]
    }
  },
  "run_duration_ms": 500000
}
```


# Actions List-Repo-Secrets

Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-repository-secrets](https://docs.github.com/rest/reference/actions#list-repository-secrets)

```java
CompletableFuture<ReposActionsSecretsResponse> actionsListRepoSecretsAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsSecretsResponse`](../../doc/models/repos-actions-secrets-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListRepoSecretsAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "secrets": [
    {
      "name": "GH_TOKEN",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z"
    },
    {
      "name": "GIST_ID",
      "created_at": "2020-01-10T10:59:22Z",
      "updated_at": "2020-01-11T11:59:22Z"
    }
  ]
}
```


# Actions Get-Repo-Public-Key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-repository-public-key](https://docs.github.com/rest/reference/actions#get-a-repository-public-key)

```java
CompletableFuture<ReposActionsSecretsPublicKeyResponse> actionsGetRepoPublicKeyAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposActionsSecretsPublicKeyResponse`](../../doc/models/repos-actions-secrets-public-key-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

actionsController.actionsGetRepoPublicKeyAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key_id": "012345678912345678",
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"
}
```


# Actions Get-Repo-Secret

Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-repository-secret](https://docs.github.com/rest/reference/actions#get-a-repository-secret)

```java
CompletableFuture<ReposActionsSecretsSecretNameResponse> actionsGetRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`ReposActionsSecretsSecretNameResponse`](../../doc/models/repos-actions-secrets-secret-name-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";

actionsController.actionsGetRepoSecretAsync(owner, repo, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "GH_TOKEN",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z"
}
```


# Actions Create-or-Update-Repo-Secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using
[LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use
this endpoint.

#### Example encrypting a secret using Node.js

Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.

```
const sodium = require('libsodium-wrappers')
const secret = 'plain-text-secret' // replace with the secret you want to encrypt
const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key

//Check if libsodium is ready and then proceed.
sodium.ready.then(() => {
  // Convert Secret & Base64 key to Uint8Array.
  let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
  let binsec = sodium.from_string(secret)

  //Encrypt the secret using LibSodium
  let encBytes = sodium.crypto_box_seal(binsec, binkey)

  // Convert encrypted Uint8Array to Base64
  let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)

  console.log(output)
});
```

#### Example encrypting a secret using Python

Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.

```
from base64 import b64encode
from nacl import encoding, public

def encrypt(public_key: str, secret_value: str) -> str:
  """Encrypt a Unicode string using the public key."""
  public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
  sealed_box = public.SealedBox(public_key)
  encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
  return b64encode(encrypted).decode("utf-8")
```

#### Example encrypting a secret using C#

Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.

```
var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");

var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);

Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
```

#### Example encrypting a secret using Ruby

Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.

```ruby
require "rbnacl"
require "base64"

key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
public_key = RbNaCl::PublicKey.new(key)

box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
encrypted_secret = box.encrypt("my_secret")

# Print the base64 encoded secret
puts Base64.strict_encode64(encrypted_secret)
```

API method documentation: [https://docs.github.com/rest/reference/actions#create-or-update-a-repository-secret](https://docs.github.com/rest/reference/actions#create-or-update-a-repository-secret)

```java
CompletableFuture<Object> actionsCreateOrUpdateRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName,
    final ReposActionsSecretsSecretNameRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`ReposActionsSecretsSecretNameRequest`](../../doc/models/repos-actions-secrets-secret-name-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";
ReposActionsSecretsSecretNameRequest body = new ReposActionsSecretsSecretNameRequest();
body.setEncryptedValue("c2VjcmV0");
body.setKeyId("012345678912345678");

actionsController.actionsCreateOrUpdateRepoSecretAsync(owner, repo, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Delete-Repo-Secret

Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-a-repository-secret](https://docs.github.com/rest/reference/actions#delete-a-repository-secret)

```java
CompletableFuture<Void> actionsDeleteRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";

actionsController.actionsDeleteRepoSecretAsync(owner, repo, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Repo-Variables

Lists all repository variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#list-repository-variables](https://docs.github.com/rest/actions/variables#list-repository-variables)

```java
CompletableFuture<ReposActionsVariablesResponse> actionsListRepoVariablesAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 30).<br>**Default**: `10` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsVariablesResponse`](../../doc/models/repos-actions-variables-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 10;
Integer page = 1;

actionsController.actionsListRepoVariablesAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "variables": [
    {
      "name": "USERNAME",
      "value": "octocat",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z"
    },
    {
      "name": "EMAIL",
      "value": "octocat@github.com",
      "created_at": "2020-01-10T10:59:22Z",
      "updated_at": "2020-01-11T11:59:22Z"
    }
  ]
}
```


# Actions Create-Repo-Variable

Creates a repository variable that you can reference in a GitHub Actions workflow.
You must authenticate using an access token with the `repo` scope to use this endpoint.
GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#create-a-repository-variable](https://docs.github.com/rest/actions/variables#create-a-repository-variable)

```java
CompletableFuture<Object> actionsCreateRepoVariableAsync(
    final String owner,
    final String repo,
    final ReposActionsVariablesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposActionsVariablesRequest`](../../doc/models/repos-actions-variables-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposActionsVariablesRequest body = new ReposActionsVariablesRequest();
body.setName("USERNAME");
body.setValue("octocat");

actionsController.actionsCreateRepoVariableAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Repo-Variable

Gets a specific variable in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#get-a-repository-variable](https://docs.github.com/rest/actions/variables#get-a-repository-variable)

```java
CompletableFuture<ActionsVariable> actionsGetRepoVariableAsync(
    final String owner,
    final String repo,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |

## Response Type

[`ActionsVariable`](../../doc/models/actions-variable.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String name = "name0";

actionsController.actionsGetRepoVariableAsync(owner, repo, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "USERNAME",
  "value": "octocat",
  "created_at": "2021-08-10T14:59:22Z",
  "updated_at": "2022-01-10T14:59:22Z"
}
```


# Actions Update-Repo-Variable

Updates a repository variable that you can reference in a GitHub Actions workflow.
You must authenticate using an access token with the `repo` scope to use this endpoint.
GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#update-a-repository-variable](https://docs.github.com/rest/actions/variables#update-a-repository-variable)

```java
CompletableFuture<Void> actionsUpdateRepoVariableAsync(
    final String owner,
    final String repo,
    final String name,
    final ReposActionsVariablesNameRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |
| `body` | [`ReposActionsVariablesNameRequest`](../../doc/models/repos-actions-variables-name-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String name = "name0";
ReposActionsVariablesNameRequest body = new ReposActionsVariablesNameRequest();
body.setName("USERNAME");
body.setValue("octocat");

actionsController.actionsUpdateRepoVariableAsync(owner, repo, name, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Delete-Repo-Variable

Deletes a repository variable using the variable name.
You must authenticate using an access token with the `repo` scope to use this endpoint.
GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#delete-a-repository-variable](https://docs.github.com/rest/actions/variables#delete-a-repository-variable)

```java
CompletableFuture<Void> actionsDeleteRepoVariableAsync(
    final String owner,
    final String repo,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `name` | `String` | Template, Required | The name of the variable. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String name = "name0";

actionsController.actionsDeleteRepoVariableAsync(owner, repo, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Repo-Workflows

Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-repository-workflows](https://docs.github.com/rest/reference/actions#list-repository-workflows)

```java
CompletableFuture<ReposActionsWorkflowsResponse> actionsListRepoWorkflowsAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsWorkflowsResponse`](../../doc/models/repos-actions-workflows-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListRepoWorkflowsAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "workflows": [
    {
      "id": 161335,
      "node_id": "MDg6V29ya2Zsb3cxNjEzMzU=",
      "name": "CI",
      "path": ".github/workflows/blank.yaml",
      "state": "active",
      "created_at": "2020-01-08T23:48:37.000-08:00",
      "updated_at": "2020-01-08T23:50:21.000-08:00",
      "url": "https://api.github.com/repos/octo-org/octo-repo/actions/workflows/161335",
      "html_url": "https://github.com/octo-org/octo-repo/blob/master/.github/workflows/161335",
      "badge_url": "https://github.com/octo-org/octo-repo/workflows/CI/badge.svg"
    },
    {
      "id": 269289,
      "node_id": "MDE4OldvcmtmbG93IFNlY29uZGFyeTI2OTI4OQ==",
      "name": "Linter",
      "path": ".github/workflows/linter.yaml",
      "state": "active",
      "created_at": "2020-01-08T23:48:37.000-08:00",
      "updated_at": "2020-01-08T23:50:21.000-08:00",
      "url": "https://api.github.com/repos/octo-org/octo-repo/actions/workflows/269289",
      "html_url": "https://github.com/octo-org/octo-repo/blob/master/.github/workflows/269289",
      "badge_url": "https://github.com/octo-org/octo-repo/workflows/Linter/badge.svg"
    }
  ]
}
```


# Actions Get-Workflow

Gets a specific workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-workflow](https://docs.github.com/rest/reference/actions#get-a-workflow)

```java
CompletableFuture<ReposActionsWorkflowsWorkflowIdResponse> actionsGetWorkflowAsync(
    final String owner,
    final String repo,
    final ActionsGetWorkflowWorkflowId workflowId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `workflowId` | [`ActionsGetWorkflowWorkflowId`]($m/ActionsGetWorkflowWorkflowId) | Template, Required | The ID of the workflow. You can also pass the workflow file name as a string. |

## Response Type

[`ReposActionsWorkflowsWorkflowIdResponse`](../../doc/models/repos-actions-workflows-workflow-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int workflowId = 186;

ActionsGetWorkflowWorkflowId workflowIdContainer = ActionsGetWorkflowWorkflowId.fromNumber(workflowId);

actionsController.actionsGetWorkflowAsync(owner, repo, workflowIdContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 161335,
  "node_id": "MDg6V29ya2Zsb3cxNjEzMzU=",
  "name": "CI",
  "path": ".github/workflows/blank.yaml",
  "state": "active",
  "created_at": "2020-01-08T23:48:37.000-08:00",
  "updated_at": "2020-01-08T23:50:21.000-08:00",
  "url": "https://api.github.com/repos/octo-org/octo-repo/actions/workflows/161335",
  "html_url": "https://github.com/octo-org/octo-repo/blob/master/.github/workflows/161335",
  "badge_url": "https://github.com/octo-org/octo-repo/workflows/CI/badge.svg"
}
```


# Actions Disable-Workflow

Disables a workflow and sets the `state` of the workflow to `disabled_manually`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#disable-a-workflow](https://docs.github.com/rest/reference/actions#disable-a-workflow)

```java
CompletableFuture<Void> actionsDisableWorkflowAsync(
    final String owner,
    final String repo,
    final ActionsDisableWorkflowWorkflowId workflowId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `workflowId` | [`ActionsDisableWorkflowWorkflowId`]($m/ActionsDisableWorkflowWorkflowId) | Template, Required | The ID of the workflow. You can also pass the workflow file name as a string. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int workflowId = 186;

ActionsDisableWorkflowWorkflowId workflowIdContainer = ActionsDisableWorkflowWorkflowId.fromNumber(workflowId);

actionsController.actionsDisableWorkflowAsync(owner, repo, workflowIdContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Create-Workflow-Dispatch

You can use this endpoint to manually trigger a GitHub Actions workflow run. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.

You must configure your GitHub Actions workflow to run when the [`workflow_dispatch` webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The `inputs` are configured in the workflow file. For more information about how to configure the `workflow_dispatch` event in the workflow file, see "[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch)."

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)."

API method documentation: [https://docs.github.com/rest/reference/actions#create-a-workflow-dispatch-event](https://docs.github.com/rest/reference/actions#create-a-workflow-dispatch-event)

```java
CompletableFuture<Void> actionsCreateWorkflowDispatchAsync(
    final String owner,
    final String repo,
    final ActionsCreateWorkflowDispatchWorkflowId workflowId,
    final ReposActionsWorkflowsWorkflowIdDispatchesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `workflowId` | [`ActionsCreateWorkflowDispatchWorkflowId`]($m/ActionsCreateWorkflowDispatchWorkflowId) | Template, Required | The ID of the workflow. You can also pass the workflow file name as a string. |
| `body` | [`ReposActionsWorkflowsWorkflowIdDispatchesRequest`](../../doc/models/repos-actions-workflows-workflow-id-dispatches-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int workflowId = 186;

ActionsCreateWorkflowDispatchWorkflowId workflowIdContainer = ActionsCreateWorkflowDispatchWorkflowId.fromNumber(workflowId);

ReposActionsWorkflowsWorkflowIdDispatchesRequest body = new ReposActionsWorkflowsWorkflowIdDispatchesRequest();
body.setRef("topic-branch");
Map<String, String> inputs = new LinkedHashMap<>();
inputs.put("name", "Mona the Octocat");
inputs.put("home", "San Francisco, CA");

body.setInputs(inputs);

actionsController.actionsCreateWorkflowDispatchAsync(owner, repo, workflowIdContainer, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Enable-Workflow

Enables a workflow and sets the `state` of the workflow to `active`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.

You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#enable-a-workflow](https://docs.github.com/rest/reference/actions#enable-a-workflow)

```java
CompletableFuture<Void> actionsEnableWorkflowAsync(
    final String owner,
    final String repo,
    final ActionsEnableWorkflowWorkflowId workflowId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `workflowId` | [`ActionsEnableWorkflowWorkflowId`]($m/ActionsEnableWorkflowWorkflowId) | Template, Required | The ID of the workflow. You can also pass the workflow file name as a string. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int workflowId = 186;

ActionsEnableWorkflowWorkflowId workflowIdContainer = ActionsEnableWorkflowWorkflowId.fromNumber(workflowId);

actionsController.actionsEnableWorkflowAsync(owner, repo, workflowIdContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Workflow-Runs

List all workflow runs for a workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).

Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.

API method documentation: [https://docs.github.com/rest/reference/actions#list-workflow-runs](https://docs.github.com/rest/reference/actions#list-workflow-runs)

```java
CompletableFuture<ReposActionsWorkflowsWorkflowIdRunsResponse> actionsListWorkflowRunsAsync(
    final String owner,
    final String repo,
    final ActionsListWorkflowRunsWorkflowId workflowId,
    final String actor,
    final String branch,
    final String event,
    final Status81Enum status,
    final Integer perPage,
    final Integer page,
    final LocalDateTime created,
    final Boolean excludePullRequests,
    final Integer checkSuiteId,
    final String headSha)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `workflowId` | [`ActionsListWorkflowRunsWorkflowId`]($m/ActionsListWorkflowRunsWorkflowId) | Template, Required | The ID of the workflow. You can also pass the workflow file name as a string. |
| `actor` | `String` | Query, Optional | Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. |
| `branch` | `String` | Query, Optional | Returns workflow runs associated with a branch. Use the name of the branch of the `push`. |
| `event` | `String` | Query, Optional | Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)." |
| `status` | [`Status81Enum`](../../doc/models/status-81-enum.md) | Query, Optional | Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `created` | `LocalDateTime` | Query, Optional | Returns workflow runs created within the given date-time range. For more information on the syntax, see "[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates)." |
| `excludePullRequests` | `Boolean` | Query, Optional | If `true` pull requests are omitted from the response (empty array).<br>**Default**: `false` |
| `checkSuiteId` | `Integer` | Query, Optional | Returns workflow runs with the `check_suite_id` that you specify. |
| `headSha` | `String` | Query, Optional | Only returns workflow runs that are associated with the specified `head_sha`. |

## Response Type

[`ReposActionsWorkflowsWorkflowIdRunsResponse`](../../doc/models/repos-actions-workflows-workflow-id-runs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int workflowId = 186;

ActionsListWorkflowRunsWorkflowId workflowIdContainer = ActionsListWorkflowRunsWorkflowId.fromNumber(workflowId);

Integer perPage = 30;
Integer page = 1;
Boolean excludePullRequests = false;

actionsController.actionsListWorkflowRunsAsync(owner, repo, workflowIdContainer, null, null, null, null, perPage, page, null, excludePullRequests, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Workflow-Usage

Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".

You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-workflow-usage](https://docs.github.com/rest/reference/actions#get-workflow-usage)

```java
CompletableFuture<ReposActionsWorkflowsWorkflowIdTimingResponse> actionsGetWorkflowUsageAsync(
    final String owner,
    final String repo,
    final ActionsGetWorkflowUsageWorkflowId workflowId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `workflowId` | [`ActionsGetWorkflowUsageWorkflowId`]($m/ActionsGetWorkflowUsageWorkflowId) | Template, Required | The ID of the workflow. You can also pass the workflow file name as a string. |

## Response Type

[`ReposActionsWorkflowsWorkflowIdTimingResponse`](../../doc/models/repos-actions-workflows-workflow-id-timing-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int workflowId = 186;

ActionsGetWorkflowUsageWorkflowId workflowIdContainer = ActionsGetWorkflowUsageWorkflowId.fromNumber(workflowId);

actionsController.actionsGetWorkflowUsageAsync(owner, repo, workflowIdContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "billable": {
    "UBUNTU": {
      "total_ms": 180000
    },
    "MACOS": {
      "total_ms": 240000
    },
    "WINDOWS": {
      "total_ms": 300000
    }
  }
}
```


# Actions List-Environment-Secrets

Lists all secrets available in an environment without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-environment-secrets](https://docs.github.com/rest/reference/actions#list-environment-secrets)

```java
CompletableFuture<ReposActionsSecretsResponse> actionsListEnvironmentSecretsAsync(
    final int repositoryId,
    final String environmentName,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `environmentName` | `String` | Template, Required | The name of the environment. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsSecretsResponse`](../../doc/models/repos-actions-secrets-response.md)

## Example Usage

```java
int repositoryId = 254;
String environmentName = "environment_name6";
Integer perPage = 30;
Integer page = 1;

actionsController.actionsListEnvironmentSecretsAsync(repositoryId, environmentName, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "secrets": [
    {
      "name": "GH_TOKEN",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z"
    },
    {
      "name": "GIST_ID",
      "created_at": "2020-01-10T10:59:22Z",
      "updated_at": "2020-01-11T11:59:22Z"
    }
  ]
}
```


# Actions Get-Environment-Public-Key

Get the public key for an environment, which you need to encrypt environment secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-an-environment-public-key](https://docs.github.com/rest/reference/actions#get-an-environment-public-key)

```java
CompletableFuture<RepositoriesEnvironmentsSecretsPublicKeyResponse> actionsGetEnvironmentPublicKeyAsync(
    final int repositoryId,
    final String environmentName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `environmentName` | `String` | Template, Required | The name of the environment. |

## Response Type

[`RepositoriesEnvironmentsSecretsPublicKeyResponse`](../../doc/models/repositories-environments-secrets-public-key-response.md)

## Example Usage

```java
int repositoryId = 254;
String environmentName = "environment_name6";

actionsController.actionsGetEnvironmentPublicKeyAsync(repositoryId, environmentName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key_id": "012345678912345678",
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"
}
```


# Actions Get-Environment-Secret

Gets a single environment secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-an-environment-secret](https://docs.github.com/rest/reference/actions#get-an-environment-secret)

```java
CompletableFuture<RepositoriesEnvironmentsSecretsSecretNameResponse> actionsGetEnvironmentSecretAsync(
    final int repositoryId,
    final String environmentName,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `environmentName` | `String` | Template, Required | The name of the environment. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`RepositoriesEnvironmentsSecretsSecretNameResponse`](../../doc/models/repositories-environments-secrets-secret-name-response.md)

## Example Usage

```java
int repositoryId = 254;
String environmentName = "environment_name6";
String secretName = "secret_name2";

actionsController.actionsGetEnvironmentSecretAsync(repositoryId, environmentName, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "GH_TOKEN",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z"
}
```


# Actions Create-or-Update-Environment-Secret

Creates or updates an environment secret with an encrypted value. Encrypt your secret using
[LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use
this endpoint.

#### Example encrypting a secret using Node.js

Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.

```
const sodium = require('libsodium-wrappers')
const secret = 'plain-text-secret' // replace with the secret you want to encrypt
const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key

//Check if libsodium is ready and then proceed.
sodium.ready.then(() => {
  // Convert Secret & Base64 key to Uint8Array.
  let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
  let binsec = sodium.from_string(secret)

  //Encrypt the secret using LibSodium
  let encBytes = sodium.crypto_box_seal(binsec, binkey)

  // Convert encrypted Uint8Array to Base64
  let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)

  console.log(output)
});
```

#### Example encrypting a secret using Python

Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.

```
from base64 import b64encode
from nacl import encoding, public

def encrypt(public_key: str, secret_value: str) -> str:
  """Encrypt a Unicode string using the public key."""
  public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
  sealed_box = public.SealedBox(public_key)
  encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
  return b64encode(encrypted).decode("utf-8")
```

#### Example encrypting a secret using C#

Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.

```
var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");

var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);

Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
```

#### Example encrypting a secret using Ruby

Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.

```ruby
require "rbnacl"
require "base64"

key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
public_key = RbNaCl::PublicKey.new(key)

box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
encrypted_secret = box.encrypt("my_secret")

# Print the base64 encoded secret
puts Base64.strict_encode64(encrypted_secret)
```

API method documentation: [https://docs.github.com/rest/reference/actions#create-or-update-an-environment-secret](https://docs.github.com/rest/reference/actions#create-or-update-an-environment-secret)

```java
CompletableFuture<Object> actionsCreateOrUpdateEnvironmentSecretAsync(
    final int repositoryId,
    final String environmentName,
    final String secretName,
    final RepositoriesEnvironmentsSecretsSecretNameRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `environmentName` | `String` | Template, Required | The name of the environment. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`RepositoriesEnvironmentsSecretsSecretNameRequest`](../../doc/models/repositories-environments-secrets-secret-name-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
int repositoryId = 254;
String environmentName = "environment_name6";
String secretName = "secret_name2";
RepositoriesEnvironmentsSecretsSecretNameRequest body = new RepositoriesEnvironmentsSecretsSecretNameRequest();
body.setEncryptedValue("c2VjcmV0");
body.setKeyId("012345678912345678");

actionsController.actionsCreateOrUpdateEnvironmentSecretAsync(repositoryId, environmentName, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Delete-Environment-Secret

Deletes a secret in an environment using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-an-environment-secret](https://docs.github.com/rest/reference/actions#delete-an-environment-secret)

```java
CompletableFuture<Void> actionsDeleteEnvironmentSecretAsync(
    final int repositoryId,
    final String environmentName,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `environmentName` | `String` | Template, Required | The name of the environment. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

`void`

## Example Usage

```java
int repositoryId = 254;
String environmentName = "environment_name6";
String secretName = "secret_name2";

actionsController.actionsDeleteEnvironmentSecretAsync(repositoryId, environmentName, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions List-Environment-Variables

Lists all environment variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#list-environment-variables](https://docs.github.com/rest/actions/variables#list-environment-variables)

```java
CompletableFuture<ReposActionsVariablesResponse> actionsListEnvironmentVariablesAsync(
    final int repositoryId,
    final String environmentName,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `environmentName` | `String` | Template, Required | The name of the environment. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 30).<br>**Default**: `10` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposActionsVariablesResponse`](../../doc/models/repos-actions-variables-response.md)

## Example Usage

```java
int repositoryId = 254;
String environmentName = "environment_name6";
Integer perPage = 10;
Integer page = 1;

actionsController.actionsListEnvironmentVariablesAsync(repositoryId, environmentName, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "variables": [
    {
      "name": "USERNAME",
      "value": "octocat",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z"
    },
    {
      "name": "EMAIL",
      "value": "octocat@github.com",
      "created_at": "2020-01-10T10:59:22Z",
      "updated_at": "2020-01-11T11:59:22Z"
    }
  ]
}
```


# Actions Create-Environment-Variable

Create an environment variable that you can reference in a GitHub Actions workflow.
You must authenticate using an access token with the `repo` scope to use this endpoint.
GitHub Apps must have the `environment:write` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#create-an-environment-variable](https://docs.github.com/rest/actions/variables#create-an-environment-variable)

```java
CompletableFuture<Object> actionsCreateEnvironmentVariableAsync(
    final int repositoryId,
    final String environmentName,
    final ReposActionsVariablesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `environmentName` | `String` | Template, Required | The name of the environment. |
| `body` | [`ReposActionsVariablesRequest`](../../doc/models/repos-actions-variables-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
int repositoryId = 254;
String environmentName = "environment_name6";
ReposActionsVariablesRequest body = new ReposActionsVariablesRequest();
body.setName("USERNAME");
body.setValue("octocat");

actionsController.actionsCreateEnvironmentVariableAsync(repositoryId, environmentName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Get-Environment-Variable

Gets a specific variable in an environment. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#get-an-environment-variable](https://docs.github.com/rest/actions/variables#get-an-environment-variable)

```java
CompletableFuture<ActionsVariable> actionsGetEnvironmentVariableAsync(
    final int repositoryId,
    final String environmentName,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `environmentName` | `String` | Template, Required | The name of the environment. |
| `name` | `String` | Template, Required | The name of the variable. |

## Response Type

[`ActionsVariable`](../../doc/models/actions-variable.md)

## Example Usage

```java
int repositoryId = 254;
String environmentName = "environment_name6";
String name = "name0";

actionsController.actionsGetEnvironmentVariableAsync(repositoryId, environmentName, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "USERNAME",
  "value": "octocat",
  "created_at": "2021-08-10T14:59:22Z",
  "updated_at": "2022-01-10T14:59:22Z"
}
```


# Actions Update-Environment-Variable

Updates an environment variable that you can reference in a GitHub Actions workflow.
You must authenticate using an access token with the `repo` scope to use this endpoint.
GitHub Apps must have the `environment:write` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#update-an-environment-variable](https://docs.github.com/rest/actions/variables#update-an-environment-variable)

```java
CompletableFuture<Void> actionsUpdateEnvironmentVariableAsync(
    final int repositoryId,
    final String name,
    final String environmentName,
    final ReposActionsVariablesNameRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `name` | `String` | Template, Required | The name of the variable. |
| `environmentName` | `String` | Template, Required | - |
| `body` | [`ReposActionsVariablesNameRequest`](../../doc/models/repos-actions-variables-name-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
int repositoryId = 254;
String name = "name0";
String environmentName = "environment_name6";
ReposActionsVariablesNameRequest body = new ReposActionsVariablesNameRequest();
body.setName("USERNAME");
body.setValue("octocat");

actionsController.actionsUpdateEnvironmentVariableAsync(repositoryId, name, environmentName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Actions Delete-Environment-Variable

Deletes an environment variable using the variable name.
You must authenticate using an access token with the `repo` scope to use this endpoint.
GitHub Apps must have the `environment:write` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/variables#delete-an-environment-variable](https://docs.github.com/rest/actions/variables#delete-an-environment-variable)

```java
CompletableFuture<Void> actionsDeleteEnvironmentVariableAsync(
    final int repositoryId,
    final String name,
    final String environmentName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `repositoryId` | `int` | Template, Required | The unique identifier of the repository. |
| `name` | `String` | Template, Required | The name of the variable. |
| `environmentName` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
int repositoryId = 254;
String name = "name0";
String environmentName = "environment_name6";

actionsController.actionsDeleteEnvironmentVariableAsync(repositoryId, name, environmentName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

