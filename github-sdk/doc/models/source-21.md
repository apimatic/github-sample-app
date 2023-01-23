
# Source 21

Update the source for the repository. Must include the branch name and path.

## Structure

`Source21`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Branch` | `String` | Required | The repository branch used to publish your site's source files. | String getBranch() | setBranch(String branch) |
| `Path` | [`Path1Enum`](../../doc/models/path-1-enum.md) | Required | - | Path1Enum getPath() | setPath(Path1Enum path) |

## Example (as JSON)

```json
{
  "branch": "branch6",
  "path": "/"
}
```

