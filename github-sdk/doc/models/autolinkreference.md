
# Autolinkreference

An autolink reference.

## Structure

`Autolinkreference`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `KeyPrefix` | `String` | Required | The prefix of a key that is linkified. | String getKeyPrefix() | setKeyPrefix(String keyPrefix) |
| `UrlTemplate` | `String` | Required | A template for the target URL that is generated if a key was found. | String getUrlTemplate() | setUrlTemplate(String urlTemplate) |
| `IsAlphanumeric` | `boolean` | Required | Whether this autolink reference matches alphanumeric characters. If false, this autolink reference only matches numeric characters. | boolean getIsAlphanumeric() | setIsAlphanumeric(boolean isAlphanumeric) |

## Example (as JSON)

```json
{
  "id": 3,
  "key_prefix": "TICKET-",
  "url_template": "https://example.com/TICKET?query=<num>",
  "is_alphanumeric": true
}
```

