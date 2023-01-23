
# Content Traffic

Content Traffic

## Structure

`ContentTraffic`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `Count` | `int` | Required | - | int getCount() | setCount(int count) |
| `Uniques` | `int` | Required | - | int getUniques() | setUniques(int uniques) |

## Example (as JSON)

```json
{
  "path": "/github/hubot",
  "title": "github/hubot: A customizable life embetterment robot.",
  "count": 3542,
  "uniques": 2225
}
```

