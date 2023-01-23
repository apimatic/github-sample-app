
# User Keys Response

## Structure

`UserKeysResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Required | - | String getKey() | setKey(String key) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Verified` | `boolean` | Required | - | boolean getVerified() | setVerified(boolean verified) |
| `ReadOnly` | `boolean` | Required | - | boolean getReadOnly() | setReadOnly(boolean readOnly) |

## Example (as JSON)

```json
{
  "key": "key0",
  "id": 112,
  "url": "url4",
  "title": "title4",
  "created_at": "2016-03-13T12:52:32.123Z",
  "verified": false,
  "read_only": false
}
```

