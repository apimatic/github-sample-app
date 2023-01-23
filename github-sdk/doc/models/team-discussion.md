
# Team Discussion

A team discussion is a persistent record of a free-form conversation within a team.

## Structure

`TeamDiscussion`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `Body` | `String` | Required | The main text of the discussion. | String getBody() | setBody(String body) |
| `BodyHtml` | `String` | Required | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `BodyVersion` | `String` | Required | The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server. | String getBodyVersion() | setBodyVersion(String bodyVersion) |
| `CommentsCount` | `int` | Required | - | int getCommentsCount() | setCommentsCount(int commentsCount) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `LastEditedAt` | `LocalDateTime` | Required | - | LocalDateTime getLastEditedAt() | setLastEditedAt(LocalDateTime lastEditedAt) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | The unique sequence number of a team discussion. | int getNumber() | setNumber(int number) |
| `Pinned` | `boolean` | Required | Whether or not this discussion should be pinned for easy retrieval. | boolean getPinned() | setPinned(boolean pinned) |
| `Private` | `boolean` | Required | Whether or not this discussion should be restricted to team members and organization administrators. | boolean getPrivate() | setPrivate(boolean mPrivate) |
| `TeamUrl` | `String` | Required | - | String getTeamUrl() | setTeamUrl(String teamUrl) |
| `Title` | `String` | Required | The title of the discussion. | String getTitle() | setTitle(String title) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |

## Example (as JSON)

```json
{
  "author": null,
  "body": "Please suggest improvements to our workflow in comments.",
  "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
  "body_version": "0307116bbf7ced493b8d8a346c650b71",
  "comments_count": 0,
  "comments_url": "https://api.github.com/organizations/1/team/2343027/discussions/1/comments",
  "created_at": "01/25/2018 18:56:31",
  "last_edited_at": null,
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
  "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
  "number": 42,
  "pinned": true,
  "private": true,
  "team_url": "https://api.github.com/organizations/1/team/2343027",
  "title": "How can we improve our workflow?",
  "updated_at": "01/25/2018 18:56:31",
  "url": "https://api.github.com/organizations/1/team/2343027/discussions/1"
}
```

