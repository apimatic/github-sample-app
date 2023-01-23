
# Alert 22

## Structure

`Alert22`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `LocalDateTime` | Required | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.` | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DismissedAt` | `Object` | Required | The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | Object getDismissedAt() | setDismissedAt(Object dismissedAt) |
| `DismissedBy` | `Object` | Required | - | Object getDismissedBy() | setDismissedBy(Object dismissedBy) |
| `DismissedComment` | `String` | Optional | The dismissal comment associated with the dismissal of the alert.<br>**Constraints**: *Maximum Length*: `280` | String getDismissedComment() | setDismissedComment(String dismissedComment) |
| `DismissedReason` | `Object` | Required | The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`. | Object getDismissedReason() | setDismissedReason(Object dismissedReason) |
| `FixedAt` | `Object` | Optional | - | Object getFixedAt() | setFixedAt(Object fixedAt) |
| `HtmlUrl` | `String` | Required | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `InstancesUrl` | `String` | Optional | - | String getInstancesUrl() | setInstancesUrl(String instancesUrl) |
| `MostRecentInstance` | `Object` | Optional | - | Object getMostRecentInstance() | setMostRecentInstance(Object mostRecentInstance) |
| `Number` | `int` | Required | The code scanning alert number. | int getNumber() | setNumber(int number) |
| `Rule` | [`Rule1`](../../doc/models/rule-1.md) | Required | - | Rule1 getRule() | setRule(Rule1 rule) |
| `State` | [`State21Enum`](../../doc/models/state-21-enum.md) | Required | - | State21Enum getState() | setState(State21Enum state) |
| `Tool` | `Object` | Required | - | Object getTool() | setTool(Object tool) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "created_at": "2016-03-13T12:52:32.123Z",
  "dismissed_at": {
    "key1": "val1",
    "key2": "val2"
  },
  "dismissed_by": {
    "key1": "val1",
    "key2": "val2"
  },
  "dismissed_comment": null,
  "dismissed_reason": {
    "key1": "val1",
    "key2": "val2"
  },
  "fixed_at": null,
  "html_url": "html_url0",
  "instances_url": null,
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
  "state": "open",
  "tool": {
    "key1": "val1",
    "key2": "val2"
  },
  "updated_at": null,
  "url": "url4"
}
```

