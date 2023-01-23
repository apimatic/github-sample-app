
# User Keys Request

## Structure

`UserKeysRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | A descriptive name for the new key. | String getTitle() | setTitle(String title) |
| `Key` | `String` | Required | The public SSH key to add to your GitHub account.<br>**Constraints**: *Pattern*: `^ssh-(rsa\|dss\|ed25519) \|^ecdsa-sha2-nistp(256\|384\|521)` | String getKey() | setKey(String key) |

## Example (as JSON)

```json
{
  "title": null,
  "key": "key0"
}
```

