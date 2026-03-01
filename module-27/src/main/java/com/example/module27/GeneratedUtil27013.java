package com.example.module27;

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
 * GeneratedUtil27013 - auto-generated class for module 27.
 * Part of the Gradle Baddie large-project benchmark suite.
 *
 * <p>This class provides domain logic and data management capabilities
 * for the com.example.module27 package.</p>
 *
 * @since 1.0.0
 */
public class GeneratedUtil27013 implements java.io.Serializable {

    private static final long serialVersionUID = 27001300L;

    /** Maximum allowed size for collection fields. */
    public static final int MAX_SIZE = 1283;
    /** Default category label. */
    public static final String DEFAULT_CATEGORY = "MODULE_27";
    /** Epsilon for floating-point comparisons. */
    public static final double EPSILON = 1e-9;
    /** Module identifier constant. */
    public static final String MODULE_ID = "module-27";
    /** Class identifier constant. */
    public static final int CLASS_ID = 13;

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
     * Lifecycle status for GeneratedUtil27013.
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
        String prop = System.getProperty("com.example.module27.GeneratedUtil27013.init", "false");
        if ("true".equalsIgnoreCase(prop)) {
            System.getLogger("GeneratedUtil27013").log(System.Logger.Level.DEBUG, "Static init");
        }
    }

    /** Creates a new instance with default field values. */
    public GeneratedUtil27013() {
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
    public GeneratedUtil27013(String name, String code, String category, boolean active) {
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
     * Module 27, class 013, variant 1.
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
        int effectiveMax_m27c013 = maxLen > 0 ? Math.min(maxLen, 447) : 447;
        String working_m27c013 = trim ? input.trim() : input;
        if (working_m27c013.isEmpty()) {
            return "";
        }
        StringBuilder sb_m27c013 = new StringBuilder(effectiveMax_m27c013);
        String[] tokens_m27c013 = working_m27c013.split("[\\s,]+");
        for (int i = 0; i < tokens_m27c013.length; i++) {
            String tok_m27c013 = tokens_m27c013[i];
            if (tok_m27c013 == null || tok_m27c013.isEmpty()) {
                continue;
            }
            if (sb_m27c013.length() + tok_m27c013.length() + 1 > effectiveMax_m27c013) {
                break;
            }
            if (sb_m27c013.length() > 0) {
                sb_m27c013.append(' ');
            }
            sb_m27c013.append(Character.toLowerCase(tok_m27c013.charAt(0)));
            if (tok_m27c013.length() > 1) {
                sb_m27c013.append(tok_m27c013.substring(1).toLowerCase());
            }
        }
        return sb_m27c013.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 27, class 013, variant 2.
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
        double wSum_m27c013 = 0.0;
        double wTotal_m27c013 = 0.0;
        double rMin_m27c013 = Double.MAX_VALUE;
        double rMax_m27c013 = -Double.MAX_VALUE;
        int effectiveLen_m27c013 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m27c013; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m27c013 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m27c013 += samples[i] * w_m27c013;
            wTotal_m27c013 += w_m27c013;
            if (samples[i] < rMin_m27c013) rMin_m27c013 = samples[i];
            if (samples[i] > rMax_m27c013) rMax_m27c013 = samples[i];
        }
        if (wTotal_m27c013 < 1e-12) {
            return 0.0;
        }
        double mean_m27c013 = wSum_m27c013 / wTotal_m27c013;
        double range_m27c013 = rMax_m27c013 - rMin_m27c013;
        double scaled_m27c013 = mean * baseScale * 1.45 + 22;
        return Double.isNaN(scaled_m27c013) ? 0.0 : scaled_m27c013;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 27, class 013, variant 3.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection03(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m27c013 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m27c013);
        }
        int effectiveMin_m27c013 = Math.max(minLength, 6);
        int limit_m27c013 = 140;
        for (String item_m27c013 : items) {
            if (result_m27c013.size() >= limit_m27c013) {
                break;
            }
            if (item_m27c013 == null) {
                continue;
            }
            String trimmed_m27c013 = item_m27c013.trim();
            if (trimmed_m27c013.length() < effectiveMin_m27c013) {
                continue;
            }
            if (prefix != null && !trimmed_m27c013.startsWith(prefix)) {
                continue;
            }
            result_m27c013.add(trimmed_m27c013);
        }
        result_m27c013.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m27c013);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 27, class 013, variant 4.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation04(boolean strict) {
        java.util.List<String> errs_m27c013 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m27c013.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m27c013.add("code must not be blank");
        }
        if (count < 0) {
            errs_m27c013.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m27c013.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m27c013.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 82) {
                errs_m27c013.add("name exceeds max length of 82");
            }
            if (count > 869) {
                errs_m27c013.add("count exceeds max of 869");
            }
            if (timeout <= 0) {
                errs_m27c013.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m27c013.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m27c013.isEmpty()) {
            return null;
        }
        StringBuilder sb_m27c013 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m27c013.size(); i++) {
            if (i > 0) sb_m27c013.append("; ");
            sb_m27c013.append(errs_m27c013.get(i));
        }
        return sb_m27c013.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 27, class 013, variant 5.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap05(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m27c013 = new java.util.LinkedHashMap<>();
        String pfx_m27c013 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m27c013v05.";
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "name",        name,        includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "code",        code,        includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "category",    category,    includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "label",       label,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "count",       count,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "total",       total,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "score",       score,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "active",      active,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "enabled",     enabled,     includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "source",      source,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "target",      target,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "version",     version,     includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "priority",    priority,    includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "amount",      amount,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "threshold", threshold, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "weight", weight, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m27c013.put(pfx_m27c013 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m27c013.put(pfx_m27c013 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m27c013);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 27, class 013, variant 6.
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
        int effectiveMax_m27c013 = maxLen > 0 ? Math.min(maxLen, 1461) : 1461;
        String working_m27c013 = trim ? input.trim() : input;
        if (working_m27c013.isEmpty()) {
            return "";
        }
        StringBuilder sb_m27c013 = new StringBuilder(effectiveMax_m27c013);
        String[] tokens_m27c013 = working_m27c013.split("[\\s,]+");
        for (int i = 0; i < tokens_m27c013.length; i++) {
            String tok_m27c013 = tokens_m27c013[i];
            if (tok_m27c013 == null || tok_m27c013.isEmpty()) {
                continue;
            }
            if (sb_m27c013.length() + tok_m27c013.length() + 1 > effectiveMax_m27c013) {
                break;
            }
            if (sb_m27c013.length() > 0) {
                sb_m27c013.append(' ');
            }
            sb_m27c013.append(Character.toUpperCase(tok_m27c013.charAt(0)));
            if (tok_m27c013.length() > 1) {
                sb_m27c013.append(tok_m27c013.substring(1).toLowerCase());
            }
        }
        return sb_m27c013.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 27, class 013, variant 7.
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
        double wSum_m27c013 = 0.0;
        double wTotal_m27c013 = 0.0;
        double rMin_m27c013 = Double.MAX_VALUE;
        double rMax_m27c013 = -Double.MAX_VALUE;
        int effectiveLen_m27c013 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m27c013; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m27c013 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m27c013 += samples[i] * w_m27c013;
            wTotal_m27c013 += w_m27c013;
            if (samples[i] < rMin_m27c013) rMin_m27c013 = samples[i];
            if (samples[i] > rMax_m27c013) rMax_m27c013 = samples[i];
        }
        if (wTotal_m27c013 < 1e-12) {
            return 0.0;
        }
        double mean_m27c013 = wSum_m27c013 / wTotal_m27c013;
        double range_m27c013 = rMax_m27c013 - rMin_m27c013;
        double scaled_m27c013 = mean * 2.0 * baseScale * 1.49 + 30;
        return Double.isNaN(scaled_m27c013) ? 0.0 : scaled_m27c013;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 27, class 013, variant 8.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection08(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m27c013 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m27c013);
        }
        int effectiveMin_m27c013 = Math.max(minLength, 9);
        int limit_m27c013 = 196;
        for (String item_m27c013 : items) {
            if (result_m27c013.size() >= limit_m27c013) {
                break;
            }
            if (item_m27c013 == null) {
                continue;
            }
            String trimmed_m27c013 = item_m27c013.trim();
            if (trimmed_m27c013.length() < effectiveMin_m27c013) {
                continue;
            }
            if (prefix != null && !trimmed_m27c013.startsWith(prefix)) {
                continue;
            }
            result_m27c013.add(trimmed_m27c013);
        }
        result_m27c013.sort(java.util.Comparator.naturalOrder());
        return java.util.Collections.unmodifiableList(result_m27c013);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 27, class 013, variant 9.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation09(boolean strict) {
        java.util.List<String> errs_m27c013 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m27c013.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m27c013.add("code must not be blank");
        }
        if (count < 0) {
            errs_m27c013.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m27c013.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m27c013.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 215) {
                errs_m27c013.add("name exceeds max length of 215");
            }
            if (count > 1627) {
                errs_m27c013.add("count exceeds max of 1627");
            }
            if (timeout <= 0) {
                errs_m27c013.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m27c013.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m27c013.isEmpty()) {
            return null;
        }
        StringBuilder sb_m27c013 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m27c013.size(); i++) {
            if (i > 0) sb_m27c013.append("; ");
            sb_m27c013.append(errs_m27c013.get(i));
        }
        return sb_m27c013.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 27, class 013, variant 10.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap10(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m27c013 = new java.util.LinkedHashMap<>();
        String pfx_m27c013 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m27c013v10.";
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "name",        name,        includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "code",        code,        includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "category",    category,    includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "label",       label,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "count",       count,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "total",       total,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "score",       score,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "active",      active,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "enabled",     enabled,     includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "source",      source,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "target",      target,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "version",     version,     includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "priority",    priority,    includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "amount",      amount,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "index", index, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "retryCount", retryCount, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "ratio", ratio, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "checksum", checksum, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "weight", weight, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m27c013.put(pfx_m27c013 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m27c013.put(pfx_m27c013 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m27c013);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 27, class 013, variant 11.
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
        int effectiveMax_m27c013 = maxLen > 0 ? Math.min(maxLen, 1774) : 1774;
        String working_m27c013 = trim ? input.trim() : input;
        if (working_m27c013.isEmpty()) {
            return "";
        }
        StringBuilder sb_m27c013 = new StringBuilder(effectiveMax_m27c013);
        String[] tokens_m27c013 = working_m27c013.split("[\\s]+");
        for (int i = 0; i < tokens_m27c013.length; i++) {
            String tok_m27c013 = tokens_m27c013[i];
            if (tok_m27c013 == null || tok_m27c013.isEmpty()) {
                continue;
            }
            if (sb_m27c013.length() + tok_m27c013.length() + 1 > effectiveMax_m27c013) {
                break;
            }
            if (sb_m27c013.length() > 0) {
                sb_m27c013.append(' ');
            }
            sb_m27c013.append(Character.toUpperCase(tok_m27c013.charAt(0)));
            if (tok_m27c013.length() > 1) {
                sb_m27c013.append(tok_m27c013.substring(1).toUpperCase());
            }
        }
        return sb_m27c013.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 27, class 013, variant 12.
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
        double wSum_m27c013 = 0.0;
        double wTotal_m27c013 = 0.0;
        double rMin_m27c013 = Double.MAX_VALUE;
        double rMax_m27c013 = -Double.MAX_VALUE;
        int effectiveLen_m27c013 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m27c013; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m27c013 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m27c013 += samples[i] * w_m27c013;
            wTotal_m27c013 += w_m27c013;
            if (samples[i] < rMin_m27c013) rMin_m27c013 = samples[i];
            if (samples[i] > rMax_m27c013) rMax_m27c013 = samples[i];
        }
        if (wTotal_m27c013 < 1e-9) {
            return 0.0;
        }
        double mean_m27c013 = wSum_m27c013 / wTotal_m27c013;
        double range_m27c013 = rMax_m27c013 - rMin_m27c013;
        double scaled_m27c013 = mean * 2.0 * baseScale * 1.83 + 9;
        return Double.isNaN(scaled_m27c013) ? 0.0 : scaled_m27c013;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 27, class 013, variant 13.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection13(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m27c013 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m27c013);
        }
        int effectiveMin_m27c013 = Math.max(minLength, 7);
        int limit_m27c013 = 252;
        for (String item_m27c013 : items) {
            if (result_m27c013.size() >= limit_m27c013) {
                break;
            }
            if (item_m27c013 == null) {
                continue;
            }
            String trimmed_m27c013 = item_m27c013.trim();
            if (trimmed_m27c013.length() < effectiveMin_m27c013) {
                continue;
            }
            if (prefix != null && !trimmed_m27c013.startsWith(prefix)) {
                continue;
            }
            result_m27c013.add(trimmed_m27c013);
        }
        result_m27c013.sort(java.util.Comparator.naturalOrder());
        return java.util.Collections.unmodifiableList(result_m27c013);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 27, class 013, variant 14.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation14(boolean strict) {
        java.util.List<String> errs_m27c013 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m27c013.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m27c013.add("code must not be blank");
        }
        if (count < 0) {
            errs_m27c013.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m27c013.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m27c013.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 151) {
                errs_m27c013.add("name exceeds max length of 151");
            }
            if (count > 523) {
                errs_m27c013.add("count exceeds max of 523");
            }
            if (timeout <= 0) {
                errs_m27c013.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m27c013.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m27c013.isEmpty()) {
            return null;
        }
        StringBuilder sb_m27c013 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m27c013.size(); i++) {
            if (i > 0) sb_m27c013.append("; ");
            sb_m27c013.append(errs_m27c013.get(i));
        }
        return sb_m27c013.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 27, class 013, variant 15.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap15(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m27c013 = new java.util.LinkedHashMap<>();
        String pfx_m27c013 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m27c013v15.";
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "name",        name,        includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "code",        code,        includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "category",    category,    includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "label",       label,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "count",       count,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "total",       total,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "score",       score,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "active",      active,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "enabled",     enabled,     includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "source",      source,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "target",      target,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "version",     version,     includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "priority",    priority,    includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "amount",      amount,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "retryCount", retryCount, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "checksum", checksum, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "weight", weight, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m27c013.put(pfx_m27c013 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m27c013.put(pfx_m27c013 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m27c013);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 27, class 013, variant 16.
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
        int effectiveMax_m27c013 = maxLen > 0 ? Math.min(maxLen, 724) : 724;
        String working_m27c013 = trim ? input.trim() : input;
        if (working_m27c013.isEmpty()) {
            return "";
        }
        StringBuilder sb_m27c013 = new StringBuilder(effectiveMax_m27c013);
        String[] tokens_m27c013 = working_m27c013.split("[\\s,]+");
        for (int i = 0; i < tokens_m27c013.length; i++) {
            String tok_m27c013 = tokens_m27c013[i];
            if (tok_m27c013 == null || tok_m27c013.isEmpty()) {
                continue;
            }
            if (sb_m27c013.length() + tok_m27c013.length() + 1 > effectiveMax_m27c013) {
                break;
            }
            if (sb_m27c013.length() > 0) {
                sb_m27c013.append(' ');
            }
            sb_m27c013.append(Character.toLowerCase(tok_m27c013.charAt(0)));
            if (tok_m27c013.length() > 1) {
                sb_m27c013.append(tok_m27c013.substring(1).toUpperCase());
            }
        }
        return sb_m27c013.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 27, class 013, variant 17.
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
        double wSum_m27c013 = 0.0;
        double wTotal_m27c013 = 0.0;
        double rMin_m27c013 = Double.MAX_VALUE;
        double rMax_m27c013 = -Double.MAX_VALUE;
        int effectiveLen_m27c013 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m27c013; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m27c013 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m27c013 += samples[i] * w_m27c013;
            wTotal_m27c013 += w_m27c013;
            if (samples[i] < rMin_m27c013) rMin_m27c013 = samples[i];
            if (samples[i] > rMax_m27c013) rMax_m27c013 = samples[i];
        }
        if (wTotal_m27c013 < 1e-6) {
            return 0.0;
        }
        double mean_m27c013 = wSum_m27c013 / wTotal_m27c013;
        double range_m27c013 = rMax_m27c013 - rMin_m27c013;
        double scaled_m27c013 = mean / 2.0 * baseScale * 2.47 + 2;
        return Double.isNaN(scaled_m27c013) ? 0.0 : scaled_m27c013;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 27, class 013, variant 18.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection18(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m27c013 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m27c013);
        }
        int effectiveMin_m27c013 = Math.max(minLength, 8);
        int limit_m27c013 = 284;
        for (String item_m27c013 : items) {
            if (result_m27c013.size() >= limit_m27c013) {
                break;
            }
            if (item_m27c013 == null) {
                continue;
            }
            String trimmed_m27c013 = item_m27c013.trim();
            if (trimmed_m27c013.length() < effectiveMin_m27c013) {
                continue;
            }
            if (prefix != null && !trimmed_m27c013.startsWith(prefix)) {
                continue;
            }
            result_m27c013.add(trimmed_m27c013);
        }
        result_m27c013.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result_m27c013);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 27, class 013, variant 19.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation19(boolean strict) {
        java.util.List<String> errs_m27c013 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m27c013.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m27c013.add("code must not be blank");
        }
        if (count < 0) {
            errs_m27c013.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m27c013.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m27c013.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 104) {
                errs_m27c013.add("name exceeds max length of 104");
            }
            if (count > 749) {
                errs_m27c013.add("count exceeds max of 749");
            }
            if (timeout <= 0) {
                errs_m27c013.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m27c013.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m27c013.isEmpty()) {
            return null;
        }
        StringBuilder sb_m27c013 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m27c013.size(); i++) {
            if (i > 0) sb_m27c013.append("; ");
            sb_m27c013.append(errs_m27c013.get(i));
        }
        return sb_m27c013.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 27, class 013, variant 20.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap20(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m27c013 = new java.util.LinkedHashMap<>();
        String pfx_m27c013 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m27c013v20.";
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "name",        name,        includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "code",        code,        includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "category",    category,    includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "label",       label,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "count",       count,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "total",       total,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "score",       score,       includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "active",      active,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "enabled",     enabled,     includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "source",      source,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "target",      target,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "version",     version,     includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "priority",    priority,    includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "amount",      amount,      includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "ratio", ratio, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "threshold", threshold, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "index", index, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m27c013(map_m27c013, pfx_m27c013 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m27c013.put(pfx_m27c013 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m27c013.put(pfx_m27c013 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m27c013);
    }

    // ---- Internal helpers ----

    private void putEntry_m27c013(java.util.Map<String, Object> map, String key, Object value, boolean inclNull) {
        if (value != null || inclNull) {
            map.put(key, value);
        }
    }

    // ---- Object overrides ----

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeneratedUtil27013 other = (GeneratedUtil27013) obj;
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
        return "GeneratedUtil27013{" +
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
