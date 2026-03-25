// https://exercism.org/tracks/java/exercises/international-calling-connoisseur

import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> dialingCodes;

    public DialingCodes() {
        this.dialingCodes = new HashMap<Integer, String>();
    }

    public Map<Integer, String> getCodes() {
        return this.dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        this.dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (
            !this.dialingCodes.containsKey(code) &&
            this.findDialingCode(country) == null
        ) this.setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : this.dialingCodes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer alreadyExistedKey = this.findDialingCode(country);
        if (alreadyExistedKey != null) {
            this.dialingCodes.remove(alreadyExistedKey);
        }
        this.setDialingCode(code, country);
    }
}
