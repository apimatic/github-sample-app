
# User Gpg Keys Request

## Structure

`UserGpgKeysRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | A descriptive name for the new key. | String getName() | setName(String name) |
| `ArmoredPublicKey` | `String` | Required | A GPG key in ASCII-armored format. | String getArmoredPublicKey() | setArmoredPublicKey(String armoredPublicKey) |

## Example (as JSON)

```json
{
  "name": null,
  "armored_public_key": "armored_public_key8"
}
```

