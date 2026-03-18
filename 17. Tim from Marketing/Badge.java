// https://exercism.org/tracks/java/exercises/tim-from-marketing

class Badge {

    public String print(Integer id, String name, String department) {
        String text = "";
        text += id == null ? "" : "[" + id + "] - ";
        text += name + " - ";
        text += department == null ? "OWNER" : department.toUpperCase();
        return text;
    }
}
