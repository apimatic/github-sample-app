
# Repos Hooks Hook Id Request

## Structure

`ReposHooksHookIdRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Config` | [`Config10`](../../doc/models/config-10.md) | Optional | - | Config10 getConfig() | setConfig(Config10 config) |
| `Events` | `List<String>` | Optional | Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. This replaces the entire array of events. | List<String> getEvents() | setEvents(List<String> events) |
| `AddEvents` | `List<String>` | Optional | Determines a list of events to be added to the list of events that the Hook triggers for. | List<String> getAddEvents() | setAddEvents(List<String> addEvents) |
| `RemoveEvents` | `List<String>` | Optional | Determines a list of events to be removed from the list of events that the Hook triggers for. | List<String> getRemoveEvents() | setRemoveEvents(List<String> removeEvents) |
| `Active` | `Boolean` | Optional | Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.<br>**Default**: `true` | Boolean getActive() | setActive(Boolean active) |

## Example (as JSON)

```json
{
  "config": null,
  "events": null,
  "add_events": null,
  "remove_events": null,
  "active": null
}
```

