
# Comment 8

## Structure

`Comment8`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Links` | [`Links11`](../../doc/models/links-11.md) | Required | - | Links11 getLinks() | setLinks(Links11 links) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | The text of the comment. | String getBody() | setBody(String body) |
| `CommitId` | `String` | Required | The SHA of the commit to which the comment applies. | String getCommitId() | setCommitId(String commitId) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DiffHunk` | `String` | Required | The diff of the line that the comment refers to. | String getDiffHunk() | setDiffHunk(String diffHunk) |
| `HtmlUrl` | `String` | Required | HTML URL for the pull request review comment. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | The ID of the pull request review comment. | int getId() | setId(int id) |
| `InReplyToId` | `Integer` | Optional | The comment ID to reply to. | Integer getInReplyToId() | setInReplyToId(Integer inReplyToId) |
| `Line` | `Integer` | Required | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | Integer getLine() | setLine(Integer line) |
| `NodeId` | `String` | Required | The node ID of the pull request review comment. | String getNodeId() | setNodeId(String nodeId) |
| `OriginalCommitId` | `String` | Required | The SHA of the original commit to which the comment applies. | String getOriginalCommitId() | setOriginalCommitId(String originalCommitId) |
| `OriginalLine` | `Integer` | Required | The line of the blob to which the comment applies. The last line of the range for a multi-line comment | Integer getOriginalLine() | setOriginalLine(Integer originalLine) |
| `OriginalPosition` | `int` | Required | The index of the original line in the diff to which the comment applies. | int getOriginalPosition() | setOriginalPosition(int originalPosition) |
| `OriginalStartLine` | `Integer` | Required | The first line of the range for a multi-line comment. | Integer getOriginalStartLine() | setOriginalStartLine(Integer originalStartLine) |
| `Path` | `String` | Required | The relative path of the file to which the comment applies. | String getPath() | setPath(String path) |
| `Position` | `Integer` | Required | The line index in the diff to which the comment applies. | Integer getPosition() | setPosition(Integer position) |
| `PullRequestReviewId` | `Integer` | Required | The ID of the pull request review to which the comment belongs. | Integer getPullRequestReviewId() | setPullRequestReviewId(Integer pullRequestReviewId) |
| `PullRequestUrl` | `String` | Required | URL for the pull request that the review comment belongs to. | String getPullRequestUrl() | setPullRequestUrl(String pullRequestUrl) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Required | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `Side` | [`Side1Enum`](../../doc/models/side-1-enum.md) | Required | - | Side1Enum getSide() | setSide(Side1Enum side) |
| `StartLine` | `Integer` | Required | The first line of the range for a multi-line comment. | Integer getStartLine() | setStartLine(Integer startLine) |
| `StartSide` | `Object` | Required | - | Object getStartSide() | setStartSide(Object startSide) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | URL for the pull request review comment | String getUrl() | setUrl(String url) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "_links": {
    "self": {
      "href": "href6"
    },
    "html": {
      "href": "href8"
    },
    "pull_request": {
      "href": "href0"
    }
  },
  "author_association": "COLLABORATOR",
  "body": "body6",
  "commit_id": "commit_id4",
  "created_at": "2016-03-13T12:52:32.123Z",
  "diff_hunk": "diff_hunk6",
  "html_url": "html_url0",
  "id": 112,
  "in_reply_to_id": null,
  "line": 200,
  "node_id": "node_id2",
  "original_commit_id": "original_commit_id0",
  "original_line": 210,
  "original_position": 124,
  "original_start_line": 198,
  "path": "path6",
  "position": 142,
  "pull_request_review_id": 116,
  "pull_request_url": "pull_request_url6",
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
  "side": "LEFT",
  "start_line": 194,
  "start_side": {
    "key1": "val1",
    "key2": "val2"
  },
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

