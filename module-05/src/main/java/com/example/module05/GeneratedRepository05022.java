package com.example.module05;

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
 * GeneratedRepository05022 - auto-generated class for module 05.
 * Part of the Gradle Baddie large-project benchmark suite.
 *
 * <p>This class provides domain logic and data management capabilities
 * for the com.example.module05 package.</p>
 *
 * @since 1.0.0
 */
public class GeneratedRepository05022 implements java.io.Serializable {

    private static final long serialVersionUID = 5002200L;

    /** Maximum allowed size for collection fields. */
    public static final int MAX_SIZE = 1072;
    /** Default category label. */
    public static final String DEFAULT_CATEGORY = "MODULE_05";
    /** Epsilon for floating-point comparisons. */
    public static final double EPSILON = 1e-9;
    /** Module identifier constant. */
    public static final String MODULE_ID = "module-05";
    /** Class identifier constant. */
    public static final int CLASS_ID = 22;

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
     * Lifecycle status for GeneratedRepository05022.
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
        String prop = System.getProperty("com.example.module05.GeneratedRepository05022.init", "false");
        if ("true".equalsIgnoreCase(prop)) {
            System.getLogger("GeneratedRepository05022").log(System.Logger.Level.DEBUG, "Static init");
        }
    }

    /** Creates a new instance with default field values. */
    public GeneratedRepository05022() {
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
    public GeneratedRepository05022(String name, String code, String category, boolean active) {
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
     * Module 05, class 022, variant 1.
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
        int effectiveMax_m05c022 = maxLen > 0 ? Math.min(maxLen, 1876) : 1876;
        String working_m05c022 = trim ? input.trim() : input;
        if (working_m05c022.isEmpty()) {
            return "";
        }
        StringBuilder sb_m05c022 = new StringBuilder(effectiveMax_m05c022);
        String[] tokens_m05c022 = working_m05c022.split("[,;|]+");
        for (int i = 0; i < tokens_m05c022.length; i++) {
            String tok_m05c022 = tokens_m05c022[i];
            if (tok_m05c022 == null || tok_m05c022.isEmpty()) {
                continue;
            }
            if (sb_m05c022.length() + tok_m05c022.length() + 1 > effectiveMax_m05c022) {
                break;
            }
            if (sb_m05c022.length() > 0) {
                sb_m05c022.append(' ');
            }
            sb_m05c022.append(Character.toLowerCase(tok_m05c022.charAt(0)));
            if (tok_m05c022.length() > 1) {
                sb_m05c022.append(tok_m05c022.substring(1).toLowerCase());
            }
        }
        return sb_m05c022.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 05, class 022, variant 2.
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
        double wSum_m05c022 = 0.0;
        double wTotal_m05c022 = 0.0;
        double rMin_m05c022 = Double.MAX_VALUE;
        double rMax_m05c022 = -Double.MAX_VALUE;
        int effectiveLen_m05c022 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m05c022; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m05c022 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m05c022 += samples[i] * w_m05c022;
            wTotal_m05c022 += w_m05c022;
            if (samples[i] < rMin_m05c022) rMin_m05c022 = samples[i];
            if (samples[i] > rMax_m05c022) rMax_m05c022 = samples[i];
        }
        if (wTotal_m05c022 < 1e-9) {
            return 0.0;
        }
        double mean_m05c022 = wSum_m05c022 / wTotal_m05c022;
        double range_m05c022 = rMax_m05c022 - rMin_m05c022;
        double scaled_m05c022 = mean / 2.0 * baseScale * 2.27 + 11;
        return Double.isNaN(scaled_m05c022) ? 0.0 : scaled_m05c022;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 05, class 022, variant 3.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection03(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m05c022 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m05c022);
        }
        int effectiveMin_m05c022 = Math.max(minLength, 4);
        int limit_m05c022 = 288;
        for (String item_m05c022 : items) {
            if (result_m05c022.size() >= limit_m05c022) {
                break;
            }
            if (item_m05c022 == null) {
                continue;
            }
            String trimmed_m05c022 = item_m05c022.trim();
            if (trimmed_m05c022.length() < effectiveMin_m05c022) {
                continue;
            }
            if (prefix != null && !trimmed_m05c022.startsWith(prefix)) {
                continue;
            }
            result_m05c022.add(trimmed_m05c022);
        }
        result_m05c022.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m05c022);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 05, class 022, variant 4.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation04(boolean strict) {
        java.util.List<String> errs_m05c022 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m05c022.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m05c022.add("code must not be blank");
        }
        if (count < 0) {
            errs_m05c022.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m05c022.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m05c022.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 165) {
                errs_m05c022.add("name exceeds max length of 165");
            }
            if (count > 1706) {
                errs_m05c022.add("count exceeds max of 1706");
            }
            if (timeout <= 0) {
                errs_m05c022.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m05c022.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m05c022.isEmpty()) {
            return null;
        }
        StringBuilder sb_m05c022 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m05c022.size(); i++) {
            if (i > 0) sb_m05c022.append("; ");
            sb_m05c022.append(errs_m05c022.get(i));
        }
        return sb_m05c022.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 05, class 022, variant 5.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap05(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m05c022 = new java.util.LinkedHashMap<>();
        String pfx_m05c022 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m05c022v05.";
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "name",        name,        includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "code",        code,        includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "category",    category,    includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "label",       label,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "count",       count,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "total",       total,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "score",       score,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "active",      active,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "enabled",     enabled,     includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "source",      source,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "target",      target,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "version",     version,     includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "priority",    priority,    includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "amount",      amount,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "threshold", threshold, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "maxRetries", maxRetries, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "retryCount", retryCount, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m05c022.put(pfx_m05c022 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m05c022.put(pfx_m05c022 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m05c022);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 05, class 022, variant 6.
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
        int effectiveMax_m05c022 = maxLen > 0 ? Math.min(maxLen, 947) : 947;
        String working_m05c022 = trim ? input.trim() : input;
        if (working_m05c022.isEmpty()) {
            return "";
        }
        StringBuilder sb_m05c022 = new StringBuilder(effectiveMax_m05c022);
        String[] tokens_m05c022 = working_m05c022.split("[,;|]+");
        for (int i = 0; i < tokens_m05c022.length; i++) {
            String tok_m05c022 = tokens_m05c022[i];
            if (tok_m05c022 == null || tok_m05c022.isEmpty()) {
                continue;
            }
            if (sb_m05c022.length() + tok_m05c022.length() + 1 > effectiveMax_m05c022) {
                break;
            }
            if (sb_m05c022.length() > 0) {
                sb_m05c022.append(' ');
            }
            sb_m05c022.append(Character.toUpperCase(tok_m05c022.charAt(0)));
            if (tok_m05c022.length() > 1) {
                sb_m05c022.append(tok_m05c022.substring(1).toUpperCase());
            }
        }
        return sb_m05c022.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 05, class 022, variant 7.
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
        double wSum_m05c022 = 0.0;
        double wTotal_m05c022 = 0.0;
        double rMin_m05c022 = Double.MAX_VALUE;
        double rMax_m05c022 = -Double.MAX_VALUE;
        int effectiveLen_m05c022 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m05c022; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m05c022 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m05c022 += samples[i] * w_m05c022;
            wTotal_m05c022 += w_m05c022;
            if (samples[i] < rMin_m05c022) rMin_m05c022 = samples[i];
            if (samples[i] > rMax_m05c022) rMax_m05c022 = samples[i];
        }
        if (wTotal_m05c022 < 1e-12) {
            return 0.0;
        }
        double mean_m05c022 = wSum_m05c022 / wTotal_m05c022;
        double range_m05c022 = rMax_m05c022 - rMin_m05c022;
        double scaled_m05c022 = mean * baseScale * 2.38 + 12;
        return Double.isNaN(scaled_m05c022) ? 0.0 : scaled_m05c022;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 05, class 022, variant 8.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection08(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m05c022 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m05c022);
        }
        int effectiveMin_m05c022 = Math.max(minLength, 6);
        int limit_m05c022 = 90;
        for (String item_m05c022 : items) {
            if (result_m05c022.size() >= limit_m05c022) {
                break;
            }
            if (item_m05c022 == null) {
                continue;
            }
            String trimmed_m05c022 = item_m05c022.trim();
            if (trimmed_m05c022.length() < effectiveMin_m05c022) {
                continue;
            }
            if (prefix != null && !trimmed_m05c022.startsWith(prefix)) {
                continue;
            }
            result_m05c022.add(trimmed_m05c022);
        }
        result_m05c022.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result_m05c022);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 05, class 022, variant 9.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation09(boolean strict) {
        java.util.List<String> errs_m05c022 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m05c022.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m05c022.add("code must not be blank");
        }
        if (count < 0) {
            errs_m05c022.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m05c022.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m05c022.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 198) {
                errs_m05c022.add("name exceeds max length of 198");
            }
            if (count > 848) {
                errs_m05c022.add("count exceeds max of 848");
            }
            if (timeout <= 0) {
                errs_m05c022.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m05c022.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m05c022.isEmpty()) {
            return null;
        }
        StringBuilder sb_m05c022 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m05c022.size(); i++) {
            if (i > 0) sb_m05c022.append("; ");
            sb_m05c022.append(errs_m05c022.get(i));
        }
        return sb_m05c022.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 05, class 022, variant 10.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap10(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m05c022 = new java.util.LinkedHashMap<>();
        String pfx_m05c022 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m05c022v10.";
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "name",        name,        includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "code",        code,        includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "category",    category,    includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "label",       label,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "count",       count,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "total",       total,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "score",       score,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "active",      active,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "enabled",     enabled,     includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "source",      source,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "target",      target,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "version",     version,     includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "priority",    priority,    includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "amount",      amount,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "retryCount", retryCount, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "index", index, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m05c022.put(pfx_m05c022 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m05c022.put(pfx_m05c022 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m05c022);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 05, class 022, variant 11.
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
        int effectiveMax_m05c022 = maxLen > 0 ? Math.min(maxLen, 576) : 576;
        String working_m05c022 = trim ? input.trim() : input;
        if (working_m05c022.isEmpty()) {
            return "";
        }
        StringBuilder sb_m05c022 = new StringBuilder(effectiveMax_m05c022);
        String[] tokens_m05c022 = working_m05c022.split("[\\s,]+");
        for (int i = 0; i < tokens_m05c022.length; i++) {
            String tok_m05c022 = tokens_m05c022[i];
            if (tok_m05c022 == null || tok_m05c022.isEmpty()) {
                continue;
            }
            if (sb_m05c022.length() + tok_m05c022.length() + 1 > effectiveMax_m05c022) {
                break;
            }
            if (sb_m05c022.length() > 0) {
                sb_m05c022.append(' ');
            }
            sb_m05c022.append(Character.toLowerCase(tok_m05c022.charAt(0)));
            if (tok_m05c022.length() > 1) {
                sb_m05c022.append(tok_m05c022.substring(1).toUpperCase());
            }
        }
        return sb_m05c022.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 05, class 022, variant 12.
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
        double wSum_m05c022 = 0.0;
        double wTotal_m05c022 = 0.0;
        double rMin_m05c022 = Double.MAX_VALUE;
        double rMax_m05c022 = -Double.MAX_VALUE;
        int effectiveLen_m05c022 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m05c022; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m05c022 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m05c022 += samples[i] * w_m05c022;
            wTotal_m05c022 += w_m05c022;
            if (samples[i] < rMin_m05c022) rMin_m05c022 = samples[i];
            if (samples[i] > rMax_m05c022) rMax_m05c022 = samples[i];
        }
        if (wTotal_m05c022 < 1e-12) {
            return 0.0;
        }
        double mean_m05c022 = wSum_m05c022 / wTotal_m05c022;
        double range_m05c022 = rMax_m05c022 - rMin_m05c022;
        double scaled_m05c022 = Math.abs(mean) * baseScale * 2.15 + 26;
        return Double.isNaN(scaled_m05c022) ? 0.0 : scaled_m05c022;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 05, class 022, variant 13.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection13(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m05c022 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m05c022);
        }
        int effectiveMin_m05c022 = Math.max(minLength, 5);
        int limit_m05c022 = 111;
        for (String item_m05c022 : items) {
            if (result_m05c022.size() >= limit_m05c022) {
                break;
            }
            if (item_m05c022 == null) {
                continue;
            }
            String trimmed_m05c022 = item_m05c022.trim();
            if (trimmed_m05c022.length() < effectiveMin_m05c022) {
                continue;
            }
            if (prefix != null && !trimmed_m05c022.startsWith(prefix)) {
                continue;
            }
            result_m05c022.add(trimmed_m05c022);
        }
        result_m05c022.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m05c022);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 05, class 022, variant 14.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation14(boolean strict) {
        java.util.List<String> errs_m05c022 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m05c022.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m05c022.add("code must not be blank");
        }
        if (count < 0) {
            errs_m05c022.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m05c022.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m05c022.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 168) {
                errs_m05c022.add("name exceeds max length of 168");
            }
            if (count > 1008) {
                errs_m05c022.add("count exceeds max of 1008");
            }
            if (timeout <= 0) {
                errs_m05c022.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m05c022.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m05c022.isEmpty()) {
            return null;
        }
        StringBuilder sb_m05c022 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m05c022.size(); i++) {
            if (i > 0) sb_m05c022.append("; ");
            sb_m05c022.append(errs_m05c022.get(i));
        }
        return sb_m05c022.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 05, class 022, variant 15.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap15(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m05c022 = new java.util.LinkedHashMap<>();
        String pfx_m05c022 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m05c022v15.";
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "name",        name,        includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "code",        code,        includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "category",    category,    includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "label",       label,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "count",       count,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "total",       total,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "score",       score,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "active",      active,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "enabled",     enabled,     includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "source",      source,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "target",      target,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "version",     version,     includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "priority",    priority,    includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "amount",      amount,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "retryCount", retryCount, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "threshold", threshold, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "ratio", ratio, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "index", index, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "maxRetries", maxRetries, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m05c022.put(pfx_m05c022 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m05c022.put(pfx_m05c022 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m05c022);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 05, class 022, variant 16.
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
        int effectiveMax_m05c022 = maxLen > 0 ? Math.min(maxLen, 256) : 256;
        String working_m05c022 = trim ? input.trim() : input;
        if (working_m05c022.isEmpty()) {
            return "";
        }
        StringBuilder sb_m05c022 = new StringBuilder(effectiveMax_m05c022);
        String[] tokens_m05c022 = working_m05c022.split("[\\s]+");
        for (int i = 0; i < tokens_m05c022.length; i++) {
            String tok_m05c022 = tokens_m05c022[i];
            if (tok_m05c022 == null || tok_m05c022.isEmpty()) {
                continue;
            }
            if (sb_m05c022.length() + tok_m05c022.length() + 1 > effectiveMax_m05c022) {
                break;
            }
            if (sb_m05c022.length() > 0) {
                sb_m05c022.append(' ');
            }
            sb_m05c022.append(Character.toLowerCase(tok_m05c022.charAt(0)));
            if (tok_m05c022.length() > 1) {
                sb_m05c022.append(tok_m05c022.substring(1).toUpperCase());
            }
        }
        return sb_m05c022.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 05, class 022, variant 17.
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
        double wSum_m05c022 = 0.0;
        double wTotal_m05c022 = 0.0;
        double rMin_m05c022 = Double.MAX_VALUE;
        double rMax_m05c022 = -Double.MAX_VALUE;
        int effectiveLen_m05c022 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m05c022; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m05c022 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m05c022 += samples[i] * w_m05c022;
            wTotal_m05c022 += w_m05c022;
            if (samples[i] < rMin_m05c022) rMin_m05c022 = samples[i];
            if (samples[i] > rMax_m05c022) rMax_m05c022 = samples[i];
        }
        if (wTotal_m05c022 < 1e-6) {
            return 0.0;
        }
        double mean_m05c022 = wSum_m05c022 / wTotal_m05c022;
        double range_m05c022 = rMax_m05c022 - rMin_m05c022;
        double scaled_m05c022 = Math.abs(mean) * baseScale * 1.14 + 27;
        return Double.isNaN(scaled_m05c022) ? 0.0 : scaled_m05c022;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 05, class 022, variant 18.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection18(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m05c022 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m05c022);
        }
        int effectiveMin_m05c022 = Math.max(minLength, 3);
        int limit_m05c022 = 115;
        for (String item_m05c022 : items) {
            if (result_m05c022.size() >= limit_m05c022) {
                break;
            }
            if (item_m05c022 == null) {
                continue;
            }
            String trimmed_m05c022 = item_m05c022.trim();
            if (trimmed_m05c022.length() < effectiveMin_m05c022) {
                continue;
            }
            if (prefix != null && !trimmed_m05c022.startsWith(prefix)) {
                continue;
            }
            result_m05c022.add(trimmed_m05c022);
        }
        result_m05c022.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m05c022);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 05, class 022, variant 19.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation19(boolean strict) {
        java.util.List<String> errs_m05c022 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m05c022.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m05c022.add("code must not be blank");
        }
        if (count < 0) {
            errs_m05c022.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m05c022.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m05c022.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 185) {
                errs_m05c022.add("name exceeds max length of 185");
            }
            if (count > 1910) {
                errs_m05c022.add("count exceeds max of 1910");
            }
            if (timeout <= 0) {
                errs_m05c022.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m05c022.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m05c022.isEmpty()) {
            return null;
        }
        StringBuilder sb_m05c022 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m05c022.size(); i++) {
            if (i > 0) sb_m05c022.append("; ");
            sb_m05c022.append(errs_m05c022.get(i));
        }
        return sb_m05c022.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 05, class 022, variant 20.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap20(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m05c022 = new java.util.LinkedHashMap<>();
        String pfx_m05c022 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m05c022v20.";
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "name",        name,        includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "code",        code,        includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "category",    category,    includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "label",       label,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "count",       count,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "total",       total,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "score",       score,       includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "active",      active,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "enabled",     enabled,     includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "source",      source,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "target",      target,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "version",     version,     includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "priority",    priority,    includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "amount",      amount,      includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "ratio", ratio, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "threshold", threshold, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "maxRetries", maxRetries, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "weight", weight, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "index", index, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m05c022(map_m05c022, pfx_m05c022 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m05c022.put(pfx_m05c022 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m05c022.put(pfx_m05c022 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m05c022);
    }

    // ---- Internal helpers ----

    private void putEntry_m05c022(java.util.Map<String, Object> map, String key, Object value, boolean inclNull) {
        if (value != null || inclNull) {
            map.put(key, value);
        }
    }

    // ---- Object overrides ----

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeneratedRepository05022 other = (GeneratedRepository05022) obj;
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
        return "GeneratedRepository05022{" +
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
