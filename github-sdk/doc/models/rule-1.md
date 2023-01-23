
# Rule 1

## Structure

`Rule1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | A short description of the rule used to detect the alert. | String getDescription() | setDescription(String description) |
| `FullDescription` | `String` | Optional | - | String getFullDescription() | setFullDescription(String fullDescription) |
| `Help` | `String` | Optional | - | String getHelp() | setHelp(String help) |
| `HelpUri` | `String` | Optional | A link to the documentation for the rule used to detect the alert. | String getHelpUri() | setHelpUri(String helpUri) |
| `Id` | `String` | Required | A unique identifier for the rule used to detect the alert. | String getId() | setId(String id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Severity` | `Object` | Required | - | Object getSeverity() | setSeverity(Object severity) |
| `Tags` | `List<String>` | Optional | - | List<String> getTags() | setTags(List<String> tags) |

## Example (as JSON)

```json
{
  "description": "description0",
  "full_description": null,
  "help": null,
  "help_uri": null,
  "id": "id0",
  "name": null,
  "severity": {
    "key1": "val1",
    "key2": "val2"
  },
  "tags": null
}
```

