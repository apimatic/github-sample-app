
# User Ssh Signing Keys Response

## Structure

`UserSshSigningKeysResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Required | - | String getKey() | setKey(String key) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |

## Example (as JSON)

```json
{
  "key": "key0",
  "id": 112,
  "title": "title4",
  "created_at": "2016-03-13T12:52:32.123Z"
}
```

