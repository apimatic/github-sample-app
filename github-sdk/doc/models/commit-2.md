
# Commit 2

## Structure

`Commit2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `Committer` | `Object` | Required | - | Object getCommitter() | setCommitter(Object committer) |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |
| `CommentCount` | `int` | Required | - | int getCommentCount() | setCommentCount(int commentCount) |
| `Tree` | [`Commit3`](../../doc/models/commit-3.md) | Required | - | Commit3 getTree() | setTree(Commit3 tree) |
| `Verification` | [`Verification`](../../doc/models/verification.md) | Optional | - | Verification getVerification() | setVerification(Verification verification) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "author": null,
  "committer": null,
  "message": "Fix all the bugs",
  "comment_count": 0,
  "tree": null
}
```

