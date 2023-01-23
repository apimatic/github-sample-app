
# Category

## Structure

`Category`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Emoji` | `String` | Required | - | String getEmoji() | setEmoji(String emoji) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `IsAnswerable` | `String` | Required, Constant | **Default**: `"True"` | String getIsAnswerable() | setIsAnswerable(String isAnswerable) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `RepositoryId` | `int` | Required | - | int getRepositoryId() | setRepositoryId(int repositoryId) |
| `Slug` | `String` | Required | - | String getSlug() | setSlug(String slug) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example (as JSON)

```json
{
  "created_at": null,
  "description": null,
  "emoji": null,
  "id": null,
  "is_answerable": "True",
  "name": null,
  "repository_id": null,
  "slug": null,
  "updated_at": null
}
```

