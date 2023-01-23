
# Repos Contents Path Request

## Structure

`ReposContentsPathRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | The commit message. | String getMessage() | setMessage(String message) |
| `Content` | `String` | Required | The new file content, using Base64 encoding. | String getContent() | setContent(String content) |
| `Sha` | `String` | Optional | **Required if you are updating a file**. The blob SHA of the file being replaced. | String getSha() | setSha(String sha) |
| `Branch` | `String` | Optional | The branch name. Default: the repository’s default branch (usually `master`) | String getBranch() | setBranch(String branch) |
| `Committer` | [`Committer8`](../../doc/models/committer-8.md) | Optional | - | Committer8 getCommitter() | setCommitter(Committer8 committer) |
| `Author` | [`Author16`](../../doc/models/author-16.md) | Optional | - | Author16 getAuthor() | setAuthor(Author16 author) |

## Example (as JSON)

```json
{
  "message": "message0",
  "content": "content4",
  "sha": null,
  "branch": null,
  "committer": null,
  "author": null
}
```

