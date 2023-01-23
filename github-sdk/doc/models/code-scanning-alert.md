
# Code Scanning Alert

## Structure

`CodeScanningAlert`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `int` | Required | The security alert number. | int getNumber() | setNumber(int number) |
| `CreatedAt` | `LocalDateTime` | Required | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | The REST API URL of the alert resource. | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `InstancesUrl` | `String` | Required | The REST API URL for fetching the list of instances for an alert. | String getInstancesUrl() | setInstancesUrl(String instancesUrl) |
| `State` | [`CodeScanningAlertStateEnum`](../../doc/models/code-scanning-alert-state-enum.md) | Required | - | CodeScanningAlertStateEnum getState() | setState(CodeScanningAlertStateEnum state) |
| `FixedAt` | `LocalDateTime` | Optional | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getFixedAt() | setFixedAt(LocalDateTime fixedAt) |
| `DismissedBy` | `Object` | Required | - | Object getDismissedBy() | setDismissedBy(Object dismissedBy) |
| `DismissedAt` | `LocalDateTime` | Required | The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDismissedAt() | setDismissedAt(LocalDateTime dismissedAt) |
| `DismissedReason` | `Object` | Required | - | Object getDismissedReason() | setDismissedReason(Object dismissedReason) |
| `DismissedComment` | `String` | Optional | The dismissal comment associated with the dismissal of the alert.<br>**Constraints**: *Maximum Length*: `280` | String getDismissedComment() | setDismissedComment(String dismissedComment) |
| `Rule` | [`CodeScanningAlertRule`](../../doc/models/code-scanning-alert-rule.md) | Required | - | CodeScanningAlertRule getRule() | setRule(CodeScanningAlertRule rule) |
| `Tool` | [`CodeScanningAnalysisTool`](../../doc/models/code-scanning-analysis-tool.md) | Required | - | CodeScanningAnalysisTool getTool() | setTool(CodeScanningAnalysisTool tool) |
| `MostRecentInstance` | [`CodeScanningAlertInstance`](../../doc/models/code-scanning-alert-instance.md) | Required | - | CodeScanningAlertInstance getMostRecentInstance() | setMostRecentInstance(CodeScanningAlertInstance mostRecentInstance) |

## Example (as JSON)

```json
{
  "number": 158,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": null,
  "url": "url4",
  "html_url": "html_url0",
  "instances_url": "instances_url0",
  "state": "open",
  "fixed_at": null,
  "dismissed_by": {
    "key1": "val1",
    "key2": "val2"
  },
  "dismissed_at": "2016-03-13T12:52:32.123Z",
  "dismissed_reason": {
    "key1": "val1",
    "key2": "val2"
  },
  "dismissed_comment": null,
  "rule": {
    "id": null,
    "name": null,
    "severity": null,
    "security_severity_level": null,
    "description": null,
    "full_description": null,
    "tags": null,
    "help": null,
    "help_uri": null
  },
  "tool": {
    "name": null,
    "version": null,
    "guid": null
  },
  "most_recent_instance": {
    "ref": null,
    "analysis_key": null,
    "environment": null,
    "category": null,
    "state": null,
    "commit_sha": null,
    "message": null,
    "location": null,
    "html_url": null,
    "classifications": null
  }
}
```

