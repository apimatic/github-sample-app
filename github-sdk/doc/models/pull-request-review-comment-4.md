
# Pull Request Review Comment 4

Pull Request Review Comments are comments on a portion of the Pull Request's diff.

## Structure

`PullRequestReviewComment4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | URL for the pull request review comment | String getUrl() | setUrl(String url) |
| `PullRequestReviewId` | `Integer` | Required | The ID of the pull request review to which the comment belongs. | Integer getPullRequestReviewId() | setPullRequestReviewId(Integer pullRequestReviewId) |
| `Id` | `int` | Required | The ID of the pull request review comment. | int getId() | setId(int id) |
| `NodeId` | `String` | Required | The node ID of the pull request review comment. | String getNodeId() | setNodeId(String nodeId) |
| `DiffHunk` | `String` | Required | The diff of the line that the comment refers to. | String getDiffHunk() | setDiffHunk(String diffHunk) |
| `Path` | `String` | Required | The relative path of the file to which the comment applies. | String getPath() | setPath(String path) |
| `Position` | `int` | Required | The line index in the diff to which the comment applies. This field is deprecated; use `line` instead. | int getPosition() | setPosition(int position) |
| `OriginalPosition` | `int` | Required | The index of the original line in the diff to which the comment applies. This field is deprecated; use `original_line` instead. | int getOriginalPosition() | setOriginalPosition(int originalPosition) |
| `CommitId` | `String` | Required | The SHA of the commit to which the comment applies. | String getCommitId() | setCommitId(String commitId) |
| `OriginalCommitId` | `String` | Required | The SHA of the original commit to which the comment applies. | String getOriginalCommitId() | setOriginalCommitId(String originalCommitId) |
| `InReplyToId` | `Integer` | Optional | The comment ID to reply to. | Integer getInReplyToId() | setInReplyToId(Integer inReplyToId) |
| `User` | [`User2`](../../doc/models/user-2.md) | Required | - | User2 getUser() | setUser(User2 user) |
| `Body` | `String` | Required | The text of the comment. | String getBody() | setBody(String body) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `HtmlUrl` | `String` | Required | HTML URL for the pull request review comment. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `PullRequestUrl` | `String` | Required | URL for the pull request that the review comment belongs to. | String getPullRequestUrl() | setPullRequestUrl(String pullRequestUrl) |
| `AuthorAssociation` | `Object` | Required | - | Object getAuthorAssociation() | setAuthorAssociation(Object authorAssociation) |
| `Links` | [`Links11`](../../doc/models/links-11.md) | Required | - | Links11 getLinks() | setLinks(Links11 links) |
| `StartLine` | `Integer` | Optional | The first line of the range for a multi-line comment. | Integer getStartLine() | setStartLine(Integer startLine) |
| `OriginalStartLine` | `Integer` | Optional | The first line of the range for a multi-line comment. | Integer getOriginalStartLine() | setOriginalStartLine(Integer originalStartLine) |
| `StartSide` | `Object` | Optional | - | Object getStartSide() | setStartSide(Object startSide) |
| `Line` | `int` | Required | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | int getLine() | setLine(int line) |
| `OriginalLine` | `Integer` | Optional | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | Integer getOriginalLine() | setOriginalLine(Integer originalLine) |
| `Side` | [`SideEnum`](../../doc/models/side-enum.md) | Optional | - | SideEnum getSide() | setSide(SideEnum side) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `BodyText` | `String` | Optional | - | String getBodyText() | setBodyText(String bodyText) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/pulls/comments/1",
  "pull_request_review_id": 42,
  "id": 1,
  "node_id": "MDI0OlB1bGxSZXF1ZXN0UmV2aWV3Q29tbWVudDEw",
  "diff_hunk": "@@ -16,33 +16,40 @@ public class Connection : IConnection...",
  "path": "config/database.yaml",
  "position": 1,
  "original_position": 4,
  "commit_id": "6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "original_commit_id": "9c48853fa3dc5c1c3d6f1f1cd1f2743e72652840",
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": null
  },
  "body": "We should probably include a check for null values here.",
  "created_at": "04/14/2011 16:00:49",
  "updated_at": "04/14/2011 16:00:49",
  "html_url": "https://github.com/octocat/Hello-World/pull/1#discussion-diff-1",
  "pull_request_url": "https://api.github.com/repos/octocat/Hello-World/pulls/1",
  "author_association": null,
  "_links": null,
  "line": 2
}
```

