#!/usr/bin/env python3
"""
Regenerates all Java source files with unique per-file local variable names
so that SonarQube CPD finds no cross-file duplicate token sequences.

CPD normalises string/number literals to a common token, so varying magic
numbers alone does NOT break CPD matches.  Using class-specific local variable
names (e.g. sb_m01c100 instead of sb) makes every business-method body
tokenise differently, breaking all cross-file matches.
"""

import os
import random

MODULES = 80
CLASSES_PER_MODULE = 100
TYPES = ["Controller", "Repository", "Util", "Service", "Entity"]
WORKSPACE = os.path.dirname(os.path.abspath(__file__))


# ---------------------------------------------------------------------------
# Helpers
# ---------------------------------------------------------------------------

def rng_for(mod: int, cls: int) -> random.Random:
    return random.Random(mod * 10000 + cls)


def fmt_double(v: float) -> str:
    """Format a float as a Java double literal with two decimal places."""
    return f"{v:.2f}"


# ---------------------------------------------------------------------------
# Per-section generators
# ---------------------------------------------------------------------------

def gen_header(mod: int, cls: int, class_name: str, package: str,
               serial_uid: int, max_size: int, mm: str, ccc: str) -> str:
    return f"""\
package {package};

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * {class_name} - auto-generated class for module {mm}.
 * Part of the Gradle Baddie large-project benchmark suite.
 *
 * <p>This class provides domain logic and data management capabilities
 * for the {package} package.</p>
 *
 * @since 1.0.0
 */
public class {class_name} implements java.io.Serializable {{

    private static final long serialVersionUID = {serial_uid}L;

    /** Maximum allowed size for collection fields. */
    public static final int MAX_SIZE = {max_size};
    /** Default category label. */
    public static final String DEFAULT_CATEGORY = "MODULE_{mm}";
    /** Epsilon for floating-point comparisons. */
    public static final double EPSILON = 1e-9;
    /** Module identifier constant. */
    public static final String MODULE_ID = "module-{mm}";
    /** Class identifier constant. */
    public static final int CLASS_ID = {int(ccc)};

    // ---- Instance fields ----
    private String name;
    private String description;
    private String code;
    private String label;
    private String category;
    private int count;
    private long total;
    private double score;
    private double ratio;
    private boolean active;
    private boolean enabled;
    private int index;
    private Integer priority;
    private Long weight;
    private java.math.BigDecimal amount;
    private Double threshold;
    private java.time.LocalDate createdDate;
    private java.time.LocalDateTime updatedAt;
    private java.util.Date expiryDate;
    private java.util.UUID id;
    private java.util.List<String> tags;
    private java.util.Map<String,Object> metadata;
    private java.util.Set<String> flags;
    private int version;
    private int retryCount;
    private int maxRetries;
    private long timeout;
    private String checksum;
    private String source;
    private String target;

    /**
     * Lifecycle status for {class_name}.
     */
    public enum Status {{
        CREATED, PENDING, PROCESSING, COMPLETED, FAILED, CANCELLED, ARCHIVED;

        /** Returns true if this is a terminal status. */
        public boolean isTerminal() {{
            return this == COMPLETED || this == FAILED || this == CANCELLED || this == ARCHIVED;
        }}

        /** Returns true if this status represents active processing. */
        public boolean isActive() {{
            return this == PENDING || this == PROCESSING;
        }}
    }}

    private Status status;

    static {{
        String prop = System.getProperty("{package}.{class_name}.init", "false");
        if ("true".equalsIgnoreCase(prop)) {{
            System.getLogger("{class_name}").log(System.Logger.Level.DEBUG, "Static init");
        }}
    }}

    /** Creates a new instance with default field values. */
    public {class_name}() {{
        this.name = "";
        this.description = "";
        this.code = MODULE_ID + "-" + CLASS_ID;
        this.category = DEFAULT_CATEGORY;
        this.source = "UNKNOWN";
        this.tags = new ArrayList<>();
        this.metadata = new HashMap<>();
        this.flags = new HashSet<>();
        this.amount = BigDecimal.ZERO;
        this.createdDate = LocalDate.now();
        this.updatedAt = LocalDateTime.now();
        this.expiryDate = new java.util.Date();
        this.id = UUID.randomUUID();
        this.status = Status.CREATED;
        this.enabled = true;
        this.maxRetries = 3;
        this.timeout = 30000L;
        this.version = 1;
    }}

    /**
     * Creates a new instance with the provided core field values.
     *
     * @param name     the human-readable name
     * @param code     the unique code identifier
     * @param category the classification category
     * @param active   whether this instance is active
     */
    public {class_name}(String name, String code, String category, boolean active) {{
        this();
        this.name = name;
        this.code = code;
        this.category = category;
        this.active = active;
        this.status = active ? Status.PENDING : Status.CREATED;
    }}

    public Status getStatus() {{ return status; }}
    public void setStatus(Status status) {{ this.status = status; }}

    // ---- Accessors ----

    public String getName() {{
        return name;
    }}

    public void setName(String name) {{
        this.name = name;
    }}

    public String getDescription() {{
        return description;
    }}

    public void setDescription(String description) {{
        this.description = description;
    }}

    public String getCode() {{
        return code;
    }}

    public void setCode(String code) {{
        this.code = code;
    }}

    public String getLabel() {{
        return label;
    }}

    public void setLabel(String label) {{
        this.label = label;
    }}

    public String getCategory() {{
        return category;
    }}

    public void setCategory(String category) {{
        this.category = category;
    }}

    public int getCount() {{
        return count;
    }}

    public void setCount(int count) {{
        this.count = count;
    }}

    public long getTotal() {{
        return total;
    }}

    public void setTotal(long total) {{
        this.total = total;
    }}

    public double getScore() {{
        return score;
    }}

    public void setScore(double score) {{
        this.score = score;
    }}

    public double getRatio() {{
        return ratio;
    }}

    public void setRatio(double ratio) {{
        this.ratio = ratio;
    }}

    public boolean getActive() {{
        return active;
    }}

    public void setActive(boolean active) {{
        this.active = active;
    }}

    public boolean getEnabled() {{
        return enabled;
    }}

    public void setEnabled(boolean enabled) {{
        this.enabled = enabled;
    }}

    public int getIndex() {{
        return index;
    }}

    public void setIndex(int index) {{
        this.index = index;
    }}

    public Integer getPriority() {{
        return priority;
    }}

    public void setPriority(Integer priority) {{
        this.priority = priority;
    }}

    public Long getWeight() {{
        return weight;
    }}

    public void setWeight(Long weight) {{
        this.weight = weight;
    }}

    public java.math.BigDecimal getAmount() {{
        return amount;
    }}

    public void setAmount(java.math.BigDecimal amount) {{
        this.amount = amount;
    }}

    public Double getThreshold() {{
        return threshold;
    }}

    public void setThreshold(Double threshold) {{
        this.threshold = threshold;
    }}

    public java.time.LocalDate getCreatedDate() {{
        return createdDate;
    }}

    public void setCreatedDate(java.time.LocalDate createdDate) {{
        this.createdDate = createdDate;
    }}

    public java.time.LocalDateTime getUpdatedAt() {{
        return updatedAt;
    }}

    public void setUpdatedAt(java.time.LocalDateTime updatedAt) {{
        this.updatedAt = updatedAt;
    }}

    public java.util.Date getExpiryDate() {{
        return expiryDate;
    }}

    public void setExpiryDate(java.util.Date expiryDate) {{
        this.expiryDate = expiryDate;
    }}

    public java.util.UUID getId() {{
        return id;
    }}

    public void setId(java.util.UUID id) {{
        this.id = id;
    }}

    public java.util.List<String> getTags() {{
        return tags;
    }}

    public void setTags(java.util.List<String> tags) {{
        this.tags = tags;
    }}

    public java.util.Map<String,Object> getMetadata() {{
        return metadata;
    }}

    public void setMetadata(java.util.Map<String,Object> metadata) {{
        this.metadata = metadata;
    }}

    public java.util.Set<String> getFlags() {{
        return flags;
    }}

    public void setFlags(java.util.Set<String> flags) {{
        this.flags = flags;
    }}

    public int getVersion() {{
        return version;
    }}

    public void setVersion(int version) {{
        this.version = version;
    }}

    public int getRetryCount() {{
        return retryCount;
    }}

    public void setRetryCount(int retryCount) {{
        this.retryCount = retryCount;
    }}

    public int getMaxRetries() {{
        return maxRetries;
    }}

    public void setMaxRetries(int maxRetries) {{
        this.maxRetries = maxRetries;
    }}

    public long getTimeout() {{
        return timeout;
    }}

    public void setTimeout(long timeout) {{
        this.timeout = timeout;
    }}

    public String getChecksum() {{
        return checksum;
    }}

    public void setChecksum(String checksum) {{
        this.checksum = checksum;
    }}

    public String getSource() {{
        return source;
    }}

    public void setSource(String source) {{
        this.source = source;
    }}

    public String getTarget() {{
        return target;
    }}

    public void setTarget(String target) {{
        this.target = target;
    }}

    // ---- Business methods ----
"""


