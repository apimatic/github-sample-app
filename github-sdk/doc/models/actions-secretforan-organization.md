
# Actions Secretforan Organization

Secrets for GitHub Actions for an organization.

## Structure

`ActionsSecretforanOrganization`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the secret. | String getName() | setName(String name) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Visibility` | [`VisibilityEnum`](../../doc/models/visibility-enum.md) | Required | - | VisibilityEnum getVisibility() | setVisibility(VisibilityEnum visibility) |
| `SelectedRepositoriesUrl` | `String` | Optional | - | String getSelectedRepositoriesUrl() | setSelectedRepositoriesUrl(String selectedRepositoriesUrl) |

## Example (as JSON)

```json
{
  "name": "SECRET_TOKEN",
  "created_at": null,
  "updated_at": null,
  "visibility": null
}
```

