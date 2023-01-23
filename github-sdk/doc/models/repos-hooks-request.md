
# Repos Hooks Request

## Structure

`ReposHooksRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Use `web` to create a webhook. Default: `web`. This parameter only accepts the value `web`. | String getName() | setName(String name) |
| `Config` | [`Config12`](../../doc/models/config-12.md) | Optional | - | Config12 getConfig() | setConfig(Config12 config) |
| `Events` | `List<String>` | Optional | Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. | List<String> getEvents() | setEvents(List<String> events) |
| `Active` | `Boolean` | Optional | Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.<br>**Default**: `true` | Boolean getActive() | setActive(Boolean active) |

## Example (as JSON)

```json
{
  "name": null,
  "config": null,
  "events": null,
  "active": null
}
```

