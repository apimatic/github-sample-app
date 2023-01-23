
# User Codespaces Secrets Response

## Structure

`UserCodespacesSecretsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Secrets` | [`List<CodespacesSecret2>`](../../doc/models/codespaces-secret-2.md) | Required | - | List<CodespacesSecret2> getSecrets() | setSecrets(List<CodespacesSecret2> secrets) |

## Example (as JSON)

```json
{
  "total_count": null,
  "secrets": {
    "name": "SECRET_NAME",
    "created_at": null,
    "updated_at": null,
    "visibility": null,
    "selected_repositories_url": "https://api.github.com/user/secrets/SECRET_NAME/repositories"
  }
}
```

