
# User Ssh Signing Keys Request

## Structure

`UserSshSigningKeysRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | A descriptive name for the new key. | String getTitle() | setTitle(String title) |
| `Key` | `String` | Required | The public SSH key to add to your GitHub account. For more information, see "[Checking for existing SSH keys](https://docs.github.com/authentication/connecting-to-github-with-ssh/checking-for-existing-ssh-keys)."<br>**Constraints**: *Pattern*: `^ssh-(rsa\|dss\|ed25519) \|^ecdsa-sha2-nistp(256\|384\|521) \|^(sk-ssh-ed25519\|sk-ecdsa-sha2-nistp256)@openssh.com` | String getKey() | setKey(String key) |

## Example (as JSON)

```json
{
  "title": null,
  "key": "key0"
}
```

