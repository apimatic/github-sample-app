
# Orgs Actions Required Workflows Request 1

## Structure

`OrgsActionsRequiredWorkflowsRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WorkflowFilePath` | `String` | Optional | Path of the workflow file to be configured as a required workflow. | String getWorkflowFilePath() | setWorkflowFilePath(String workflowFilePath) |
| `RepositoryId` | `String` | Optional | The ID of the repository that contains the workflow file. | String getRepositoryId() | setRepositoryId(String repositoryId) |
| `Scope` | [`Scope7Enum`](../../doc/models/scope-7-enum.md) | Optional | - | Scope7Enum getScope() | setScope(Scope7Enum scope) |
| `SelectedRepositoryIds` | `List<Integer>` | Optional | A list of repository IDs where you want to enable the required workflow. A list of repository IDs where you want to enable the required workflow. You can only provide a list of repository ids when the `scope` is set to `selected`. | List<Integer> getSelectedRepositoryIds() | setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) |

## Example (as JSON)

```json
{
  "workflow_file_path": null,
  "repository_id": null,
  "scope": null,
  "selected_repository_ids": null
}
```

