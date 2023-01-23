
# Runner Groups Org

## Structure

`RunnerGroupsOrg`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `double` | Required | - | double getId() | setId(double id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Visibility` | `String` | Required | - | String getVisibility() | setVisibility(String visibility) |
| `Default` | `boolean` | Required | - | boolean getDefault() | setDefault(boolean mDefault) |
| `SelectedRepositoriesUrl` | `String` | Optional | Link to the selected repositories resource for this runner group. Not present unless visibility was set to `selected` | String getSelectedRepositoriesUrl() | setSelectedRepositoriesUrl(String selectedRepositoriesUrl) |
| `RunnersUrl` | `String` | Required | - | String getRunnersUrl() | setRunnersUrl(String runnersUrl) |
| `Inherited` | `boolean` | Required | - | boolean getInherited() | setInherited(boolean inherited) |
| `InheritedAllowsPublicRepositories` | `Boolean` | Optional | - | Boolean getInheritedAllowsPublicRepositories() | setInheritedAllowsPublicRepositories(Boolean inheritedAllowsPublicRepositories) |
| `AllowsPublicRepositories` | `boolean` | Required | - | boolean getAllowsPublicRepositories() | setAllowsPublicRepositories(boolean allowsPublicRepositories) |
| `WorkflowRestrictionsReadOnly` | `Boolean` | Optional | If `true`, the `restricted_to_workflows` and `selected_workflows` fields cannot be modified.<br>**Default**: `false` | Boolean getWorkflowRestrictionsReadOnly() | setWorkflowRestrictionsReadOnly(Boolean workflowRestrictionsReadOnly) |
| `RestrictedToWorkflows` | `Boolean` | Optional | If `true`, the runner group will be restricted to running only the workflows specified in the `selected_workflows` array.<br>**Default**: `false` | Boolean getRestrictedToWorkflows() | setRestrictedToWorkflows(Boolean restrictedToWorkflows) |
| `SelectedWorkflows` | `List<String>` | Optional | List of workflows the runner group should be allowed to run. This setting will be ignored unless `restricted_to_workflows` is set to `true`. | List<String> getSelectedWorkflows() | setSelectedWorkflows(List<String> selectedWorkflows) |

## Example (as JSON)

```json
{
  "id": 60.0,
  "name": "name0",
  "visibility": "visibility8",
  "default": false,
  "selected_repositories_url": null,
  "runners_url": "runners_url8",
  "inherited": false,
  "inherited_allows_public_repositories": null,
  "allows_public_repositories": false,
  "workflow_restrictions_read_only": null,
  "restricted_to_workflows": null,
  "selected_workflows": null
}
```

