
# Code Scanning Alert Rule

## Structure

`CodeScanningAlertRule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | A unique identifier for the rule used to detect the alert. | String getId() | setId(String id) |
| `Name` | `String` | Optional | The name of the rule used to detect the alert. | String getName() | setName(String name) |
| `Severity` | `Object` | Optional | - | Object getSeverity() | setSeverity(Object severity) |
| `SecuritySeverityLevel` | `Object` | Optional | - | Object getSecuritySeverityLevel() | setSecuritySeverityLevel(Object securitySeverityLevel) |
| `Description` | `String` | Optional | A short description of the rule used to detect the alert. | String getDescription() | setDescription(String description) |
| `FullDescription` | `String` | Optional | description of the rule used to detect the alert. | String getFullDescription() | setFullDescription(String fullDescription) |
| `Tags` | `List<String>` | Optional | A set of tags applicable for the rule. | List<String> getTags() | setTags(List<String> tags) |
| `Help` | `String` | Optional | Detailed documentation for the rule as GitHub Flavored Markdown. | String getHelp() | setHelp(String help) |
| `HelpUri` | `String` | Optional | A link to the documentation for the rule used to detect the alert. | String getHelpUri() | setHelpUri(String helpUri) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "severity": null,
  "security_severity_level": null,
  "description": null,
  "full_description": null,
  "tags": null,
  "help": null,
  "help_uri": null
}
```

