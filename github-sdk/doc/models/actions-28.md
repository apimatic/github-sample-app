
# Actions 28

## Structure

`Actions28`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Label` | `String` | Required | The text to be displayed on a button in the web UI. The maximum size is 20 characters.<br>**Constraints**: *Maximum Length*: `20` | String getLabel() | setLabel(String label) |
| `Description` | `String` | Required | A short explanation of what this action would do. The maximum size is 40 characters.<br>**Constraints**: *Maximum Length*: `40` | String getDescription() | setDescription(String description) |
| `Identifier` | `String` | Required | A reference for the action on the integrator's system. The maximum size is 20 characters.<br>**Constraints**: *Maximum Length*: `20` | String getIdentifier() | setIdentifier(String identifier) |

## Example (as JSON)

```json
{
  "label": "label0",
  "description": "description0",
  "identifier": "identifier2"
}
```

