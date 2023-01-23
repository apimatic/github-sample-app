
# Codespaces Secret 1

Set repository secrets for GitHub Codespaces.

## Structure

`CodespacesSecret1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the secret. | String getName() | setName(String name) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "name": "SECRET_TOKEN",
  "created_at": null,
  "updated_at": null
}
```

