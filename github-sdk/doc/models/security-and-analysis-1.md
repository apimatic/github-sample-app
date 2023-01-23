
# Security and Analysis 1

Specify which security and analysis features to enable or disable for the repository.

To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."

For example, to enable GitHub Advanced Security, use this data in the body of the `PATCH` request:
`{ "security_and_analysis": {"advanced_security": { "status": "enabled" } } }`.

You can check which security and analysis features are currently enabled by using a `GET /repos/{owner}/{repo}` request.

## Structure

`SecurityAndAnalysis1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdvancedSecurity` | [`AdvancedSecurity2`](../../doc/models/advanced-security-2.md) | Optional | - | AdvancedSecurity2 getAdvancedSecurity() | setAdvancedSecurity(AdvancedSecurity2 advancedSecurity) |
| `SecretScanning` | [`SecretScanning2`](../../doc/models/secret-scanning-2.md) | Optional | - | SecretScanning2 getSecretScanning() | setSecretScanning(SecretScanning2 secretScanning) |
| `SecretScanningPushProtection` | [`SecretScanningPushProtection2`](../../doc/models/secret-scanning-push-protection-2.md) | Optional | - | SecretScanningPushProtection2 getSecretScanningPushProtection() | setSecretScanningPushProtection(SecretScanningPushProtection2 secretScanningPushProtection) |

## Example (as JSON)

```json
{
  "advanced_security": null,
  "secret_scanning": null,
  "secret_scanning_push_protection": null
}
```

