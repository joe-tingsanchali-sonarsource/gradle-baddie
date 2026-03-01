package com.example.module21;

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
 * GeneratedEntity21025 - auto-generated class for module 21.
 * Part of the Gradle Baddie large-project benchmark suite.
 *
 * <p>This class provides domain logic and data management capabilities
 * for the com.example.module21 package.</p>
 *
 * @since 1.0.0
 */
public class GeneratedEntity21025 implements java.io.Serializable {

    private static final long serialVersionUID = 21002500L;

    /** Maximum allowed size for collection fields. */
    public static final int MAX_SIZE = 1235;
    /** Default category label. */
    public static final String DEFAULT_CATEGORY = "MODULE_21";
    /** Epsilon for floating-point comparisons. */
    public static final double EPSILON = 1e-9;
    /** Module identifier constant. */
    public static final String MODULE_ID = "module-21";
    /** Class identifier constant. */
    public static final int CLASS_ID = 25;

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
     * Lifecycle status for GeneratedEntity21025.
     */
    public enum Status {
        CREATED, PENDING, PROCESSING, COMPLETED, FAILED, CANCELLED, ARCHIVED;

        /** Returns true if this is a terminal status. */
        public boolean isTerminal() {
            return this == COMPLETED || this == FAILED || this == CANCELLED || this == ARCHIVED;
        }

        /** Returns true if this status represents active processing. */
        public boolean isActive() {
            return this == PENDING || this == PROCESSING;
        }
    }

    private Status status;

    static {
        String prop = System.getProperty("com.example.module21.GeneratedEntity21025.init", "false");
        if ("true".equalsIgnoreCase(prop)) {
            System.getLogger("GeneratedEntity21025").log(System.Logger.Level.DEBUG, "Static init");
        }
    }

    /** Creates a new instance with default field values. */
    public GeneratedEntity21025() {
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
    }

