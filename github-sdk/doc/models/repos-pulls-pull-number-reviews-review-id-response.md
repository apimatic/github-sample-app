
# Repos Pulls Pull Number Reviews Review Id Response

## Structure

`ReposPullsPullNumberReviewsReviewIdResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the review | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `Body` | `String` | Required | The text of the review. | String getBody() | setBody(String body) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `PullRequestUrl` | `String` | Required | - | String getPullRequestUrl() | setPullRequestUrl(String pullRequestUrl) |
| `Links` | [`Links10`](../../doc/models/links-10.md) | Required | - | Links10 getLinks() | setLinks(Links10 links) |
| `SubmittedAt` | `LocalDateTime` | Optional | - | LocalDateTime getSubmittedAt() | setSubmittedAt(LocalDateTime submittedAt) |
| `CommitId` | `String` | Required | A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer exists in Git and this value will be `null`. | String getCommitId() | setCommitId(String commitId) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `BodyText` | `String` | Optional | - | String getBodyText() | setBodyText(String bodyText) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |

## Example (as JSON)

```json
{
  "id": 42,
  "node_id": "MDE3OlB1bGxSZXF1ZXN0UmV2aWV3ODA=",
  "user": null,
  "body": "This looks great.",
  "state": "CHANGES_REQUESTED",
  "html_url": "https://github.com/octocat/Hello-World/pull/12#pullrequestreview-80",
  "pull_request_url": "https://api.github.com/repos/octocat/Hello-World/pulls/12",
  "_links": null,
  "commit_id": "54bb654c9e6025347f57900a4a5c2313a96b8035",
  "author_association": null
}
```

