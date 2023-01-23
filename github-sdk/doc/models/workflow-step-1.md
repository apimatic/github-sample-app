
# Workflow Step 1

## Structure

`WorkflowStep1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CompletedAt` | `String` | Required | - | String getCompletedAt() | setCompletedAt(String completedAt) |
| `Conclusion` | `Object` | Required | - | Object getConclusion() | setConclusion(Object conclusion) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `StartedAt` | `String` | Required | - | String getStartedAt() | setStartedAt(String startedAt) |
| `Status` | [`Status24Enum`](../../doc/models/status-24-enum.md) | Required | - | Status24Enum getStatus() | setStatus(Status24Enum status) |

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
  "status": "in_progress"
}
```

