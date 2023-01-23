
# Orgs Hooks Request 1

## Structure

`OrgsHooksRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Config` | [`Config9`](../../doc/models/config-9.md) | Optional | - | Config9 getConfig() | setConfig(Config9 config) |
| `Events` | `List<String>` | Optional | Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. | List<String> getEvents() | setEvents(List<String> events) |
| `Active` | `Boolean` | Optional | Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.<br>**Default**: `true` | Boolean getActive() | setActive(Boolean active) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "config": null,
  "events": null,
  "active": null,
  "name": null
}
```

