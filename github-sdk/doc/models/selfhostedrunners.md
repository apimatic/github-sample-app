
# Selfhostedrunners

A self hosted runner

## Structure

`Selfhostedrunners`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | The id of the runner. | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of the runner. | String getName() | setName(String name) |
| `Os` | `String` | Required | The Operating System of the runner. | String getOs() | setOs(String os) |
| `Status` | `String` | Required | The status of the runner. | String getStatus() | setStatus(String status) |
| `Busy` | `boolean` | Required | - | boolean getBusy() | setBusy(boolean busy) |
| `Labels` | [`List<Selfhostedrunnerlabel>`](../../doc/models/selfhostedrunnerlabel.md) | Required | - | List<Selfhostedrunnerlabel> getLabels() | setLabels(List<Selfhostedrunnerlabel> labels) |

## Example (as JSON)

```json
{
  "id": 5,
  "name": "iMac",
  "os": "macos",
  "status": "online",
  "busy": null,
  "labels": null
}
```

