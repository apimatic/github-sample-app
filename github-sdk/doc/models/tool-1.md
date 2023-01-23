
# Tool 1

## Structure

`Tool1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Guid` | `String` | Optional | - | String getGuid() | setGuid(String guid) |
| `Name` | `String` | Required | The name of the tool used to generate the code scanning analysis alert. | String getName() | setName(String name) |
| `Version` | `String` | Required | The version of the tool used to detect the alert. | String getVersion() | setVersion(String version) |

## Example (as JSON)

```json
{
  "guid": null,
  "name": "name0",
  "version": "version4"
}
```

