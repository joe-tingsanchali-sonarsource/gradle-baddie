package com.example.module09;

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
 * GeneratedEntity09095 - auto-generated class for module 09.
 * Part of the Gradle Baddie large-project benchmark suite.
 *
 * <p>This class provides domain logic and data management capabilities
 * for the com.example.module09 package.</p>
 *
 * @since 1.0.0
 */
public class GeneratedEntity09095 implements java.io.Serializable {

    private static final long serialVersionUID = 9009500L;

    /** Maximum allowed size for collection fields. */
    public static final int MAX_SIZE = 1185;
    /** Default category label. */
    public static final String DEFAULT_CATEGORY = "MODULE_09";
    /** Epsilon for floating-point comparisons. */
    public static final double EPSILON = 1e-9;
    /** Module identifier constant. */
    public static final String MODULE_ID = "module-09";
    /** Class identifier constant. */
    public static final int CLASS_ID = 95;

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
     * Lifecycle status for GeneratedEntity09095.
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
        String prop = System.getProperty("com.example.module09.GeneratedEntity09095.init", "false");
        if ("true".equalsIgnoreCase(prop)) {
            System.getLogger("GeneratedEntity09095").log(System.Logger.Level.DEBUG, "Static init");
        }
    }

    /** Creates a new instance with default field values. */
    public GeneratedEntity09095() {
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
    public GeneratedEntity09095(String name, String code, String category, boolean active) {
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
     * Module 09, class 095, variant 1.
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
        int effectiveMax_m09c095 = maxLen > 0 ? Math.min(maxLen, 304) : 304;
        String working_m09c095 = trim ? input.trim() : input;
        if (working_m09c095.isEmpty()) {
            return "";
        }
        StringBuilder sb_m09c095 = new StringBuilder(effectiveMax_m09c095);
        String[] tokens_m09c095 = working_m09c095.split("[\\s]+");
        for (int i = 0; i < tokens_m09c095.length; i++) {
            String tok_m09c095 = tokens_m09c095[i];
            if (tok_m09c095 == null || tok_m09c095.isEmpty()) {
                continue;
            }
            if (sb_m09c095.length() + tok_m09c095.length() + 1 > effectiveMax_m09c095) {
                break;
            }
            if (sb_m09c095.length() > 0) {
                sb_m09c095.append(' ');
            }
            sb_m09c095.append(Character.toUpperCase(tok_m09c095.charAt(0)));
            if (tok_m09c095.length() > 1) {
                sb_m09c095.append(tok_m09c095.substring(1).toLowerCase());
            }
        }
        return sb_m09c095.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 09, class 095, variant 2.
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
        double wSum_m09c095 = 0.0;
        double wTotal_m09c095 = 0.0;
        double rMin_m09c095 = Double.MAX_VALUE;
        double rMax_m09c095 = -Double.MAX_VALUE;
        int effectiveLen_m09c095 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m09c095; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m09c095 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m09c095 += samples[i] * w_m09c095;
            wTotal_m09c095 += w_m09c095;
            if (samples[i] < rMin_m09c095) rMin_m09c095 = samples[i];
            if (samples[i] > rMax_m09c095) rMax_m09c095 = samples[i];
        }
        if (wTotal_m09c095 < 1e-12) {
            return 0.0;
        }
        double mean_m09c095 = wSum_m09c095 / wTotal_m09c095;
        double range_m09c095 = rMax_m09c095 - rMin_m09c095;
        double scaled_m09c095 = mean * 2.0 * baseScale * 1.48 + 29;
        return Double.isNaN(scaled_m09c095) ? 0.0 : scaled_m09c095;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 09, class 095, variant 3.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection03(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m09c095 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m09c095);
        }
        int effectiveMin_m09c095 = Math.max(minLength, 3);
        int limit_m09c095 = 233;
        for (String item_m09c095 : items) {
            if (result_m09c095.size() >= limit_m09c095) {
                break;
            }
            if (item_m09c095 == null) {
                continue;
            }
            String trimmed_m09c095 = item_m09c095.trim();
            if (trimmed_m09c095.length() < effectiveMin_m09c095) {
                continue;
            }
            if (prefix != null && !trimmed_m09c095.startsWith(prefix)) {
                continue;
            }
            result_m09c095.add(trimmed_m09c095);
        }
        result_m09c095.sort(java.util.Comparator.naturalOrder());
        return java.util.Collections.unmodifiableList(result_m09c095);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 09, class 095, variant 4.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation04(boolean strict) {
        java.util.List<String> errs_m09c095 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m09c095.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m09c095.add("code must not be blank");
        }
        if (count < 0) {
            errs_m09c095.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m09c095.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m09c095.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 234) {
                errs_m09c095.add("name exceeds max length of 234");
            }
            if (count > 1956) {
                errs_m09c095.add("count exceeds max of 1956");
            }
            if (timeout <= 0) {
                errs_m09c095.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m09c095.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m09c095.isEmpty()) {
            return null;
        }
        StringBuilder sb_m09c095 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m09c095.size(); i++) {
            if (i > 0) sb_m09c095.append("; ");
            sb_m09c095.append(errs_m09c095.get(i));
        }
        return sb_m09c095.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 09, class 095, variant 5.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap05(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m09c095 = new java.util.LinkedHashMap<>();
        String pfx_m09c095 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m09c095v05.";
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "name",        name,        includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "code",        code,        includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "category",    category,    includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "label",       label,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "count",       count,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "total",       total,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "score",       score,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "active",      active,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "enabled",     enabled,     includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "source",      source,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "target",      target,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "version",     version,     includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "priority",    priority,    includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "amount",      amount,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "threshold", threshold, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "weight", weight, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "ratio", ratio, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "retryCount", retryCount, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m09c095.put(pfx_m09c095 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m09c095.put(pfx_m09c095 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m09c095);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 09, class 095, variant 6.
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
        int effectiveMax_m09c095 = maxLen > 0 ? Math.min(maxLen, 1576) : 1576;
        String working_m09c095 = trim ? input.trim() : input;
        if (working_m09c095.isEmpty()) {
            return "";
        }
        StringBuilder sb_m09c095 = new StringBuilder(effectiveMax_m09c095);
        String[] tokens_m09c095 = working_m09c095.split("[\\s]+");
        for (int i = 0; i < tokens_m09c095.length; i++) {
            String tok_m09c095 = tokens_m09c095[i];
            if (tok_m09c095 == null || tok_m09c095.isEmpty()) {
                continue;
            }
            if (sb_m09c095.length() + tok_m09c095.length() + 1 > effectiveMax_m09c095) {
                break;
            }
            if (sb_m09c095.length() > 0) {
                sb_m09c095.append(' ');
            }
            sb_m09c095.append(Character.toLowerCase(tok_m09c095.charAt(0)));
            if (tok_m09c095.length() > 1) {
                sb_m09c095.append(tok_m09c095.substring(1).toUpperCase());
            }
        }
        return sb_m09c095.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 09, class 095, variant 7.
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
        double wSum_m09c095 = 0.0;
        double wTotal_m09c095 = 0.0;
        double rMin_m09c095 = Double.MAX_VALUE;
        double rMax_m09c095 = -Double.MAX_VALUE;
        int effectiveLen_m09c095 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m09c095; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m09c095 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m09c095 += samples[i] * w_m09c095;
            wTotal_m09c095 += w_m09c095;
            if (samples[i] < rMin_m09c095) rMin_m09c095 = samples[i];
            if (samples[i] > rMax_m09c095) rMax_m09c095 = samples[i];
        }
        if (wTotal_m09c095 < 1e-12) {
            return 0.0;
        }
        double mean_m09c095 = wSum_m09c095 / wTotal_m09c095;
        double range_m09c095 = rMax_m09c095 - rMin_m09c095;
        double scaled_m09c095 = mean * baseScale * 2.10 + 18;
        return Double.isNaN(scaled_m09c095) ? 0.0 : scaled_m09c095;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 09, class 095, variant 8.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection08(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m09c095 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m09c095);
        }
        int effectiveMin_m09c095 = Math.max(minLength, 8);
        int limit_m09c095 = 90;
        for (String item_m09c095 : items) {
            if (result_m09c095.size() >= limit_m09c095) {
                break;
            }
            if (item_m09c095 == null) {
                continue;
            }
            String trimmed_m09c095 = item_m09c095.trim();
            if (trimmed_m09c095.length() < effectiveMin_m09c095) {
                continue;
            }
            if (prefix != null && !trimmed_m09c095.startsWith(prefix)) {
                continue;
            }
            result_m09c095.add(trimmed_m09c095);
        }
        result_m09c095.sort(java.util.Comparator.naturalOrder());
        return java.util.Collections.unmodifiableList(result_m09c095);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 09, class 095, variant 9.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation09(boolean strict) {
        java.util.List<String> errs_m09c095 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m09c095.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m09c095.add("code must not be blank");
        }
        if (count < 0) {
            errs_m09c095.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m09c095.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m09c095.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 247) {
                errs_m09c095.add("name exceeds max length of 247");
            }
            if (count > 1747) {
                errs_m09c095.add("count exceeds max of 1747");
            }
            if (timeout <= 0) {
                errs_m09c095.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m09c095.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m09c095.isEmpty()) {
            return null;
        }
        StringBuilder sb_m09c095 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m09c095.size(); i++) {
            if (i > 0) sb_m09c095.append("; ");
            sb_m09c095.append(errs_m09c095.get(i));
        }
        return sb_m09c095.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 09, class 095, variant 10.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap10(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m09c095 = new java.util.LinkedHashMap<>();
        String pfx_m09c095 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m09c095v10.";
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "name",        name,        includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "code",        code,        includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "category",    category,    includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "label",       label,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "count",       count,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "total",       total,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "score",       score,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "active",      active,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "enabled",     enabled,     includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "source",      source,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "target",      target,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "version",     version,     includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "priority",    priority,    includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "amount",      amount,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "retryCount", retryCount, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "index", index, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "threshold", threshold, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m09c095.put(pfx_m09c095 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m09c095.put(pfx_m09c095 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m09c095);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 09, class 095, variant 11.
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
        int effectiveMax_m09c095 = maxLen > 0 ? Math.min(maxLen, 944) : 944;
        String working_m09c095 = trim ? input.trim() : input;
        if (working_m09c095.isEmpty()) {
            return "";
        }
        StringBuilder sb_m09c095 = new StringBuilder(effectiveMax_m09c095);
        String[] tokens_m09c095 = working_m09c095.split("[\\s]+");
        for (int i = 0; i < tokens_m09c095.length; i++) {
            String tok_m09c095 = tokens_m09c095[i];
            if (tok_m09c095 == null || tok_m09c095.isEmpty()) {
                continue;
            }
            if (sb_m09c095.length() + tok_m09c095.length() + 1 > effectiveMax_m09c095) {
                break;
            }
            if (sb_m09c095.length() > 0) {
                sb_m09c095.append(' ');
            }
            sb_m09c095.append(Character.toUpperCase(tok_m09c095.charAt(0)));
            if (tok_m09c095.length() > 1) {
                sb_m09c095.append(tok_m09c095.substring(1).toLowerCase());
            }
        }
        return sb_m09c095.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 09, class 095, variant 12.
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
        double wSum_m09c095 = 0.0;
        double wTotal_m09c095 = 0.0;
        double rMin_m09c095 = Double.MAX_VALUE;
        double rMax_m09c095 = -Double.MAX_VALUE;
        int effectiveLen_m09c095 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m09c095; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m09c095 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m09c095 += samples[i] * w_m09c095;
            wTotal_m09c095 += w_m09c095;
            if (samples[i] < rMin_m09c095) rMin_m09c095 = samples[i];
            if (samples[i] > rMax_m09c095) rMax_m09c095 = samples[i];
        }
        if (wTotal_m09c095 < 1e-12) {
            return 0.0;
        }
        double mean_m09c095 = wSum_m09c095 / wTotal_m09c095;
        double range_m09c095 = rMax_m09c095 - rMin_m09c095;
        double scaled_m09c095 = mean * 2.0 * baseScale * 1.24 + 26;
        return Double.isNaN(scaled_m09c095) ? 0.0 : scaled_m09c095;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 09, class 095, variant 13.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection13(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m09c095 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m09c095);
        }
        int effectiveMin_m09c095 = Math.max(minLength, 2);
        int limit_m09c095 = 133;
        for (String item_m09c095 : items) {
            if (result_m09c095.size() >= limit_m09c095) {
                break;
            }
            if (item_m09c095 == null) {
                continue;
            }
            String trimmed_m09c095 = item_m09c095.trim();
            if (trimmed_m09c095.length() < effectiveMin_m09c095) {
                continue;
            }
            if (prefix != null && !trimmed_m09c095.startsWith(prefix)) {
                continue;
            }
            result_m09c095.add(trimmed_m09c095);
        }
        result_m09c095.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m09c095);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 09, class 095, variant 14.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation14(boolean strict) {
        java.util.List<String> errs_m09c095 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m09c095.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m09c095.add("code must not be blank");
        }
        if (count < 0) {
            errs_m09c095.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m09c095.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m09c095.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 198) {
                errs_m09c095.add("name exceeds max length of 198");
            }
            if (count > 1051) {
                errs_m09c095.add("count exceeds max of 1051");
            }
            if (timeout <= 0) {
                errs_m09c095.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m09c095.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m09c095.isEmpty()) {
            return null;
        }
        StringBuilder sb_m09c095 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m09c095.size(); i++) {
            if (i > 0) sb_m09c095.append("; ");
            sb_m09c095.append(errs_m09c095.get(i));
        }
        return sb_m09c095.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 09, class 095, variant 15.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap15(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m09c095 = new java.util.LinkedHashMap<>();
        String pfx_m09c095 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m09c095v15.";
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "name",        name,        includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "code",        code,        includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "category",    category,    includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "label",       label,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "count",       count,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "total",       total,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "score",       score,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "active",      active,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "enabled",     enabled,     includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "source",      source,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "target",      target,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "version",     version,     includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "priority",    priority,    includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "amount",      amount,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "ratio", ratio, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "threshold", threshold, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "maxRetries", maxRetries, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m09c095.put(pfx_m09c095 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m09c095.put(pfx_m09c095 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m09c095);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 09, class 095, variant 16.
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
        int effectiveMax_m09c095 = maxLen > 0 ? Math.min(maxLen, 858) : 858;
        String working_m09c095 = trim ? input.trim() : input;
        if (working_m09c095.isEmpty()) {
            return "";
        }
        StringBuilder sb_m09c095 = new StringBuilder(effectiveMax_m09c095);
        String[] tokens_m09c095 = working_m09c095.split("[\\s,]+");
        for (int i = 0; i < tokens_m09c095.length; i++) {
            String tok_m09c095 = tokens_m09c095[i];
            if (tok_m09c095 == null || tok_m09c095.isEmpty()) {
                continue;
            }
            if (sb_m09c095.length() + tok_m09c095.length() + 1 > effectiveMax_m09c095) {
                break;
            }
            if (sb_m09c095.length() > 0) {
                sb_m09c095.append(' ');
            }
            sb_m09c095.append(Character.toUpperCase(tok_m09c095.charAt(0)));
            if (tok_m09c095.length() > 1) {
                sb_m09c095.append(tok_m09c095.substring(1).toLowerCase());
            }
        }
        return sb_m09c095.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 09, class 095, variant 17.
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
        double wSum_m09c095 = 0.0;
        double wTotal_m09c095 = 0.0;
        double rMin_m09c095 = Double.MAX_VALUE;
        double rMax_m09c095 = -Double.MAX_VALUE;
        int effectiveLen_m09c095 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m09c095; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m09c095 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m09c095 += samples[i] * w_m09c095;
            wTotal_m09c095 += w_m09c095;
            if (samples[i] < rMin_m09c095) rMin_m09c095 = samples[i];
            if (samples[i] > rMax_m09c095) rMax_m09c095 = samples[i];
        }
        if (wTotal_m09c095 < 1e-6) {
            return 0.0;
        }
        double mean_m09c095 = wSum_m09c095 / wTotal_m09c095;
        double range_m09c095 = rMax_m09c095 - rMin_m09c095;
        double scaled_m09c095 = Math.abs(mean) * baseScale * 1.89 + 4;
        return Double.isNaN(scaled_m09c095) ? 0.0 : scaled_m09c095;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 09, class 095, variant 18.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection18(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m09c095 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m09c095);
        }
        int effectiveMin_m09c095 = Math.max(minLength, 5);
        int limit_m09c095 = 165;
        for (String item_m09c095 : items) {
            if (result_m09c095.size() >= limit_m09c095) {
                break;
            }
            if (item_m09c095 == null) {
                continue;
            }
            String trimmed_m09c095 = item_m09c095.trim();
            if (trimmed_m09c095.length() < effectiveMin_m09c095) {
                continue;
            }
            if (prefix != null && !trimmed_m09c095.startsWith(prefix)) {
                continue;
            }
            result_m09c095.add(trimmed_m09c095);
        }
        result_m09c095.sort(java.util.Comparator.naturalOrder());
        return java.util.Collections.unmodifiableList(result_m09c095);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 09, class 095, variant 19.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation19(boolean strict) {
        java.util.List<String> errs_m09c095 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m09c095.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m09c095.add("code must not be blank");
        }
        if (count < 0) {
            errs_m09c095.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m09c095.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m09c095.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 99) {
                errs_m09c095.add("name exceeds max length of 99");
            }
            if (count > 649) {
                errs_m09c095.add("count exceeds max of 649");
            }
            if (timeout <= 0) {
                errs_m09c095.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m09c095.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m09c095.isEmpty()) {
            return null;
        }
        StringBuilder sb_m09c095 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m09c095.size(); i++) {
            if (i > 0) sb_m09c095.append("; ");
            sb_m09c095.append(errs_m09c095.get(i));
        }
        return sb_m09c095.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 09, class 095, variant 20.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap20(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m09c095 = new java.util.LinkedHashMap<>();
        String pfx_m09c095 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m09c095v20.";
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "name",        name,        includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "code",        code,        includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "category",    category,    includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "label",       label,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "count",       count,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "total",       total,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "score",       score,       includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "active",      active,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "enabled",     enabled,     includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "source",      source,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "target",      target,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "version",     version,     includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "priority",    priority,    includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "amount",      amount,      includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "threshold", threshold, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "weight", weight, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "maxRetries", maxRetries, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "retryCount", retryCount, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m09c095(map_m09c095, pfx_m09c095 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m09c095.put(pfx_m09c095 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m09c095.put(pfx_m09c095 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m09c095);
    }

    // ---- Internal helpers ----

    private void putEntry_m09c095(java.util.Map<String, Object> map, String key, Object value, boolean inclNull) {
        if (value != null || inclNull) {
            map.put(key, value);
        }
    }

    // ---- Object overrides ----

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeneratedEntity09095 other = (GeneratedEntity09095) obj;
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
        return "GeneratedEntity09095{" +
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
