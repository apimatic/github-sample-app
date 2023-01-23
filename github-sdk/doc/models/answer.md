
# Answer

## Structure

`Answer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `ChildCommentCount` | `int` | Required | - | int getChildCommentCount() | setChildCommentCount(int childCommentCount) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DiscussionId` | `int` | Required | - | int getDiscussionId() | setDiscussionId(int discussionId) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `ParentId` | `Object` | Required | - | Object getParentId() | setParentId(Object parentId) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "author_association": "COLLABORATOR",
  "body": "body6",
  "child_comment_count": 200,
  "created_at": "2016-03-13T12:52:32.123Z",
  "discussion_id": 90,
  "html_url": "html_url0",
  "id": 112,
  "node_id": "node_id2",
  "parent_id": {
    "key1": "val1",
    "key2": "val2"
  },
  "reactions": null,
  "repository_url": "repository_url0",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

