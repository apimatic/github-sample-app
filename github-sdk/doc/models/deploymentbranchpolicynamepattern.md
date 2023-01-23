
# Deploymentbranchpolicynamepattern

## Structure

`Deploymentbranchpolicynamepattern`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name pattern that branches must match in order to deploy to the environment.<br><br>Wildcard characters will not match `/`. For example, to match branches that begin with `release/` and contain an additional single slash, use `release/*/*`.<br>For more information about pattern matching syntax, see the [Ruby File.fnmatch documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch). | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "name": "release/*"
}
```

