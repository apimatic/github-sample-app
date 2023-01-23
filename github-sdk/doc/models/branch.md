
# Branch

## Structure

`Branch`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Commit` | [`Commit9`](../../doc/models/commit-9.md) | Required | - | Commit9 getCommit() | setCommit(Commit9 commit) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Protected` | `boolean` | Required | - | boolean getProtected() | setProtected(boolean mProtected) |

## Example (as JSON)

```json
{
  "commit": {
    "sha": "sha4",
    "url": "url2"
  },
  "name": "name0",
  "protected": false
}
```

