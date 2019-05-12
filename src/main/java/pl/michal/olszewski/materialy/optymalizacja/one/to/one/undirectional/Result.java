package pl.michal.olszewski.materialy.optymalizacja.one.to.one.undirectional;

public class Result {
    private final String title;
    private final Long id;

    public Result(String title, Long id) {
        this.title = title;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Result{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