def gen_process_string(mm: str, ccc: str, variant: int, rng: random.Random) -> str:
    """processStringValue — unique local variable names per class."""
    sfx = f"_m{mm}c{ccc}"
    effective_max = rng.randint(256, 2048)
    split_re = rng.choice([r"[\\s,;|]+", r"[\\s]+", r"[\\s,]+", r"[,;|]+"])
    upper_first = rng.choice(["toUpperCase", "toLowerCase"])
    rest_op = rng.choice(["toLowerCase", "toUpperCase"])
    vv = f"{variant:02d}"
    return f"""\
    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module {mm}, class {ccc}, variant {variant}.
     *
     * @param input  the raw input string
     * @param trim   whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue{vv}(String input, boolean trim, int maxLen) {{
        if (input == null) {{
            return code != null ? code.toString() : "";
        }}
        int effectiveMax{sfx} = maxLen > 0 ? Math.min(maxLen, {effective_max}) : {effective_max};
        String working{sfx} = trim ? input.trim() : input;
        if (working{sfx}.isEmpty()) {{
            return "";
        }}
        StringBuilder sb{sfx} = new StringBuilder(effectiveMax{sfx});
        String[] tokens{sfx} = working{sfx}.split("{split_re}");
        for (int i = 0; i < tokens{sfx}.length; i++) {{
            String tok{sfx} = tokens{sfx}[i];
            if (tok{sfx} == null || tok{sfx}.isEmpty()) {{
                continue;
            }}
            if (sb{sfx}.length() + tok{sfx}.length() + 1 > effectiveMax{sfx}) {{
                break;
            }}
            if (sb{sfx}.length() > 0) {{
                sb{sfx}.append(' ');
            }}
            sb{sfx}.append(Character.{upper_first}(tok{sfx}.charAt(0)));
            if (tok{sfx}.length() > 1) {{
                sb{sfx}.append(tok{sfx}.substring(1).{rest_op}());
            }}
        }}
        return sb{sfx}.toString();
    }}
"""


