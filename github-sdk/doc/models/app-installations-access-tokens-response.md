
# App Installations Access Tokens Response

## Structure

`AppInstallationsAccessTokensResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Required | - | String getToken() | setToken(String token) |
| `ExpiresAt` | `String` | Required | - | String getExpiresAt() | setExpiresAt(String expiresAt) |
| `Permissions` | [`Permissions3`](../../doc/models/permissions-3.md) | Optional | - | Permissions3 getPermissions() | setPermissions(Permissions3 permissions) |
| `RepositorySelection` | [`RepositorySelection1Enum`](../../doc/models/repository-selection-1-enum.md) | Optional | - | RepositorySelection1Enum getRepositorySelection() | setRepositorySelection(RepositorySelection1Enum repositorySelection) |
| `Repositories` | [`List<Repository>`](../../doc/models/repository.md) | Optional | - | List<Repository> getRepositories() | setRepositories(List<Repository> repositories) |
| `SingleFile` | `String` | Optional | - | String getSingleFile() | setSingleFile(String singleFile) |
| `HasMultipleSingleFiles` | `Boolean` | Optional | - | Boolean getHasMultipleSingleFiles() | setHasMultipleSingleFiles(Boolean hasMultipleSingleFiles) |
| `SingleFilePaths` | `List<String>` | Optional | - | List<String> getSingleFilePaths() | setSingleFilePaths(List<String> singleFilePaths) |

## Example (as JSON)

```json
{
  "token": "token6",
  "expires_at": "expires_at6",
  "permissions": null,
  "repository_selection": null,
  "repositories": null,
  "single_file": null,
  "has_multiple_single_files": null,
  "single_file_paths": null
}
```

