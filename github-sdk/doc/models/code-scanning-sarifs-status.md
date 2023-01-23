
# Code Scanning Sarifs Status

## Structure

`CodeScanningSarifsStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProcessingStatus` | [`ProcessingStatusEnum`](../../doc/models/processing-status-enum.md) | Optional | - | ProcessingStatusEnum getProcessingStatus() | setProcessingStatus(ProcessingStatusEnum processingStatus) |
| `AnalysesUrl` | `String` | Optional | The REST API URL for getting the analyses associated with the upload. | String getAnalysesUrl() | setAnalysesUrl(String analysesUrl) |
| `Errors` | `List<String>` | Optional | Any errors that ocurred during processing of the delivery. | List<String> getErrors() | setErrors(List<String> errors) |

## Example (as JSON)

```json
{
  "processing_status": null,
  "analyses_url": null,
  "errors": null
}
```

