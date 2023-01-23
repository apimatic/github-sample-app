
# Orgs Actions Runner Groups Repositories Request

## Structure

`OrgsActionsRunnerGroupsRepositoriesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SelectedRepositoryIds` | `List<Integer>` | Required | List of repository IDs that can access the runner group. | List<Integer> getSelectedRepositoryIds() | setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) |

## Example (as JSON)

```json
{
  "selected_repository_ids": [
    113,
    114
  ]
}
```