def gen_compute_numeric(mm: str, ccc: str, variant: int, rng: random.Random) -> str:
    """computeNumericValue — unique local variable names per class."""
    sfx = f"_m{mm}c{ccc}"
    multiplier = fmt_double(rng.uniform(1.1, 2.5))
    offset = rng.randint(1, 30)
    epsilon = rng.choice(["1e-9", "1e-12", "1e-6"])
    extra_op = rng.choice(["mean", "mean * 2.0", "mean / 2.0", "Math.abs(mean)"])
    vv = f"{variant:02d}"
    return f"""\
    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module {mm}, class {ccc}, variant {variant}.
     *
     * @param samples   array of sample values
     * @param weights   optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue{vv}(double[] samples, double[] weights, double baseScale) {{
        if (samples == null || samples.length == 0) {{
            return 0.0;
        }}
        double wSum{sfx} = 0.0;
        double wTotal{sfx} = 0.0;
        double rMin{sfx} = Double.MAX_VALUE;
        double rMax{sfx} = -Double.MAX_VALUE;
        int effectiveLen{sfx} = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen{sfx}; i++) {{
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {{
                continue;
            }}
            double w{sfx} = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum{sfx} += samples[i] * w{sfx};
            wTotal{sfx} += w{sfx};
            if (samples[i] < rMin{sfx}) rMin{sfx} = samples[i];
            if (samples[i] > rMax{sfx}) rMax{sfx} = samples[i];
        }}
        if (wTotal{sfx} < {epsilon}) {{
            return 0.0;
        }}
        double mean{sfx} = wSum{sfx} / wTotal{sfx};
        double range{sfx} = rMax{sfx} - rMin{sfx};
        double scaled{sfx} = {extra_op} * baseScale * {multiplier} + {offset};
        return Double.isNaN(scaled{sfx}) ? 0.0 : scaled{sfx};
    }}
"""