    /**
     * Creates a new instance with the provided core field values.
     *
     * @param name     the human-readable name
     * @param code     the unique code identifier
     * @param category the classification category
     * @param active   whether this instance is active
     */
    public GeneratedEntity21025(String name, String code, String category, boolean active) {
        this();
        this.name = name;
        this.code = code;
        this.category = category;
        this.active = active;
        this.status = active ? Status.PENDING : Status.CREATED;
    }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    // ---- Accessors ----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public java.math.BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public java.time.LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(java.time.LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public java.time.LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.time.LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public java.util.Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(java.util.Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public java.util.UUID getId() {
        return id;
    }

    public void setId(java.util.UUID id) {
        this.id = id;
    }

    public java.util.List<String> getTags() {
        return tags;
    }

    public void setTags(java.util.List<String> tags) {
        this.tags = tags;
    }

    public java.util.Map<String,Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(java.util.Map<String,Object> metadata) {
        this.metadata = metadata;
    }

    public java.util.Set<String> getFlags() {
        return flags;
    }

    public void setFlags(java.util.Set<String> flags) {
        this.flags = flags;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    // ---- Business methods ----

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 21, class 025, variant 1.
     *
     * @param input  the raw input string
     * @param trim   whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue01(String input, boolean trim, int maxLen) {
        if (input == null) {
            return code != null ? code.toString() : "";
        }
        int effectiveMax_m21c025 = maxLen > 0 ? Math.min(maxLen, 827) : 827;
        String working_m21c025 = trim ? input.trim() : input;
        if (working_m21c025.isEmpty()) {
            return "";
        }
        StringBuilder sb_m21c025 = new StringBuilder(effectiveMax_m21c025);
        String[] tokens_m21c025 = working_m21c025.split("[\\s]+");
        for (int i = 0; i < tokens_m21c025.length; i++) {
            String tok_m21c025 = tokens_m21c025[i];
            if (tok_m21c025 == null || tok_m21c025.isEmpty()) {
                continue;
            }
            if (sb_m21c025.length() + tok_m21c025.length() + 1 > effectiveMax_m21c025) {
                break;
            }
            if (sb_m21c025.length() > 0) {
                sb_m21c025.append(' ');
            }
            sb_m21c025.append(Character.toUpperCase(tok_m21c025.charAt(0)));
            if (tok_m21c025.length() > 1) {
                sb_m21c025.append(tok_m21c025.substring(1).toLowerCase());
            }
        }
        return sb_m21c025.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 21, class 025, variant 2.
     *
     * @param samples   array of sample values
     * @param weights   optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue02(double[] samples, double[] weights, double baseScale) {
        if (samples == null || samples.length == 0) {
            return 0.0;
        }
        double wSum_m21c025 = 0.0;
        double wTotal_m21c025 = 0.0;
        double rMin_m21c025 = Double.MAX_VALUE;
        double rMax_m21c025 = -Double.MAX_VALUE;
        int effectiveLen_m21c025 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m21c025; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m21c025 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m21c025 += samples[i] * w_m21c025;
            wTotal_m21c025 += w_m21c025;
            if (samples[i] < rMin_m21c025) rMin_m21c025 = samples[i];
            if (samples[i] > rMax_m21c025) rMax_m21c025 = samples[i];
        }
        if (wTotal_m21c025 < 1e-9) {
            return 0.0;
        }
        double mean_m21c025 = wSum_m21c025 / wTotal_m21c025;
        double range_m21c025 = rMax_m21c025 - rMin_m21c025;
        double scaled_m21c025 = mean * 2.0 * baseScale * 1.74 + 25;
        return Double.isNaN(scaled_m21c025) ? 0.0 : scaled_m21c025;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 21, class 025, variant 3.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection03(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m21c025 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m21c025);
        }
        int effectiveMin_m21c025 = Math.max(minLength, 3);
        int limit_m21c025 = 113;
        for (String item_m21c025 : items) {
            if (result_m21c025.size() >= limit_m21c025) {
                break;
            }
            if (item_m21c025 == null) {
                continue;
            }
            String trimmed_m21c025 = item_m21c025.trim();
            if (trimmed_m21c025.length() < effectiveMin_m21c025) {
                continue;
            }
            if (prefix != null && !trimmed_m21c025.startsWith(prefix)) {
                continue;
            }
            result_m21c025.add(trimmed_m21c025);
        }
        result_m21c025.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m21c025);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 21, class 025, variant 4.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation04(boolean strict) {
        java.util.List<String> errs_m21c025 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m21c025.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m21c025.add("code must not be blank");
        }
        if (count < 0) {
            errs_m21c025.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m21c025.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m21c025.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 177) {
                errs_m21c025.add("name exceeds max length of 177");
            }
            if (count > 1607) {
                errs_m21c025.add("count exceeds max of 1607");
            }
            if (timeout <= 0) {
                errs_m21c025.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m21c025.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m21c025.isEmpty()) {
            return null;
        }
        StringBuilder sb_m21c025 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m21c025.size(); i++) {
            if (i > 0) sb_m21c025.append("; ");
            sb_m21c025.append(errs_m21c025.get(i));
        }
        return sb_m21c025.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 21, class 025, variant 5.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap05(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m21c025 = new java.util.LinkedHashMap<>();
        String pfx_m21c025 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m21c025v05.";
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "name",        name,        includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "code",        code,        includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "category",    category,    includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "label",       label,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "count",       count,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "total",       total,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "score",       score,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "active",      active,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "enabled",     enabled,     includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "source",      source,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "target",      target,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "version",     version,     includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "priority",    priority,    includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "amount",      amount,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "checksum", checksum, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "maxRetries", maxRetries, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "weight", weight, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "threshold", threshold, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "retryCount", retryCount, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m21c025.put(pfx_m21c025 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m21c025.put(pfx_m21c025 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m21c025);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 21, class 025, variant 6.
     *
     * @param input  the raw input string
     * @param trim   whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue06(String input, boolean trim, int maxLen) {
        if (input == null) {
            return code != null ? code.toString() : "";
        }
        int effectiveMax_m21c025 = maxLen > 0 ? Math.min(maxLen, 870) : 870;
        String working_m21c025 = trim ? input.trim() : input;
        if (working_m21c025.isEmpty()) {
            return "";
        }
        StringBuilder sb_m21c025 = new StringBuilder(effectiveMax_m21c025);
        String[] tokens_m21c025 = working_m21c025.split("[,;|]+");
        for (int i = 0; i < tokens_m21c025.length; i++) {
            String tok_m21c025 = tokens_m21c025[i];
            if (tok_m21c025 == null || tok_m21c025.isEmpty()) {
                continue;
            }
            if (sb_m21c025.length() + tok_m21c025.length() + 1 > effectiveMax_m21c025) {
                break;
            }
            if (sb_m21c025.length() > 0) {
                sb_m21c025.append(' ');
            }
            sb_m21c025.append(Character.toUpperCase(tok_m21c025.charAt(0)));
            if (tok_m21c025.length() > 1) {
                sb_m21c025.append(tok_m21c025.substring(1).toUpperCase());
            }
        }
        return sb_m21c025.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 21, class 025, variant 7.
     *
     * @param samples   array of sample values
     * @param weights   optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue07(double[] samples, double[] weights, double baseScale) {
        if (samples == null || samples.length == 0) {
            return 0.0;
        }
        double wSum_m21c025 = 0.0;
        double wTotal_m21c025 = 0.0;
        double rMin_m21c025 = Double.MAX_VALUE;
        double rMax_m21c025 = -Double.MAX_VALUE;
        int effectiveLen_m21c025 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m21c025; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m21c025 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m21c025 += samples[i] * w_m21c025;
            wTotal_m21c025 += w_m21c025;
            if (samples[i] < rMin_m21c025) rMin_m21c025 = samples[i];
            if (samples[i] > rMax_m21c025) rMax_m21c025 = samples[i];
        }
        if (wTotal_m21c025 < 1e-12) {
            return 0.0;
        }
        double mean_m21c025 = wSum_m21c025 / wTotal_m21c025;
        double range_m21c025 = rMax_m21c025 - rMin_m21c025;
        double scaled_m21c025 = mean / 2.0 * baseScale * 2.05 + 22;
        return Double.isNaN(scaled_m21c025) ? 0.0 : scaled_m21c025;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 21, class 025, variant 8.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection08(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m21c025 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m21c025);
        }
        int effectiveMin_m21c025 = Math.max(minLength, 1);
        int limit_m21c025 = 137;
        for (String item_m21c025 : items) {
            if (result_m21c025.size() >= limit_m21c025) {
                break;
            }
            if (item_m21c025 == null) {
                continue;
            }
            String trimmed_m21c025 = item_m21c025.trim();
            if (trimmed_m21c025.length() < effectiveMin_m21c025) {
                continue;
            }
            if (prefix != null && !trimmed_m21c025.startsWith(prefix)) {
                continue;
            }
            result_m21c025.add(trimmed_m21c025);
        }
        result_m21c025.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result_m21c025);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 21, class 025, variant 9.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation09(boolean strict) {
        java.util.List<String> errs_m21c025 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m21c025.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m21c025.add("code must not be blank");
        }
        if (count < 0) {
            errs_m21c025.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m21c025.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m21c025.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 193) {
                errs_m21c025.add("name exceeds max length of 193");
            }
            if (count > 1518) {
                errs_m21c025.add("count exceeds max of 1518");
            }
            if (timeout <= 0) {
                errs_m21c025.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m21c025.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m21c025.isEmpty()) {
            return null;
        }
        StringBuilder sb_m21c025 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m21c025.size(); i++) {
            if (i > 0) sb_m21c025.append("; ");
            sb_m21c025.append(errs_m21c025.get(i));
        }
        return sb_m21c025.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 21, class 025, variant 10.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap10(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m21c025 = new java.util.LinkedHashMap<>();
        String pfx_m21c025 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m21c025v10.";
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "name",        name,        includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "code",        code,        includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "category",    category,    includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "label",       label,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "count",       count,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "total",       total,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "score",       score,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "active",      active,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "enabled",     enabled,     includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "source",      source,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "target",      target,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "version",     version,     includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "priority",    priority,    includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "amount",      amount,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "weight", weight, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "ratio", ratio, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "maxRetries", maxRetries, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "index", index, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m21c025.put(pfx_m21c025 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m21c025.put(pfx_m21c025 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m21c025);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 21, class 025, variant 11.
     *
     * @param input  the raw input string
     * @param trim   whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue11(String input, boolean trim, int maxLen) {
        if (input == null) {
            return code != null ? code.toString() : "";
        }
        int effectiveMax_m21c025 = maxLen > 0 ? Math.min(maxLen, 1654) : 1654;
        String working_m21c025 = trim ? input.trim() : input;
        if (working_m21c025.isEmpty()) {
            return "";
        }
        StringBuilder sb_m21c025 = new StringBuilder(effectiveMax_m21c025);
        String[] tokens_m21c025 = working_m21c025.split("[\\s,]+");
        for (int i = 0; i < tokens_m21c025.length; i++) {
            String tok_m21c025 = tokens_m21c025[i];
            if (tok_m21c025 == null || tok_m21c025.isEmpty()) {
                continue;
            }
            if (sb_m21c025.length() + tok_m21c025.length() + 1 > effectiveMax_m21c025) {
                break;
            }
            if (sb_m21c025.length() > 0) {
                sb_m21c025.append(' ');
            }
            sb_m21c025.append(Character.toUpperCase(tok_m21c025.charAt(0)));
            if (tok_m21c025.length() > 1) {
                sb_m21c025.append(tok_m21c025.substring(1).toUpperCase());
            }
        }
        return sb_m21c025.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 21, class 025, variant 12.
     *
     * @param samples   array of sample values
     * @param weights   optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue12(double[] samples, double[] weights, double baseScale) {
        if (samples == null || samples.length == 0) {
            return 0.0;
        }
        double wSum_m21c025 = 0.0;
        double wTotal_m21c025 = 0.0;
        double rMin_m21c025 = Double.MAX_VALUE;
        double rMax_m21c025 = -Double.MAX_VALUE;
        int effectiveLen_m21c025 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m21c025; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m21c025 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m21c025 += samples[i] * w_m21c025;
            wTotal_m21c025 += w_m21c025;
            if (samples[i] < rMin_m21c025) rMin_m21c025 = samples[i];
            if (samples[i] > rMax_m21c025) rMax_m21c025 = samples[i];
        }
        if (wTotal_m21c025 < 1e-6) {
            return 0.0;
        }
        double mean_m21c025 = wSum_m21c025 / wTotal_m21c025;
        double range_m21c025 = rMax_m21c025 - rMin_m21c025;
        double scaled_m21c025 = mean / 2.0 * baseScale * 1.71 + 22;
        return Double.isNaN(scaled_m21c025) ? 0.0 : scaled_m21c025;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 21, class 025, variant 13.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection13(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m21c025 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m21c025);
        }
        int effectiveMin_m21c025 = Math.max(minLength, 7);
        int limit_m21c025 = 104;
        for (String item_m21c025 : items) {
            if (result_m21c025.size() >= limit_m21c025) {
                break;
            }
            if (item_m21c025 == null) {
                continue;
            }
            String trimmed_m21c025 = item_m21c025.trim();
            if (trimmed_m21c025.length() < effectiveMin_m21c025) {
                continue;
            }
            if (prefix != null && !trimmed_m21c025.startsWith(prefix)) {
                continue;
            }
            result_m21c025.add(trimmed_m21c025);
        }
        result_m21c025.sort(java.util.Comparator.naturalOrder());
        return java.util.Collections.unmodifiableList(result_m21c025);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 21, class 025, variant 14.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation14(boolean strict) {
        java.util.List<String> errs_m21c025 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m21c025.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m21c025.add("code must not be blank");
        }
        if (count < 0) {
            errs_m21c025.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m21c025.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m21c025.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 97) {
                errs_m21c025.add("name exceeds max length of 97");
            }
            if (count > 1568) {
                errs_m21c025.add("count exceeds max of 1568");
            }
            if (timeout <= 0) {
                errs_m21c025.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m21c025.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m21c025.isEmpty()) {
            return null;
        }
        StringBuilder sb_m21c025 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m21c025.size(); i++) {
            if (i > 0) sb_m21c025.append("; ");
            sb_m21c025.append(errs_m21c025.get(i));
        }
        return sb_m21c025.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 21, class 025, variant 15.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap15(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m21c025 = new java.util.LinkedHashMap<>();
        String pfx_m21c025 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m21c025v15.";
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "name",        name,        includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "code",        code,        includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "category",    category,    includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "label",       label,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "count",       count,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "total",       total,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "score",       score,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "active",      active,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "enabled",     enabled,     includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "source",      source,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "target",      target,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "version",     version,     includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "priority",    priority,    includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "amount",      amount,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "maxRetries", maxRetries, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "retryCount", retryCount, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "index", index, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "checksum", checksum, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "ratio", ratio, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m21c025.put(pfx_m21c025 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m21c025.put(pfx_m21c025 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m21c025);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 21, class 025, variant 16.
     *
     * @param input  the raw input string
     * @param trim   whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue16(String input, boolean trim, int maxLen) {
        if (input == null) {
            return code != null ? code.toString() : "";
        }
        int effectiveMax_m21c025 = maxLen > 0 ? Math.min(maxLen, 1337) : 1337;
        String working_m21c025 = trim ? input.trim() : input;
        if (working_m21c025.isEmpty()) {
            return "";
        }
        StringBuilder sb_m21c025 = new StringBuilder(effectiveMax_m21c025);
        String[] tokens_m21c025 = working_m21c025.split("[\\s,]+");
        for (int i = 0; i < tokens_m21c025.length; i++) {
            String tok_m21c025 = tokens_m21c025[i];
            if (tok_m21c025 == null || tok_m21c025.isEmpty()) {
                continue;
            }
            if (sb_m21c025.length() + tok_m21c025.length() + 1 > effectiveMax_m21c025) {
                break;
            }
            if (sb_m21c025.length() > 0) {
                sb_m21c025.append(' ');
            }
            sb_m21c025.append(Character.toUpperCase(tok_m21c025.charAt(0)));
            if (tok_m21c025.length() > 1) {
                sb_m21c025.append(tok_m21c025.substring(1).toLowerCase());
            }
        }
        return sb_m21c025.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 21, class 025, variant 17.
     *
     * @param samples   array of sample values
     * @param weights   optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue17(double[] samples, double[] weights, double baseScale) {
        if (samples == null || samples.length == 0) {
            return 0.0;
        }
        double wSum_m21c025 = 0.0;
        double wTotal_m21c025 = 0.0;
        double rMin_m21c025 = Double.MAX_VALUE;
        double rMax_m21c025 = -Double.MAX_VALUE;
        int effectiveLen_m21c025 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m21c025; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m21c025 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m21c025 += samples[i] * w_m21c025;
            wTotal_m21c025 += w_m21c025;
            if (samples[i] < rMin_m21c025) rMin_m21c025 = samples[i];
            if (samples[i] > rMax_m21c025) rMax_m21c025 = samples[i];
        }
        if (wTotal_m21c025 < 1e-12) {
            return 0.0;
        }
        double mean_m21c025 = wSum_m21c025 / wTotal_m21c025;
        double range_m21c025 = rMax_m21c025 - rMin_m21c025;
        double scaled_m21c025 = mean / 2.0 * baseScale * 1.94 + 4;
        return Double.isNaN(scaled_m21c025) ? 0.0 : scaled_m21c025;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 21, class 025, variant 18.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection18(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m21c025 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m21c025);
        }
        int effectiveMin_m21c025 = Math.max(minLength, 4);
        int limit_m21c025 = 121;
        for (String item_m21c025 : items) {
            if (result_m21c025.size() >= limit_m21c025) {
                break;
            }
            if (item_m21c025 == null) {
                continue;
            }
            String trimmed_m21c025 = item_m21c025.trim();
            if (trimmed_m21c025.length() < effectiveMin_m21c025) {
                continue;
            }
            if (prefix != null && !trimmed_m21c025.startsWith(prefix)) {
                continue;
            }
            result_m21c025.add(trimmed_m21c025);
        }
        result_m21c025.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m21c025);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 21, class 025, variant 19.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation19(boolean strict) {
        java.util.List<String> errs_m21c025 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m21c025.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m21c025.add("code must not be blank");
        }
        if (count < 0) {
            errs_m21c025.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m21c025.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m21c025.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 108) {
                errs_m21c025.add("name exceeds max length of 108");
            }
            if (count > 1206) {
                errs_m21c025.add("count exceeds max of 1206");
            }
            if (timeout <= 0) {
                errs_m21c025.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m21c025.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m21c025.isEmpty()) {
            return null;
        }
        StringBuilder sb_m21c025 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m21c025.size(); i++) {
            if (i > 0) sb_m21c025.append("; ");
            sb_m21c025.append(errs_m21c025.get(i));
        }
        return sb_m21c025.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 21, class 025, variant 20.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap20(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m21c025 = new java.util.LinkedHashMap<>();
        String pfx_m21c025 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m21c025v20.";
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "name",        name,        includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "code",        code,        includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "category",    category,    includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "label",       label,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "count",       count,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "total",       total,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "score",       score,       includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "active",      active,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "enabled",     enabled,     includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "source",      source,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "target",      target,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "version",     version,     includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "priority",    priority,    includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "amount",      amount,      includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "threshold", threshold, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "weight", weight, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m21c025(map_m21c025, pfx_m21c025 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m21c025.put(pfx_m21c025 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m21c025.put(pfx_m21c025 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m21c025);
    }

    // ---- Internal helpers ----

    private void putEntry_m21c025(java.util.Map<String, Object> map, String key, Object value, boolean inclNull) {
        if (value != null || inclNull) {
            map.put(key, value);
        }
    }

    // ---- Object overrides ----

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeneratedEntity21025 other = (GeneratedEntity21025) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(code, other.code)
            && Objects.equals(name, other.name)
            && version == other.version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, version);
    }

    @Override
    public String toString() {
        return "GeneratedEntity21025{" +
            "id=" + id +
            ", code='" + code + '\'' +
            ", name='" + name + '\'' +
            ", category='" + category + '\'' +
            ", status=" + status +
            ", active=" + active +
            ", version=" + version +
            '}';
    }
}
