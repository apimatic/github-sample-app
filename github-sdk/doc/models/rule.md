
# Rule

## Structure

`Rule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | A short description of the rule used to detect the alert. | String getDescription() | setDescription(String description) |
| `Id` | `String` | Required | A unique identifier for the rule used to detect the alert. | String getId() | setId(String id) |
| `Severity` | `Object` | Required | - | Object getSeverity() | setSeverity(Object severity) |

## Example (as JSON)

```json
{
  "description": "description0",
  "id": "id0",
  "severity": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

