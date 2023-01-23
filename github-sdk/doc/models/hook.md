
# Hook

The modified webhook. This will contain different keys based on the type of webhook it is: repository, organization, business, app, or GitHub Marketplace.

## Structure

`Hook`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Active` | `boolean` | Required | - | boolean getActive() | setActive(boolean active) |
| `Config` | [`Config2`](../../doc/models/config-2.md) | Required | - | Config2 getConfig() | setConfig(Config2 config) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Events` | [`List<Event28Enum>`](../../doc/models/event-28-enum.md) | Required | - | List<Event28Enum> getEvents() | setEvents(List<Event28Enum> events) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example (as JSON)

```json
{
  "active": false,
  "config": {
    "content_type": "json",
    "insecure_ssl": "insecure_ssl2",
    "secret": null,
    "url": "url0"
  },
  "created_at": "created_at2",
  "events": [
    "repository_dispatch"
  ],
  "id": 112,
  "name": "name0",
  "type": "type0",
  "updated_at": "updated_at4"
}
```

