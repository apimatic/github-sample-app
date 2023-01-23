
# Gist

Gist

## Structure

`Gist`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `ForksUrl` | `String` | Required | - | String getForksUrl() | setForksUrl(String forksUrl) |
| `CommitsUrl` | `String` | Required | - | String getCommitsUrl() | setCommitsUrl(String commitsUrl) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `GitPullUrl` | `String` | Required | - | String getGitPullUrl() | setGitPullUrl(String gitPullUrl) |
| `GitPushUrl` | `String` | Required | - | String getGitPushUrl() | setGitPushUrl(String gitPushUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Files` | [`Map<String, Files>`](../../doc/models/files.md) | Required | - | Map<String, Files> getFiles() | setFiles(Map<String, Files> files) |
| `Public` | `boolean` | Required | - | boolean getPublic() | setPublic(boolean mPublic) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Comments` | `int` | Required | - | int getComments() | setComments(int comments) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `Owner` | `Object` | Optional | - | Object getOwner() | setOwner(Object owner) |
| `Truncated` | `Boolean` | Optional | - | Boolean getTruncated() | setTruncated(Boolean truncated) |
| `Forks` | `List<Object>` | Optional | - | List<Object> getForks() | setForks(List<Object> forks) |
| `History` | `List<Object>` | Optional | - | List<Object> getHistory() | setHistory(List<Object> history) |

## Example (as JSON)

```json
{
  "url": "url4",
  "forks_url": "forks_url4",
  "commits_url": "commits_url4",
  "id": "id0",
  "node_id": "node_id2",
  "git_pull_url": "git_pull_url0",
  "git_push_url": "git_push_url0",
  "html_url": "html_url0",
  "files": {
    "key0": {
      "filename": null,
      "type": null,
      "language": null,
      "raw_url": null,
      "size": null
    },
    "key1": {
      "filename": null,
      "type": null,
      "language": null,
      "raw_url": null,
      "size": null
    }
  },
  "public": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "description": "description0",
  "comments": 182,
  "user": {
    "key1": "val1",
    "key2": "val2"
  },
  "comments_url": "comments_url4",
  "owner": null,
  "truncated": null,
  "forks": null,
  "history": null
}
```

