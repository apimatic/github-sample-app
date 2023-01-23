
# Alert 1

The code scanning alert involved in the event.

## Structure

`Alert1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `LocalDateTime` | Required | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.` | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DismissedAt` | `LocalDateTime` | Required | The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDismissedAt() | setDismissedAt(LocalDateTime dismissedAt) |
| `DismissedBy` | `Object` | Required | - | Object getDismissedBy() | setDismissedBy(Object dismissedBy) |
| `DismissedReason` | `Object` | Required | - | Object getDismissedReason() | setDismissedReason(Object dismissedReason) |
| `HtmlUrl` | `String` | Required | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `MostRecentInstance` | `Object` | Optional | - | Object getMostRecentInstance() | setMostRecentInstance(Object mostRecentInstance) |
| `Number` | `int` | Required | The code scanning alert number. | int getNumber() | setNumber(int number) |
| `Rule` | [`Rule1`](../../doc/models/rule-1.md) | Required | - | Rule1 getRule() | setRule(Rule1 rule) |
| `State` | [`State19Enum`](../../doc/models/state-19-enum.md) | Required | - | State19Enum getState() | setState(State19Enum state) |
| `Tool` | [`Tool1`](../../doc/models/tool-1.md) | Required | - | Tool1 getTool() | setTool(Tool1 tool) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "created_at": "2016-03-13T12:52:32.123Z",
  "dismissed_at": "2016-03-13T12:52:32.123Z",
  "dismissed_by": {
    "key1": "val1",
    "key2": "val2"
  },
  "dismissed_reason": {
    "key1": "val1",
    "key2": "val2"
  },
  "html_url": "html_url0",
  "most_recent_instance": null,
  "number": 158,
  "rule": {
    "description": "description0",
    "full_description": null,
    "help": null,
    "help_uri": null,
    "id": "id0",
    "name": null,
    "severity": {
      "key1": "val1",
      "key2": "val2"
    },
    "tags": null
  },
  "state": "dismissed",
  "tool": {
    "guid": null,
    "name": "name6",
    "version": "version2"
  },
  "url": "url4"
}
```

