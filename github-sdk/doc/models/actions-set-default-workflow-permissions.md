
# Actions Set Default Workflow Permissions

## Structure

`ActionsSetDefaultWorkflowPermissions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DefaultWorkflowPermissions` | [`ActionsDefaultWorkflowPermissionsEnum`](../../doc/models/actions-default-workflow-permissions-enum.md) | Optional | - | ActionsDefaultWorkflowPermissionsEnum getDefaultWorkflowPermissions() | setDefaultWorkflowPermissions(ActionsDefaultWorkflowPermissionsEnum defaultWorkflowPermissions) |
| `CanApprovePullRequestReviews` | `Boolean` | Optional | Whether GitHub Actions can approve pull requests. Enabling this can be a security risk. | Boolean getCanApprovePullRequestReviews() | setCanApprovePullRequestReviews(Boolean canApprovePullRequestReviews) |

## Example (as JSON)

```json
{
  "default_workflow_permissions": null,
  "can_approve_pull_request_reviews": null
}
```

