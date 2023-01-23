
# Deployment Branch Policy Settings

The type of deployment branch policy for this environment. To allow all branches to deploy, set to `null`.

## Structure

`DeploymentBranchPolicySettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProtectedBranches` | `boolean` | Required | Whether only branches with branch protection rules can deploy to this environment. If `protected_branches` is `true`, `custom_branch_policies` must be `false`; if `protected_branches` is `false`, `custom_branch_policies` must be `true`. | boolean getProtectedBranches() | setProtectedBranches(boolean protectedBranches) |
| `CustomBranchPolicies` | `boolean` | Required | Whether only branches that match the specified name patterns can deploy to this environment.  If `custom_branch_policies` is `true`, `protected_branches` must be `false`; if `custom_branch_policies` is `false`, `protected_branches` must be `true`. | boolean getCustomBranchPolicies() | setCustomBranchPolicies(boolean customBranchPolicies) |

## Example (as JSON)

```json
{
  "protected_branches": false,
  "custom_branch_policies": false
}
```

