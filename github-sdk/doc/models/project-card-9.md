
# Project Card 9

## Structure

`ProjectCard9`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AfterId` | `Integer` | Optional | - | Integer getAfterId() | setAfterId(Integer afterId) |
| `Archived` | `boolean` | Required | Whether or not the card is archived | boolean getArchived() | setArchived(boolean archived) |
| `ColumnId` | `Integer` | Required | - | Integer getColumnId() | setColumnId(Integer columnId) |
| `ColumnUrl` | `String` | Required | - | String getColumnUrl() | setColumnUrl(String columnUrl) |
| `ContentUrl` | `String` | Optional | - | String getContentUrl() | setContentUrl(String contentUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `Id` | `int` | Required | The project card's ID | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Note` | `String` | Required | - | String getNote() | setNote(String note) |
| `ProjectUrl` | `String` | Required | - | String getProjectUrl() | setProjectUrl(String projectUrl) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "after_id": null,
  "archived": false,
  "column_id": 154,
  "column_url": "column_url2",
  "content_url": null,
  "created_at": "2016-03-13T12:52:32.123Z",
  "creator": {
    "key1": "val1",
    "key2": "val2"
  },
  "id": 112,
  "node_id": "node_id2",
  "note": "note4",
  "project_url": "project_url6",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4"
}
```

