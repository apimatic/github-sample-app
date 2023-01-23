
# Workflow Step

## Structure

`WorkflowStep`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CompletedAt` | `String` | Required | - | String getCompletedAt() | setCompletedAt(String completedAt) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `StartedAt` | `String` | Required | - | String getStartedAt() | setStartedAt(String startedAt) |
| `Status` | [`Status7Enum`](../../doc/models/status-7-enum.md) | Required | - | Status7Enum getStatus() | setStatus(Status7Enum status) |

## Example (as JSON)

```json
{
  "completed_at": "completed_at2",
  "conclusion": {
    "key1": "val1",
    "key2": "val2"
  },
  "name": "name0",
  "number": 158,
  "started_at": "started_at2",
  "status": "completed"
}
```

