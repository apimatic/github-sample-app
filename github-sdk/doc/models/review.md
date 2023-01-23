
# Review

The review that was affected.

## Structure

`Review`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Links` | [`Links10`](../../doc/models/links-10.md) | Required | - | Links10 getLinks() | setLinks(Links10 links) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `Body` | `String` | Required | The text of the review. | String getBody() | setBody(String body) |
| `CommitId` | `String` | Required | A commit SHA for the review. | String getCommitId() | setCommitId(String commitId) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | Unique identifier of the review | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `PullRequestUrl` | `String` | Required | - | String getPullRequestUrl() | setPullRequestUrl(String pullRequestUrl) |
| `State` | [`State136Enum`](../../doc/models/state-136-enum.md) | Required | - | State136Enum getState() | setState(State136Enum state) |
| `SubmittedAt` | `LocalDateTime` | Required | - | LocalDateTime getSubmittedAt() | setSubmittedAt(LocalDateTime submittedAt) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "_links": {
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
  "html_url": "html_url0",
  "id": 112,
  "node_id": "node_id2",
  "pull_request_url": "pull_request_url6",
  "state": "changes_requested",
  "submitted_at": "2016-03-13T12:52:32.123Z",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

