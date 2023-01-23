
# Security Advisory 1

## Structure

`SecurityAdvisory1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GhsaId` | `String` | Required | The unique GitHub Security Advisory ID assigned to the advisory. | String getGhsaId() | setGhsaId(String ghsaId) |
| `CveId` | `String` | Required | The unique CVE ID assigned to the advisory. | String getCveId() | setCveId(String cveId) |
| `Summary` | `String` | Required | A short, plain text summary of the advisory.<br>**Constraints**: *Maximum Length*: `1024` | String getSummary() | setSummary(String summary) |
| `Description` | `String` | Required | A long-form Markdown-supported description of the advisory. | String getDescription() | setDescription(String description) |
| `Vulnerabilities` | [`List<DependabotAlertSecurityVulnerability>`](../../doc/models/dependabot-alert-security-vulnerability.md) | Required | Vulnerable version range information for the advisory. | List<DependabotAlertSecurityVulnerability> getVulnerabilities() | setVulnerabilities(List<DependabotAlertSecurityVulnerability> vulnerabilities) |
| `Severity` | [`Severity1Enum`](../../doc/models/severity-1-enum.md) | Required | - | Severity1Enum getSeverity() | setSeverity(Severity1Enum severity) |
| `Cvss` | [`Cvss4`](../../doc/models/cvss-4.md) | Required | - | Cvss4 getCvss() | setCvss(Cvss4 cvss) |
| `Cwes` | [`List<Cwe>`](../../doc/models/cwe.md) | Required | Details for the advisory pertaining to Common Weakness Enumeration. | List<Cwe> getCwes() | setCwes(List<Cwe> cwes) |
| `Identifiers` | [`List<Identifier>`](../../doc/models/identifier.md) | Required | Values that identify this advisory among security information sources. | List<Identifier> getIdentifiers() | setIdentifiers(List<Identifier> identifiers) |
| `References` | [`List<Reference>`](../../doc/models/reference.md) | Required | Links to additional advisory information. | List<Reference> getReferences() | setReferences(List<Reference> references) |
| `PublishedAt` | `LocalDateTime` | Required | The time that the advisory was published in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getPublishedAt() | setPublishedAt(LocalDateTime publishedAt) |
| `UpdatedAt` | `LocalDateTime` | Required | The time that the advisory was last modified in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `WithdrawnAt` | `LocalDateTime` | Required | The time that the advisory was withdrawn in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getWithdrawnAt() | setWithdrawnAt(LocalDateTime withdrawnAt) |

## Example (as JSON)

```json
{
  "ghsa_id": "ghsa_id0",
  "cve_id": "cve_id0",
  "summary": "summary2",
  "description": "description0",
  "vulnerabilities": [
    {
      "package": {
        "ecosystem": "ecosystem7",
        "name": "name1"
      },
      "severity": "critical",
      "vulnerable_version_range": "vulnerable_version_range1",
      "first_patched_version": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "package": {
        "ecosystem": "ecosystem8",
        "name": "name2"
      },
      "severity": "low",
      "vulnerable_version_range": "vulnerable_version_range2",
      "first_patched_version": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ],
  "severity": "low",
  "cvss": {
    "score": 169.06,
    "vector_string": "vector_string6"
  },
  "cwes": [
    {
      "cwe_id": "cwe_id8",
      "name": "name0"
    }
  ],
  "identifiers": [
    {
      "type": "CVE",
      "value": "value8"
    }
  ],
  "references": [
    {
      "url": "url0"
    },
    {
      "url": "url1"
    }
  ],
  "published_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "withdrawn_at": "2016-03-13T12:52:32.123Z"
}
```

