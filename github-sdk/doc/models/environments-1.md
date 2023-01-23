
# Environments 1

## Structure

`Environments1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The id of the environment. | Integer getId() | setId(Integer id) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Optional | The name of the environment. | String getName() | setName(String name) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Optional | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `CreatedAt` | `LocalDateTime` | Optional | The time that the environment was created, in ISO 8601 format. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | The time that the environment was last updated, in ISO 8601 format. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "id": null,
  "node_id": null,
  "name": null,
  "url": null,
  "html_url": null,
  "created_at": null,
  "updated_at": null
}
```

