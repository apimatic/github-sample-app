
# Alert 3

The code scanning alert involved in the event.

## Structure

`Alert3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `LocalDateTime` | Required | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.` | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DismissedAt` | `LocalDateTime` | Required | The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDismissedAt() | setDismissedAt(LocalDateTime dismissedAt) |
| `DismissedBy` | `Object` | Required | - | Object getDismissedBy() | setDismissedBy(Object dismissedBy) |
| `DismissedReason` | `Object` | Required | - | Object getDismissedReason() | setDismissedReason(Object dismissedReason) |
| `HtmlUrl` | `String` | Required | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `InstancesUrl` | `String` | Optional | - | String getInstancesUrl() | setInstancesUrl(String instancesUrl) |
| `MostRecentInstance` | `Object` | Optional | - | Object getMostRecentInstance() | setMostRecentInstance(Object mostRecentInstance) |
| `Number` | `int` | Required | The code scanning alert number. | int getNumber() | setNumber(int number) |
| `Rule` | [`Rule1`](../../doc/models/rule-1.md) | Required | - | Rule1 getRule() | setRule(Rule1 rule) |
| `State` | `String` | Required, Constant | State of a code scanning alert.<br>**Default**: `"fixed"` | String getState() | setState(String state) |
| `Tool` | [`Tool1`](../../doc/models/tool-1.md) | Required | - | Tool1 getTool() | setTool(Tool1 tool) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "created_at": null,
  "dismissed_at": null,
  "dismissed_by": null,
  "dismissed_reason": null,
  "html_url": null,
  "number": null,
  "rule": null,
  "state": "fixed",
  "tool": null,
  "url": null
}
```

