
# Identifier

An advisory identifier.

## Structure

`Identifier`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type1Enum`](../../doc/models/type-1-enum.md) | Required | - | Type1Enum getType() | setType(Type1Enum type) |
| `Value` | `String` | Required | The value of the advisory identifer. | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "type": "CVE",
  "value": "value2"
}
```

