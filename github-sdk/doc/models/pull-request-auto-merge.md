
# Pull Request Auto Merge

The status of auto merging a pull request.

## Structure

`PullRequestAutoMerge`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CommitMessage` | `String` | Required | Commit message for the merge commit. | String getCommitMessage() | setCommitMessage(String commitMessage) |
| `CommitTitle` | `String` | Required | Title for the merge commit message. | String getCommitTitle() | setCommitTitle(String commitTitle) |
| `EnabledBy` | `Object` | Required | - | Object getEnabledBy() | setEnabledBy(Object enabledBy) |
| `MergeMethod` | [`MergeMethodEnum`](../../doc/models/merge-method-enum.md) | Required | - | MergeMethodEnum getMergeMethod() | setMergeMethod(MergeMethodEnum mergeMethod) |

## Example (as JSON)

```json
{
  "commit_message": "commit_message0",
  "commit_title": "commit_title6",
  "enabled_by": {
    "key1": "val1",
    "key2": "val2"
  },
  "merge_method": "merge"
}
```

