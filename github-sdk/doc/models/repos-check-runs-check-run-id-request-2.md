
# Repos Check Runs Check Run Id Request 2

## Structure

`ReposCheckRunsCheckRunIdRequest2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the check. For example, "code-coverage". | String getName() | setName(String name) |
| `DetailsUrl` | `String` | Optional | The URL of the integrator's site that has the full details of the check. | String getDetailsUrl() | setDetailsUrl(String detailsUrl) |
| `ExternalId` | `String` | Optional | A reference for the run on the integrator's system. | String getExternalId() | setExternalId(String externalId) |
| `StartedAt` | `LocalDateTime` | Optional | This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getStartedAt() | setStartedAt(LocalDateTime startedAt) |
| `Status` | [`Status34Enum`](../../doc/models/status-34-enum.md) | Optional | - | Status34Enum getStatus() | setStatus(Status34Enum status) |
| `Conclusion` | [`Conclusion20Enum`](../../doc/models/conclusion-20-enum.md) | Optional | - | Conclusion20Enum getConclusion() | setConclusion(Conclusion20Enum conclusion) |
| `CompletedAt` | `LocalDateTime` | Optional | The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCompletedAt() | setCompletedAt(LocalDateTime completedAt) |
| `Output` | [`Output4`](../../doc/models/output-4.md) | Optional | - | Output4 getOutput() | setOutput(Output4 output) |
| `Actions` | [`List<Actions28>`](../../doc/models/actions-28.md) | Optional | Possible further actions the integrator can perform, which a user may trigger. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://docs.github.com/rest/reference/checks#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://docs.github.com/rest/reference/checks#check-runs-and-requested-actions)."<br>**Constraints**: *Maximum Items*: `3` | List<Actions28> getActions() | setActions(List<Actions28> actions) |

## Example (as JSON)

```json
{
  "name": null,
  "details_url": null,
  "external_id": null,
  "started_at": null,
  "status": null,
  "conclusion": null,
  "completed_at": null,
  "output": null,
  "actions": null
}
```

