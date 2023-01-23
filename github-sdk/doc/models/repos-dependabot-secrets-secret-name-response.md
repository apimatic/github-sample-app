
# Repos Dependabot Secrets Secret Name Response

## Structure

`ReposDependabotSecretsSecretNameResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the secret. | String getName() | setName(String name) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "name": "MY_ARTIFACTORY_PASSWORD",
  "created_at": null,
  "updated_at": null
}
```

