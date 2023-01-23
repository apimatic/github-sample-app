
# Orgs Actions Runner Groups Request 1

## Structure

`OrgsActionsRunnerGroupsRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the runner group. | String getName() | setName(String name) |
| `Visibility` | [`Visibility80Enum`](../../doc/models/visibility-80-enum.md) | Optional | - | Visibility80Enum getVisibility() | setVisibility(Visibility80Enum visibility) |
| `AllowsPublicRepositories` | `Boolean` | Optional | Whether the runner group can be used by `public` repositories.<br>**Default**: `false` | Boolean getAllowsPublicRepositories() | setAllowsPublicRepositories(Boolean allowsPublicRepositories) |
| `RestrictedToWorkflows` | `Boolean` | Optional | If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows` array.<br>**Default**: `false` | Boolean getRestrictedToWorkflows() | setRestrictedToWorkflows(Boolean restrictedToWorkflows) |
| `SelectedWorkflows` | `List<String>` | Optional | List of workflows the runner group should be allowed to run. This setting will be ignored unless `restricted_to_workflows` is set to `true`. | List<String> getSelectedWorkflows() | setSelectedWorkflows(List<String> selectedWorkflows) |

## Example (as JSON)

```json
{
  "name": "name0",
  "visibility": null,
  "allows_public_repositories": null,
  "restricted_to_workflows": null,
  "selected_workflows": null
}
```

