import java.util.List;
import java.util.Map;

public abstract class AbstractOrgDimensionValidator {
    private AbstractOrgDimensionValidator next;
    private List<String> uploadStatus;

    private boolean hasNext() {
        return this.next != null;
    }

    protected void setNext(AbstractOrgDimensionValidator next) {
        this.next = next;
    }

    protected void setUploadStatus(List<String> uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    protected void executeNext(List<Map<String, String>> dataset) {
        if (hasNext()) {
            this.next.setUploadStatus(uploadStatus);
            this.next.validate(dataset);
        }
    }

    abstract void validate(List<Map<String, String>> dataset);
}
