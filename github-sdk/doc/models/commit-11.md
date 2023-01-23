
# Commit 11

## Structure

`Commit11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | [`Author10`](../../doc/models/author-10.md) | Required | - | Author10 getAuthor() | setAuthor(Author10 author) |
| `CommentCount` | `int` | Required | - | int getCommentCount() | setCommentCount(int commentCount) |
| `Committer` | [`Author10`](../../doc/models/author-10.md) | Required | - | Author10 getCommitter() | setCommitter(Author10 committer) |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |
| `Tree` | [`Commit3`](../../doc/models/commit-3.md) | Required | - | Commit3 getTree() | setTree(Commit3 tree) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Verification` | [`Verification4`](../../doc/models/verification-4.md) | Required | - | Verification4 getVerification() | setVerification(Verification4 verification) |

## Example (as JSON)

```json
{
  "author": {
    "date": "2016-03-13T12:52:32.123Z",
    "email": "email6",
    "name": "name0",
    "username": null
  },
  "comment_count": 18,
  "committer": {
    "date": "2016-03-13T12:52:32.123Z",
    "email": "email2",
    "name": "name4",
    "username": null
  },
  "message": "message0",
  "tree": {
    "sha": "sha4",
    "url": "url2"
  },
  "url": "url4",
  "verification": {
    "payload": "payload0",
    "reason": "unknown_signature_type",
    "signature": "signature2",
    "verified": false
  }
}
```

