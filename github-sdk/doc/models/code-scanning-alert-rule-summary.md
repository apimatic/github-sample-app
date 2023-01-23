
# Code Scanning Alert Rule Summary

## Structure

`CodeScanningAlertRuleSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | A unique identifier for the rule used to detect the alert. | String getId() | setId(String id) |
| `Name` | `String` | Optional | The name of the rule used to detect the alert. | String getName() | setName(String name) |
| `Tags` | `List<String>` | Optional | A set of tags applicable for the rule. | List<String> getTags() | setTags(List<String> tags) |
| `Severity` | `Object` | Optional | - | Object getSeverity() | setSeverity(Object severity) |
| `Description` | `String` | Optional | A short description of the rule used to detect the alert. | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "tags": null,
  "severity": null,
  "description": null
}
```

