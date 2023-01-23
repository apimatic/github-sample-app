
# Repos Git Commits Commit Sha Response

## Structure

`ReposGitCommitsCommitShaResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Sha` | `String` | Required | SHA for the commit | String getSha() | setSha(String sha) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Author` | [`Author1`](../../doc/models/author-1.md) | Required | - | Author1 getAuthor() | setAuthor(Author1 author) |
| `Committer` | [`Committer1`](../../doc/models/committer-1.md) | Required | - | Committer1 getCommitter() | setCommitter(Committer1 committer) |
| `Message` | `String` | Required | Message describing the purpose of the commit | String getMessage() | setMessage(String message) |
| `Tree` | [`Tree2`](../../doc/models/tree-2.md) | Required | - | Tree2 getTree() | setTree(Tree2 tree) |
| `Parents` | [`List<Parent2>`](../../doc/models/parent-2.md) | Required | - | List<Parent2> getParents() | setParents(List<Parent2> parents) |
| `Verification` | [`Verification`](../../doc/models/verification.md) | Required | - | Verification getVerification() | setVerification(Verification verification) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |

## Example (as JSON)

```json
{
  "sha": "7638417db6d59f3c431d3e1f261cc637155684cd",
  "node_id": null,
  "url": null,
  "author": {
    "date": "08/09/2014 01:02:04",
    "email": "monalisa.octocat@example.com",
    "name": "Monalisa Octocat"
  },
  "committer": {
    "date": "08/09/2014 01:02:04",
    "email": "monalisa.octocat@example.com",
    "name": "Monalisa Octocat"
  },
  "message": "Fix #42",
  "tree": {
    "sha": "7638417db6d59f3c431d3e1f261cc637155684cd",
    "url": null
  },
  "parents": {
    "sha": "7638417db6d59f3c431d3e1f261cc637155684cd",
    "url": null,
    "html_url": null
  },
  "verification": null,
  "html_url": null
}
```

