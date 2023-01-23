
# Permissions 1

## Structure

`Permissions1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Admin` | `boolean` | Required | - | boolean getAdmin() | setAdmin(boolean admin) |
| `Pull` | `boolean` | Required | - | boolean getPull() | setPull(boolean pull) |
| `Triage` | `Boolean` | Optional | - | Boolean getTriage() | setTriage(Boolean triage) |
| `Push` | `boolean` | Required | - | boolean getPush() | setPush(boolean push) |
| `Maintain` | `Boolean` | Optional | - | Boolean getMaintain() | setMaintain(Boolean maintain) |

## Example (as JSON)

```json
{
  "admin": false,
  "pull": false,
  "triage": null,
  "push": false,
  "maintain": null
}
```

