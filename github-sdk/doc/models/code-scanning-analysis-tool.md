
# Code Scanning Analysis Tool

## Structure

`CodeScanningAnalysisTool`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the tool used to generate the code scanning analysis. | String getName() | setName(String name) |
| `Version` | `String` | Optional | The version of the tool used to generate the code scanning analysis. | String getVersion() | setVersion(String version) |
| `Guid` | `String` | Optional | The GUID of the tool used to generate the code scanning analysis, if provided in the uploaded SARIF data. | String getGuid() | setGuid(String guid) |

## Example (as JSON)

```json
{
  "name": null,
  "version": null,
  "guid": null
}
```

