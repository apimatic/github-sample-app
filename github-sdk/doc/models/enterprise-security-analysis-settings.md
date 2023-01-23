
# Enterprise Security Analysis Settings

## Structure

`EnterpriseSecurityAnalysisSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdvancedSecurityEnabledForNewRepositories` | `boolean` | Required | Whether GitHub advanced security is automatically enabled for new repositories and repositories transferred to<br>this enterprise. | boolean getAdvancedSecurityEnabledForNewRepositories() | setAdvancedSecurityEnabledForNewRepositories(boolean advancedSecurityEnabledForNewRepositories) |
| `SecretScanningEnabledForNewRepositories` | `boolean` | Required | Whether secret scanning is automatically enabled for new repositories and repositories transferred to this<br>enterprise. | boolean getSecretScanningEnabledForNewRepositories() | setSecretScanningEnabledForNewRepositories(boolean secretScanningEnabledForNewRepositories) |
| `SecretScanningPushProtectionEnabledForNewRepositories` | `boolean` | Required | Whether secret scanning push protection is automatically enabled for new repositories and repositories<br>transferred to this enterprise. | boolean getSecretScanningPushProtectionEnabledForNewRepositories() | setSecretScanningPushProtectionEnabledForNewRepositories(boolean secretScanningPushProtectionEnabledForNewRepositories) |
| `SecretScanningPushProtectionCustomLink` | `String` | Optional | An optional URL string to display to contributors who are blocked from pushing a secret. | String getSecretScanningPushProtectionCustomLink() | setSecretScanningPushProtectionCustomLink(String secretScanningPushProtectionCustomLink) |

## Example (as JSON)

```json
{
  "advanced_security_enabled_for_new_repositories": false,
  "secret_scanning_enabled_for_new_repositories": false,
  "secret_scanning_push_protection_enabled_for_new_repositories": false
}
```