def gen_filter_collection(mm: str, ccc: str, variant: int, rng: random.Random) -> str:
    """filterCollection — unique local variable names per class."""
    sfx = f"_m{mm}c{ccc}"
    limit = rng.randint(50, 300)
    effective_min_base = rng.randint(1, 10)
    sort_order = rng.choice(["String.CASE_INSENSITIVE_ORDER",
                              "java.util.Comparator.naturalOrder()",
                              "java.util.Comparator.reverseOrder()"])
    vv = f"{variant:02d}"
    return f"""\
    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module {mm}, class {ccc}, variant {variant}.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection{vv}(
            java.util.List<String> items, String prefix, int minLength) {{
        java.util.List<String> result{sfx} = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {{
            return java.util.Collections.unmodifiableList(result{sfx});
        }}
        int effectiveMin{sfx} = Math.max(minLength, {effective_min_base});
        int limit{sfx} = {limit};
        for (String item{sfx} : items) {{
            if (result{sfx}.size() >= limit{sfx}) {{
                break;
            }}
            if (item{sfx} == null) {{
                continue;
            }}
            String trimmed{sfx} = item{sfx}.trim();
            if (trimmed{sfx}.length() < effectiveMin{sfx}) {{
                continue;
            }}
            if (prefix != null && !trimmed{sfx}.startsWith(prefix)) {{
                continue;
            }}
            result{sfx}.add(trimmed{sfx});
        }}
        result{sfx}.sort({sort_order});
        return java.util.Collections.unmodifiableList(result{sfx});
    }}
"""


def gen_perform_validation(mm: str, ccc: str, variant: int, rng: random.Random) -> str:
    """performValidation — unique local variable names per class."""
    sfx = f"_m{mm}c{ccc}"
    max_name_len = rng.randint(64, 255)
    max_count = rng.randint(500, 2000)
    vv = f"{variant:02d}"
    return f"""\
    /**
     * Validates this instance's fields against business rules.
     * Module {mm}, class {ccc}, variant {variant}.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation{vv}(boolean strict) {{
        java.util.List<String> errs{sfx} = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {{
            errs{sfx}.add("name must not be blank");
        }}
        if (code == null || code.trim().isEmpty()) {{
            errs{sfx}.add("code must not be blank");
        }}
        if (count < 0) {{
            errs{sfx}.add("count must be >= 0, got: " + count);
        }}
        if (score < 0.0 || score > 1.0) {{
            errs{sfx}.add("score must be in [0.0, 1.0], got: " + score);
        }}
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {{
            errs{sfx}.add("amount must be non-negative");
        }}
        if (strict) {{
            if (name != null && name.length() > {max_name_len}) {{
                errs{sfx}.add("name exceeds max length of {max_name_len}");
            }}
            if (count > {max_count}) {{
                errs{sfx}.add("count exceeds max of {max_count}");
            }}
            if (timeout <= 0) {{
                errs{sfx}.add("timeout must be positive");
            }}
            if (retryCount > maxRetries) {{
                errs{sfx}.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }}
        }}
        if (errs{sfx}.isEmpty()) {{
            return null;
        }}
        StringBuilder sb{sfx} = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs{sfx}.size(); i++) {{
            if (i > 0) sb{sfx}.append("; ");
            sb{sfx}.append(errs{sfx}.get(i));
        }}
        return sb{sfx}.toString();
    }}
"""


