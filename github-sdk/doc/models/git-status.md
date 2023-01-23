
# Git Status

Details about the codespace's git repository.

## Structure

`GitStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ahead` | `Integer` | Optional | The number of commits the local repository is ahead of the remote. | Integer getAhead() | setAhead(Integer ahead) |
| `Behind` | `Integer` | Optional | The number of commits the local repository is behind the remote. | Integer getBehind() | setBehind(Integer behind) |
| `HasUnpushedChanges` | `Boolean` | Optional | Whether the local repository has unpushed changes. | Boolean getHasUnpushedChanges() | setHasUnpushedChanges(Boolean hasUnpushedChanges) |
| `HasUncommittedChanges` | `Boolean` | Optional | Whether the local repository has uncommitted changes. | Boolean getHasUncommittedChanges() | setHasUncommittedChanges(Boolean hasUncommittedChanges) |
| `Ref` | `String` | Optional | The current branch (or SHA if in detached HEAD state) of the local repository. | String getRef() | setRef(String ref) |

## Example (as JSON)

```json
{
  "ahead": null,
  "behind": null,
  "has_unpushed_changes": null,
  "has_uncommitted_changes": null,
  "ref": null
}
```

