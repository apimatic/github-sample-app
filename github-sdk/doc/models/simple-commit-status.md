
# Simple Commit Status

## Structure

`SimpleCommitStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `Context` | `String` | Required | - | String getContext() | setContext(String context) |
| `TargetUrl` | `String` | Required | - | String getTargetUrl() | setTargetUrl(String targetUrl) |
| `Required` | `Boolean` | Optional | - | Boolean getRequired() | setRequired(Boolean required) |
| `AvatarUrl` | `String` | Required | - | String getAvatarUrl() | setAvatarUrl(String avatarUrl) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "description": "description0",
  "id": 112,
  "node_id": "node_id2",
  "state": "state4",
  "context": "context2",
  "target_url": "target_url2",
  "required": null,
  "avatar_url": "avatar_url6",
  "url": "url4",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z"
}
```

