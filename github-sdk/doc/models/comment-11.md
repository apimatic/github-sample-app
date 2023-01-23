
# Comment 11

## Structure

`Comment11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | The text of the comment. | String getBody() | setBody(String body) |
| `CommitId` | `String` | Required | The SHA of the commit to which the comment applies. | String getCommitId() | setCommitId(String commitId) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | The ID of the commit comment. | int getId() | setId(int id) |
| `Line` | `Integer` | Required | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | Integer getLine() | setLine(Integer line) |
| `NodeId` | `String` | Required | The node ID of the commit comment. | String getNodeId() | setNodeId(String nodeId) |
| `Path` | `String` | Required | The relative path of the file to which the comment applies. | String getPath() | setPath(String path) |
| `Position` | `Integer` | Required | The line index in the diff to which the comment applies. | Integer getPosition() | setPosition(Integer position) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "author_association": "COLLABORATOR",
  "body": "body6",
  "commit_id": "commit_id4",
  "created_at": "created_at2",
  "html_url": "html_url0",
  "id": 112,
  "line": 200,
  "node_id": "node_id2",
  "path": "path6",
  "position": 142,
  "reactions": null,
  "updated_at": "updated_at4",
  "url": "url4",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

