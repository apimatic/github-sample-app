
# Legacy Review Comment

Legacy Review Comment

## Structure

`LegacyReviewComment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `PullRequestReviewId` | `Integer` | Required | - | Integer getPullRequestReviewId() | setPullRequestReviewId(Integer pullRequestReviewId) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `DiffHunk` | `String` | Required | - | String getDiffHunk() | setDiffHunk(String diffHunk) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Position` | `Integer` | Required | - | Integer getPosition() | setPosition(Integer position) |
| `OriginalPosition` | `int` | Required | - | int getOriginalPosition() | setOriginalPosition(int originalPosition) |
| `CommitId` | `String` | Required | - | String getCommitId() | setCommitId(String commitId) |
| `OriginalCommitId` | `String` | Required | - | String getOriginalCommitId() | setOriginalCommitId(String originalCommitId) |
| `InReplyToId` | `Integer` | Optional | - | Integer getInReplyToId() | setInReplyToId(Integer inReplyToId) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `PullRequestUrl` | `String` | Required | - | String getPullRequestUrl() | setPullRequestUrl(String pullRequestUrl) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Links` | [`Links11`](../../doc/models/links-11.md) | Required | - | Links11 getLinks() | setLinks(Links11 links) |
| `BodyText` | `String` | Optional | - | String getBodyText() | setBodyText(String bodyText) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `Side` | [`Side1Enum`](../../doc/models/side-1-enum.md) | Optional | - | Side1Enum getSide() | setSide(Side1Enum side) |
| `StartSide` | `Object` | Optional | - | Object getStartSide() | setStartSide(Object startSide) |
| `Line` | `Integer` | Optional | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | Integer getLine() | setLine(Integer line) |
| `OriginalLine` | `Integer` | Optional | The original line of the blob to which the comment applies. The last line of the range for a multi-line comment | Integer getOriginalLine() | setOriginalLine(Integer originalLine) |
| `StartLine` | `Integer` | Optional | The first line of the range for a multi-line comment. | Integer getStartLine() | setStartLine(Integer startLine) |
| `OriginalStartLine` | `Integer` | Optional | The original first line of the range for a multi-line comment. | Integer getOriginalStartLine() | setOriginalStartLine(Integer originalStartLine) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/pulls/comments/1",
  "pull_request_review_id": 42,
  "id": 10,
  "node_id": "MDI0OlB1bGxSZXF1ZXN0UmV2aWV3Q29tbWVudDEw",
  "diff_hunk": "@@ -16,33 +16,40 @@ public class Connection : IConnection...",
  "path": "file1.txt",
  "position": 1,
  "original_position": 4,
  "commit_id": "6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "original_commit_id": "9c48853fa3dc5c1c3d6f1f1cd1f2743e72652840",
  "user": null,
  "body": "Great stuff",
  "created_at": "04/14/2011 16:00:49",
  "updated_at": "04/14/2011 16:00:49",
  "html_url": "https://github.com/octocat/Hello-World/pull/1#discussion-diff-1",
  "pull_request_url": "https://api.github.com/repos/octocat/Hello-World/pulls/1",
  "author_association": null,
  "_links": null
}
```

