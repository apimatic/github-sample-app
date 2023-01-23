
# Orgs Teams Discussions Discussion Number Comments Response

## Structure

`OrgsTeamsDiscussionsDiscussionNumberCommentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `Body` | `String` | Required | The main text of the comment. | String getBody() | setBody(String body) |
| `BodyHtml` | `String` | Required | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `BodyVersion` | `String` | Required | The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server. | String getBodyVersion() | setBodyVersion(String bodyVersion) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `LastEditedAt` | `LocalDateTime` | Required | - | LocalDateTime getLastEditedAt() | setLastEditedAt(LocalDateTime lastEditedAt) |
| `DiscussionUrl` | `String` | Required | - | String getDiscussionUrl() | setDiscussionUrl(String discussionUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | The unique sequence number of a team discussion comment. | int getNumber() | setNumber(int number) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |

## Example (as JSON)

```json
{
  "author": null,
  "body": "I agree with this suggestion.",
  "body_html": "<p>Do you like apples?</p>",
  "body_version": "0307116bbf7ced493b8d8a346c650b71",
  "created_at": "01/15/2018 23:53:58",
  "last_edited_at": null,
  "discussion_url": "https://api.github.com/organizations/1/team/2403582/discussions/1",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
  "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
  "number": 42,
  "updated_at": "01/15/2018 23:53:58",
  "url": "https://api.github.com/organizations/1/team/2403582/discussions/1/comments/1"
}
```

