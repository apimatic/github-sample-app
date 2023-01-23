
# Comment 1

## Structure

`Comment1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `ChildCommentCount` | `int` | Required | - | int getChildCommentCount() | setChildCommentCount(int childCommentCount) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `DiscussionId` | `int` | Required | - | int getDiscussionId() | setDiscussionId(int discussionId) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `ParentId` | `Integer` | Required | - | Integer getParentId() | setParentId(Integer parentId) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Required | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `RepositoryUrl` | `String` | Required | - | String getRepositoryUrl() | setRepositoryUrl(String repositoryUrl) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "author_association": "COLLABORATOR",
  "body": "body6",
  "child_comment_count": 200,
  "created_at": "created_at2",
  "discussion_id": 90,
  "html_url": "html_url0",
  "id": 112,
  "node_id": "node_id2",
  "parent_id": 42,
  "reactions": {
    "url": "url2",
    "total_count": 212,
    "plus1": 166,
    "minus1": 110,
    "laugh": 254,
    "confused": 160,
    "heart": 50,
    "hooray": 92,
    "eyes": 178,
    "rocket": 102
  },
  "repository_url": "repository_url0",
  "updated_at": "updated_at4",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

