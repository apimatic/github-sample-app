
# Repos Keys Request

## Structure

`ReposKeysRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | A name for the key. | String getTitle() | setTitle(String title) |
| `Key` | `String` | Required | The contents of the key. | String getKey() | setKey(String key) |
| `ReadOnly` | `Boolean` | Optional | If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and write.<br><br>Deploy keys with write access can perform the same actions as an organization member with admin access, or a collaborator on a personal repository. For more information, see "[Repository permission levels for an organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)" and "[Permission levels for a user account repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/)." | Boolean getReadOnly() | setReadOnly(Boolean readOnly) |

## Example (as JSON)

```json
{
  "title": null,
  "key": "key0",
  "read_only": null
}
```

