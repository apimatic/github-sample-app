
# Merge Group

## Structure

`MergeGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HeadSha` | `String` | Required | The SHA of the merge group. | String getHeadSha() | setHeadSha(String headSha) |
| `HeadRef` | `String` | Required | The full ref of the merge group. | String getHeadRef() | setHeadRef(String headRef) |
| `BaseSha` | `String` | Required | The SHA of the merge group's parent commit. | String getBaseSha() | setBaseSha(String baseSha) |
| `BaseRef` | `String` | Required | The full ref of the branch the merge group will be merged into. | String getBaseRef() | setBaseRef(String baseRef) |
| `HeadCommit` | [`SimpleCommit2`](../../doc/models/simple-commit-2.md) | Required | - | SimpleCommit2 getHeadCommit() | setHeadCommit(SimpleCommit2 headCommit) |

## Example (as JSON)

```json
{
  "head_sha": "head_sha6",
  "head_ref": "head_ref0",
  "base_sha": "base_sha0",
  "base_ref": "base_ref6",
  "head_commit": {
    "author": {
      "date": null,
      "email": "email8",
      "name": "name8",
      "username": null
    },
    "committer": {
      "date": null,
      "email": "email6",
      "name": "name2",
      "username": null
    },
    "id": "id8",
    "message": "message8",
    "timestamp": "timestamp6",
    "tree_id": "tree_id0"
  }
}
```

