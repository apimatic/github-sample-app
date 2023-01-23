
# Reaction

Reactions to conversations provide a way to help people express their feelings more simply and effectively.

## Structure

`Reaction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `Content` | [`ContentEnum`](../../doc/models/content-enum.md) | Required | - | ContentEnum getContent() | setContent(ContentEnum content) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |

## Example (as JSON)

```json
{
  "id": 1,
  "node_id": "MDg6UmVhY3Rpb24x",
  "user": null,
  "content": null,
  "created_at": "05/20/2016 20:09:31"
}
```

