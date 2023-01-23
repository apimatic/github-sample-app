
# Projects Columns Cards Response

## Structure

`ProjectsColumnsCardsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Id` | `int` | Required | The project card's ID | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Note` | `String` | Required | - | String getNote() | setNote(String note) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Archived` | `Boolean` | Optional | Whether or not the card is archived | Boolean getArchived() | setArchived(Boolean archived) |
| `ColumnName` | `String` | Optional | - | String getColumnName() | setColumnName(String columnName) |
| `ProjectId` | `String` | Optional | - | String getProjectId() | setProjectId(String projectId) |
| `ColumnUrl` | `String` | Required | - | String getColumnUrl() | setColumnUrl(String columnUrl) |
| `ContentUrl` | `String` | Optional | - | String getContentUrl() | setContentUrl(String contentUrl) |
| `ProjectUrl` | `String` | Required | - | String getProjectUrl() | setProjectUrl(String projectUrl) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/projects/columns/cards/1478",
  "id": 42,
  "node_id": "MDExOlByb2plY3RDYXJkMTQ3OA==",
  "note": "Add payload for delete Project column",
  "creator": null,
  "created_at": "09/05/2016 14:21:06",
  "updated_at": "09/05/2016 14:20:22",
  "column_url": "https://api.github.com/projects/columns/367",
  "project_url": "https://api.github.com/projects/120"
}
```

