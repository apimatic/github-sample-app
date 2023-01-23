
# Actions Get Default Workflow Permissions

## Structure

`ActionsGetDefaultWorkflowPermissions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DefaultWorkflowPermissions` | [`ActionsDefaultWorkflowPermissionsEnum`](../../doc/models/actions-default-workflow-permissions-enum.md) | Required | - | ActionsDefaultWorkflowPermissionsEnum getDefaultWorkflowPermissions() | setDefaultWorkflowPermissions(ActionsDefaultWorkflowPermissionsEnum defaultWorkflowPermissions) |
| `CanApprovePullRequestReviews` | `boolean` | Required | Whether GitHub Actions can approve pull requests. Enabling this can be a security risk. | boolean getCanApprovePullRequestReviews() | setCanApprovePullRequestReviews(boolean canApprovePullRequestReviews) |

## Example (as JSON)

```json
{
  "default_workflow_permissions": "read",
  "can_approve_pull_request_reviews": false
}
```

