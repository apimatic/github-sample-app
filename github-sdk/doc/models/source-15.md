
# Source 15

## Structure

`Source15`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Branch` | `String` | Required | The repository branch used to publish your site's source files. | String getBranch() | setBranch(String branch) |
| `Path` | `Object` | Required | - | Object getPath() | setPath(Object path) |

## Example (as JSON)

```json
{
  "branch": "branch6",
  "path": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

