import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrgDatasetValidator {
    public static void main(String[] args) {
        List<Map<String, String>> orgDataset = new ArrayList<>();
        makeValidateData(orgDataset);
        AbstractOrgDimensionValidator validator = createValidator();
        validator.validate(orgDataset);
    }

    public static void makeValidateData(List<Map<String, String>> orgDataset) {
        Map<String, String> dataMap1 = new HashMap<>();
        Map<String, String> dataMap2 = new HashMap<>();
        Map<String, String> dataMap3 = new HashMap<>();

        dataMap1.put("Code", "C0201");
        dataMap2.put("Code", "C0202");
        dataMap3.put("Code", "C0203");
        dataMap1.put("Org", "본부");
        dataMap2.put("Org", "담당");
        dataMap3.put("Org", "지역단");
        dataMap1.put("Pl", "원수보험료");
        dataMap2.put("Pl", "손해액");
        dataMap3.put("Pl", "평가금액");

        orgDataset.add(dataMap1);
        orgDataset.add(dataMap2);
        orgDataset.add(dataMap3);
    }

    public static AbstractOrgDimensionValidator createValidator() {
        List<String> uploadStatus = new ArrayList<>();

        OrgDimensionCodeValidator codeValidator = new OrgDimensionCodeValidator();

        OrgDimensionPlItemValidator plItemValidator = new OrgDimensionPlItemValidator();
        plItemValidator.setNext(codeValidator);

        OrgDimensionOrganizationValidator organizationValidator = new OrgDimensionOrganizationValidator();
        organizationValidator.setNext(plItemValidator);
        organizationValidator.setUploadStatus(uploadStatus);

        return organizationValidator;
    }
}
