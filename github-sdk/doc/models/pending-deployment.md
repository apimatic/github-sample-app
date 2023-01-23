
# Pending Deployment

Details of a deployment that is waiting for protection rules to pass

## Structure

`PendingDeployment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Environment` | [`Environment2`](../../doc/models/environment-2.md) | Required | - | Environment2 getEnvironment() | setEnvironment(Environment2 environment) |
| `WaitTimer` | `int` | Required | The set duration of the wait timer | int getWaitTimer() | setWaitTimer(int waitTimer) |
| `WaitTimerStartedAt` | `LocalDateTime` | Required | The time that the wait timer began. | LocalDateTime getWaitTimerStartedAt() | setWaitTimerStartedAt(LocalDateTime waitTimerStartedAt) |
| `CurrentUserCanApprove` | `boolean` | Required | Whether the currently authenticated user can approve the deployment | boolean getCurrentUserCanApprove() | setCurrentUserCanApprove(boolean currentUserCanApprove) |
| `Reviewers` | [`List<Reviewer>`](../../doc/models/reviewer.md) | Required | The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. | List<Reviewer> getReviewers() | setReviewers(List<Reviewer> reviewers) |

## Example (as JSON)

```json
{
  "environment": null,
  "wait_timer": 30,
  "wait_timer_started_at": "11/23/2020 22:00:40",
  "current_user_can_approve": true,
  "reviewers": null
}
```

