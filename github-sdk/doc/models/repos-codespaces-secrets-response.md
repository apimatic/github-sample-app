
# Repos Codespaces Secrets Response

## Structure

`ReposCodespacesSecretsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Secrets` | [`List<CodespacesSecret1>`](../../doc/models/codespaces-secret-1.md) | Required | - | List<CodespacesSecret1> getSecrets() | setSecrets(List<CodespacesSecret1> secrets) |

## Example (as JSON)

```json
{
  "total_count": null,
  "secrets": {
    "name": "SECRET_TOKEN",
    "created_at": null,
    "updated_at": null
  }
}
```

