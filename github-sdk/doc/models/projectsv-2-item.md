
# Projectsv 2 Item

An item belonging to a project

## Structure

`Projectsv2Item`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `double` | Required | - | double getId() | setId(double id) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `ProjectNodeId` | `String` | Optional | - | String getProjectNodeId() | setProjectNodeId(String projectNodeId) |
| `ContentNodeId` | `String` | Required | - | String getContentNodeId() | setContentNodeId(String contentNodeId) |
| `ContentType` | [`Projectsv2ItemContentTypeEnum`](../../doc/models/projectsv-2-item-content-type-enum.md) | Required | - | Projectsv2ItemContentTypeEnum getContentType() | setContentType(Projectsv2ItemContentTypeEnum contentType) |
| `Creator` | [`Creator`](../../doc/models/creator.md) | Optional | - | Creator getCreator() | setCreator(Creator creator) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `ArchivedAt` | `LocalDateTime` | Required | - | LocalDateTime getArchivedAt() | setArchivedAt(LocalDateTime archivedAt) |

## Example (as JSON)

```json
{
  "id": null,
  "content_node_id": null,
  "content_type": null,
  "created_at": "04/28/2022 12:00:00",
  "updated_at": "04/28/2022 12:00:00",
  "archived_at": "04/28/2022 12:00:00"
}
```

