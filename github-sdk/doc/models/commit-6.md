
# Commit 6

## Structure

`Commit6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | [`Author5`](../../doc/models/author-5.md) | Required | - | Author5 getAuthor() | setAuthor(Author5 author) |
| `Committer` | `Object` | Required | - | Object getCommitter() | setCommitter(Object committer) |
| `CommentCount` | `int` | Required | - | int getCommentCount() | setCommentCount(int commentCount) |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |
| `Tree` | [`Commit3`](../../doc/models/commit-3.md) | Required | - | Commit3 getTree() | setTree(Commit3 tree) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Verification` | [`Verification`](../../doc/models/verification.md) | Optional | - | Verification getVerification() | setVerification(Verification verification) |

## Example (as JSON)

```json
{
  "author": {
    "name": "name0",
    "email": "email6",
    "date": "2016-03-13T12:52:32.123Z"
  },
  "committer": {
    "key1": "val1",
    "key2": "val2"
  },
  "comment_count": 18,
  "message": "message0",
  "tree": {
    "sha": "sha4",
    "url": "url2"
  },
  "url": "url4",
  "verification": null
}
```

