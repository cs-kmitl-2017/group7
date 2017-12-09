package th.ac.kmitl.science.comsci.example.models.utilities;

public class CountryCodeMapper implements Mapper {

    @Override
    public int map(String dataToMap) throws NotFoundMappingException {

        switch (dataToMap) {
            case "เกาหลี":
                return 82;
            case "เนเธอร์แลนด์":
                return 31;
            case "ไทย":
                return 66;
            case "จีน":
                return 86;
            case "ญี่ปุ่น":
                return 81;
            case "ฝรั่งเศส":
                return 33;
            case "ลาว":
                return 856;
            case "สวีเดน":
                return 46;
            case "สหรัฐอเมริกา":
                return 684;
            default:
                throw new NotFoundMappingException("Not found country name to map");
        }
    }
}
