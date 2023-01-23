
# Repos Traffic Clones Response

## Structure

`ReposTrafficClonesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Count` | `int` | Required | - | int getCount() | setCount(int count) |
| `Uniques` | `int` | Required | - | int getUniques() | setUniques(int uniques) |
| `Clones` | [`List<Traffic>`](../../doc/models/traffic.md) | Required | - | List<Traffic> getClones() | setClones(List<Traffic> clones) |

## Example (as JSON)

```json
{
  "count": 173,
  "uniques": 128,
  "clones": null
}
```

