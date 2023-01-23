
# Source 1

The source branch and directory used to publish your Pages site.

## Structure

`Source1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Branch` | `String` | Required | The repository branch used to publish your site's source files. | String getBranch() | setBranch(String branch) |
| `Path` | [`PathEnum`](../../doc/models/path-enum.md) | Optional | - | PathEnum getPath() | setPath(PathEnum path) |

## Example (as JSON)

```json
{
  "branch": "branch6",
  "path": null
}
```

