
# Contributor Activity

Contributor Activity

## Structure

`ContributorActivity`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `Total` | `int` | Required | - | int getTotal() | setTotal(int total) |
| `Weeks` | [`List<Week>`](../../doc/models/week.md) | Required | - | List<Week> getWeeks() | setWeeks(List<Week> weeks) |

## Example (as JSON)

```json
{
  "author": null,
  "total": 135,
  "weeks": [
    {
      "w": 1367712000,
      "a": 6898,
      "d": 77,
      "c": 10
    }
  ]
}
```

