
# Orgs Actions Runners Remove Token Response

## Structure

`OrgsActionsRunnersRemoveTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Required | The token used for authentication | String getToken() | setToken(String token) |
| `ExpiresAt` | `LocalDateTime` | Required | The time this token expires | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `Permissions` | `Object` | Optional | - | Object getPermissions() | setPermissions(Object permissions) |
| `Repositories` | [`List<Repository>`](../../doc/models/repository.md) | Optional | The repositories this token has access to | List<Repository> getRepositories() | setRepositories(List<Repository> repositories) |
| `SingleFile` | `String` | Optional | - | String getSingleFile() | setSingleFile(String singleFile) |
| `RepositorySelection` | [`RepositorySelectionEnum`](../../doc/models/repository-selection-enum.md) | Optional | - | RepositorySelectionEnum getRepositorySelection() | setRepositorySelection(RepositorySelectionEnum repositorySelection) |

## Example (as JSON)

```json
{
  "token": "v1.1f699f1069f60xxx",
  "expires_at": "07/11/2016 22:14:10"
}
```

