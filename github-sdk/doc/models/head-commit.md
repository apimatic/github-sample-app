
# Head Commit

## Structure

`HeadCommit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `TreeId` | `String` | Required | - | String getTreeId() | setTreeId(String treeId) |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |
| `Timestamp` | `LocalDateTime` | Required | - | LocalDateTime getTimestamp() | setTimestamp(LocalDateTime timestamp) |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `Committer` | `Object` | Required | - | Object getCommitter() | setCommitter(Object committer) |

## Example (as JSON)

```json
{
  "id": "id0",
  "tree_id": "tree_id2",
  "message": "message0",
  "timestamp": "2016-03-13T12:52:32.123Z",
  "author": {
    "key1": "val1",
    "key2": "val2"
  },
  "committer": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

