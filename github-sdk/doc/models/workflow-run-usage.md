
# Workflow Run Usage

Workflow Run Usage

## Structure

`WorkflowRunUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Billable` | [`Billable1`](../../doc/models/billable-1.md) | Required | - | Billable1 getBillable() | setBillable(Billable1 billable) |
| `RunDurationMs` | `Integer` | Optional | - | Integer getRunDurationMs() | setRunDurationMs(Integer runDurationMs) |

## Example (as JSON)

```json
{
  "billable": {
    "UBUNTU": null,
    "MACOS": null,
    "WINDOWS": null
  },
  "run_duration_ms": null
}
```

