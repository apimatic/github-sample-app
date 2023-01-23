
# Comment 13

## Structure

`Comment13`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the issue comment | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | URL for the issue comment | String getUrl() | setUrl(String url) |
| `Body` | `String` | Optional | Contents of the issue comment | String getBody() | setBody(String body) |
| `BodyText` | `String` | Optional | - | String getBodyText() | setBodyText(String bodyText) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `IssueUrl` | `String` | Required | - | String getIssueUrl() | setIssueUrl(String issueUrl) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `PerformedViaGithubApp` | `Object` | Optional | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |

## Example (as JSON)

```json
{
  "id": 42,
  "node_id": null,
  "url": "https://api.github.com/repositories/42/issues/comments/1",
  "html_url": null,
  "user": null,
  "created_at": "04/14/2011 16:00:49",
  "updated_at": "04/14/2011 16:00:49",
  "issue_url": null,
  "author_association": null
}
```

