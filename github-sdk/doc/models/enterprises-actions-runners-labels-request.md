
# Enterprises Actions Runners Labels Request

## Structure

`EnterprisesActionsRunnersLabelsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Labels` | `List<String>` | Required | The names of the custom labels to add to the runner.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `100` | List<String> getLabels() | setLabels(List<String> labels) |

## Example (as JSON)

```json
{
  "labels": [
    "labels4",
    "labels5"
  ]
}
```

