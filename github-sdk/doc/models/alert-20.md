
# Alert 20

## Structure

`Alert20`

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
| `Rule` | [`Rule`](../../doc/models/rule.md) | Required | - | Rule getRule() | setRule(Rule rule) |
| `State` | [`State16Enum`](../../doc/models/state-16-enum.md) | Required | - | State16Enum getState() | setState(State16Enum state) |
| `Tool` | [`Tool`](../../doc/models/tool.md) | Required | - | Tool getTool() | setTool(Tool tool) |
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
    "id": "id0",
    "severity": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "state": "fixed",
  "tool": {
    "name": "name6",
    "version": "version2"
  },
  "url": "url4"
}
```

