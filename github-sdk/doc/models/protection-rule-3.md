
# Protection Rule 3

## Structure

`ProtectionRule3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `WaitTimer` | `Integer` | Optional | The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days). | Integer getWaitTimer() | setWaitTimer(Integer waitTimer) |
| `Reviewers` | [`List<Reviewer>`](../../doc/models/reviewer.md) | Optional | The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. | List<Reviewer> getReviewers() | setReviewers(List<Reviewer> reviewers) |

## Example (as JSON)

```json
{
  "id": null,
  "node_id": null,
  "type": null,
  "wait_timer": null,
  "reviewers": null
}
```

