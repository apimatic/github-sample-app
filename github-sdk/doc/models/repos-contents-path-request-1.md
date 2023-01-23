
# Repos Contents Path Request 1

## Structure

`ReposContentsPathRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | The commit message. | String getMessage() | setMessage(String message) |
| `Sha` | `String` | Required | The blob SHA of the file being deleted. | String getSha() | setSha(String sha) |
| `Branch` | `String` | Optional | The branch name. Default: the repository’s default branch (usually `master`) | String getBranch() | setBranch(String branch) |
| `Committer` | [`Committer9`](../../doc/models/committer-9.md) | Optional | - | Committer9 getCommitter() | setCommitter(Committer9 committer) |
| `Author` | [`Author17`](../../doc/models/author-17.md) | Optional | - | Author17 getAuthor() | setAuthor(Author17 author) |

## Example (as JSON)

```json
{
  "message": "message0",
  "sha": "sha6",
  "branch": null,
  "committer": null,
  "author": null
}
```

