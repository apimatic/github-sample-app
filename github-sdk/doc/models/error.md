
# Error

## Structure

`Error`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Resource` | `String` | Optional | - | String getResource() | setResource(String resource) |
| `Field` | `String` | Optional | - | String getField() | setField(String field) |
| `Message` | `String` | Optional | - | String getMessage() | setMessage(String message) |
| `Code` | `String` | Required | - | String getCode() | setCode(String code) |
| `Index` | `Integer` | Optional | - | Integer getIndex() | setIndex(Integer index) |
| `Value` | [`ErrorValue`]($m/ErrorValue) | Optional | - | ErrorValue getValue() | setValue(ErrorValue value) |

## Example (as JSON)

```json
{
  "resource": null,
  "field": null,
  "message": null,
  "code": "code8",
  "index": null,
  "value": null
}
```

