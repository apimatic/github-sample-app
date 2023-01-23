
# Code Scanning Analysis

## Structure

`CodeScanningAnalysis`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ref` | `String` | Required | The full Git reference, formatted as `refs/heads/<branch name>`,<br>`refs/pull/<number>/merge`, or `refs/pull/<number>/head`. | String getRef() | setRef(String ref) |
| `CommitSha` | `String` | Required | The SHA of the commit to which the analysis you are uploading relates.<br>**Constraints**: *Minimum Length*: `40`, *Maximum Length*: `40`, *Pattern*: `^[0-9a-fA-F]+$` | String getCommitSha() | setCommitSha(String commitSha) |
| `AnalysisKey` | `String` | Required | Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. | String getAnalysisKey() | setAnalysisKey(String analysisKey) |
| `Environment` | `String` | Required | Identifies the variable values associated with the environment in which this analysis was performed. | String getEnvironment() | setEnvironment(String environment) |
| `Category` | `String` | Optional | Identifies the configuration under which the analysis was executed. Used to distinguish between multiple analyses for the same tool and commit, but performed on different languages or different parts of the code. | String getCategory() | setCategory(String category) |
| `Error` | `String` | Required | - | String getError() | setError(String error) |
| `CreatedAt` | `LocalDateTime` | Required | The time that the analysis was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `ResultsCount` | `int` | Required | The total number of results in the analysis. | int getResultsCount() | setResultsCount(int resultsCount) |
| `RulesCount` | `int` | Required | The total number of rules used in the analysis. | int getRulesCount() | setRulesCount(int rulesCount) |
| `Id` | `int` | Required | Unique identifier for this analysis. | int getId() | setId(int id) |
| `Url` | `String` | Required | The REST API URL of the analysis resource. | String getUrl() | setUrl(String url) |
| `SarifId` | `String` | Required | An identifier for the upload. | String getSarifId() | setSarifId(String sarifId) |
| `Tool` | [`CodeScanningAnalysisTool`](../../doc/models/code-scanning-analysis-tool.md) | Required | - | CodeScanningAnalysisTool getTool() | setTool(CodeScanningAnalysisTool tool) |
| `Deletable` | `boolean` | Required | - | boolean getDeletable() | setDeletable(boolean deletable) |
| `Warning` | `String` | Required | Warning generated when processing the analysis | String getWarning() | setWarning(String warning) |

## Example (as JSON)

```json
{
  "ref": null,
  "commit_sha": null,
  "analysis_key": null,
  "environment": null,
  "error": "error reading field xyz",
  "created_at": null,
  "results_count": null,
  "rules_count": null,
  "id": null,
  "url": null,
  "sarif_id": "6c81cd8e-b078-4ac3-a3be-1dad7dbd0b53",
  "tool": null,
  "deletable": null,
  "warning": "123 results were ignored"
}
```

