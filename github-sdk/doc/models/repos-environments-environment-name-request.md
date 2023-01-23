
# Repos Environments Environment Name Request

## Structure

`ReposEnvironmentsEnvironmentNameRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WaitTimer` | `Integer` | Optional | The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days). | Integer getWaitTimer() | setWaitTimer(Integer waitTimer) |
| `Reviewers` | [`List<Reviewer4>`](../../doc/models/reviewer-4.md) | Optional | The people or teams that may review jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. | List<Reviewer4> getReviewers() | setReviewers(List<Reviewer4> reviewers) |
| `DeploymentBranchPolicy` | `Object` | Optional | - | Object getDeploymentBranchPolicy() | setDeploymentBranchPolicy(Object deploymentBranchPolicy) |

## Example (as JSON)

```json
{
  "wait_timer": null,
  "reviewers": null,
  "deployment_branch_policy": null
}
```

