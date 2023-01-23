
# User Emails Request 1

Deletes one or more email addresses from your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.

## Structure

`UserEmailsRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Emails` | `List<String>` | Required | Email addresses associated with the GitHub user account. | List<String> getEmails() | setEmails(List<String> emails) |

## Example (as JSON)

```json
{
  "emails": [
    "octocat@github.com",
    "mona@github.com"
  ]
}
```

