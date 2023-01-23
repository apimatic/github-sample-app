
# Orgs Actions Secrets Response

## Structure

`OrgsActionsSecretsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Secrets` | [`List<ActionsSecretforanOrganization>`](../../doc/models/actions-secretforan-organization.md) | Required | - | List<ActionsSecretforanOrganization> getSecrets() | setSecrets(List<ActionsSecretforanOrganization> secrets) |

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

