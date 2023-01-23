
# Repos Dependabot Secrets Response

## Structure

`ReposDependabotSecretsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Secrets` | [`List<DependabotSecret>`](../../doc/models/dependabot-secret.md) | Required | - | List<DependabotSecret> getSecrets() | setSecrets(List<DependabotSecret> secrets) |

## Example (as JSON)

```json
{
  "total_count": null,
  "secrets": {
    "name": "MY_ARTIFACTORY_PASSWORD",
    "created_at": null,
    "updated_at": null
  }
}
```

