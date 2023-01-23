
# Validation Error

Validation Error

## Structure

`ValidationError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |
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

