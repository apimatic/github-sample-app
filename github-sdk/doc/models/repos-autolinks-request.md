
# Repos Autolinks Request

## Structure

`ReposAutolinksRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `KeyPrefix` | `String` | Required | This prefix appended by certain characters will generate a link any time it is found in an issue, pull request, or commit. | String getKeyPrefix() | setKeyPrefix(String keyPrefix) |
| `UrlTemplate` | `String` | Required | The URL must contain `<num>` for the reference number. `<num>` matches different characters depending on the value of `is_alphanumeric`. | String getUrlTemplate() | setUrlTemplate(String urlTemplate) |
| `IsAlphanumeric` | `Boolean` | Optional | Whether this autolink reference matches alphanumeric characters. If true, the `<num>` parameter of the `url_template` matches alphanumeric characters `A-Z` (case insensitive), `0-9`, and `-`. If false, this autolink reference only matches numeric characters.<br>**Default**: `true` | Boolean getIsAlphanumeric() | setIsAlphanumeric(Boolean isAlphanumeric) |

## Example (as JSON)

```json
{
  "key_prefix": "key_prefix8",
  "url_template": "url_template0",
  "is_alphanumeric": null
}
```

