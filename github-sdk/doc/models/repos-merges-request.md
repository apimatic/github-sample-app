
# Repos Merges Request

## Structure

`ReposMergesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Base` | `String` | Required | The name of the base branch that the head will be merged into. | String getBase() | setBase(String base) |
| `Head` | `String` | Required | The head to merge. This can be a branch name or a commit SHA1. | String getHead() | setHead(String head) |
| `CommitMessage` | `String` | Optional | Commit message to use for the merge commit. If omitted, a default message will be used. | String getCommitMessage() | setCommitMessage(String commitMessage) |

## Example (as JSON)

```json
{
  "base": "base6",
  "head": "head8",
  "commit_message": null
}
```

