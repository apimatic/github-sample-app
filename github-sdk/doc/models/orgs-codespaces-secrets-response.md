
# Orgs Codespaces Secrets Response

## Structure

`OrgsCodespacesSecretsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Secrets` | [`List<CodespacesSecret>`](../../doc/models/codespaces-secret.md) | Required | - | List<CodespacesSecret> getSecrets() | setSecrets(List<CodespacesSecret> secrets) |

## Example (as JSON)

```json
{
  "total_count": null,
  "secrets": {
    "name": "SECRET_NAME",
    "created_at": null,
    "updated_at": null,
    "visibility": null
  }
}
```

