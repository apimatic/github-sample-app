
# App Installations Access Tokens Request

## Structure

`AppInstallationsAccessTokensRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Repositories` | `List<String>` | Optional | List of repository names that the token should have access to | List<String> getRepositories() | setRepositories(List<String> repositories) |
| `RepositoryIds` | `List<Integer>` | Optional | List of repository IDs that the token should have access to | List<Integer> getRepositoryIds() | setRepositoryIds(List<Integer> repositoryIds) |
| `Permissions` | [`Permissions3`](../../doc/models/permissions-3.md) | Optional | - | Permissions3 getPermissions() | setPermissions(Permissions3 permissions) |

## Example (as JSON)

```json
{
  "repositories": null,
  "repository_ids": null,
  "permissions": null
}
```

