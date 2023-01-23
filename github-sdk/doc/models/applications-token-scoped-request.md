
# Applications Token Scoped Request

## Structure

`ApplicationsTokenScopedRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccessToken` | `String` | Required | The OAuth access token used to authenticate to the GitHub API. | String getAccessToken() | setAccessToken(String accessToken) |
| `Target` | `String` | Optional | The name of the user or organization to scope the user-to-server access token to. **Required** unless `target_id` is specified. | String getTarget() | setTarget(String target) |
| `TargetId` | `Integer` | Optional | The ID of the user or organization to scope the user-to-server access token to. **Required** unless `target` is specified. | Integer getTargetId() | setTargetId(Integer targetId) |
| `Repositories` | `List<String>` | Optional | The list of repository names to scope the user-to-server access token to. `repositories` may not be specified if `repository_ids` is specified. | List<String> getRepositories() | setRepositories(List<String> repositories) |
| `RepositoryIds` | `List<Integer>` | Optional | The list of repository IDs to scope the user-to-server access token to. `repository_ids` may not be specified if `repositories` is specified. | List<Integer> getRepositoryIds() | setRepositoryIds(List<Integer> repositoryIds) |
| `Permissions` | [`Permissions3`](../../doc/models/permissions-3.md) | Optional | - | Permissions3 getPermissions() | setPermissions(Permissions3 permissions) |

## Example (as JSON)

```json
{
  "access_token": "e72e16c7e42f292c6912e7710c838347ae178b4a"
}
```

