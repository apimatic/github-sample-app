
# Orgs Dependabot Secrets Response

## Structure

`OrgsDependabotSecretsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Secrets` | [`List<DependabotSecretforanOrganization>`](../../doc/models/dependabot-secretforan-organization.md) | Required | - | List<DependabotSecretforanOrganization> getSecrets() | setSecrets(List<DependabotSecretforanOrganization> secrets) |

## Example (as JSON)

```json
{
  "total_count": null,
  "secrets": {
    "name": "SECRET_TOKEN",
    "created_at": null,
    "updated_at": null,
    "visibility": null
  }
}
```

