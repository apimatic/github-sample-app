
# Orgs Actions Variables Request 1

## Structure

`OrgsActionsVariablesRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the variable. | String getName() | setName(String name) |
| `Value` | `String` | Optional | The value of the variable. | String getValue() | setValue(String value) |
| `Visibility` | [`Visibility82Enum`](../../doc/models/visibility-82-enum.md) | Optional | - | Visibility82Enum getVisibility() | setVisibility(Visibility82Enum visibility) |
| `SelectedRepositoryIds` | `List<Integer>` | Optional | An array of repository ids that can access the organization variable. You can only provide a list of repository ids when the `visibility` is set to `selected`. | List<Integer> getSelectedRepositoryIds() | setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) |

## Example (as JSON)

```json
{
  "name": null,
  "value": null,
  "visibility": null,
  "selected_repository_ids": null
}
```

