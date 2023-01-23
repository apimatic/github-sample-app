
# Code Scanning Alert Instance

## Structure

`CodeScanningAlertInstance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ref` | `String` | Optional | The full Git reference, formatted as `refs/heads/<branch name>`,<br>`refs/pull/<number>/merge`, or `refs/pull/<number>/head`. | String getRef() | setRef(String ref) |
| `AnalysisKey` | `String` | Optional | Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. | String getAnalysisKey() | setAnalysisKey(String analysisKey) |
| `Environment` | `String` | Optional | Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed. | String getEnvironment() | setEnvironment(String environment) |
| `Category` | `String` | Optional | Identifies the configuration under which the analysis was executed. Used to distinguish between multiple analyses for the same tool and commit, but performed on different languages or different parts of the code. | String getCategory() | setCategory(String category) |
| `State` | [`CodeScanningAlertStateEnum`](../../doc/models/code-scanning-alert-state-enum.md) | Optional | - | CodeScanningAlertStateEnum getState() | setState(CodeScanningAlertStateEnum state) |
| `CommitSha` | `String` | Optional | - | String getCommitSha() | setCommitSha(String commitSha) |
| `Message` | [`Message`](../../doc/models/message.md) | Optional | - | Message getMessage() | setMessage(Message message) |
| `Location` | [`Location2`](../../doc/models/location-2.md) | Optional | - | Location2 getLocation() | setLocation(Location2 location) |
| `HtmlUrl` | `String` | Optional | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Classifications` | [`List<CodeScanningAlertInstanceClassifications>`]($m/CodeScanningAlertInstanceClassifications) | Optional | Classifications that have been applied to the file that triggered the alert.<br>For example identifying it as documentation, or a generated file. | List<CodeScanningAlertInstanceClassifications> getClassifications() | setClassifications(List<CodeScanningAlertInstanceClassifications> classifications) |

## Example (as JSON)

```json
{
  "ref": null,
  "analysis_key": null,
  "environment": null,
  "category": null,
  "state": null,
  "commit_sha": null,
  "message": null,
  "location": null,
  "html_url": null,
  "classifications": null
}
```

