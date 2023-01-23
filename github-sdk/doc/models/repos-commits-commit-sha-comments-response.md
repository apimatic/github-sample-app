
# Repos Commits Commit Sha Comments Response

## Structure

`ReposCommitsCommitShaCommentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Position` | `Integer` | Required | - | Integer getPosition() | setPosition(Integer position) |
| `Line` | `Integer` | Required | - | Integer getLine() | setLine(Integer line) |
| `CommitId` | `String` | Required | - | String getCommitId() | setCommitId(String commitId) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |

## Example (as JSON)

```json
{
  "html_url": "html_url0",
  "url": "url4",
  "id": 112,
  "node_id": "node_id2",
  "body": "body6",
  "path": "path6",
  "position": 142,
  "line": 200,
  "commit_id": "commit_id4",
  "user": {
    "key1": "val1",
    "key2": "val2"
  },
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "author_association": "COLLABORATOR",
  "reactions": null
}
```

