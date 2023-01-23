
# Traffic

## Structure

`Traffic`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Timestamp` | `LocalDateTime` | Required | - | LocalDateTime getTimestamp() | setTimestamp(LocalDateTime timestamp) |
| `Uniques` | `int` | Required | - | int getUniques() | setUniques(int uniques) |
| `Count` | `int` | Required | - | int getCount() | setCount(int count) |

## Example (as JSON)

```json
{
  "timestamp": "2016-03-13T12:52:32.123Z",
  "uniques": 252,
  "count": 60
}
```

