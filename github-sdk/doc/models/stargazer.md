
# Stargazer

Stargazer

## Structure

`Stargazer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StarredAt` | `LocalDateTime` | Required | - | LocalDateTime getStarredAt() | setStarredAt(LocalDateTime starredAt) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "starred_at": "2016-03-13T12:52:32.123Z",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

