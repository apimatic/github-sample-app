
# Organization Secret Scanning Alert

## Structure

`OrganizationSecretScanningAlert`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `Integer` | Optional | The security alert number. | Integer getNumber() | setNumber(Integer number) |
| `CreatedAt` | `LocalDateTime` | Optional | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Optional | The REST API URL of the alert resource. | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Optional | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `LocationsUrl` | `String` | Optional | The REST API URL of the code locations for this alert. | String getLocationsUrl() | setLocationsUrl(String locationsUrl) |
| `State` | [`SecretScanningAlertStateEnum`](../../doc/models/secret-scanning-alert-state-enum.md) | Optional | - | SecretScanningAlertStateEnum getState() | setState(SecretScanningAlertStateEnum state) |
| `Resolution` | `Object` | Optional | - | Object getResolution() | setResolution(Object resolution) |
| `ResolvedAt` | `LocalDateTime` | Optional | The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getResolvedAt() | setResolvedAt(LocalDateTime resolvedAt) |
| `ResolvedBy` | `Object` | Optional | - | Object getResolvedBy() | setResolvedBy(Object resolvedBy) |
| `SecretType` | `String` | Optional | The type of secret that secret scanning detected. | String getSecretType() | setSecretType(String secretType) |
| `SecretTypeDisplayName` | `String` | Optional | User-friendly name for the detected secret, matching the `secret_type`.<br>For a list of built-in patterns, see "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)." | String getSecretTypeDisplayName() | setSecretTypeDisplayName(String secretTypeDisplayName) |
| `Secret` | `String` | Optional | The secret that was detected. | String getSecret() | setSecret(String secret) |
| `Repository` | [`Repository1`](../../doc/models/repository-1.md) | Optional | - | Repository1 getRepository() | setRepository(Repository1 repository) |
| `PushProtectionBypassed` | `Boolean` | Optional | Whether push protection was bypassed for the detected secret. | Boolean getPushProtectionBypassed() | setPushProtectionBypassed(Boolean pushProtectionBypassed) |
| `PushProtectionBypassedBy` | `Object` | Optional | - | Object getPushProtectionBypassedBy() | setPushProtectionBypassedBy(Object pushProtectionBypassedBy) |
| `PushProtectionBypassedAt` | `LocalDateTime` | Optional | The time that push protection was bypassed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getPushProtectionBypassedAt() | setPushProtectionBypassedAt(LocalDateTime pushProtectionBypassedAt) |
| `ResolutionComment` | `String` | Optional | The comment that was optionally added when this alert was closed | String getResolutionComment() | setResolutionComment(String resolutionComment) |

## Example (as JSON)

```json
{
  "number": null,
  "created_at": null,
  "updated_at": null,
  "url": null,
  "html_url": null,
  "locations_url": null,
  "state": null,
  "resolution": null,
  "resolved_at": null,
  "resolved_by": null,
  "secret_type": null,
  "secret_type_display_name": null,
  "secret": null,
  "repository": null,
  "push_protection_bypassed": null,
  "push_protection_bypassed_by": null,
  "push_protection_bypassed_at": null,
  "resolution_comment": null
}
```

