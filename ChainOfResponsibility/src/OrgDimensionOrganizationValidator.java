import java.util.List;
import java.util.Map;

public class OrgDimensionOrganizationValidator extends AbstractOrgDimensionValidator {
    @Override
    void validate(List<Map<String, String>> dataset) {
        List<Map<String, String>> recordList = dataset;

        for (Map<String, String> orgRecord: recordList) {
            String data = orgRecord.get("Org");

            if (data != null) {
                System.out.println("조직 " + data + "이(가) 검증되었습니다.");
            }
        }

        this.executeNext(dataset);
    }
}
