
# Webhook

Webhooks for repositories.

## Structure

`Webhook`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Id` | `int` | Required | Unique identifier of the webhook. | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of a valid service, use 'web' for a webhook. | String getName() | setName(String name) |
| `Active` | `boolean` | Required | Determines whether the hook is actually triggered on pushes. | boolean getActive() | setActive(boolean active) |
| `Events` | `List<String>` | Required | Determines what events the hook is triggered for. Default: ['push']. | List<String> getEvents() | setEvents(List<String> events) |
| `Config` | [`Config1`](../../doc/models/config-1.md) | Required | - | Config1 getConfig() | setConfig(Config1 config) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `TestUrl` | `String` | Required | - | String getTestUrl() | setTestUrl(String testUrl) |
| `PingUrl` | `String` | Required | - | String getPingUrl() | setPingUrl(String pingUrl) |
| `DeliveriesUrl` | `String` | Optional | - | String getDeliveriesUrl() | setDeliveriesUrl(String deliveriesUrl) |
| `LastResponse` | [`HookResponse`](../../doc/models/hook-response.md) | Required | - | HookResponse getLastResponse() | setLastResponse(HookResponse lastResponse) |

## Example (as JSON)

```json
{
  "type": null,
  "id": 42,
  "name": "web",
  "active": true,
  "events": [
    "push",
    "pull_request"
  ],
  "config": null,
  "updated_at": "09/06/2011 20:39:23",
  "created_at": "09/06/2011 17:26:27",
  "url": "https://api.github.com/repos/octocat/Hello-World/hooks/1",
  "test_url": "https://api.github.com/repos/octocat/Hello-World/hooks/1/test",
  "ping_url": "https://api.github.com/repos/octocat/Hello-World/hooks/1/pings",
  "last_response": null
}
```

