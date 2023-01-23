
# Alert Instance

## Structure

`AlertInstance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AnalysisKey` | `String` | Required | Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name. | String getAnalysisKey() | setAnalysisKey(String analysisKey) |
| `Classifications` | `List<String>` | Optional | - | List<String> getClassifications() | setClassifications(List<String> classifications) |
| `CommitSha` | `String` | Optional | - | String getCommitSha() | setCommitSha(String commitSha) |
| `Environment` | `String` | Required | Identifies the variable values associated with the environment in which the analysis that generated this alert instance was performed, such as the language that was analyzed. | String getEnvironment() | setEnvironment(String environment) |
| `Location` | [`Location2`](../../doc/models/location-2.md) | Optional | - | Location2 getLocation() | setLocation(Location2 location) |
| `Message` | [`Message`](../../doc/models/message.md) | Optional | - | Message getMessage() | setMessage(Message message) |
| `Ref` | `String` | Required | The full Git reference, formatted as `refs/heads/<branch name>`. | String getRef() | setRef(String ref) |
| `State` | [`State16Enum`](../../doc/models/state-16-enum.md) | Required | - | State16Enum getState() | setState(State16Enum state) |

## Example (as JSON)

```json
{
  "analysis_key": "analysis_key2",
  "classifications": null,
  "commit_sha": null,
  "environment": "environment6",
  "location": null,
  "message": null,
  "ref": "ref0",
  "state": "fixed"
}
```