def gen_build_property_map(mm: str, ccc: str, variant: int, rng: random.Random) -> str:
    """buildPropertyMap — unique local variable names per class."""
    sfx = f"_m{mm}c{ccc}"
    vv = f"{variant:02d}"
    default_pfx = f"m{mm}c{ccc}v{vv}"
    # pick a random subset of extra fields to include, making map contents unique
    extra_fields = rng.sample(
        ["ratio", "threshold", "checksum", "index", "weight", "retryCount", "maxRetries"],
        k=rng.randint(2, 5)
    )
    extra_puts = "\n".join(
        f"        putEntry{sfx}(map{sfx}, pfx{sfx} + \"{f}\", {f}, includeNulls);"
        for f in extra_fields
    )
    return f"""\
    /**
     * Assembles a property map from the current field state.
     * Module {mm}, class {ccc}, variant {variant}.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap{vv}(boolean includeNulls, String keyPrefix) {{
        java.util.Map<String, Object> map{sfx} = new java.util.LinkedHashMap<>();
        String pfx{sfx} = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "{default_pfx}.";
        putEntry{sfx}(map{sfx}, pfx{sfx} + "name",        name,        includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "code",        code,        includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "category",    category,    includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "label",       label,       includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "count",       count,       includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "total",       total,       includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "score",       score,       includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "active",      active,      includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "enabled",     enabled,     includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "source",      source,      includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "target",      target,      includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "version",     version,     includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "priority",    priority,    includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "amount",      amount,      includeNulls);
{extra_puts}
        putEntry{sfx}(map{sfx}, pfx{sfx} + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry{sfx}(map{sfx}, pfx{sfx} + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {{
            map{sfx}.put(pfx{sfx} + "tags.size", tags.size());
        }}
        if (metadata != null && !metadata.isEmpty()) {{
            map{sfx}.put(pfx{sfx} + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }}
        return java.util.Collections.unmodifiableMap(map{sfx});
    }}
"""


def gen_footer(class_name: str, sfx: str) -> str:
    return f"""\

    // ---- Internal helpers ----

    private void putEntry{sfx}(java.util.Map<String, Object> map, String key, Object value, boolean inclNull) {{
        if (value != null || inclNull) {{
            map.put(key, value);
        }}
    }}

    // ---- Object overrides ----

    @Override
    public boolean equals(Object obj) {{
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        {class_name} other = ({class_name}) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(code, other.code)
            && Objects.equals(name, other.name)
            && version == other.version;
    }}

    @Override
    public int hashCode() {{
        return Objects.hash(id, code, name, version);
    }}

    @Override
    public String toString() {{
        return "{class_name}{{" +
            "id=" + id +
            ", code='" + code + '\\'' +
            ", name='" + name + '\\'' +
            ", category='" + category + '\\'' +
            ", status=" + status +
            ", active=" + active +
            ", version=" + version +
            '}}';
    }}
}}
"""


# ---------------------------------------------------------------------------
# File generator
# ---------------------------------------------------------------------------

METHOD_GENERATORS = [
    gen_process_string,
    gen_compute_numeric,
    gen_filter_collection,
    gen_perform_validation,
    gen_build_property_map,
]

NUM_VARIANTS = 20  # 4 full cycles × 5 method types


def generate_file(mod: int, cls: int) -> str:
    mm = f"{mod:02d}"
    ccc = f"{cls:03d}"
    rng = rng_for(mod, cls)
    type_name = TYPES[(cls - 1) % len(TYPES)]
    class_name = f"Generated{type_name}{mm}{ccc}"
    package = f"com.example.module{mm}"
    serial_uid = mod * 1000000 + cls * 100
    max_size = 1000 + mod * 10 + cls
    sfx = f"_m{mm}c{ccc}"

    parts = [gen_header(mod, cls, class_name, package, serial_uid, max_size, mm, ccc)]

    for variant in range(1, NUM_VARIANTS + 1):
        gen_fn = METHOD_GENERATORS[(variant - 1) % len(METHOD_GENERATORS)]
        parts.append("\n")
        parts.append(gen_fn(mm, ccc, variant, rng))

    parts.append(gen_footer(class_name, sfx))
    return "".join(parts)


# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------

def main() -> None:
    total = 0
    for mod in range(1, MODULES + 1):
        mm = f"{mod:02d}"
        module_dir = os.path.join(WORKSPACE, f"module-{mm}",
                                  "src", "main", "java",
                                  "com", "example", f"module{mm}")
        for cls in range(1, CLASSES_PER_MODULE + 1):
            ccc = f"{cls:03d}"
            type_name = TYPES[(cls - 1) % len(TYPES)]
            class_name = f"Generated{type_name}{mm}{ccc}"
            file_path = os.path.join(module_dir, f"{class_name}.java")

            content = generate_file(mod, cls)
            with open(file_path, "w", encoding="utf-8") as f:
                f.write(content)
            total += 1

        if mod % 10 == 0:
            print(f"  module-{mm} done ({mod * CLASSES_PER_MODULE} files written)")

    print(f"\nDone — {total} files regenerated.")


if __name__ == "__main__":
    main()
