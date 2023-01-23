
# Simple Commit 2

## Structure

`SimpleCommit2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | [`Author62`](../../doc/models/author-62.md) | Required | - | Author62 getAuthor() | setAuthor(Author62 author) |
| `Committer` | [`Committer4`](../../doc/models/committer-4.md) | Required | - | Committer4 getCommitter() | setCommitter(Committer4 committer) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |
| `Timestamp` | `String` | Required | - | String getTimestamp() | setTimestamp(String timestamp) |
| `TreeId` | `String` | Required | - | String getTreeId() | setTreeId(String treeId) |

## Example (as JSON)

```json
{
  "author": {
    "date": null,
    "email": "email6",
    "name": "name0",
    "username": null
  },
  "committer": {
    "date": null,
    "email": "email2",
    "name": "name4",
    "username": null
  },
  "id": "id0",
  "message": "message0",
  "timestamp": "timestamp2",
  "tree_id": "tree_id2"
}
```

