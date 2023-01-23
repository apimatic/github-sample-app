
# Key 1

The [`deploy key`](https://docs.github.com/rest/reference/deployments#get-a-deploy-key) resource.

## Structure

`Key1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddedBy` | `String` | Optional | - | String getAddedBy() | setAddedBy(String addedBy) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Key` | `String` | Required | - | String getKey() | setKey(String key) |
| `LastUsed` | `String` | Optional | - | String getLastUsed() | setLastUsed(String lastUsed) |
| `ReadOnly` | `boolean` | Required | - | boolean getReadOnly() | setReadOnly(boolean readOnly) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Verified` | `boolean` | Required | - | boolean getVerified() | setVerified(boolean verified) |

## Example (as JSON)

```json
{
  "added_by": null,
  "created_at": "created_at2",
  "id": 112,
  "key": "key0",
  "last_used": null,
  "read_only": false,
  "title": "title4",
  "url": "url4",
  "verified": false
}
```

