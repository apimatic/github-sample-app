
# Orgs Actions Variables Request

## Structure

`OrgsActionsVariablesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the variable. | String getName() | setName(String name) |
| `Value` | `String` | Required | The value of the variable. | String getValue() | setValue(String value) |
| `Visibility` | [`Visibility82Enum`](../../doc/models/visibility-82-enum.md) | Required | - | Visibility82Enum getVisibility() | setVisibility(Visibility82Enum visibility) |
| `SelectedRepositoryIds` | `List<Integer>` | Optional | An array of repository ids that can access the organization variable. You can only provide a list of repository ids when the `visibility` is set to `selected`. | List<Integer> getSelectedRepositoryIds() | setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) |

## Example (as JSON)

```json
{
  "name": "name0",
  "value": "value2",
  "visibility": "selected",
  "selected_repository_ids": null
}
```

