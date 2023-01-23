
# Repos Secret Scanning Alerts Alert Number Request

## Structure

`ReposSecretScanningAlertsAlertNumberRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | [`SecretScanningAlertStateEnum`](../../doc/models/secret-scanning-alert-state-enum.md) | Required | - | SecretScanningAlertStateEnum getState() | setState(SecretScanningAlertStateEnum state) |
| `Resolution` | `Object` | Optional | - | Object getResolution() | setResolution(Object resolution) |
| `ResolutionComment` | `String` | Optional | An optional comment when closing an alert. Cannot be updated or deleted. Must be `null` when changing `state` to `open`. | String getResolutionComment() | setResolutionComment(String resolutionComment) |

## Example (as JSON)

```json
{
  "state": "open",
  "resolution": null,
  "resolution_comment": null
}
```

