
# Actions Variableforan Organization

Organization variable for GitHub Actions.

## Structure

`ActionsVariableforanOrganization`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the variable. | String getName() | setName(String name) |
| `Value` | `String` | Required | The value of the variable. | String getValue() | setValue(String value) |
| `CreatedAt` | `LocalDateTime` | Required | The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Visibility` | [`Visibility1Enum`](../../doc/models/visibility-1-enum.md) | Required | - | Visibility1Enum getVisibility() | setVisibility(Visibility1Enum visibility) |
| `SelectedRepositoriesUrl` | `String` | Optional | - | String getSelectedRepositoriesUrl() | setSelectedRepositoriesUrl(String selectedRepositoriesUrl) |

## Example (as JSON)

```json
{
  "name": "USERNAME",
  "value": "octocat",
  "created_at": "01/24/2019 22:45:36",
  "updated_at": "01/24/2019 22:45:36",
  "visibility": null
}
```

