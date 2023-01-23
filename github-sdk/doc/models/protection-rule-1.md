
# Protection Rule 1

## Structure

`ProtectionRule1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Reviewers` | [`List<Reviewer>`](../../doc/models/reviewer.md) | Optional | The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. | List<Reviewer> getReviewers() | setReviewers(List<Reviewer> reviewers) |

## Example (as JSON)

```json
{
  "id": 3755,
  "node_id": "MDQ6R2F0ZTM3NTU=",
  "type": "required_reviewers"
}
```

