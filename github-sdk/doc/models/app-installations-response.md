
# App Installations Response

## Structure

`AppInstallationsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The ID of the installation. | int getId() | setId(int id) |
| `Account` | [`Account`]($m/AppInstallationsResponseAccount) | Required | - | Account getAccount() | setAccount(Account account) |
| `RepositorySelection` | [`RepositorySelectionEnum`](../../doc/models/repository-selection-enum.md) | Required | - | RepositorySelectionEnum getRepositorySelection() | setRepositorySelection(RepositorySelectionEnum repositorySelection) |
| `AccessTokensUrl` | `String` | Required | - | String getAccessTokensUrl() | setAccessTokensUrl(String accessTokensUrl) |
| `RepositoriesUrl` | `String` | Required | - | String getRepositoriesUrl() | setRepositoriesUrl(String repositoriesUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `AppId` | `int` | Required | - | int getAppId() | setAppId(int appId) |
| `TargetId` | `int` | Required | The ID of the user or organization this token is being scoped to. | int getTargetId() | setTargetId(int targetId) |
| `TargetType` | `String` | Required | - | String getTargetType() | setTargetType(String targetType) |
| `Permissions` | [`Permissions3`](../../doc/models/permissions-3.md) | Required | - | Permissions3 getPermissions() | setPermissions(Permissions3 permissions) |
| `Events` | `List<String>` | Required | - | List<String> getEvents() | setEvents(List<String> events) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `SingleFileName` | `String` | Required | - | String getSingleFileName() | setSingleFileName(String singleFileName) |
| `HasMultipleSingleFiles` | `Boolean` | Optional | - | Boolean getHasMultipleSingleFiles() | setHasMultipleSingleFiles(Boolean hasMultipleSingleFiles) |
| `SingleFilePaths` | `List<String>` | Optional | - | List<String> getSingleFilePaths() | setSingleFilePaths(List<String> singleFilePaths) |
| `AppSlug` | `String` | Required | - | String getAppSlug() | setAppSlug(String appSlug) |
| `SuspendedBy` | `Object` | Required | - | Object getSuspendedBy() | setSuspendedBy(Object suspendedBy) |
| `SuspendedAt` | `LocalDateTime` | Required | - | LocalDateTime getSuspendedAt() | setSuspendedAt(LocalDateTime suspendedAt) |
| `ContactEmail` | `String` | Optional | - | String getContactEmail() | setContactEmail(String contactEmail) |

## Example (as JSON)

```json
{
  "id": 1,
  "account": null,
  "repository_selection": null,
  "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
  "repositories_url": "https://api.github.com/installation/repositories",
  "html_url": "https://github.com/organizations/github/settings/installations/1",
  "app_id": 1,
  "target_id": null,
  "target_type": "Organization",
  "permissions": null,
  "events": null,
  "created_at": null,
  "updated_at": null,
  "single_file_name": "config.yaml",
  "app_slug": "github-actions",
  "suspended_by": null,
  "suspended_at": null
}
```

