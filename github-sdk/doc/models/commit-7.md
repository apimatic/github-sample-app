
# Commit 7

## Structure

`Commit7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Added` | `List<String>` | Optional | An array of files added in the commit. | List<String> getAdded() | setAdded(List<String> added) |
| `Author` | [`Author62`](../../doc/models/author-62.md) | Required | - | Author62 getAuthor() | setAuthor(Author62 author) |
| `Committer` | [`Committer4`](../../doc/models/committer-4.md) | Required | - | Committer4 getCommitter() | setCommitter(Committer4 committer) |
| `Distinct` | `boolean` | Required | Whether this commit is distinct from any that have been pushed before. | boolean getDistinct() | setDistinct(boolean distinct) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Message` | `String` | Required | The commit message. | String getMessage() | setMessage(String message) |
| `Modified` | `List<String>` | Optional | An array of files modified by the commit. | List<String> getModified() | setModified(List<String> modified) |
| `Removed` | `List<String>` | Optional | An array of files removed in the commit. | List<String> getRemoved() | setRemoved(List<String> removed) |
| `Timestamp` | `LocalDateTime` | Required | The ISO 8601 timestamp of the commit. | LocalDateTime getTimestamp() | setTimestamp(LocalDateTime timestamp) |
| `TreeId` | `String` | Required | - | String getTreeId() | setTreeId(String treeId) |
| `Url` | `String` | Required | URL that points to the commit API resource. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "added": null,
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
  "distinct": false,
  "id": "id0",
  "message": "message0",
  "modified": null,
  "removed": null,
  "timestamp": "2016-03-13T12:52:32.123Z",
  "tree_id": "tree_id2",
  "url": "url4"
}
```

