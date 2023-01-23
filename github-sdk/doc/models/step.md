
# Step

## Structure

`Step`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`Status3Enum`](../../doc/models/status-3-enum.md) | Required | - | Status3Enum getStatus() | setStatus(Status3Enum status) |
| `Conclusion` | `String` | Required | The outcome of the job. | String getConclusion() | setConclusion(String conclusion) |
| `Name` | `String` | Required | The name of the job. | String getName() | setName(String name) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `StartedAt` | `LocalDateTime` | Optional | The time that the step started, in ISO 8601 format. | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `CompletedAt` | `LocalDateTime` | Optional | The time that the job finished, in ISO 8601 format. | LocalDateTime getCompletedAt() | setCompletedAt(LocalDateTime completedAt) |

## Example (as JSON)

```json
{
  "status": null,
  "conclusion": "success",
  "name": "test-coverage",
  "number": 1
}
```

