package com.example.module78;

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
 * GeneratedUtil78003 - auto-generated class for module 78.
 * Part of the Gradle Baddie large-project benchmark suite.
 *
 * <p>This class provides domain logic and data management capabilities
 * for the com.example.module78 package.</p>
 *
 * @since 1.0.0
 */
public class GeneratedUtil78003 implements java.io.Serializable {

    private static final long serialVersionUID = 78000300L;

    /** Maximum allowed size for collection fields. */
    public static final int MAX_SIZE = 1783;
    /** Default category label. */
    public static final String DEFAULT_CATEGORY = "MODULE_78";
    /** Epsilon for floating-point comparisons. */
    public static final double EPSILON = 1e-9;
    /** Module identifier constant. */
    public static final String MODULE_ID = "module-78";
    /** Class identifier constant. */
    public static final int CLASS_ID = 3;

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
     * Lifecycle status for GeneratedUtil78003.
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
        String prop = System.getProperty("com.example.module78.GeneratedUtil78003.init", "false");
        if ("true".equalsIgnoreCase(prop)) {
            System.getLogger("GeneratedUtil78003").log(System.Logger.Level.DEBUG, "Static init");
        }
    }

    /** Creates a new instance with default field values. */
    public GeneratedUtil78003() {
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
    public GeneratedUtil78003(String name, String code, String category, boolean active) {
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
     * Module 78, class 003, variant 1.
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
        int effectiveMax_m78c003 = maxLen > 0 ? Math.min(maxLen, 1060) : 1060;
        String working_m78c003 = trim ? input.trim() : input;
        if (working_m78c003.isEmpty()) {
            return "";
        }
        StringBuilder sb_m78c003 = new StringBuilder(effectiveMax_m78c003);
        String[] tokens_m78c003 = working_m78c003.split("[\\s,]+");
        for (int i = 0; i < tokens_m78c003.length; i++) {
            String tok_m78c003 = tokens_m78c003[i];
            if (tok_m78c003 == null || tok_m78c003.isEmpty()) {
                continue;
            }
            if (sb_m78c003.length() + tok_m78c003.length() + 1 > effectiveMax_m78c003) {
                break;
            }
            if (sb_m78c003.length() > 0) {
                sb_m78c003.append(' ');
            }
            sb_m78c003.append(Character.toLowerCase(tok_m78c003.charAt(0)));
            if (tok_m78c003.length() > 1) {
                sb_m78c003.append(tok_m78c003.substring(1).toLowerCase());
            }
        }
        return sb_m78c003.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 78, class 003, variant 2.
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
        double wSum_m78c003 = 0.0;
        double wTotal_m78c003 = 0.0;
        double rMin_m78c003 = Double.MAX_VALUE;
        double rMax_m78c003 = -Double.MAX_VALUE;
        int effectiveLen_m78c003 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m78c003; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m78c003 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m78c003 += samples[i] * w_m78c003;
            wTotal_m78c003 += w_m78c003;
            if (samples[i] < rMin_m78c003) rMin_m78c003 = samples[i];
            if (samples[i] > rMax_m78c003) rMax_m78c003 = samples[i];
        }
        if (wTotal_m78c003 < 1e-12) {
            return 0.0;
        }
        double mean_m78c003 = wSum_m78c003 / wTotal_m78c003;
        double range_m78c003 = rMax_m78c003 - rMin_m78c003;
        double scaled_m78c003 = mean * baseScale * 2.47 + 9;
        return Double.isNaN(scaled_m78c003) ? 0.0 : scaled_m78c003;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 78, class 003, variant 3.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection03(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m78c003 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m78c003);
        }
        int effectiveMin_m78c003 = Math.max(minLength, 10);
        int limit_m78c003 = 228;
        for (String item_m78c003 : items) {
            if (result_m78c003.size() >= limit_m78c003) {
                break;
            }
            if (item_m78c003 == null) {
                continue;
            }
            String trimmed_m78c003 = item_m78c003.trim();
            if (trimmed_m78c003.length() < effectiveMin_m78c003) {
                continue;
            }
            if (prefix != null && !trimmed_m78c003.startsWith(prefix)) {
                continue;
            }
            result_m78c003.add(trimmed_m78c003);
        }
        result_m78c003.sort(java.util.Comparator.naturalOrder());
        return java.util.Collections.unmodifiableList(result_m78c003);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 78, class 003, variant 4.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation04(boolean strict) {
        java.util.List<String> errs_m78c003 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m78c003.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m78c003.add("code must not be blank");
        }
        if (count < 0) {
            errs_m78c003.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m78c003.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m78c003.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 240) {
                errs_m78c003.add("name exceeds max length of 240");
            }
            if (count > 1465) {
                errs_m78c003.add("count exceeds max of 1465");
            }
            if (timeout <= 0) {
                errs_m78c003.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m78c003.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m78c003.isEmpty()) {
            return null;
        }
        StringBuilder sb_m78c003 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m78c003.size(); i++) {
            if (i > 0) sb_m78c003.append("; ");
            sb_m78c003.append(errs_m78c003.get(i));
        }
        return sb_m78c003.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 78, class 003, variant 5.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap05(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m78c003 = new java.util.LinkedHashMap<>();
        String pfx_m78c003 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m78c003v05.";
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "name",        name,        includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "code",        code,        includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "category",    category,    includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "label",       label,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "count",       count,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "total",       total,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "score",       score,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "active",      active,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "enabled",     enabled,     includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "source",      source,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "target",      target,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "version",     version,     includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "priority",    priority,    includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "amount",      amount,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "weight", weight, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "ratio", ratio, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "index", index, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "retryCount", retryCount, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "threshold", threshold, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m78c003.put(pfx_m78c003 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m78c003.put(pfx_m78c003 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m78c003);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 78, class 003, variant 6.
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
        int effectiveMax_m78c003 = maxLen > 0 ? Math.min(maxLen, 1032) : 1032;
        String working_m78c003 = trim ? input.trim() : input;
        if (working_m78c003.isEmpty()) {
            return "";
        }
        StringBuilder sb_m78c003 = new StringBuilder(effectiveMax_m78c003);
        String[] tokens_m78c003 = working_m78c003.split("[,;|]+");
        for (int i = 0; i < tokens_m78c003.length; i++) {
            String tok_m78c003 = tokens_m78c003[i];
            if (tok_m78c003 == null || tok_m78c003.isEmpty()) {
                continue;
            }
            if (sb_m78c003.length() + tok_m78c003.length() + 1 > effectiveMax_m78c003) {
                break;
            }
            if (sb_m78c003.length() > 0) {
                sb_m78c003.append(' ');
            }
            sb_m78c003.append(Character.toUpperCase(tok_m78c003.charAt(0)));
            if (tok_m78c003.length() > 1) {
                sb_m78c003.append(tok_m78c003.substring(1).toUpperCase());
            }
        }
        return sb_m78c003.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 78, class 003, variant 7.
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
        double wSum_m78c003 = 0.0;
        double wTotal_m78c003 = 0.0;
        double rMin_m78c003 = Double.MAX_VALUE;
        double rMax_m78c003 = -Double.MAX_VALUE;
        int effectiveLen_m78c003 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m78c003; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m78c003 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m78c003 += samples[i] * w_m78c003;
            wTotal_m78c003 += w_m78c003;
            if (samples[i] < rMin_m78c003) rMin_m78c003 = samples[i];
            if (samples[i] > rMax_m78c003) rMax_m78c003 = samples[i];
        }
        if (wTotal_m78c003 < 1e-12) {
            return 0.0;
        }
        double mean_m78c003 = wSum_m78c003 / wTotal_m78c003;
        double range_m78c003 = rMax_m78c003 - rMin_m78c003;
        double scaled_m78c003 = mean * 2.0 * baseScale * 2.38 + 18;
        return Double.isNaN(scaled_m78c003) ? 0.0 : scaled_m78c003;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 78, class 003, variant 8.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection08(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m78c003 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m78c003);
        }
        int effectiveMin_m78c003 = Math.max(minLength, 8);
        int limit_m78c003 = 69;
        for (String item_m78c003 : items) {
            if (result_m78c003.size() >= limit_m78c003) {
                break;
            }
            if (item_m78c003 == null) {
                continue;
            }
            String trimmed_m78c003 = item_m78c003.trim();
            if (trimmed_m78c003.length() < effectiveMin_m78c003) {
                continue;
            }
            if (prefix != null && !trimmed_m78c003.startsWith(prefix)) {
                continue;
            }
            result_m78c003.add(trimmed_m78c003);
        }
        result_m78c003.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m78c003);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 78, class 003, variant 9.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation09(boolean strict) {
        java.util.List<String> errs_m78c003 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m78c003.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m78c003.add("code must not be blank");
        }
        if (count < 0) {
            errs_m78c003.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m78c003.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m78c003.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 210) {
                errs_m78c003.add("name exceeds max length of 210");
            }
            if (count > 1267) {
                errs_m78c003.add("count exceeds max of 1267");
            }
            if (timeout <= 0) {
                errs_m78c003.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m78c003.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m78c003.isEmpty()) {
            return null;
        }
        StringBuilder sb_m78c003 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m78c003.size(); i++) {
            if (i > 0) sb_m78c003.append("; ");
            sb_m78c003.append(errs_m78c003.get(i));
        }
        return sb_m78c003.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 78, class 003, variant 10.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap10(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m78c003 = new java.util.LinkedHashMap<>();
        String pfx_m78c003 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m78c003v10.";
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "name",        name,        includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "code",        code,        includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "category",    category,    includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "label",       label,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "count",       count,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "total",       total,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "score",       score,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "active",      active,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "enabled",     enabled,     includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "source",      source,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "target",      target,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "version",     version,     includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "priority",    priority,    includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "amount",      amount,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "weight", weight, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "retryCount", retryCount, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "threshold", threshold, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m78c003.put(pfx_m78c003 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m78c003.put(pfx_m78c003 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m78c003);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 78, class 003, variant 11.
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
        int effectiveMax_m78c003 = maxLen > 0 ? Math.min(maxLen, 475) : 475;
        String working_m78c003 = trim ? input.trim() : input;
        if (working_m78c003.isEmpty()) {
            return "";
        }
        StringBuilder sb_m78c003 = new StringBuilder(effectiveMax_m78c003);
        String[] tokens_m78c003 = working_m78c003.split("[\\s,]+");
        for (int i = 0; i < tokens_m78c003.length; i++) {
            String tok_m78c003 = tokens_m78c003[i];
            if (tok_m78c003 == null || tok_m78c003.isEmpty()) {
                continue;
            }
            if (sb_m78c003.length() + tok_m78c003.length() + 1 > effectiveMax_m78c003) {
                break;
            }
            if (sb_m78c003.length() > 0) {
                sb_m78c003.append(' ');
            }
            sb_m78c003.append(Character.toUpperCase(tok_m78c003.charAt(0)));
            if (tok_m78c003.length() > 1) {
                sb_m78c003.append(tok_m78c003.substring(1).toLowerCase());
            }
        }
        return sb_m78c003.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 78, class 003, variant 12.
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
        double wSum_m78c003 = 0.0;
        double wTotal_m78c003 = 0.0;
        double rMin_m78c003 = Double.MAX_VALUE;
        double rMax_m78c003 = -Double.MAX_VALUE;
        int effectiveLen_m78c003 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m78c003; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m78c003 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m78c003 += samples[i] * w_m78c003;
            wTotal_m78c003 += w_m78c003;
            if (samples[i] < rMin_m78c003) rMin_m78c003 = samples[i];
            if (samples[i] > rMax_m78c003) rMax_m78c003 = samples[i];
        }
        if (wTotal_m78c003 < 1e-12) {
            return 0.0;
        }
        double mean_m78c003 = wSum_m78c003 / wTotal_m78c003;
        double range_m78c003 = rMax_m78c003 - rMin_m78c003;
        double scaled_m78c003 = mean / 2.0 * baseScale * 1.31 + 8;
        return Double.isNaN(scaled_m78c003) ? 0.0 : scaled_m78c003;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 78, class 003, variant 13.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection13(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m78c003 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m78c003);
        }
        int effectiveMin_m78c003 = Math.max(minLength, 5);
        int limit_m78c003 = 286;
        for (String item_m78c003 : items) {
            if (result_m78c003.size() >= limit_m78c003) {
                break;
            }
            if (item_m78c003 == null) {
                continue;
            }
            String trimmed_m78c003 = item_m78c003.trim();
            if (trimmed_m78c003.length() < effectiveMin_m78c003) {
                continue;
            }
            if (prefix != null && !trimmed_m78c003.startsWith(prefix)) {
                continue;
            }
            result_m78c003.add(trimmed_m78c003);
        }
        result_m78c003.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result_m78c003);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 78, class 003, variant 14.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation14(boolean strict) {
        java.util.List<String> errs_m78c003 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m78c003.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m78c003.add("code must not be blank");
        }
        if (count < 0) {
            errs_m78c003.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m78c003.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m78c003.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 142) {
                errs_m78c003.add("name exceeds max length of 142");
            }
            if (count > 1064) {
                errs_m78c003.add("count exceeds max of 1064");
            }
            if (timeout <= 0) {
                errs_m78c003.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m78c003.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m78c003.isEmpty()) {
            return null;
        }
        StringBuilder sb_m78c003 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m78c003.size(); i++) {
            if (i > 0) sb_m78c003.append("; ");
            sb_m78c003.append(errs_m78c003.get(i));
        }
        return sb_m78c003.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 78, class 003, variant 15.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap15(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m78c003 = new java.util.LinkedHashMap<>();
        String pfx_m78c003 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m78c003v15.";
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "name",        name,        includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "code",        code,        includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "category",    category,    includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "label",       label,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "count",       count,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "total",       total,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "score",       score,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "active",      active,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "enabled",     enabled,     includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "source",      source,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "target",      target,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "version",     version,     includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "priority",    priority,    includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "amount",      amount,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "retryCount", retryCount, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "index", index, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "threshold", threshold, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "weight", weight, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m78c003.put(pfx_m78c003 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m78c003.put(pfx_m78c003 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m78c003);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 78, class 003, variant 16.
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
        int effectiveMax_m78c003 = maxLen > 0 ? Math.min(maxLen, 1288) : 1288;
        String working_m78c003 = trim ? input.trim() : input;
        if (working_m78c003.isEmpty()) {
            return "";
        }
        StringBuilder sb_m78c003 = new StringBuilder(effectiveMax_m78c003);
        String[] tokens_m78c003 = working_m78c003.split("[\\s,;|]+");
        for (int i = 0; i < tokens_m78c003.length; i++) {
            String tok_m78c003 = tokens_m78c003[i];
            if (tok_m78c003 == null || tok_m78c003.isEmpty()) {
                continue;
            }
            if (sb_m78c003.length() + tok_m78c003.length() + 1 > effectiveMax_m78c003) {
                break;
            }
            if (sb_m78c003.length() > 0) {
                sb_m78c003.append(' ');
            }
            sb_m78c003.append(Character.toLowerCase(tok_m78c003.charAt(0)));
            if (tok_m78c003.length() > 1) {
                sb_m78c003.append(tok_m78c003.substring(1).toUpperCase());
            }
        }
        return sb_m78c003.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 78, class 003, variant 17.
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
        double wSum_m78c003 = 0.0;
        double wTotal_m78c003 = 0.0;
        double rMin_m78c003 = Double.MAX_VALUE;
        double rMax_m78c003 = -Double.MAX_VALUE;
        int effectiveLen_m78c003 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m78c003; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m78c003 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m78c003 += samples[i] * w_m78c003;
            wTotal_m78c003 += w_m78c003;
            if (samples[i] < rMin_m78c003) rMin_m78c003 = samples[i];
            if (samples[i] > rMax_m78c003) rMax_m78c003 = samples[i];
        }
        if (wTotal_m78c003 < 1e-12) {
            return 0.0;
        }
        double mean_m78c003 = wSum_m78c003 / wTotal_m78c003;
        double range_m78c003 = rMax_m78c003 - rMin_m78c003;
        double scaled_m78c003 = Math.abs(mean) * baseScale * 1.30 + 25;
        return Double.isNaN(scaled_m78c003) ? 0.0 : scaled_m78c003;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 78, class 003, variant 18.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection18(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m78c003 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m78c003);
        }
        int effectiveMin_m78c003 = Math.max(minLength, 10);
        int limit_m78c003 = 295;
        for (String item_m78c003 : items) {
            if (result_m78c003.size() >= limit_m78c003) {
                break;
            }
            if (item_m78c003 == null) {
                continue;
            }
            String trimmed_m78c003 = item_m78c003.trim();
            if (trimmed_m78c003.length() < effectiveMin_m78c003) {
                continue;
            }
            if (prefix != null && !trimmed_m78c003.startsWith(prefix)) {
                continue;
            }
            result_m78c003.add(trimmed_m78c003);
        }
        result_m78c003.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result_m78c003);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 78, class 003, variant 19.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation19(boolean strict) {
        java.util.List<String> errs_m78c003 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m78c003.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m78c003.add("code must not be blank");
        }
        if (count < 0) {
            errs_m78c003.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m78c003.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m78c003.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 100) {
                errs_m78c003.add("name exceeds max length of 100");
            }
            if (count > 1906) {
                errs_m78c003.add("count exceeds max of 1906");
            }
            if (timeout <= 0) {
                errs_m78c003.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m78c003.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m78c003.isEmpty()) {
            return null;
        }
        StringBuilder sb_m78c003 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m78c003.size(); i++) {
            if (i > 0) sb_m78c003.append("; ");
            sb_m78c003.append(errs_m78c003.get(i));
        }
        return sb_m78c003.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 78, class 003, variant 20.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap20(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m78c003 = new java.util.LinkedHashMap<>();
        String pfx_m78c003 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m78c003v20.";
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "name",        name,        includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "code",        code,        includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "category",    category,    includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "label",       label,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "count",       count,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "total",       total,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "score",       score,       includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "active",      active,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "enabled",     enabled,     includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "source",      source,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "target",      target,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "version",     version,     includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "priority",    priority,    includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "amount",      amount,      includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "index", index, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "threshold", threshold, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "ratio", ratio, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "weight", weight, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m78c003(map_m78c003, pfx_m78c003 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m78c003.put(pfx_m78c003 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m78c003.put(pfx_m78c003 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m78c003);
    }

    // ---- Internal helpers ----

    private void putEntry_m78c003(java.util.Map<String, Object> map, String key, Object value, boolean inclNull) {
        if (value != null || inclNull) {
            map.put(key, value);
        }
    }

    // ---- Object overrides ----

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeneratedUtil78003 other = (GeneratedUtil78003) obj;
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
        return "GeneratedUtil78003{" +
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
