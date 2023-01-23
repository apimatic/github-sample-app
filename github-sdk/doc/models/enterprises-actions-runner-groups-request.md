
# Enterprises Actions Runner Groups Request

## Structure

`EnterprisesActionsRunnerGroupsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the runner group. | String getName() | setName(String name) |
| `Visibility` | [`Visibility78Enum`](../../doc/models/visibility-78-enum.md) | Optional | - | Visibility78Enum getVisibility() | setVisibility(Visibility78Enum visibility) |
| `SelectedOrganizationIds` | `List<Integer>` | Optional | List of organization IDs that can access the runner group. | List<Integer> getSelectedOrganizationIds() | setSelectedOrganizationIds(List<Integer> selectedOrganizationIds) |
| `Runners` | `List<Integer>` | Optional | List of runner IDs to add to the runner group. | List<Integer> getRunners() | setRunners(List<Integer> runners) |
| `AllowsPublicRepositories` | `Boolean` | Optional | Whether the runner group can be used by `public` repositories.<br>**Default**: `false` | Boolean getAllowsPublicRepositories() | setAllowsPublicRepositories(Boolean allowsPublicRepositories) |
| `RestrictedToWorkflows` | `Boolean` | Optional | If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows` array.<br>**Default**: `false` | Boolean getRestrictedToWorkflows() | setRestrictedToWorkflows(Boolean restrictedToWorkflows) |
| `SelectedWorkflows` | `List<String>` | Optional | List of workflows the runner group should be allowed to run. This setting will be ignored unless `restricted_to_workflows` is set to `true`. | List<String> getSelectedWorkflows() | setSelectedWorkflows(List<String> selectedWorkflows) |

## Example (as JSON)

```json
{
  "name": "name0",
  "visibility": null,
  "selected_organization_ids": null,
  "runners": null,
  "allows_public_repositories": null,
  "restricted_to_workflows": null,
  "selected_workflows": null
}
```

