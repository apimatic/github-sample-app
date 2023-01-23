
# Alert 10

## Structure

`Alert10`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `LocalDateTime` | Optional | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `HtmlUrl` | `String` | Optional | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `LocationsUrl` | `String` | Optional | The REST API URL of the code locations for this alert. | String getLocationsUrl() | setLocationsUrl(String locationsUrl) |
| `Number` | `Integer` | Optional | The security alert number. | Integer getNumber() | setNumber(Integer number) |
| `PushProtectionBypassed` | `Boolean` | Optional | Whether push protection was bypassed for the detected secret. | Boolean getPushProtectionBypassed() | setPushProtectionBypassed(Boolean pushProtectionBypassed) |
| `PushProtectionBypassedAt` | `LocalDateTime` | Optional | The time that push protection was bypassed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getPushProtectionBypassedAt() | setPushProtectionBypassedAt(LocalDateTime pushProtectionBypassedAt) |
| `PushProtectionBypassedBy` | `Object` | Optional | - | Object getPushProtectionBypassedBy() | setPushProtectionBypassedBy(Object pushProtectionBypassedBy) |
| `Resolution` | `Object` | Optional | - | Object getResolution() | setResolution(Object resolution) |
| `ResolvedAt` | `LocalDateTime` | Optional | The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getResolvedAt() | setResolvedAt(LocalDateTime resolvedAt) |
| `ResolvedBy` | `Object` | Optional | - | Object getResolvedBy() | setResolvedBy(Object resolvedBy) |
| `ResolutionComment` | `String` | Optional | An optional comment to resolve an alert. | String getResolutionComment() | setResolutionComment(String resolutionComment) |
| `Secret` | `String` | Optional | The secret that was detected. | String getSecret() | setSecret(String secret) |
| `SecretType` | `String` | Optional | The type of secret that secret scanning detected. | String getSecretType() | setSecretType(String secretType) |
| `SecretTypeDisplayName` | `String` | Optional | User-friendly name for the detected secret, matching the `secret_type`.<br>For a list of built-in patterns, see "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)." | String getSecretTypeDisplayName() | setSecretTypeDisplayName(String secretTypeDisplayName) |
| `State` | [`SecretScanningAlertStateEnum`](../../doc/models/secret-scanning-alert-state-enum.md) | Optional | - | SecretScanningAlertStateEnum getState() | setState(SecretScanningAlertStateEnum state) |
| `UpdatedAt` | `LocalDateTime` | Optional | The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Optional | The REST API URL of the alert resource. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "created_at": null,
  "html_url": null,
  "locations_url": null,
  "number": null,
  "push_protection_bypassed": null,
  "push_protection_bypassed_at": null,
  "push_protection_bypassed_by": null,
  "resolution": null,
  "resolved_at": null,
  "resolved_by": null,
  "resolution_comment": null,
  "secret": null,
  "secret_type": null,
  "secret_type_display_name": null,
  "state": null,
  "updated_at": null,
  "url": null
}
```

