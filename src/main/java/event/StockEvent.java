package event;

import java.time.LocalDateTime;

public class StockEvent {

    private final String type;
    private final String description;
    private final String indexName;
    private final double change;
    private final LocalDateTime timestamp;

    public StockEvent(String type, String description, String indexName, double change) {
        this.type = type;
        this.description = description;
        this.indexName = indexName;
        this.change = change;
        this.timestamp = LocalDateTime.now();
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getIndexName() {
        return indexName;
    }

    public double getChange() {
        return change;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + indexName + " - " + type +
                " (" + change + "%): " + description;
    }
}
