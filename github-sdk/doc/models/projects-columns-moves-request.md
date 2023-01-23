
# Projects Columns Moves Request

## Structure

`ProjectsColumnsMovesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Position` | `String` | Required | The position of the column in a project. Can be one of: `first`, `last`, or `after:<column_id>` to place after the specified column.<br>**Constraints**: *Pattern*: `^(?:first\|last\|after:\d+)$` | String getPosition() | setPosition(String position) |

## Example (as JSON)

```json
{
  "position": "last"
}
```

