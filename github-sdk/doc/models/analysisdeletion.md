
# Analysisdeletion

Successful deletion of a code scanning analysis

## Structure

`Analysisdeletion`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NextAnalysisUrl` | `String` | Required | Next deletable analysis in chain, without last analysis deletion confirmation | String getNextAnalysisUrl() | setNextAnalysisUrl(String nextAnalysisUrl) |
| `ConfirmDeleteUrl` | `String` | Required | Next deletable analysis in chain, with last analysis deletion confirmation | String getConfirmDeleteUrl() | setConfirmDeleteUrl(String confirmDeleteUrl) |

## Example (as JSON)

```json
{
  "next_analysis_url": "next_analysis_url2",
  "confirm_delete_url": "confirm_delete_url0"
}
```

