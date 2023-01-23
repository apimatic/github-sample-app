
# Repos Actions Runners Runner Id Labels Request 1

## Structure

`ReposActionsRunnersRunnerIdLabelsRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Labels` | `List<String>` | Required | The names of the custom labels to set for the runner. You can pass an empty array to remove all custom labels.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `100` | List<String> getLabels() | setLabels(List<String> labels) |

## Example (as JSON)

```json
{
  "labels": [
    "labels4",
    "labels5"
  ]
}
```

