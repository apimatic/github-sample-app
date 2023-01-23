
# Scoped Installation

## Structure

`ScopedInstallation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Permissions` | [`Permissions3`](../../doc/models/permissions-3.md) | Required | - | Permissions3 getPermissions() | setPermissions(Permissions3 permissions) |
| `RepositorySelection` | [`RepositorySelectionEnum`](../../doc/models/repository-selection-enum.md) | Required | - | RepositorySelectionEnum getRepositorySelection() | setRepositorySelection(RepositorySelectionEnum repositorySelection) |
| `SingleFileName` | `String` | Required | - | String getSingleFileName() | setSingleFileName(String singleFileName) |
| `HasMultipleSingleFiles` | `Boolean` | Optional | - | Boolean getHasMultipleSingleFiles() | setHasMultipleSingleFiles(Boolean hasMultipleSingleFiles) |
| `SingleFilePaths` | `List<String>` | Optional | - | List<String> getSingleFilePaths() | setSingleFilePaths(List<String> singleFilePaths) |
| `RepositoriesUrl` | `String` | Required | - | String getRepositoriesUrl() | setRepositoriesUrl(String repositoriesUrl) |
| `Account` | [`Account12`](../../doc/models/account-12.md) | Required | - | Account12 getAccount() | setAccount(Account12 account) |

## Example (as JSON)

```json
{
  "permissions": null,
  "repository_selection": null,
  "single_file_name": "config.yaml",
  "repositories_url": "https://api.github.com/users/octocat/repos",
  "account": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
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
    "site_admin": null
  }
}
```

