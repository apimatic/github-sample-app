
# Orgs Hooks Request

## Structure

`OrgsHooksRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Must be passed as "web". | String getName() | setName(String name) |
| `Config` | [`Config8`](../../doc/models/config-8.md) | Required | - | Config8 getConfig() | setConfig(Config8 config) |
| `Events` | `List<String>` | Optional | Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. Set to `["*"]` to receive all possible events. | List<String> getEvents() | setEvents(List<String> events) |
| `Active` | `Boolean` | Optional | Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.<br>**Default**: `true` | Boolean getActive() | setActive(Boolean active) |

## Example (as JSON)

```json
{
  "name": null,
  "config": {
    "url": "https://example.com/webhook"
  }
}
```

