
# Repos Check Runs Check Run Id Request 3

## Structure

`ReposCheckRunsCheckRunIdRequest3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `Object` | Optional | - | Object getStatus() | setStatus(Object status) |

## Example (as JSON)

```json
{
  "name": "mighty_readme",
  "started_at": "2018-05-04T01:14:52Z",
  "status": "completed",
  "conclusion": "success",
  "completed_at": "2018-05-04T01:14:52Z",
  "output": {
    "title": "Mighty Readme report",
    "summary": "There are 0 failures, 2 warnings, and 1 notices.",
    "text": "You may have some misspelled words on lines 2 and 4. You also may want to add a section in your README about how to install your app.",
    "annotations": [
      {
        "path": "README.md",
        "annotation_level": "warning",
        "title": "Spell Checker",
        "message": "Check your spelling for 'banaas'.",
        "raw_details": "Do you mean 'bananas' or 'banana'?",
        "start_line": 2,
        "end_line": 2
      },
      {
        "path": "README.md",
        "annotation_level": "warning",
        "title": "Spell Checker",
        "message": "Check your spelling for 'aples'",
        "raw_details": "Do you mean 'apples' or 'Naples'",
        "start_line": 4,
        "end_line": 4
      }
    ],
    "images": [
      {
        "alt": "Super bananas",
        "image_url": "http://example.com/images/42"
      }
    ]
  }
}
```

