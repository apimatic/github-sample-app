
# Hook 1

## Structure

`Hook1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Active` | `boolean` | Required | Determines whether the hook is actually triggered for the events it subscribes to. | boolean getActive() | setActive(boolean active) |
| `AppId` | `Integer` | Optional | Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the webhook URL you specified during registration. The GitHub App ID sent in this field is required for authenticating an app. | Integer getAppId() | setAppId(Integer appId) |
| `Config` | [`AppHookConfigRequest`](../../doc/models/app-hook-config-request.md) | Required | - | AppHookConfigRequest getConfig() | setConfig(AppHookConfigRequest config) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DeliveriesUrl` | `String` | Optional | - | String getDeliveriesUrl() | setDeliveriesUrl(String deliveriesUrl) |
| `Events` | `List<String>` | Required | Determines what events the hook is triggered for. Default: ['push']. | List<String> getEvents() | setEvents(List<String> events) |
| `Id` | `int` | Required | Unique identifier of the webhook. | int getId() | setId(int id) |
| `LastResponse` | [`HookResponse`](../../doc/models/hook-response.md) | Optional | - | HookResponse getLastResponse() | setLastResponse(HookResponse lastResponse) |
| `Name` | `String` | Required, Constant | The type of webhook. The only valid value is 'web'.<br>**Default**: `"web"` | String getName() | setName(String name) |
| `PingUrl` | `String` | Optional | - | String getPingUrl() | setPingUrl(String pingUrl) |
| `TestUrl` | `String` | Optional | - | String getTestUrl() | setTestUrl(String testUrl) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "active": null,
  "config": null,
  "created_at": null,
  "events": null,
  "id": null,
  "name": "web",
  "type": null,
  "updated_at": null
}
```

