
# Codespaces Secret

Secrets for a GitHub Codespace.

## Structure

`CodespacesSecret`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the secret | String getName() | setName(String name) |
| `CreatedAt` | `LocalDateTime` | Required | The date and time at which the secret was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | The date and time at which the secret was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Visibility` | [`Visibility2Enum`](../../doc/models/visibility-2-enum.md) | Required | - | Visibility2Enum getVisibility() | setVisibility(Visibility2Enum visibility) |
| `SelectedRepositoriesUrl` | `String` | Optional | The API URL at which the list of repositories this secret is visible to can be retrieved | String getSelectedRepositoriesUrl() | setSelectedRepositoriesUrl(String selectedRepositoriesUrl) |

## Example (as JSON)

```json
{
  "name": "SECRET_NAME",
  "created_at": null,
  "updated_at": null,
  "visibility": null
}
```

