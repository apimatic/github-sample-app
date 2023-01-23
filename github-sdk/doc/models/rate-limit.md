
# Rate Limit

## Structure

`RateLimit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Limit` | `int` | Required | - | int getLimit() | setLimit(int limit) |
| `Remaining` | `int` | Required | - | int getRemaining() | setRemaining(int remaining) |
| `Reset` | `int` | Required | - | int getReset() | setReset(int reset) |
| `Used` | `int` | Required | - | int getUsed() | setUsed(int used) |

## Example (as JSON)

```json
{
  "limit": 172,
  "remaining": 76,
  "reset": 12,
  "used": 204
}
```

