
# Projects Columns Response

## Structure

`ProjectsColumnsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `ProjectUrl` | `String` | Required | - | String getProjectUrl() | setProjectUrl(String projectUrl) |
| `CardsUrl` | `String` | Required | - | String getCardsUrl() | setCardsUrl(String cardsUrl) |
| `Id` | `int` | Required | The unique identifier of the project column | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | Name of the project column | String getName() | setName(String name) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/projects/columns/367",
  "project_url": "https://api.github.com/projects/120",
  "cards_url": "https://api.github.com/projects/columns/367/cards",
  "id": 42,
  "node_id": "MDEzOlByb2plY3RDb2x1bW4zNjc=",
  "name": "Remaining tasks",
  "created_at": "09/05/2016 14:18:44",
  "updated_at": "09/05/2016 14:22:28"
}
```

