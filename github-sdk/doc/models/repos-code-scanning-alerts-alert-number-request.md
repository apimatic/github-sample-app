
# Repos Code Scanning Alerts Alert Number Request

## Structure

`ReposCodeScanningAlertsAlertNumberRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | [`CodeScanningAlertSetStateEnum`](../../doc/models/code-scanning-alert-set-state-enum.md) | Required | - | CodeScanningAlertSetStateEnum getState() | setState(CodeScanningAlertSetStateEnum state) |
| `DismissedReason` | `Object` | Optional | - | Object getDismissedReason() | setDismissedReason(Object dismissedReason) |
| `DismissedComment` | `String` | Optional | The dismissal comment associated with the dismissal of the alert.<br>**Constraints**: *Maximum Length*: `280` | String getDismissedComment() | setDismissedComment(String dismissedComment) |

## Example (as JSON)

```json
{
  "state": "open",
  "dismissed_reason": null,
  "dismissed_comment": null
}
```

