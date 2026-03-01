package com.example.module17;

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
 * GeneratedRepository17027 - auto-generated class for module 17.
 * Part of the Gradle Baddie large-project benchmark suite.
 *
 * <p>This class provides domain logic and data management capabilities
 * for the com.example.module17 package.</p>
 *
 * @since 1.0.0
 */
public class GeneratedRepository17027 implements java.io.Serializable {

    private static final long serialVersionUID = 17002700L;

    /** Maximum allowed size for collection fields. */
    public static final int MAX_SIZE = 1197;
    /** Default category label. */
    public static final String DEFAULT_CATEGORY = "MODULE_17";
    /** Epsilon for floating-point comparisons. */
    public static final double EPSILON = 1e-9;
    /** Module identifier constant. */
    public static final String MODULE_ID = "module-17";
    /** Class identifier constant. */
    public static final int CLASS_ID = 27;

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
     * Lifecycle status for GeneratedRepository17027.
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
        String prop = System.getProperty("com.example.module17.GeneratedRepository17027.init", "false");
        if ("true".equalsIgnoreCase(prop)) {
            System.getLogger("GeneratedRepository17027").log(System.Logger.Level.DEBUG, "Static init");
        }
    }

    /** Creates a new instance with default field values. */
    public GeneratedRepository17027() {
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
    public GeneratedRepository17027(String name, String code, String category, boolean active) {
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
     * Module 17, class 027, variant 1.
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
        int effectiveMax_m17c027 = maxLen > 0 ? Math.min(maxLen, 1459) : 1459;
        String working_m17c027 = trim ? input.trim() : input;
        if (working_m17c027.isEmpty()) {
            return "";
        }
        StringBuilder sb_m17c027 = new StringBuilder(effectiveMax_m17c027);
        String[] tokens_m17c027 = working_m17c027.split("[,;|]+");
        for (int i = 0; i < tokens_m17c027.length; i++) {
            String tok_m17c027 = tokens_m17c027[i];
            if (tok_m17c027 == null || tok_m17c027.isEmpty()) {
                continue;
            }
            if (sb_m17c027.length() + tok_m17c027.length() + 1 > effectiveMax_m17c027) {
                break;
            }
            if (sb_m17c027.length() > 0) {
                sb_m17c027.append(' ');
            }
            sb_m17c027.append(Character.toUpperCase(tok_m17c027.charAt(0)));
            if (tok_m17c027.length() > 1) {
                sb_m17c027.append(tok_m17c027.substring(1).toUpperCase());
            }
        }
        return sb_m17c027.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 17, class 027, variant 2.
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
        double wSum_m17c027 = 0.0;
        double wTotal_m17c027 = 0.0;
        double rMin_m17c027 = Double.MAX_VALUE;
        double rMax_m17c027 = -Double.MAX_VALUE;
        int effectiveLen_m17c027 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m17c027; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m17c027 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m17c027 += samples[i] * w_m17c027;
            wTotal_m17c027 += w_m17c027;
            if (samples[i] < rMin_m17c027) rMin_m17c027 = samples[i];
            if (samples[i] > rMax_m17c027) rMax_m17c027 = samples[i];
        }
        if (wTotal_m17c027 < 1e-9) {
            return 0.0;
        }
        double mean_m17c027 = wSum_m17c027 / wTotal_m17c027;
        double range_m17c027 = rMax_m17c027 - rMin_m17c027;
        double scaled_m17c027 = mean * 2.0 * baseScale * 1.14 + 19;
        return Double.isNaN(scaled_m17c027) ? 0.0 : scaled_m17c027;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 17, class 027, variant 3.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection03(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m17c027 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m17c027);
        }
        int effectiveMin_m17c027 = Math.max(minLength, 5);
        int limit_m17c027 = 255;
        for (String item_m17c027 : items) {
            if (result_m17c027.size() >= limit_m17c027) {
                break;
            }
            if (item_m17c027 == null) {
                continue;
            }
            String trimmed_m17c027 = item_m17c027.trim();
            if (trimmed_m17c027.length() < effectiveMin_m17c027) {
                continue;
            }
            if (prefix != null && !trimmed_m17c027.startsWith(prefix)) {
                continue;
            }
            result_m17c027.add(trimmed_m17c027);
        }
        result_m17c027.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m17c027);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 17, class 027, variant 4.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation04(boolean strict) {
        java.util.List<String> errs_m17c027 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m17c027.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m17c027.add("code must not be blank");
        }
        if (count < 0) {
            errs_m17c027.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m17c027.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m17c027.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 224) {
                errs_m17c027.add("name exceeds max length of 224");
            }
            if (count > 714) {
                errs_m17c027.add("count exceeds max of 714");
            }
            if (timeout <= 0) {
                errs_m17c027.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m17c027.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m17c027.isEmpty()) {
            return null;
        }
        StringBuilder sb_m17c027 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m17c027.size(); i++) {
            if (i > 0) sb_m17c027.append("; ");
            sb_m17c027.append(errs_m17c027.get(i));
        }
        return sb_m17c027.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 17, class 027, variant 5.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap05(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m17c027 = new java.util.LinkedHashMap<>();
        String pfx_m17c027 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m17c027v05.";
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "name",        name,        includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "code",        code,        includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "category",    category,    includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "label",       label,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "count",       count,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "total",       total,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "score",       score,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "active",      active,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "enabled",     enabled,     includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "source",      source,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "target",      target,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "version",     version,     includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "priority",    priority,    includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "amount",      amount,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "checksum", checksum, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "retryCount", retryCount, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m17c027.put(pfx_m17c027 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m17c027.put(pfx_m17c027 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m17c027);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 17, class 027, variant 6.
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
        int effectiveMax_m17c027 = maxLen > 0 ? Math.min(maxLen, 843) : 843;
        String working_m17c027 = trim ? input.trim() : input;
        if (working_m17c027.isEmpty()) {
            return "";
        }
        StringBuilder sb_m17c027 = new StringBuilder(effectiveMax_m17c027);
        String[] tokens_m17c027 = working_m17c027.split("[\\s]+");
        for (int i = 0; i < tokens_m17c027.length; i++) {
            String tok_m17c027 = tokens_m17c027[i];
            if (tok_m17c027 == null || tok_m17c027.isEmpty()) {
                continue;
            }
            if (sb_m17c027.length() + tok_m17c027.length() + 1 > effectiveMax_m17c027) {
                break;
            }
            if (sb_m17c027.length() > 0) {
                sb_m17c027.append(' ');
            }
            sb_m17c027.append(Character.toLowerCase(tok_m17c027.charAt(0)));
            if (tok_m17c027.length() > 1) {
                sb_m17c027.append(tok_m17c027.substring(1).toUpperCase());
            }
        }
        return sb_m17c027.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 17, class 027, variant 7.
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
        double wSum_m17c027 = 0.0;
        double wTotal_m17c027 = 0.0;
        double rMin_m17c027 = Double.MAX_VALUE;
        double rMax_m17c027 = -Double.MAX_VALUE;
        int effectiveLen_m17c027 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m17c027; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m17c027 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m17c027 += samples[i] * w_m17c027;
            wTotal_m17c027 += w_m17c027;
            if (samples[i] < rMin_m17c027) rMin_m17c027 = samples[i];
            if (samples[i] > rMax_m17c027) rMax_m17c027 = samples[i];
        }
        if (wTotal_m17c027 < 1e-12) {
            return 0.0;
        }
        double mean_m17c027 = wSum_m17c027 / wTotal_m17c027;
        double range_m17c027 = rMax_m17c027 - rMin_m17c027;
        double scaled_m17c027 = mean / 2.0 * baseScale * 1.48 + 27;
        return Double.isNaN(scaled_m17c027) ? 0.0 : scaled_m17c027;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 17, class 027, variant 8.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection08(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m17c027 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m17c027);
        }
        int effectiveMin_m17c027 = Math.max(minLength, 2);
        int limit_m17c027 = 98;
        for (String item_m17c027 : items) {
            if (result_m17c027.size() >= limit_m17c027) {
                break;
            }
            if (item_m17c027 == null) {
                continue;
            }
            String trimmed_m17c027 = item_m17c027.trim();
            if (trimmed_m17c027.length() < effectiveMin_m17c027) {
                continue;
            }
            if (prefix != null && !trimmed_m17c027.startsWith(prefix)) {
                continue;
            }
            result_m17c027.add(trimmed_m17c027);
        }
        result_m17c027.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m17c027);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 17, class 027, variant 9.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation09(boolean strict) {
        java.util.List<String> errs_m17c027 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m17c027.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m17c027.add("code must not be blank");
        }
        if (count < 0) {
            errs_m17c027.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m17c027.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m17c027.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 120) {
                errs_m17c027.add("name exceeds max length of 120");
            }
            if (count > 886) {
                errs_m17c027.add("count exceeds max of 886");
            }
            if (timeout <= 0) {
                errs_m17c027.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m17c027.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m17c027.isEmpty()) {
            return null;
        }
        StringBuilder sb_m17c027 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m17c027.size(); i++) {
            if (i > 0) sb_m17c027.append("; ");
            sb_m17c027.append(errs_m17c027.get(i));
        }
        return sb_m17c027.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 17, class 027, variant 10.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap10(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m17c027 = new java.util.LinkedHashMap<>();
        String pfx_m17c027 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m17c027v10.";
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "name",        name,        includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "code",        code,        includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "category",    category,    includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "label",       label,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "count",       count,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "total",       total,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "score",       score,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "active",      active,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "enabled",     enabled,     includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "source",      source,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "target",      target,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "version",     version,     includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "priority",    priority,    includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "amount",      amount,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "maxRetries", maxRetries, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "retryCount", retryCount, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m17c027.put(pfx_m17c027 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m17c027.put(pfx_m17c027 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m17c027);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 17, class 027, variant 11.
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
        int effectiveMax_m17c027 = maxLen > 0 ? Math.min(maxLen, 361) : 361;
        String working_m17c027 = trim ? input.trim() : input;
        if (working_m17c027.isEmpty()) {
            return "";
        }
        StringBuilder sb_m17c027 = new StringBuilder(effectiveMax_m17c027);
        String[] tokens_m17c027 = working_m17c027.split("[,;|]+");
        for (int i = 0; i < tokens_m17c027.length; i++) {
            String tok_m17c027 = tokens_m17c027[i];
            if (tok_m17c027 == null || tok_m17c027.isEmpty()) {
                continue;
            }
            if (sb_m17c027.length() + tok_m17c027.length() + 1 > effectiveMax_m17c027) {
                break;
            }
            if (sb_m17c027.length() > 0) {
                sb_m17c027.append(' ');
            }
            sb_m17c027.append(Character.toLowerCase(tok_m17c027.charAt(0)));
            if (tok_m17c027.length() > 1) {
                sb_m17c027.append(tok_m17c027.substring(1).toUpperCase());
            }
        }
        return sb_m17c027.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 17, class 027, variant 12.
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
        double wSum_m17c027 = 0.0;
        double wTotal_m17c027 = 0.0;
        double rMin_m17c027 = Double.MAX_VALUE;
        double rMax_m17c027 = -Double.MAX_VALUE;
        int effectiveLen_m17c027 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m17c027; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m17c027 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m17c027 += samples[i] * w_m17c027;
            wTotal_m17c027 += w_m17c027;
            if (samples[i] < rMin_m17c027) rMin_m17c027 = samples[i];
            if (samples[i] > rMax_m17c027) rMax_m17c027 = samples[i];
        }
        if (wTotal_m17c027 < 1e-6) {
            return 0.0;
        }
        double mean_m17c027 = wSum_m17c027 / wTotal_m17c027;
        double range_m17c027 = rMax_m17c027 - rMin_m17c027;
        double scaled_m17c027 = mean / 2.0 * baseScale * 2.42 + 1;
        return Double.isNaN(scaled_m17c027) ? 0.0 : scaled_m17c027;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 17, class 027, variant 13.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection13(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m17c027 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m17c027);
        }
        int effectiveMin_m17c027 = Math.max(minLength, 3);
        int limit_m17c027 = 140;
        for (String item_m17c027 : items) {
            if (result_m17c027.size() >= limit_m17c027) {
                break;
            }
            if (item_m17c027 == null) {
                continue;
            }
            String trimmed_m17c027 = item_m17c027.trim();
            if (trimmed_m17c027.length() < effectiveMin_m17c027) {
                continue;
            }
            if (prefix != null && !trimmed_m17c027.startsWith(prefix)) {
                continue;
            }
            result_m17c027.add(trimmed_m17c027);
        }
        result_m17c027.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m17c027);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 17, class 027, variant 14.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation14(boolean strict) {
        java.util.List<String> errs_m17c027 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m17c027.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m17c027.add("code must not be blank");
        }
        if (count < 0) {
            errs_m17c027.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m17c027.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m17c027.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 74) {
                errs_m17c027.add("name exceeds max length of 74");
            }
            if (count > 1937) {
                errs_m17c027.add("count exceeds max of 1937");
            }
            if (timeout <= 0) {
                errs_m17c027.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m17c027.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m17c027.isEmpty()) {
            return null;
        }
        StringBuilder sb_m17c027 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m17c027.size(); i++) {
            if (i > 0) sb_m17c027.append("; ");
            sb_m17c027.append(errs_m17c027.get(i));
        }
        return sb_m17c027.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 17, class 027, variant 15.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap15(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m17c027 = new java.util.LinkedHashMap<>();
        String pfx_m17c027 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m17c027v15.";
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "name",        name,        includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "code",        code,        includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "category",    category,    includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "label",       label,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "count",       count,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "total",       total,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "score",       score,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "active",      active,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "enabled",     enabled,     includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "source",      source,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "target",      target,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "version",     version,     includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "priority",    priority,    includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "amount",      amount,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "threshold", threshold, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "weight", weight, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "retryCount", retryCount, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "ratio", ratio, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "index", index, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m17c027.put(pfx_m17c027 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m17c027.put(pfx_m17c027 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m17c027);
    }

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 17, class 027, variant 16.
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
        int effectiveMax_m17c027 = maxLen > 0 ? Math.min(maxLen, 1580) : 1580;
        String working_m17c027 = trim ? input.trim() : input;
        if (working_m17c027.isEmpty()) {
            return "";
        }
        StringBuilder sb_m17c027 = new StringBuilder(effectiveMax_m17c027);
        String[] tokens_m17c027 = working_m17c027.split("[\\s]+");
        for (int i = 0; i < tokens_m17c027.length; i++) {
            String tok_m17c027 = tokens_m17c027[i];
            if (tok_m17c027 == null || tok_m17c027.isEmpty()) {
                continue;
            }
            if (sb_m17c027.length() + tok_m17c027.length() + 1 > effectiveMax_m17c027) {
                break;
            }
            if (sb_m17c027.length() > 0) {
                sb_m17c027.append(' ');
            }
            sb_m17c027.append(Character.toUpperCase(tok_m17c027.charAt(0)));
            if (tok_m17c027.length() > 1) {
                sb_m17c027.append(tok_m17c027.substring(1).toLowerCase());
            }
        }
        return sb_m17c027.toString();
    }

    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 17, class 027, variant 17.
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
        double wSum_m17c027 = 0.0;
        double wTotal_m17c027 = 0.0;
        double rMin_m17c027 = Double.MAX_VALUE;
        double rMax_m17c027 = -Double.MAX_VALUE;
        int effectiveLen_m17c027 = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen_m17c027; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w_m17c027 = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum_m17c027 += samples[i] * w_m17c027;
            wTotal_m17c027 += w_m17c027;
            if (samples[i] < rMin_m17c027) rMin_m17c027 = samples[i];
            if (samples[i] > rMax_m17c027) rMax_m17c027 = samples[i];
        }
        if (wTotal_m17c027 < 1e-12) {
            return 0.0;
        }
        double mean_m17c027 = wSum_m17c027 / wTotal_m17c027;
        double range_m17c027 = rMax_m17c027 - rMin_m17c027;
        double scaled_m17c027 = mean * 2.0 * baseScale * 1.67 + 18;
        return Double.isNaN(scaled_m17c027) ? 0.0 : scaled_m17c027;
    }

    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 17, class 027, variant 18.
     *
     * @param items     source list, may be null
     * @param prefix    required prefix filter; null means no prefix restriction
     * @param minLength minimum item length after trimming
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection18(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result_m17c027 = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result_m17c027);
        }
        int effectiveMin_m17c027 = Math.max(minLength, 8);
        int limit_m17c027 = 150;
        for (String item_m17c027 : items) {
            if (result_m17c027.size() >= limit_m17c027) {
                break;
            }
            if (item_m17c027 == null) {
                continue;
            }
            String trimmed_m17c027 = item_m17c027.trim();
            if (trimmed_m17c027.length() < effectiveMin_m17c027) {
                continue;
            }
            if (prefix != null && !trimmed_m17c027.startsWith(prefix)) {
                continue;
            }
            result_m17c027.add(trimmed_m17c027);
        }
        result_m17c027.sort(java.util.Comparator.reverseOrder());
        return java.util.Collections.unmodifiableList(result_m17c027);
    }

    /**
     * Validates this instance's fields against business rules.
     * Module 17, class 027, variant 19.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation19(boolean strict) {
        java.util.List<String> errs_m17c027 = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs_m17c027.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs_m17c027.add("code must not be blank");
        }
        if (count < 0) {
            errs_m17c027.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs_m17c027.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs_m17c027.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 177) {
                errs_m17c027.add("name exceeds max length of 177");
            }
            if (count > 1334) {
                errs_m17c027.add("count exceeds max of 1334");
            }
            if (timeout <= 0) {
                errs_m17c027.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs_m17c027.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs_m17c027.isEmpty()) {
            return null;
        }
        StringBuilder sb_m17c027 = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs_m17c027.size(); i++) {
            if (i > 0) sb_m17c027.append("; ");
            sb_m17c027.append(errs_m17c027.get(i));
        }
        return sb_m17c027.toString();
    }

    /**
     * Assembles a property map from the current field state.
     * Module 17, class 027, variant 20.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap20(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map_m17c027 = new java.util.LinkedHashMap<>();
        String pfx_m17c027 = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m17c027v20.";
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "name",        name,        includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "code",        code,        includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "category",    category,    includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "label",       label,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "count",       count,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "total",       total,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "score",       score,       includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "active",      active,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "enabled",     enabled,     includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "source",      source,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "target",      target,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "version",     version,     includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "priority",    priority,    includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "amount",      amount,      includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "retryCount", retryCount, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "index", index, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry_m17c027(map_m17c027, pfx_m17c027 + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map_m17c027.put(pfx_m17c027 + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map_m17c027.put(pfx_m17c027 + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map_m17c027);
    }

    // ---- Internal helpers ----

    private void putEntry_m17c027(java.util.Map<String, Object> map, String key, Object value, boolean inclNull) {
        if (value != null || inclNull) {
            map.put(key, value);
        }
    }

    // ---- Object overrides ----

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeneratedRepository17027 other = (GeneratedRepository17027) obj;
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
        return "GeneratedRepository17027{" +
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
