
# Comment 5

## Structure

`Comment5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | Contents of the issue comment | String getBody() | setBody(String body) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | Unique identifier of the issue comment | int getId() | setId(int id) |
| `IssueUrl` | `String` | Required | - | String getIssueUrl() | setIssueUrl(String issueUrl) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `PerformedViaGithubApp` | `Object` | Required | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Required | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | URL for the issue comment | String getUrl() | setUrl(String url) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "author_association": "COLLABORATOR",
  "body": "body6",
  "created_at": "2016-03-13T12:52:32.123Z",
  "html_url": "html_url0",
  "id": 112,
  "issue_url": "issue_url4",
  "node_id": "node_id2",
  "performed_via_github_app": {
    "key1": "val1",
    "key2": "val2"
  },
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
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

