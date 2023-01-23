
# User Memberships Orgs Request

## Structure

`UserMembershipsOrgsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `String` | Required, Constant | The state that the membership should be in. Only `"active"` will be accepted.<br>**Default**: `"active"` | String getState() | setState(String state) |

## Example (as JSON)

```json
{
  "state": "active"
}
```

