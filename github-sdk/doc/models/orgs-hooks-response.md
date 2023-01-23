
# Orgs Hooks Response

## Structure

`OrgsHooksResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `PingUrl` | `String` | Required | - | String getPingUrl() | setPingUrl(String pingUrl) |
| `DeliveriesUrl` | `String` | Optional | - | String getDeliveriesUrl() | setDeliveriesUrl(String deliveriesUrl) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Events` | `List<String>` | Required | - | List<String> getEvents() | setEvents(List<String> events) |
| `Active` | `boolean` | Required | - | boolean getActive() | setActive(boolean active) |
| `Config` | [`Config`](../../doc/models/config.md) | Required | - | Config getConfig() | setConfig(Config config) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "id": 1,
  "url": "https://api.github.com/orgs/octocat/hooks/1",
  "ping_url": "https://api.github.com/orgs/octocat/hooks/1/pings",
  "name": "web",
  "events": [
    "push",
    "pull_request"
  ],
  "active": true,
  "config": null,
  "updated_at": "09/06/2011 20:39:23",
  "created_at": "09/06/2011 17:26:27",
  "type": null
}
```

