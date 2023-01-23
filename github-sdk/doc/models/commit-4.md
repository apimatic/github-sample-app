
# Commit 4

## Structure

`Commit4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Sha` | `String` | Optional | - | String getSha() | setSha(String sha) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Optional | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Author` | [`Author2`](../../doc/models/author-2.md) | Optional | - | Author2 getAuthor() | setAuthor(Author2 author) |
| `Committer` | [`Author2`](../../doc/models/author-2.md) | Optional | - | Author2 getCommitter() | setCommitter(Author2 committer) |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |
| `Tree` | [`Tree1`](../../doc/models/tree-1.md) | Optional | - | Tree1 getTree() | setTree(Tree1 tree) |
| `Parents` | [`List<Parent1>`](../../doc/models/parent-1.md) | Optional | - | List<Parent1> getParents() | setParents(List<Parent1> parents) |
| `Verification` | [`Verification1`](../../doc/models/verification-1.md) | Optional | - | Verification1 getVerification() | setVerification(Verification1 verification) |

## Example (as JSON)

```json
{
  "sha": null,
  "node_id": null,
  "url": null,
  "html_url": null,
  "author": null,
  "committer": null,
  "message": null,
  "tree": null,
  "parents": null,
  "verification": null
}
```

