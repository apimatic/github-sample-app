
# Orgs Actions Permissions Repositories Request

## Structure

`OrgsActionsPermissionsRepositoriesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SelectedRepositoryIds` | `List<Integer>` | Required | List of repository IDs to enable for GitHub Actions. | List<Integer> getSelectedRepositoryIds() | setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) |

## Example (as JSON)

```json
{
  "selected_repository_ids": [
    113,
    114
  ]
}
```

