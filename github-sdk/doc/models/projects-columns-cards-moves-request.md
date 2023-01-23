
# Projects Columns Cards Moves Request

## Structure

`ProjectsColumnsCardsMovesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Position` | `String` | Required | The position of the card in a column. Can be one of: `top`, `bottom`, or `after:<card_id>` to place after the specified card.<br>**Constraints**: *Pattern*: `^(?:top\|bottom\|after:\d+)$` | String getPosition() | setPosition(String position) |
| `ColumnId` | `Integer` | Optional | The unique identifier of the column the card should be moved to | Integer getColumnId() | setColumnId(Integer columnId) |

## Example (as JSON)

```json
{
  "position": "bottom"
}
```

