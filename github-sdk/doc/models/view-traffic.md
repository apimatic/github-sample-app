
# View Traffic

View Traffic

## Structure

`ViewTraffic`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Count` | `int` | Required | - | int getCount() | setCount(int count) |
| `Uniques` | `int` | Required | - | int getUniques() | setUniques(int uniques) |
| `Views` | [`List<Traffic>`](../../doc/models/traffic.md) | Required | - | List<Traffic> getViews() | setViews(List<Traffic> views) |

## Example (as JSON)

```json
{
  "count": 14850,
  "uniques": 3782,
  "views": null
}
```

