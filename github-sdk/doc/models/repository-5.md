
# Repository 5

## Structure

`Repository5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FullName` | `String` | Required | - | String getFullName() | setFullName(String fullName) |
| `Id` | `int` | Required | Unique identifier of the repository | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of the repository. | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Private` | `boolean` | Required | Whether the repository is private or public. | boolean getPrivate() | setPrivate(boolean mPrivate) |

## Example (as JSON)

```json
{
  "full_name": "full_name6",
  "id": 112,
  "name": "name0",
  "node_id": "node_id2",
  "private": false
}
```

