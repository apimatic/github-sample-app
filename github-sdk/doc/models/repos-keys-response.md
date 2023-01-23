
# Repos Keys Response

## Structure

`ReposKeysResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Key` | `String` | Required | - | String getKey() | setKey(String key) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `Verified` | `boolean` | Required | - | boolean getVerified() | setVerified(boolean verified) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `ReadOnly` | `boolean` | Required | - | boolean getReadOnly() | setReadOnly(boolean readOnly) |
| `AddedBy` | `String` | Optional | - | String getAddedBy() | setAddedBy(String addedBy) |
| `LastUsed` | `String` | Optional | - | String getLastUsed() | setLastUsed(String lastUsed) |

## Example (as JSON)

```json
{
  "id": 112,
  "key": "key0",
  "url": "url4",
  "title": "title4",
  "verified": false,
  "created_at": "created_at2",
  "read_only": false,
  "added_by": null,
  "last_used": null
}
```

