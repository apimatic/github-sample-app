
# Selfhostedrunnerlabel

A label for a self hosted runner

## Structure

`Selfhostedrunnerlabel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | Unique identifier of the label. | Integer getId() | setId(Integer id) |
| `Name` | `String` | Required | Name of the label. | String getName() | setName(String name) |
| `Type` | [`TypeEnum`](../../doc/models/type-enum.md) | Optional | - | TypeEnum getType() | setType(TypeEnum type) |

## Example (as JSON)

```json
{
  "id": null,
  "name": "name0",
  "type": null
}
```

