
# Commit 10

## Structure

`Commit10`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `Commit` | [`Commit11`](../../doc/models/commit-11.md) | Required | - | Commit11 getCommit() | setCommit(Commit11 commit) |
| `Committer` | `Object` | Required | - | Object getCommitter() | setCommitter(Object committer) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Parents` | [`List<Parent71>`](../../doc/models/parent-71.md) | Required | - | List<Parent71> getParents() | setParents(List<Parent71> parents) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "author": {
    "key1": "val1",
    "key2": "val2"
  },
  "comments_url": "comments_url4",
  "commit": {
    "author": {
      "date": "2016-03-13T12:52:32.123Z",
      "email": "email4",
      "name": "name2",
      "username": null
    },
    "comment_count": 16,
    "committer": {
      "date": "2016-03-13T12:52:32.123Z",
      "email": "email4",
      "name": "name2",
      "username": null
    },
    "message": "message2",
    "tree": {
      "sha": "sha6",
      "url": "url4"
    },
    "url": "url2",
    "verification": {
      "payload": "payload2",
      "reason": "valid",
      "signature": "signature4",
      "verified": false
    }
  },
  "committer": {
    "key1": "val1",
    "key2": "val2"
  },
  "html_url": "html_url0",
  "node_id": "node_id2",
  "parents": [
    {
      "html_url": "html_url0",
      "sha": "sha6",
      "url": "url4"
    },
    {
      "html_url": "html_url9",
      "sha": "sha7",
      "url": "url5"
    },
    {
      "html_url": "html_url8",
      "sha": "sha8",
      "url": "url6"
    }
  ],
  "sha": "sha6",
  "url": "url4"
}
```

