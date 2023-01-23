
# Protection Rule

## Structure

`ProtectionRule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `WaitTimer` | `Integer` | Optional | The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days). | Integer getWaitTimer() | setWaitTimer(Integer waitTimer) |

## Example (as JSON)

```json
{
  "id": 3515,
  "node_id": "MDQ6R2F0ZTM1MTU=",
  "type": "wait_timer"
}
```

