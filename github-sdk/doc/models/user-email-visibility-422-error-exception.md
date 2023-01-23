
# User Email Visibility 422 Error Exception

## Structure

`UserEmailVisibility422ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | - | String getMessageField() | setMessageField(String messageField) |
| `DocumentationUrl` | `String` | Required | - | String getDocumentationUrl() | setDocumentationUrl(String documentationUrl) |
| `Errors` | [`List<Error>`](../../doc/models/error.md) | Optional | - | List<Error> getErrors() | setErrors(List<Error> errors) |

## Example (as JSON)

```json
{
  "message": "message0",
  "documentation_url": "documentation_url8",
  "errors": null
}
```

