
# Repos Merges Response

## Structure

`ReposMergesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `Commit` | [`Commit2`](../../doc/models/commit-2.md) | Required | - | Commit2 getCommit() | setCommit(Commit2 commit) |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `Committer` | `Object` | Required | - | Object getCommitter() | setCommitter(Object committer) |
| `Parents` | [`List<Parent>`](../../doc/models/parent.md) | Required | - | List<Parent> getParents() | setParents(List<Parent> parents) |
| `Stats` | [`ChangeStatus`](../../doc/models/change-status.md) | Optional | - | ChangeStatus getStats() | setStats(ChangeStatus stats) |
| `Files` | [`List<DiffEntry>`](../../doc/models/diff-entry.md) | Optional | - | List<DiffEntry> getFiles() | setFiles(List<DiffEntry> files) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "sha": "6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "node_id": "MDY6Q29tbWl0NmRjYjA5YjViNTc4NzVmMzM0ZjYxYWViZWQ2OTVlMmU0MTkzZGI1ZQ==",
  "html_url": "https://github.com/octocat/Hello-World/commit/6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "comments_url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e/comments",
  "commit": {
    "url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
    "author": null,
    "committer": null,
    "message": "Fix all the bugs",
    "comment_count": 0,
    "tree": null
  },
  "author": null,
  "committer": null,
  "parents": {
    "sha": "7638417db6d59f3c431d3e1f261cc637155684cd",
    "url": "https://api.github.com/repos/octocat/Hello-World/commits/7638417db6d59f3c431d3e1f261cc637155684cd"
  }
}
```

