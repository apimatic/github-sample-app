
# Repos Check Runs Request 2

## Structure

`ReposCheckRunsRequest2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the check. For example, "code-coverage". | String getName() | setName(String name) |
| `HeadSha` | `String` | Required | The SHA of the commit. | String getHeadSha() | setHeadSha(String headSha) |
| `DetailsUrl` | `String` | Optional | The URL of the integrator's site that has the full details of the check. If the integrator does not provide this, then the homepage of the GitHub app is used. | String getDetailsUrl() | setDetailsUrl(String detailsUrl) |
| `ExternalId` | `String` | Optional | A reference for the run on the integrator's system. | String getExternalId() | setExternalId(String externalId) |
| `Status` | [`Status34Enum`](../../doc/models/status-34-enum.md) | Optional | - | Status34Enum getStatus() | setStatus(Status34Enum status) |
| `StartedAt` | `LocalDateTime` | Optional | The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `Conclusion` | [`Conclusion20Enum`](../../doc/models/conclusion-20-enum.md) | Optional | - | Conclusion20Enum getConclusion() | setConclusion(Conclusion20Enum conclusion) |
| `CompletedAt` | `LocalDateTime` | Optional | The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCompletedAt() | setCompletedAt(LocalDateTime completedAt) |
| `Output` | [`Output5`](../../doc/models/output-5.md) | Optional | - | Output5 getOutput() | setOutput(Output5 output) |
| `Actions` | [`List<Actions28>`](../../doc/models/actions-28.md) | Optional | Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [`check_run.requested_action` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) to your app. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://docs.github.com/rest/reference/checks#check-runs-and-requested-actions)."<br>**Constraints**: *Maximum Items*: `3` | List<Actions28> getActions() | setActions(List<Actions28> actions) |

## Example (as JSON)

```json
{
  "name": "name0",
  "head_sha": "head_sha6",
  "details_url": null,
  "external_id": null,
  "status": null,
  "started_at": null,
  "conclusion": null,
  "completed_at": null,
  "output": null,
  "actions": null
}
```

