package org.opennms.poc.ignite.worker.workflows;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

public class Workflow implements Serializable {
    private static final long serialVersionUID = 0L;

    private String description;
    private String type;
    private String cron;
    private Map<String,String> parameters = new LinkedHashMap<>();
    private String uuid;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workflow workflow = (Workflow) o;
        return Objects.equals(description, workflow.description) && Objects.equals(type, workflow.type) && Objects.equals(cron, workflow.cron) && Objects.equals(parameters, workflow.parameters) && Objects.equals(uuid, workflow.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, type, cron, parameters, uuid);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Workflow.class.getSimpleName() + "[", "]")
                .add("type='" + type + "'")
                .add("cron='" + cron + "'")
                .add("parameters=" + parameters)
                .add("uuid='" + uuid + "'")
                .toString();
    }
}
