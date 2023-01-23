
# Repos Actions Runs Run Id Pending Deployments Request

## Structure

`ReposActionsRunsRunIdPendingDeploymentsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EnvironmentIds` | `List<Integer>` | Required | The list of environment ids to approve or reject | List<Integer> getEnvironmentIds() | setEnvironmentIds(List<Integer> environmentIds) |
| `State` | [`State171Enum`](../../doc/models/state-171-enum.md) | Required | - | State171Enum getState() | setState(State171Enum state) |
| `Comment` | `String` | Required | A comment to accompany the deployment review | String getComment() | setComment(String comment) |

## Example (as JSON)

```json
{
  "environment_ids": [
    161171787,
    161171795
  ],
  "state": null,
  "comment": "Ship it!"
}
```

