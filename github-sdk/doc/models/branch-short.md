
# Branch Short

Branch Short

## Structure

`BranchShort`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Commit` | [`Commit3`](../../doc/models/commit-3.md) | Required | - | Commit3 getCommit() | setCommit(Commit3 commit) |
| `Protected` | `boolean` | Required | - | boolean getProtected() | setProtected(boolean mProtected) |

## Example (as JSON)

```json
{
  "name": "name0",
  "commit": {
    "sha": "sha4",
    "url": "url2"
  },
  "protected": false
}
```

