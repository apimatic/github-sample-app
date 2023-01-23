
# Repos Topics Request

## Structure

`ReposTopicsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Names` | `List<String>` | Required | An array of topics to add to the repository. Pass one or more topics to _replace_ the set of existing topics. Send an empty array (`[]`) to clear all topics from the repository. **Note:** Topic `names` cannot contain uppercase letters. | List<String> getNames() | setNames(List<String> names) |

## Example (as JSON)

```json
{
  "names": [
    "names0",
    "names1",
    "names2"
  ]
}
```

