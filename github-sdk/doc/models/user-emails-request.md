
# User Emails Request

## Structure

`UserEmailsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Emails` | `List<String>` | Required | Adds one or more email addresses to your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key. | List<String> getEmails() | setEmails(List<String> emails) |

## Example (as JSON)

```json
{
  "emails": [
    "octocat@github.com",
    "mona@github.com"
  ]
}
```

