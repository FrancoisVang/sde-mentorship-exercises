# Exercise 04: Log File Analyzer

## Objective

Combine parsing, collections, sorting, validation, and aggregation in a practical problem.

## Requirements

Build an analyzer for log lines in this format:

`2026-01-15T10:30:00Z INFO GET /orders 200 42`

Fields are timestamp, level, method, path, status code, and latency in milliseconds.

The analyzer should:

- Parse valid lines.
- Count requests by log level.
- Count requests by HTTP status class.
- Return the top three paths by request count.
- Calculate average latency.
- Handle malformed lines using a documented strategy.
- Include tests for valid, empty, malformed, and mixed-status input.

## Submit

Include domain classes as appropriate, tests, a README explaining your design, and a pull request.