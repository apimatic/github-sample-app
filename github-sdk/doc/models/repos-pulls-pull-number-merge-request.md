
# Repos Pulls Pull Number Merge Request

## Structure

`ReposPullsPullNumberMergeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CommitTitle` | `String` | Optional | Title for the automatic commit message. | String getCommitTitle() | setCommitTitle(String commitTitle) |
| `CommitMessage` | `String` | Optional | Extra detail to append to automatic commit message. | String getCommitMessage() | setCommitMessage(String commitMessage) |
| `Sha` | `String` | Optional | SHA that pull request head must match to allow merge. | String getSha() | setSha(String sha) |
| `MergeMethod` | [`MergeMethodEnum`](../../doc/models/merge-method-enum.md) | Optional | - | MergeMethodEnum getMergeMethod() | setMergeMethod(MergeMethodEnum mergeMethod) |

## Example (as JSON)

```json
{
  "commit_title": null,
  "commit_message": null,
  "sha": null,
  "merge_method": null
}
```

