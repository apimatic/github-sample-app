
# Repos Environments Environment Name Deployment Branch Policies Response

## Structure

`ReposEnvironmentsEnvironmentNameDeploymentBranchPoliciesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | The number of deployment branch policies for the environment. | int getTotalCount() | setTotalCount(int totalCount) |
| `BranchPolicies` | [`List<Deploymentbranchpolicy>`](../../doc/models/deploymentbranchpolicy.md) | Required | - | List<Deploymentbranchpolicy> getBranchPolicies() | setBranchPolicies(List<Deploymentbranchpolicy> branchPolicies) |

## Example (as JSON)

```json
{
  "total_count": 2,
  "branch_policies": null
}
```

