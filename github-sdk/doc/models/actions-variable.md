
# Actions Variable

## Structure

`ActionsVariable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the variable. | String getName() | setName(String name) |
| `Value` | `String` | Required | The value of the variable. | String getValue() | setValue(String value) |
| `CreatedAt` | `LocalDateTime` | Required | The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "name": "USERNAME",
  "value": "octocat",
  "created_at": "01/24/2019 22:45:36",
  "updated_at": "01/24/2019 22:45:36"
}
```

