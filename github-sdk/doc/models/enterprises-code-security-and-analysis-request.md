
# Enterprises Code Security and Analysis Request

## Structure

`EnterprisesCodeSecurityAndAnalysisRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdvancedSecurityEnabledForNewRepositories` | `Boolean` | Optional | Whether GitHub Advanced Security is automatically enabled for new repositories. For more information, see "[About GitHub Advanced Security](https://docs.github.com/get-started/learning-about-github/about-github-advanced-security)." | Boolean getAdvancedSecurityEnabledForNewRepositories() | setAdvancedSecurityEnabledForNewRepositories(Boolean advancedSecurityEnabledForNewRepositories) |
| `SecretScanningEnabledForNewRepositories` | `Boolean` | Optional | Whether secret scanning is automatically enabled for new repositories. For more information, see "[About secret scanning](https://docs.github.com/code-security/secret-scanning/about-secret-scanning)." | Boolean getSecretScanningEnabledForNewRepositories() | setSecretScanningEnabledForNewRepositories(Boolean secretScanningEnabledForNewRepositories) |
| `SecretScanningPushProtectionEnabledForNewRepositories` | `Boolean` | Optional | Whether secret scanning push protection is automatically enabled for new repositories. For more information, see "[Protecting pushes with secret scanning](https://docs.github.com/code-security/secret-scanning/protecting-pushes-with-secret-scanning)." | Boolean getSecretScanningPushProtectionEnabledForNewRepositories() | setSecretScanningPushProtectionEnabledForNewRepositories(Boolean secretScanningPushProtectionEnabledForNewRepositories) |
| `SecretScanningPushProtectionCustomLink` | `String` | Optional | The URL that will be displayed to contributors who are blocked from pushing a secret. For more information, see "[Protecting pushes with secret scanning](https://docs.github.com/code-security/secret-scanning/protecting-pushes-with-secret-scanning)."<br>To disable this functionality, set this field to `null`. | String getSecretScanningPushProtectionCustomLink() | setSecretScanningPushProtectionCustomLink(String secretScanningPushProtectionCustomLink) |

## Example (as JSON)

```json
{
  "advanced_security_enabled_for_new_repositories": null,
  "secret_scanning_enabled_for_new_repositories": null,
  "secret_scanning_push_protection_enabled_for_new_repositories": null,
  "secret_scanning_push_protection_custom_link": null
}
```

