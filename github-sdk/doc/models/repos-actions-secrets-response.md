
# Repos Actions Secrets Response

## Structure

`ReposActionsSecretsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Secrets` | [`List<ActionsSecret>`](../../doc/models/actions-secret.md) | Required | - | List<ActionsSecret> getSecrets() | setSecrets(List<ActionsSecret> secrets) |

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

