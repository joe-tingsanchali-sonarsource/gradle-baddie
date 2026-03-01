# gradle-baddie

A large multi-module Gradle project used for testing SonarQube analysis performance and memory behaviour at scale.

## Project structure

- **90 submodules** (`module-01` through `module-90`), each containing 100 generated Java source files (~43 KB each)
- **9,000 Java files** total, no test files
- All modules share the same build configuration via `allprojects` / `subprojects` blocks in the root `build.gradle.kts`

## Lines of code

Each Java file is 1,236 lines broken down as follows:

| Category | Per file | 9,000 files total |
|----------|----------|-------------------|
| Raw lines | 1,236 | 11,124,000 |
| Blank lines | 122 (10%) | 1,098,000 |
| Comment lines | 202 (16%) | 1,818,000 |
| **Code lines (LOC)** | **912 (74%)** | **~8,208,000** |

SonarQube counts **LOC as non-blank, non-comment lines**, so the reported LOC for this project is approximately **8.2 million**. This is the primary driver of scanner memory usage — the Java sensor performs symbolic execution and data-flow analysis on every line of code, accumulating heap state across all modules in a single JVM process.

## Key settings

### `build.gradle.kts`

| Setting | Value |
|---------|-------|
| SonarQube plugin | `org.sonarqube` 7.2.2.6593 |
| Java source/target compatibility | 17 |
| `sonar.projectKey` | `gradle-baddie1` |
| `sonar.organization` | `joetest1` |
| `sonar.host.url` | `https://dev5.sc-dev5.io` |

### `gradle.properties`

| Setting | Value |
|---------|-------|
| `org.gradle.jvmargs` | `-Xmx12g -Xms4g -XX:MaxMetaspaceSize=1g -XX:+HeapDumpOnOutOfMemoryError` |
| `org.gradle.parallel` | `true` |
| `org.gradle.daemon` | `true` |
| `org.gradle.caching` | `true` |

> **Note:** 12 GB heap is required. With 6 GB the SonarQube scanner runs out of memory partway through the analysis due to heap accumulation across modules.

## Commands

**Build:**
```bash
./gradlew build
```

**SonarQube analysis:**
```bash
./gradlew sonar \
  -Dsonar.token=<token> \
  -Dsonar.scanner.skipSystemTruststore=true \
  -i 2>&1 | tee output5
```

**Monitor progress while running:**
```bash
tail -f output5 | grep -E "% analyzed|JavaSensor.*done"
```
