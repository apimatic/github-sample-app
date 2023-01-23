
# Repos Dependabot Alerts Alert Number Request

## Structure

`ReposDependabotAlertsAlertNumberRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | [`State172Enum`](../../doc/models/state-172-enum.md) | Required | - | State172Enum getState() | setState(State172Enum state) |
| `DismissedReason` | [`DismissedReason5Enum`](../../doc/models/dismissed-reason-5-enum.md) | Optional | - | DismissedReason5Enum getDismissedReason() | setDismissedReason(DismissedReason5Enum dismissedReason) |
| `DismissedComment` | `String` | Optional | An optional comment associated with dismissing the alert.<br>**Constraints**: *Maximum Length*: `280` | String getDismissedComment() | setDismissedComment(String dismissedComment) |

## Example (as JSON)

```json
{
  "state": "dismissed",
  "dismissed_reason": null,
  "dismissed_comment": null
}
```

